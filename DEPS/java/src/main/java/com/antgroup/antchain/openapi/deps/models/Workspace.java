// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class Workspace extends TeaModel {
    // 创建时间
    @NameInMap("create_time")
    public String createTime;

    // workspace 显示名称
    @NameInMap("display_name")
    public String displayName;

    // workspace 名称
    @NameInMap("id")
    public String id;

    // 工作空间唯一标识
    @NameInMap("identity")
    public String identity;

    // workspace 名称（等同于唯一标识）
    @NameInMap("name")
    public String name;

    // 网络类型
    @NameInMap("network_type")
    public String networkType;

    // workspace所在regionId
    @NameInMap("region")
    public String region;

    // region id
    @NameInMap("region_id")
    public String regionId;

    // 所属租户名称
    @NameInMap("tenant")
    public String tenant;

    // 最近更新时间
    @NameInMap("update_time")
    public String updateTime;

    // workspace所在zoneIdentity列表
    @NameInMap("zones")
    public java.util.List<String> zones;

    // 工作空间类型
    @NameInMap("type")
    public String type;

    public static Workspace build(java.util.Map<String, ?> map) throws Exception {
        Workspace self = new Workspace();
        return TeaModel.build(map, self);
    }

    public Workspace setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Workspace setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Workspace setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Workspace setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public Workspace setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Workspace setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public Workspace setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public Workspace setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public Workspace setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public Workspace setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public Workspace setZones(java.util.List<String> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<String> getZones() {
        return this.zones;
    }

    public Workspace setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
