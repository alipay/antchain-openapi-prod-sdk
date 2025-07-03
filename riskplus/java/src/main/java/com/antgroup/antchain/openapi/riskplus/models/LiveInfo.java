// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class LiveInfo extends TeaModel {
    // 居住省份
    /**
     * <strong>example:</strong>
     * <p>居住省份</p>
     */
    @NameInMap("live_province")
    public String liveProvince;

    // 居住城市
    /**
     * <strong>example:</strong>
     * <p>居住城市</p>
     */
    @NameInMap("live_city")
    public String liveCity;

    // 居住区域
    /**
     * <strong>example:</strong>
     * <p>居住区域</p>
     */
    @NameInMap("live_area")
    public String liveArea;

    // 居住街道
    /**
     * <strong>example:</strong>
     * <p>居住街道</p>
     */
    @NameInMap("live_street")
    public String liveStreet;

    // 居住详细地址
    /**
     * <strong>example:</strong>
     * <p>居住详细地址</p>
     */
    @NameInMap("live_address")
    public String liveAddress;

    // 居住年限
    /**
     * <strong>example:</strong>
     * <p>居住年限</p>
     */
    @NameInMap("live_years")
    public Long liveYears;

    public static LiveInfo build(java.util.Map<String, ?> map) throws Exception {
        LiveInfo self = new LiveInfo();
        return TeaModel.build(map, self);
    }

    public LiveInfo setLiveProvince(String liveProvince) {
        this.liveProvince = liveProvince;
        return this;
    }
    public String getLiveProvince() {
        return this.liveProvince;
    }

    public LiveInfo setLiveCity(String liveCity) {
        this.liveCity = liveCity;
        return this;
    }
    public String getLiveCity() {
        return this.liveCity;
    }

    public LiveInfo setLiveArea(String liveArea) {
        this.liveArea = liveArea;
        return this;
    }
    public String getLiveArea() {
        return this.liveArea;
    }

    public LiveInfo setLiveStreet(String liveStreet) {
        this.liveStreet = liveStreet;
        return this;
    }
    public String getLiveStreet() {
        return this.liveStreet;
    }

    public LiveInfo setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
        return this;
    }
    public String getLiveAddress() {
        return this.liveAddress;
    }

    public LiveInfo setLiveYears(Long liveYears) {
        this.liveYears = liveYears;
        return this;
    }
    public Long getLiveYears() {
        return this.liveYears;
    }

}
