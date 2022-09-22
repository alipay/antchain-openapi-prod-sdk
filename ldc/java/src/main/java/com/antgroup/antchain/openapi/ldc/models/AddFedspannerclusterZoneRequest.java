// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AddFedspannerclusterZoneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 联邦统一接入集群名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 待添加的机房（可用区）列表
    @NameInMap("zones")
    @Validation(required = true)
    public java.util.List<String> zones;

    public static AddFedspannerclusterZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFedspannerclusterZoneRequest self = new AddFedspannerclusterZoneRequest();
        return TeaModel.build(map, self);
    }

    public AddFedspannerclusterZoneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddFedspannerclusterZoneRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public AddFedspannerclusterZoneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddFedspannerclusterZoneRequest setZones(java.util.List<String> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<String> getZones() {
        return this.zones;
    }

}
