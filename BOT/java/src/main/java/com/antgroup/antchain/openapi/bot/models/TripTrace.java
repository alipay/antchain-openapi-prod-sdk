// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TripTrace extends TeaModel {
    // 定位数据
    /**
     * <strong>example:</strong>
     * <p>113.784416,22.747500</p>
     */
    @NameInMap("device_location")
    @Validation(required = true)
    public String deviceLocation;

    public static TripTrace build(java.util.Map<String, ?> map) throws Exception {
        TripTrace self = new TripTrace();
        return TeaModel.build(map, self);
    }

    public TripTrace setDeviceLocation(String deviceLocation) {
        this.deviceLocation = deviceLocation;
        return this;
    }
    public String getDeviceLocation() {
        return this.deviceLocation;
    }

}
