// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateMetaWorkspaceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // workspace 显示名称
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // workspace 唯一标识符
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // VPC ｜ Classic
    @NameInMap("network_type")
    @Validation(required = true)
    public String networkType;

    // 地域
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 可用区
    @NameInMap("zones")
    public java.util.List<String> zones;

    public static CreateMetaWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaWorkspaceRequest self = new CreateMetaWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateMetaWorkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateMetaWorkspaceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateMetaWorkspaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMetaWorkspaceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateMetaWorkspaceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateMetaWorkspaceRequest setZones(java.util.List<String> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<String> getZones() {
        return this.zones;
    }

}
