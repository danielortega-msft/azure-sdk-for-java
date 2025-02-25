// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.PhoenixObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PhoenixObjectDatasetTests {
    @Test
    public void testDeserialize() {
        PhoenixObjectDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"PhoenixObject\",\"typeProperties\":{},\"description\":\"ubkmifo\",\"linkedServiceName\":{\"referenceName\":\"ubvphavpmhbrbqgv\",\"parameters\":{}},\"parameters\":{\"tefjoknssqyzq\":{\"type\":\"SecureString\"},\"kdfrdbiqmrjgeihf\":{\"type\":\"Array\"}},\"annotations\":[],\"folder\":{\"name\":\"fiwzcxmjpbyep\"},\"\":{}}")
                .toObject(PhoenixObjectDataset.class);
        Assertions.assertEquals("ubkmifo", model.description());
        Assertions.assertEquals("ubvphavpmhbrbqgv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("tefjoknssqyzq").type());
        Assertions.assertEquals("fiwzcxmjpbyep", model.folder().name());
    }

    @Test
    public void testSerialize() {
        PhoenixObjectDataset model =
            new PhoenixObjectDataset()
                .withDescription("ubkmifo")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("ubvphavpmhbrbqgv").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "tefjoknssqyzq",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING),
                        "kdfrdbiqmrjgeihf",
                        new ParameterSpecification().withType(ParameterType.ARRAY)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("fiwzcxmjpbyep"));
        model = BinaryData.fromObject(model).toObject(PhoenixObjectDataset.class);
        Assertions.assertEquals("ubkmifo", model.description());
        Assertions.assertEquals("ubvphavpmhbrbqgv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("tefjoknssqyzq").type());
        Assertions.assertEquals("fiwzcxmjpbyep", model.folder().name());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
