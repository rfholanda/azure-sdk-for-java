// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ArmIdWrapper model. */
@Immutable
public final class ArmIdWrapper {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ArmIdWrapper.class);

    /*
     * The id property.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
