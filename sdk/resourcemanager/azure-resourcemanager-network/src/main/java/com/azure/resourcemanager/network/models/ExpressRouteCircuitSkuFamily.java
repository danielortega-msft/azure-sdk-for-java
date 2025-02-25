// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The family of the SKU. */
public final class ExpressRouteCircuitSkuFamily extends ExpandableStringEnum<ExpressRouteCircuitSkuFamily> {
    /** Static value UnlimitedData for ExpressRouteCircuitSkuFamily. */
    public static final ExpressRouteCircuitSkuFamily UNLIMITED_DATA = fromString("UnlimitedData");

    /** Static value MeteredData for ExpressRouteCircuitSkuFamily. */
    public static final ExpressRouteCircuitSkuFamily METERED_DATA = fromString("MeteredData");

    /**
     * Creates or finds a ExpressRouteCircuitSkuFamily from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExpressRouteCircuitSkuFamily.
     */
    @JsonCreator
    public static ExpressRouteCircuitSkuFamily fromString(String name) {
        return fromString(name, ExpressRouteCircuitSkuFamily.class);
    }

    /**
     * Gets known ExpressRouteCircuitSkuFamily values.
     *
     * @return known ExpressRouteCircuitSkuFamily values.
     */
    public static Collection<ExpressRouteCircuitSkuFamily> values() {
        return values(ExpressRouteCircuitSkuFamily.class);
    }
}
