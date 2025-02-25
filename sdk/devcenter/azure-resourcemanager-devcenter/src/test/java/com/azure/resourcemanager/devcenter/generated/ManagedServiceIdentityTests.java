// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.ManagedServiceIdentity;
import com.azure.resourcemanager.devcenter.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.devcenter.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ManagedServiceIdentityTests {
    @Test
    public void testDeserialize() {
        ManagedServiceIdentity model =
            BinaryData
                .fromString(
                    "{\"principalId\":\"ebc3a072-5a8d-4601-b051-def22134612e\",\"tenantId\":\"53185b8b-e6df-478c-bc24-60681d1ad656\",\"type\":\"SystemAssigned,"
                        + " UserAssigned\",\"userAssignedIdentities\":{\"uxinpmqnjaq\":{\"principalId\":\"d406f4c6-eb9c-4f70-8c44-644b35a077b7\",\"clientId\":\"2dec27fa-ab02-4792-adfc-c2afca88a09a\"},\"jsprozvcpute\":{\"principalId\":\"96617c1e-b4a3-47d4-8cef-28d12173a812\",\"clientId\":\"f9d5e59a-78bc-4438-bc24-4c0c539033fd\"}}}")
                .toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.type());
    }

    @Test
    public void testSerialize() {
        ManagedServiceIdentity model =
            new ManagedServiceIdentity()
                .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                .withUserAssignedIdentities(
                    mapOf("uxinpmqnjaq", new UserAssignedIdentity(), "jsprozvcpute", new UserAssignedIdentity()));
        model = BinaryData.fromObject(model).toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.type());
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
