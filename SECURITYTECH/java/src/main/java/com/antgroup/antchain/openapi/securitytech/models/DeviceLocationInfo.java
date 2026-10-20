// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class DeviceLocationInfo extends TeaModel {
    // 纬度
    /**
     * <strong>example:</strong>
     * <p>30.288701</p>
     */
    @NameInMap("lat")
    @Validation(required = true)
    public String lat;

    // 经度
    /**
     * <strong>example:</strong>
     * <p>120.160256</p>
     */
    @NameInMap("lng")
    @Validation(required = true)
    public String lng;

    // 最后一次定位上报时间
    /**
     * <strong>example:</strong>
     * <p>2026-10-13 10:00:00</p>
     */
    @NameInMap("location_time")
    @Validation(required = true)
    public String locationTime;

    // 预留可扩展字段json
    @NameInMap("extra_info")
    public String extraInfo;

    public static DeviceLocationInfo build(java.util.Map<String, ?> map) throws Exception {
        DeviceLocationInfo self = new DeviceLocationInfo();
        return TeaModel.build(map, self);
    }

    public DeviceLocationInfo setLat(String lat) {
        this.lat = lat;
        return this;
    }
    public String getLat() {
        return this.lat;
    }

    public DeviceLocationInfo setLng(String lng) {
        this.lng = lng;
        return this;
    }
    public String getLng() {
        return this.lng;
    }

    public DeviceLocationInfo setLocationTime(String locationTime) {
        this.locationTime = locationTime;
        return this;
    }
    public String getLocationTime() {
        return this.locationTime;
    }

    public DeviceLocationInfo setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
