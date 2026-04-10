// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class TripPoint extends TeaModel {
    // 经度
    /**
     * <strong>example:</strong>
     * <p>121.503052</p>
     */
    @NameInMap("longitude")
    public String longitude;

    // 维度
    /**
     * <strong>example:</strong>
     * <p>31.218412</p>
     */
    @NameInMap("latitude")
    public String latitude;

    public static TripPoint build(java.util.Map<String, ?> map) throws Exception {
        TripPoint self = new TripPoint();
        return TeaModel.build(map, self);
    }

    public TripPoint setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public TripPoint setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

}
