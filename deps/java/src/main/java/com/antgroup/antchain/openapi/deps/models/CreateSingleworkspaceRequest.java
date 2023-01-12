// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateSingleworkspaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

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

    // 枚举值：
    //   标准工作空间NORMAL;
    //   单元化工作空间UNIT
    @NameInMap("type")
    public String type;

    // 可用区
    @NameInMap("zones")
    public java.util.List<String> zones;

    // region_id，由于和阿里云命名冲突，故用paas_region_id
    @NameInMap("paas_region_id")
    @Validation(required = true)
    public String paasRegionId;

    // zone_ids
    @NameInMap("zone_ids")
    @Validation(required = true)
    public java.util.List<String> zoneIds;

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

    public CreateSingleworkspaceRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
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

    public CreateSingleworkspaceRequest setPaasRegionId(String paasRegionId) {
        this.paasRegionId = paasRegionId;
        return this;
    }
    public String getPaasRegionId() {
        return this.paasRegionId;
    }

    public CreateSingleworkspaceRequest setZoneIds(java.util.List<String> zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

}
