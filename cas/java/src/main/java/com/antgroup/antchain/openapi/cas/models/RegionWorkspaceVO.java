// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class RegionWorkspaceVO extends TeaModel {
    // availableNetworkTypes
    @NameInMap("available_network_types")
    @Validation(required = true)
    public java.util.List<String> availableNetworkTypes;

    // description
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // identity
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // networkType
    @NameInMap("network_type")
    @Validation(required = true)
    public String networkType;

    // providerId
    @NameInMap("provider_id")
    @Validation(required = true)
    public String providerId;

    // state
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // workspaces
    @NameInMap("workspaces")
    @Validation(required = true)
    public java.util.List<WorkspaceWithGroupView> workspaces;

    public static RegionWorkspaceVO build(java.util.Map<String, ?> map) throws Exception {
        RegionWorkspaceVO self = new RegionWorkspaceVO();
        return TeaModel.build(map, self);
    }

    public RegionWorkspaceVO setAvailableNetworkTypes(java.util.List<String> availableNetworkTypes) {
        this.availableNetworkTypes = availableNetworkTypes;
        return this;
    }
    public java.util.List<String> getAvailableNetworkTypes() {
        return this.availableNetworkTypes;
    }

    public RegionWorkspaceVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RegionWorkspaceVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RegionWorkspaceVO setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public RegionWorkspaceVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RegionWorkspaceVO setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public RegionWorkspaceVO setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public RegionWorkspaceVO setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public RegionWorkspaceVO setWorkspaces(java.util.List<WorkspaceWithGroupView> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<WorkspaceWithGroupView> getWorkspaces() {
        return this.workspaces;
    }

}
