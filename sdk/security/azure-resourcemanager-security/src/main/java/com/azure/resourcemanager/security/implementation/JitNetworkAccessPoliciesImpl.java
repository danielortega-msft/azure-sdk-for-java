// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.JitNetworkAccessPoliciesClient;
import com.azure.resourcemanager.security.fluent.models.JitNetworkAccessPolicyInner;
import com.azure.resourcemanager.security.fluent.models.JitNetworkAccessRequestInner;
import com.azure.resourcemanager.security.models.JitNetworkAccessPolicies;
import com.azure.resourcemanager.security.models.JitNetworkAccessPolicy;
import com.azure.resourcemanager.security.models.JitNetworkAccessPolicyInitiateRequest;
import com.azure.resourcemanager.security.models.JitNetworkAccessRequest;

public final class JitNetworkAccessPoliciesImpl implements JitNetworkAccessPolicies {
    private static final ClientLogger LOGGER = new ClientLogger(JitNetworkAccessPoliciesImpl.class);

    private final JitNetworkAccessPoliciesClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public JitNetworkAccessPoliciesImpl(
        JitNetworkAccessPoliciesClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<JitNetworkAccessPolicy> list() {
        PagedIterable<JitNetworkAccessPolicyInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new JitNetworkAccessPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<JitNetworkAccessPolicy> list(Context context) {
        PagedIterable<JitNetworkAccessPolicyInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new JitNetworkAccessPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<JitNetworkAccessPolicy> listByRegion(String ascLocation) {
        PagedIterable<JitNetworkAccessPolicyInner> inner = this.serviceClient().listByRegion(ascLocation);
        return Utils.mapPage(inner, inner1 -> new JitNetworkAccessPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<JitNetworkAccessPolicy> listByRegion(String ascLocation, Context context) {
        PagedIterable<JitNetworkAccessPolicyInner> inner = this.serviceClient().listByRegion(ascLocation, context);
        return Utils.mapPage(inner, inner1 -> new JitNetworkAccessPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<JitNetworkAccessPolicy> listByResourceGroup(String resourceGroupName) {
        PagedIterable<JitNetworkAccessPolicyInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new JitNetworkAccessPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<JitNetworkAccessPolicy> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<JitNetworkAccessPolicyInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new JitNetworkAccessPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<JitNetworkAccessPolicy> listByResourceGroupAndRegion(
        String resourceGroupName, String ascLocation) {
        PagedIterable<JitNetworkAccessPolicyInner> inner =
            this.serviceClient().listByResourceGroupAndRegion(resourceGroupName, ascLocation);
        return Utils.mapPage(inner, inner1 -> new JitNetworkAccessPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<JitNetworkAccessPolicy> listByResourceGroupAndRegion(
        String resourceGroupName, String ascLocation, Context context) {
        PagedIterable<JitNetworkAccessPolicyInner> inner =
            this.serviceClient().listByResourceGroupAndRegion(resourceGroupName, ascLocation, context);
        return Utils.mapPage(inner, inner1 -> new JitNetworkAccessPolicyImpl(inner1, this.manager()));
    }

    public Response<JitNetworkAccessPolicy> getWithResponse(
        String resourceGroupName, String ascLocation, String jitNetworkAccessPolicyName, Context context) {
        Response<JitNetworkAccessPolicyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, ascLocation, jitNetworkAccessPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JitNetworkAccessPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public JitNetworkAccessPolicy get(String resourceGroupName, String ascLocation, String jitNetworkAccessPolicyName) {
        JitNetworkAccessPolicyInner inner =
            this.serviceClient().get(resourceGroupName, ascLocation, jitNetworkAccessPolicyName);
        if (inner != null) {
            return new JitNetworkAccessPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String ascLocation, String jitNetworkAccessPolicyName, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, ascLocation, jitNetworkAccessPolicyName, context);
    }

    public void delete(String resourceGroupName, String ascLocation, String jitNetworkAccessPolicyName) {
        this.serviceClient().delete(resourceGroupName, ascLocation, jitNetworkAccessPolicyName);
    }

    public Response<JitNetworkAccessRequest> initiateWithResponse(
        String resourceGroupName,
        String ascLocation,
        String jitNetworkAccessPolicyName,
        JitNetworkAccessPolicyInitiateRequest body,
        Context context) {
        Response<JitNetworkAccessRequestInner> inner =
            this
                .serviceClient()
                .initiateWithResponse(resourceGroupName, ascLocation, jitNetworkAccessPolicyName, body, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JitNetworkAccessRequestImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public JitNetworkAccessRequest initiate(
        String resourceGroupName,
        String ascLocation,
        String jitNetworkAccessPolicyName,
        JitNetworkAccessPolicyInitiateRequest body) {
        JitNetworkAccessRequestInner inner =
            this.serviceClient().initiate(resourceGroupName, ascLocation, jitNetworkAccessPolicyName, body);
        if (inner != null) {
            return new JitNetworkAccessRequestImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public JitNetworkAccessPolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String ascLocation = Utils.getValueFromIdByName(id, "locations");
        if (ascLocation == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'locations'.", id)));
        }
        String jitNetworkAccessPolicyName = Utils.getValueFromIdByName(id, "jitNetworkAccessPolicies");
        if (jitNetworkAccessPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'jitNetworkAccessPolicies'.",
                                id)));
        }
        return this
            .getWithResponse(resourceGroupName, ascLocation, jitNetworkAccessPolicyName, Context.NONE)
            .getValue();
    }

    public Response<JitNetworkAccessPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String ascLocation = Utils.getValueFromIdByName(id, "locations");
        if (ascLocation == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'locations'.", id)));
        }
        String jitNetworkAccessPolicyName = Utils.getValueFromIdByName(id, "jitNetworkAccessPolicies");
        if (jitNetworkAccessPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'jitNetworkAccessPolicies'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, ascLocation, jitNetworkAccessPolicyName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String ascLocation = Utils.getValueFromIdByName(id, "locations");
        if (ascLocation == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'locations'.", id)));
        }
        String jitNetworkAccessPolicyName = Utils.getValueFromIdByName(id, "jitNetworkAccessPolicies");
        if (jitNetworkAccessPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'jitNetworkAccessPolicies'.",
                                id)));
        }
        this.deleteWithResponse(resourceGroupName, ascLocation, jitNetworkAccessPolicyName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String ascLocation = Utils.getValueFromIdByName(id, "locations");
        if (ascLocation == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'locations'.", id)));
        }
        String jitNetworkAccessPolicyName = Utils.getValueFromIdByName(id, "jitNetworkAccessPolicies");
        if (jitNetworkAccessPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'jitNetworkAccessPolicies'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, ascLocation, jitNetworkAccessPolicyName, context);
    }

    private JitNetworkAccessPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    public JitNetworkAccessPolicyImpl define(String name) {
        return new JitNetworkAccessPolicyImpl(name, this.manager());
    }
}
