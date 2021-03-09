// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class Workspace extends TeaModel {
    // id
    @NameInMap("id")
    public String id;

    // 名称
    @NameInMap("name")
    public String name;

    // 网络类型
    @NameInMap("network_type")
    public String networkType;

    // 租户
    @NameInMap("tenant")
    public String tenant;

    // 可用区 id
    @NameInMap("zone_ids")
    public String zoneIds;

    // region id
    @NameInMap("region_id")
    public String regionId;

    public static Workspace build(java.util.Map<String, ?> map) throws Exception {
        Workspace self = new Workspace();
        return TeaModel.build(map, self);
    }

    public Workspace setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
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

    public Workspace setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public Workspace setZoneIds(String zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public String getZoneIds() {
        return this.zoneIds;
    }

    public Workspace setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
