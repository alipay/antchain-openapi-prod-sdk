// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateSingleworkspaceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // workspace 显示名称
    @NameInMap("display_name")
    public String displayName;

    // VPC ｜ Classic
    @NameInMap("network_type")
    public String networkType;

    // 地域id
    @NameInMap("region")
    public String region;

    // 可用区id列表
    @NameInMap("zones")
    public java.util.List<String> zones;

    // 环境唯一标识
    @NameInMap("name")
    public String name;

    public static UpdateSingleworkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSingleworkspaceRequest self = new UpdateSingleworkspaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSingleworkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSingleworkspaceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateSingleworkspaceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public UpdateSingleworkspaceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateSingleworkspaceRequest setZones(java.util.List<String> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<String> getZones() {
        return this.zones;
    }

    public UpdateSingleworkspaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
