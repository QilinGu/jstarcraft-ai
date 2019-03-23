package com.jstarcraft.ai.data.module;

import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.jstarcraft.ai.data.DataModule;
import com.jstarcraft.ai.utility.FloatArray;
import com.jstarcraft.ai.utility.IntegerArray;
import com.jstarcraft.core.utility.KeyValue;

/**
 * 抽象模块
 * 
 * @author Birdy
 *
 */
abstract public class AbstractModule implements DataModule {

	/** 离散特征 */
	protected int qualityOrder;

	/** 连续特征 */
	protected int continuousOrder;

	/** 从外部索引到属性的投影(true代表离散,false代表连续) */
	protected TreeMap<Integer, KeyValue<String, Boolean>> outer = new TreeMap<>();

	/** 从离散属性到内部索引的投影 */
	protected TreeMap<String, Integer> qualityInner = new TreeMap<>();

	/** 从连续属性到内部索引的投影 */
	protected TreeMap<String, Integer> continuousInner = new TreeMap<>();

	/** 离散标记 */
	protected IntegerArray qualityMarks;

	/** 连续标记 */
	protected FloatArray continuousMarks;

	protected int capacity;

	protected int size;

	protected AbstractModule(String name, List<KeyValue<KeyValue<String, Boolean>, Integer>> definition, int capacity) {
		for (KeyValue<KeyValue<String, Boolean>, Integer> term : definition) {
			KeyValue<String, Boolean> keyValue = term.getKey();
			if (keyValue.getValue()) {
				this.outer.put(this.qualityOrder + this.continuousOrder, keyValue);
				this.qualityInner.put(keyValue.getKey(), this.qualityInner.getOrDefault(keyValue.getKey(), 0) + term.getValue());
				this.qualityOrder += term.getValue();
			} else {
				this.outer.put(this.qualityOrder + this.continuousOrder, keyValue);
				this.continuousInner.put(keyValue.getKey(), this.continuousInner.getOrDefault(keyValue.getKey(), 0) + term.getValue());
				this.continuousOrder += term.getValue();
			}
		}
		{
			int count = 0;
			for (Entry<String, Integer> term : qualityInner.entrySet()) {
				int size = term.getValue();
				term.setValue(count);
				count += size;
			}
		}
		{
			int count = 0;
			for (Entry<String, Integer> term : continuousInner.entrySet()) {
				int size = term.getValue();
				term.setValue(count);
				count += size;
			}
		}
		this.qualityMarks = new IntegerArray(1000, capacity);
		this.continuousMarks = new FloatArray(1000, capacity);
		this.capacity = capacity;
	}

	@Override
	public Entry<Integer, KeyValue<String, Boolean>> getOuterKeyValue(int index) {
		// 通过小于等于查找
		return outer.floorEntry(index);
	}

	@Override
	public int getQualityInner(String name) {
		// 通过等于查找
		return qualityInner.get(name);
	}

	@Override
	public int getContinuousInner(String name) {
		// 通过等于查找
		return continuousInner.get(name);
	}

	@Override
	public int getQualityOrder() {
		return qualityOrder;
	}

	@Override
	public int getContinuousOrder() {
		return continuousOrder;
	}

	IntegerArray getQualityMarks() {
		return qualityMarks;
	}

	FloatArray getContinuousMarks() {
		return continuousMarks;
	}

}
