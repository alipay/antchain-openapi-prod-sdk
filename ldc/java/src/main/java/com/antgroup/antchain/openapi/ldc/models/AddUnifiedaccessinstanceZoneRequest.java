// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AddUnifiedaccessinstanceZoneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 统一接入实例名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 可用区（机房）列表
    @NameInMap("zones")
    @Validation(required = true)
    public java.util.List<String> zones;

    public static AddUnifiedaccessinstanceZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUnifiedaccessinstanceZoneRequest self = new AddUnifiedaccessinstanceZoneRequest();
        return TeaModel.build(map, self);
    }

    public AddUnifiedaccessinstanceZoneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddUnifiedaccessinstanceZoneRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public AddUnifiedaccessinstanceZoneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddUnifiedaccessinstanceZoneRequest setZones(java.util.List<String> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<String> getZones() {
        return this.zones;
    }

}
