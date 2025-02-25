// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureQueueSink;
import org.junit.jupiter.api.Test;

public final class AzureQueueSinkTests {
    @Test
    public void testDeserialize() {
        AzureQueueSink model =
            BinaryData.fromString("{\"type\":\"AzureQueueSink\",\"\":{}}").toObject(AzureQueueSink.class);
    }

    @Test
    public void testSerialize() {
        AzureQueueSink model = new AzureQueueSink();
        model = BinaryData.fromObject(model).toObject(AzureQueueSink.class);
    }
}
