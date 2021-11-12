// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Zone extends TeaModel {
    // 机房的标识（与阿里云对齐）
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // 机房的名字
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 地域的id
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // 机房内关联的资源池列表
    @NameInMap("resource_pools")
    @Validation(required = true)
    public java.util.List<ResourcePool> resourcePools;

    // 机房的id
    @NameInMap("zone_id")
    @Validation(required = true)
    public String zoneId;

    // 显示的名字
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    public static Zone build(java.util.Map<String, ?> map) throws Exception {
        Zone self = new Zone();
        return TeaModel.build(map, self);
    }

    public Zone setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public Zone setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Zone setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public Zone setResourcePools(java.util.List<ResourcePool> resourcePools) {
        this.resourcePools = resourcePools;
        return this;
    }
    public java.util.List<ResourcePool> getResourcePools() {
        return this.resourcePools;
    }

    public Zone setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public Zone setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}
