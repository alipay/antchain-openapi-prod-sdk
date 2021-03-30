// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class LogisticLocation extends TeaModel {
    // 结构化地址信息,规则遵循：国家、省份、城市、区县、城镇、乡村、街道、门牌号码、屋邨、大厦
    @NameInMap("address")
    public String address;

    // 行政区划代码
    @NameInMap("city_code")
    public String cityCode;

    // 纬度
    // 
    @NameInMap("lat")
    @Validation(required = true)
    public String lat;

    // 经度
    @NameInMap("lon")
    @Validation(required = true)
    public String lon;

    // 轨迹时间戳
    @NameInMap("track_time")
    @Validation(required = true)
    public Long trackTime;

    public static LogisticLocation build(java.util.Map<String, ?> map) throws Exception {
        LogisticLocation self = new LogisticLocation();
        return TeaModel.build(map, self);
    }

    public LogisticLocation setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public LogisticLocation setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public LogisticLocation setLat(String lat) {
        this.lat = lat;
        return this;
    }
    public String getLat() {
        return this.lat;
    }

    public LogisticLocation setLon(String lon) {
        this.lon = lon;
        return this;
    }
    public String getLon() {
        return this.lon;
    }

    public LogisticLocation setTrackTime(Long trackTime) {
        this.trackTime = trackTime;
        return this;
    }
    public Long getTrackTime() {
        return this.trackTime;
    }

}
