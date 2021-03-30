// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class AllocLocationInfo extends TeaModel {
    // 仓位ID
    @NameInMap("location_id")
    public String locationId;

    // 仓位名称
    @NameInMap("location_name")
    public String locationName;

    // 仓位容量
    @NameInMap("capacity")
    public Long capacity;

    // 已用容量
    @NameInMap("used_capacity")
    public String usedCapacity;

    // 监控等级【VIDEOREGULATORY：视频监控】
    @NameInMap("monitor_capacity")
    public String monitorCapacity;

    // 监控水平【STANDARD：标准版，UPGRADED：升级版】
    @NameInMap("monitor_level")
    public String monitorLevel;

    public static AllocLocationInfo build(java.util.Map<String, ?> map) throws Exception {
        AllocLocationInfo self = new AllocLocationInfo();
        return TeaModel.build(map, self);
    }

    public AllocLocationInfo setLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }
    public String getLocationId() {
        return this.locationId;
    }

    public AllocLocationInfo setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }
    public String getLocationName() {
        return this.locationName;
    }

    public AllocLocationInfo setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }
    public Long getCapacity() {
        return this.capacity;
    }

    public AllocLocationInfo setUsedCapacity(String usedCapacity) {
        this.usedCapacity = usedCapacity;
        return this;
    }
    public String getUsedCapacity() {
        return this.usedCapacity;
    }

    public AllocLocationInfo setMonitorCapacity(String monitorCapacity) {
        this.monitorCapacity = monitorCapacity;
        return this;
    }
    public String getMonitorCapacity() {
        return this.monitorCapacity;
    }

    public AllocLocationInfo setMonitorLevel(String monitorLevel) {
        this.monitorLevel = monitorLevel;
        return this;
    }
    public String getMonitorLevel() {
        return this.monitorLevel;
    }

}
