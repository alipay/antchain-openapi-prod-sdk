// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class Zone extends TeaModel {
    // 数据中心名
    @NameInMap("data_center")
    @Validation(required = true)
    public String dataCenter;

    // 可用区展示名
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 可用区名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 所属地域
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 可用区id
    @NameInMap("zone_id")
    @Validation(required = true)
    public String zoneId;

    // 地域id
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    public static Zone build(java.util.Map<String, ?> map) throws Exception {
        Zone self = new Zone();
        return TeaModel.build(map, self);
    }

    public Zone setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public Zone setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Zone setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Zone setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public Zone setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public Zone setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
