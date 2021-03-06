package com.jstarcraft.ai.data.module;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.jstarcraft.ai.data.DataModule;
import com.jstarcraft.ai.data.IntegerArray;
import com.jstarcraft.core.utility.KeyValue;

import it.unimi.dsi.fastutil.ints.Int2FloatAVLTreeMap;
import it.unimi.dsi.fastutil.ints.Int2FloatSortedMap;
import it.unimi.dsi.fastutil.ints.Int2IntAVLTreeMap;
import it.unimi.dsi.fastutil.ints.Int2IntSortedMap;

public class ReferenceModuleTestCase {

    private String moduleName = "module";

    private int order = 10;

    private int instanceCapacity = 10;

    private DataModule getDataModule() {
        List<KeyValue<KeyValue<String, Boolean>, Integer>> moduleDefinition = new LinkedList<>();
        for (int index = 0; index < order; index++) {
            moduleDefinition.add(new KeyValue<>(new KeyValue<>("quality", true), 1));
            moduleDefinition.add(new KeyValue<>(new KeyValue<>("ontinuous", false), 1));
        }
        DataModule module = new SparseModule(moduleName, moduleDefinition, instanceCapacity);
        Int2IntSortedMap qualityFeatures = new Int2IntAVLTreeMap();
        Int2FloatSortedMap quantityFeatures = new Int2FloatAVLTreeMap();
        for (int index = 0; index < instanceCapacity; index++) {
            qualityFeatures.clear();
            qualityFeatures.put(index, index);
            module.associateInstance(qualityFeatures, quantityFeatures);
        }
        return module;
    }

    @Test
    public void testAssociateInstance() {
        DataModule module = getDataModule();
        IntegerArray references = new IntegerArray(instanceCapacity, instanceCapacity);
        module = new ReferenceModule(references, module);
        Assert.assertEquals(0, module.getSize());

        try {
            Int2IntSortedMap qualityFeatures = new Int2IntAVLTreeMap();
            Int2FloatSortedMap quantityFeatures = new Int2FloatAVLTreeMap();
            module.associateInstance(qualityFeatures, quantityFeatures);
            Assert.fail();
        } catch (UnsupportedOperationException exception) {
        }
    }

    @Test
    public void testReference() {
        DataModule module = getDataModule();
        IntegerArray references = new IntegerArray(instanceCapacity, instanceCapacity);
        references.associateData(5);
        module = new ReferenceModule(references, module);
        Assert.assertEquals(1, module.getSize());
        Assert.assertEquals(5, module.getInstance(0).getQualityFeature(5));
    }

}
