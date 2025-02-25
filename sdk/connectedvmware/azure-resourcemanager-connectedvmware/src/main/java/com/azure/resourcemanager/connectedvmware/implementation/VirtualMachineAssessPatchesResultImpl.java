// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.implementation;

import com.azure.resourcemanager.connectedvmware.fluent.models.VirtualMachineAssessPatchesResultInner;
import com.azure.resourcemanager.connectedvmware.models.AvailablePatchCountByClassification;
import com.azure.resourcemanager.connectedvmware.models.ErrorDetail;
import com.azure.resourcemanager.connectedvmware.models.OsTypeUM;
import com.azure.resourcemanager.connectedvmware.models.PatchOperationStartedBy;
import com.azure.resourcemanager.connectedvmware.models.PatchOperationStatus;
import com.azure.resourcemanager.connectedvmware.models.PatchServiceUsed;
import com.azure.resourcemanager.connectedvmware.models.VirtualMachineAssessPatchesResult;
import java.time.OffsetDateTime;

public final class VirtualMachineAssessPatchesResultImpl implements VirtualMachineAssessPatchesResult {
    private VirtualMachineAssessPatchesResultInner innerObject;

    private final com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager serviceManager;

    VirtualMachineAssessPatchesResultImpl(
        VirtualMachineAssessPatchesResultInner innerObject,
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public PatchOperationStatus status() {
        return this.innerModel().status();
    }

    public String assessmentActivityId() {
        return this.innerModel().assessmentActivityId();
    }

    public Boolean rebootPending() {
        return this.innerModel().rebootPending();
    }

    public AvailablePatchCountByClassification availablePatchCountByClassification() {
        return this.innerModel().availablePatchCountByClassification();
    }

    public OffsetDateTime startDateTime() {
        return this.innerModel().startDateTime();
    }

    public OffsetDateTime lastModifiedDateTime() {
        return this.innerModel().lastModifiedDateTime();
    }

    public PatchOperationStartedBy startedBy() {
        return this.innerModel().startedBy();
    }

    public PatchServiceUsed patchServiceUsed() {
        return this.innerModel().patchServiceUsed();
    }

    public OsTypeUM osType() {
        return this.innerModel().osType();
    }

    public ErrorDetail errorDetails() {
        return this.innerModel().errorDetails();
    }

    public VirtualMachineAssessPatchesResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager() {
        return this.serviceManager;
    }
}
