// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class SimCarLocationInfo extends TeaModel {
    // 定位时间
    /**
     * <strong>example:</strong>
     * <p>2025-12-26 17:07:00</p>
     */
    @NameInMap("location_time")
    @Validation(required = true)
    public String locationTime;

    // 经度
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("longitude")
    @Validation(required = true)
    public String longitude;

    // 纬度
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("latitude")
    @Validation(required = true)
    public String latitude;

    public static SimCarLocationInfo build(java.util.Map<String, ?> map) throws Exception {
        SimCarLocationInfo self = new SimCarLocationInfo();
        return TeaModel.build(map, self);
    }

    public SimCarLocationInfo setLocationTime(String locationTime) {
        this.locationTime = locationTime;
        return this;
    }
    public String getLocationTime() {
        return this.locationTime;
    }

    public SimCarLocationInfo setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public SimCarLocationInfo setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

}
