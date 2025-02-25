// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.azure.resourcemanager.datafactory.models.SqlAlwaysEncryptedAkvAuthType;
import com.azure.resourcemanager.datafactory.models.SqlAlwaysEncryptedProperties;
import com.azure.resourcemanager.datafactory.models.SqlServerLinkedService;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SqlServerLinkedServiceTests {
    @Test
    public void testDeserialize() {
        SqlServerLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"SqlServer\",\"typeProperties\":{\"password\":{\"type\":\"SecretBase\"},\"alwaysEncryptedSettings\":{\"alwaysEncryptedAkvAuthType\":\"ServicePrincipal\"}},\"connectVia\":{\"referenceName\":\"b\",\"parameters\":{}},\"description\":\"b\",\"parameters\":{\"ehpavawugiqjtiog\":{\"type\":\"Float\"},\"minict\":{\"type\":\"Bool\"}},\"annotations\":[],\"\":{}}")
                .toObject(SqlServerLinkedService.class);
        Assertions.assertEquals("b", model.connectVia().referenceName());
        Assertions.assertEquals("b", model.description());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("ehpavawugiqjtiog").type());
        Assertions
            .assertEquals(
                SqlAlwaysEncryptedAkvAuthType.SERVICE_PRINCIPAL,
                model.alwaysEncryptedSettings().alwaysEncryptedAkvAuthType());
    }

    @Test
    public void testSerialize() {
        SqlServerLinkedService model =
            new SqlServerLinkedService()
                .withConnectVia(new IntegrationRuntimeReference().withReferenceName("b").withParameters(mapOf()))
                .withDescription("b")
                .withParameters(
                    mapOf(
                        "ehpavawugiqjtiog",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "minict",
                        new ParameterSpecification().withType(ParameterType.BOOL)))
                .withAnnotations(Arrays.asList())
                .withPassword(new SecretBase())
                .withAlwaysEncryptedSettings(
                    new SqlAlwaysEncryptedProperties()
                        .withAlwaysEncryptedAkvAuthType(SqlAlwaysEncryptedAkvAuthType.SERVICE_PRINCIPAL));
        model = BinaryData.fromObject(model).toObject(SqlServerLinkedService.class);
        Assertions.assertEquals("b", model.connectVia().referenceName());
        Assertions.assertEquals("b", model.description());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("ehpavawugiqjtiog").type());
        Assertions
            .assertEquals(
                SqlAlwaysEncryptedAkvAuthType.SERVICE_PRINCIPAL,
                model.alwaysEncryptedSettings().alwaysEncryptedAkvAuthType());
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
