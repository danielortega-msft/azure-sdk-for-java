// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.PyTorch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PyTorchTests {
    @Test
    public void testDeserialize() {
        PyTorch model =
            BinaryData
                .fromString("{\"distributionType\":\"PyTorch\",\"processCountPerInstance\":1314386445}")
                .toObject(PyTorch.class);
        Assertions.assertEquals(1314386445, model.processCountPerInstance());
    }

    @Test
    public void testSerialize() {
        PyTorch model = new PyTorch().withProcessCountPerInstance(1314386445);
        model = BinaryData.fromObject(model).toObject(PyTorch.class);
        Assertions.assertEquals(1314386445, model.processCountPerInstance());
    }
}
