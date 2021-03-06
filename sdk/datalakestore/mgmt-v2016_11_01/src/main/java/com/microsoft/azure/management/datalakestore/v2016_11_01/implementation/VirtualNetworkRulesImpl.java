/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.datalakestore.v2016_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datalakestore.v2016_11_01.VirtualNetworkRules;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.datalakestore.v2016_11_01.VirtualNetworkRule;

class VirtualNetworkRulesImpl extends WrapperImpl<VirtualNetworkRulesInner> implements VirtualNetworkRules {
    private final DataLakeStoreManager manager;

    VirtualNetworkRulesImpl(DataLakeStoreManager manager) {
        super(manager.inner().virtualNetworkRules());
        this.manager = manager;
    }

    public DataLakeStoreManager manager() {
        return this.manager;
    }

    @Override
    public VirtualNetworkRuleImpl define(String name) {
        return wrapModel(name);
    }

    private VirtualNetworkRuleImpl wrapModel(VirtualNetworkRuleInner inner) {
        return  new VirtualNetworkRuleImpl(inner, manager());
    }

    private VirtualNetworkRuleImpl wrapModel(String name) {
        return new VirtualNetworkRuleImpl(name, this.manager());
    }

    @Override
    public Observable<VirtualNetworkRule> listByAccountAsync(final String resourceGroupName, final String accountName) {
        VirtualNetworkRulesInner client = this.inner();
        return client.listByAccountAsync(resourceGroupName, accountName)
        .flatMapIterable(new Func1<Page<VirtualNetworkRuleInner>, Iterable<VirtualNetworkRuleInner>>() {
            @Override
            public Iterable<VirtualNetworkRuleInner> call(Page<VirtualNetworkRuleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualNetworkRuleInner, VirtualNetworkRule>() {
            @Override
            public VirtualNetworkRule call(VirtualNetworkRuleInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<VirtualNetworkRule> getAsync(String resourceGroupName, String accountName, String virtualNetworkRuleName) {
        VirtualNetworkRulesInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, virtualNetworkRuleName)
        .map(new Func1<VirtualNetworkRuleInner, VirtualNetworkRule>() {
            @Override
            public VirtualNetworkRule call(VirtualNetworkRuleInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String virtualNetworkRuleName) {
        VirtualNetworkRulesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, virtualNetworkRuleName).toCompletable();
    }

}
