// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceVaultConfig;
import com.azure.resourcemanager.recoveryservicesbackup.models.EnhancedSecurityState;
import com.azure.resourcemanager.recoveryservicesbackup.models.SoftDeleteFeatureState;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageType;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageTypeState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BackupResourceVaultConfigTests {
    @Test
    public void testDeserialize() {
        BackupResourceVaultConfig model =
            BinaryData
                .fromString(
                    "{\"storageModelType\":\"ReadAccessGeoZoneRedundant\",\"storageType\":\"LocallyRedundant\",\"storageTypeState\":\"Locked\",\"enhancedSecurityState\":\"Enabled\",\"softDeleteFeatureState\":\"Disabled\",\"resourceGuardOperationRequests\":[\"xhvpmoue\"],\"isSoftDeleteFeatureStateEditable\":true}")
                .toObject(BackupResourceVaultConfig.class);
        Assertions.assertEquals(StorageType.READ_ACCESS_GEO_ZONE_REDUNDANT, model.storageModelType());
        Assertions.assertEquals(StorageType.LOCALLY_REDUNDANT, model.storageType());
        Assertions.assertEquals(StorageTypeState.LOCKED, model.storageTypeState());
        Assertions.assertEquals(EnhancedSecurityState.ENABLED, model.enhancedSecurityState());
        Assertions.assertEquals(SoftDeleteFeatureState.DISABLED, model.softDeleteFeatureState());
        Assertions.assertEquals("xhvpmoue", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(true, model.isSoftDeleteFeatureStateEditable());
    }

    @Test
    public void testSerialize() {
        BackupResourceVaultConfig model =
            new BackupResourceVaultConfig()
                .withStorageModelType(StorageType.READ_ACCESS_GEO_ZONE_REDUNDANT)
                .withStorageType(StorageType.LOCALLY_REDUNDANT)
                .withStorageTypeState(StorageTypeState.LOCKED)
                .withEnhancedSecurityState(EnhancedSecurityState.ENABLED)
                .withSoftDeleteFeatureState(SoftDeleteFeatureState.DISABLED)
                .withResourceGuardOperationRequests(Arrays.asList("xhvpmoue"))
                .withIsSoftDeleteFeatureStateEditable(true);
        model = BinaryData.fromObject(model).toObject(BackupResourceVaultConfig.class);
        Assertions.assertEquals(StorageType.READ_ACCESS_GEO_ZONE_REDUNDANT, model.storageModelType());
        Assertions.assertEquals(StorageType.LOCALLY_REDUNDANT, model.storageType());
        Assertions.assertEquals(StorageTypeState.LOCKED, model.storageTypeState());
        Assertions.assertEquals(EnhancedSecurityState.ENABLED, model.enhancedSecurityState());
        Assertions.assertEquals(SoftDeleteFeatureState.DISABLED, model.softDeleteFeatureState());
        Assertions.assertEquals("xhvpmoue", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(true, model.isSoftDeleteFeatureStateEditable());
    }
}
