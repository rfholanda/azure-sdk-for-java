/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import rx.Observable;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.AgentRegistrationInformationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing AgentRegistrationInformations.
 */
public interface AgentRegistrationInformations extends HasInner<AgentRegistrationInformationsInner> {
    /**
     * Retrieve the automation agent registration information.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AgentRegistration> getAsync(String resourceGroupName, String automationAccountName);

    /**
     * Regenerate a primary or secondary agent registration key.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param parameters The name of the agent registration key to be regenerated
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AgentRegistration> regenerateKeyAsync(String resourceGroupName, String automationAccountName, AgentRegistrationRegenerateKeyParameter parameters);

}