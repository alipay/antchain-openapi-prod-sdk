// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class RegionView extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // identity
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // providerId
    @NameInMap("provider_id")
    @Validation(required = true)
    public String providerId;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // state
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // description
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // networkType
    @NameInMap("network_type")
    @Validation(required = true)
    public String networkType;

    // availableNetworkTypes
    @NameInMap("available_network_types")
    @Validation(required = true)
    public java.util.List<String> availableNetworkTypes;

    public static RegionView build(java.util.Map<String, ?> map) throws Exception {
        RegionView self = new RegionView();
        return TeaModel.build(map, self);
    }

    public RegionView setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RegionView setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public RegionView setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public RegionView setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RegionView setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public RegionView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RegionView setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public RegionView setAvailableNetworkTypes(java.util.List<String> availableNetworkTypes) {
        this.availableNetworkTypes = availableNetworkTypes;
        return this;
    }
    public java.util.List<String> getAvailableNetworkTypes() {
        return this.availableNetworkTypes;
    }

}
