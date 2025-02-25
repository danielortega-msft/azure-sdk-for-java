// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.GoogleCloudStorageLocation;
import org.junit.jupiter.api.Test;

public final class GoogleCloudStorageLocationTests {
    @Test
    public void testDeserialize() {
        GoogleCloudStorageLocation model =
            BinaryData
                .fromString("{\"type\":\"GoogleCloudStorageLocation\",\"\":{}}")
                .toObject(GoogleCloudStorageLocation.class);
    }

    @Test
    public void testSerialize() {
        GoogleCloudStorageLocation model = new GoogleCloudStorageLocation();
        model = BinaryData.fromObject(model).toObject(GoogleCloudStorageLocation.class);
    }
}
