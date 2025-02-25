// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.TargetUtilizationScaleSettings;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TargetUtilizationScaleSettingsTests {
    @Test
    public void testDeserialize() {
        TargetUtilizationScaleSettings model =
            BinaryData
                .fromString(
                    "{\"scaleType\":\"TargetUtilization\",\"maxInstances\":1095681099,\"minInstances\":1317358877,\"pollingInterval\":\"PT10H14M39S\",\"targetUtilizationPercentage\":93995844}")
                .toObject(TargetUtilizationScaleSettings.class);
        Assertions.assertEquals(1095681099, model.maxInstances());
        Assertions.assertEquals(1317358877, model.minInstances());
        Assertions.assertEquals(Duration.parse("PT10H14M39S"), model.pollingInterval());
        Assertions.assertEquals(93995844, model.targetUtilizationPercentage());
    }

    @Test
    public void testSerialize() {
        TargetUtilizationScaleSettings model =
            new TargetUtilizationScaleSettings()
                .withMaxInstances(1095681099)
                .withMinInstances(1317358877)
                .withPollingInterval(Duration.parse("PT10H14M39S"))
                .withTargetUtilizationPercentage(93995844);
        model = BinaryData.fromObject(model).toObject(TargetUtilizationScaleSettings.class);
        Assertions.assertEquals(1095681099, model.maxInstances());
        Assertions.assertEquals(1317358877, model.minInstances());
        Assertions.assertEquals(Duration.parse("PT10H14M39S"), model.pollingInterval());
        Assertions.assertEquals(93995844, model.targetUtilizationPercentage());
    }
}
