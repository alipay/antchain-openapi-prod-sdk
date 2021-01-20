// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateSingleworkspaceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // workspace 显示名称
    @NameInMap("display_name")
    public String displayName;

    // workspace 唯一标识符
    @NameInMap("name")
    public String name;

    // VPC ｜ Classic
    @NameInMap("network_type")
    public String networkType;

    // 地域
    @NameInMap("region")
    public String region;

    // 枚举值：
    //   标准工作空间NORMAL;
    //   单元化工作空间UNIT
    @NameInMap("type")
    public String type;

    // 可用区
    @NameInMap("zones")
    public java.util.List<String> zones;

    public static CreateSingleworkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSingleworkspaceRequest self = new CreateSingleworkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSingleworkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSingleworkspaceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateSingleworkspaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSingleworkspaceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateSingleworkspaceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateSingleworkspaceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateSingleworkspaceRequest setZones(java.util.List<String> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<String> getZones() {
        return this.zones;
    }

}
