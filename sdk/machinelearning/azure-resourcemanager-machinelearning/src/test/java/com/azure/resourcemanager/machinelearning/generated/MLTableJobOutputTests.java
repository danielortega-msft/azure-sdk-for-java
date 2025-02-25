// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.MLTableJobOutput;
import com.azure.resourcemanager.machinelearning.models.OutputDeliveryMode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MLTableJobOutputTests {
    @Test
    public void testDeserialize() {
        MLTableJobOutput model =
            BinaryData
                .fromString(
                    "{\"jobOutputType\":\"mltable\",\"mode\":\"ReadWriteMount\",\"uri\":\"mlcfnzhmhsurl\",\"description\":\"qkpmmzpstau\"}")
                .toObject(MLTableJobOutput.class);
        Assertions.assertEquals("qkpmmzpstau", model.description());
        Assertions.assertEquals(OutputDeliveryMode.READ_WRITE_MOUNT, model.mode());
        Assertions.assertEquals("mlcfnzhmhsurl", model.uri());
    }

    @Test
    public void testSerialize() {
        MLTableJobOutput model =
            new MLTableJobOutput()
                .withDescription("qkpmmzpstau")
                .withMode(OutputDeliveryMode.READ_WRITE_MOUNT)
                .withUri("mlcfnzhmhsurl");
        model = BinaryData.fromObject(model).toObject(MLTableJobOutput.class);
        Assertions.assertEquals("qkpmmzpstau", model.description());
        Assertions.assertEquals(OutputDeliveryMode.READ_WRITE_MOUNT, model.mode());
        Assertions.assertEquals("mlcfnzhmhsurl", model.uri());
    }
}
