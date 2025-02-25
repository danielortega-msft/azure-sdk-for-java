// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.models.Pool;

/** Samples for Pools Update. */
public final class PoolsUpdateSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-10-12-preview/examples/Pools_Patch.json
     */
    /**
     * Sample code: Pools_Update.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void poolsUpdate(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        Pool resource = manager.pools().getWithResponse("rg1", "{projectName}", "{poolName}", Context.NONE).getValue();
        resource.update().withDevBoxDefinitionName("WebDevBox2").apply();
    }
}
