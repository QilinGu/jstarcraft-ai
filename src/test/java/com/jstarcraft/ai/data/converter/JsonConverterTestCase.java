package com.jstarcraft.ai.data.converter;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Assert;
import org.junit.Test;

import com.jstarcraft.ai.data.DataModule;
import com.jstarcraft.ai.data.DataSpace;

public class JsonConverterTestCase {

	@Test
	public void testConvert() throws Exception {
		Map<String, Class<?>> discreteDifinitions = new HashMap<>();
		Map<String, Class<?>> continuousDifinitions = new HashMap<>();
		discreteDifinitions.put("user", int.class);
		discreteDifinitions.put("item", int.class);
		continuousDifinitions.put("score", float.class);
		DataSpace space = new DataSpace(discreteDifinitions, continuousDifinitions);

		TreeMap<Integer, String> configuration = new TreeMap<>();
		configuration.put(2, "user");
		configuration.put(4, "item");
		configuration.put(5, "score");

		JsonConverter converter = new JsonConverter(space.getDiscreteAttributes(), space.getContinuousAttributes());
		{
			DataModule dense = space.makeDenseModule("dense", configuration, 1000);
			File file = new File(this.getClass().getResource("dense.js").toURI());
			InputStream stream = new FileInputStream(file);
			int count = converter.convert(dense, stream);
			Assert.assertEquals(5, count);
		}
		{
			DataModule sparse = space.makeSparseModule("sparse", configuration, 1000);
			File file = new File(this.getClass().getResource("sparse.js").toURI());
			InputStream stream = new FileInputStream(file);
			int count = converter.convert(sparse, stream);
			Assert.assertEquals(5, count);
		}
	}

}
