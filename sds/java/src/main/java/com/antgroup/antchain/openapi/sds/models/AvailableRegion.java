// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class AvailableRegion extends TeaModel {
    // 【类型】 消费金可用地域的类型，COUNTRY表示国家级别可用，PROVINCE表示省级可用，CITY表示市级可用，DISTRICT表示区级可用。
    // 可选取值
    // PROVINCE:  地域信息精确到省级
    // CITY:  地域信息精确到市级
    // DISTRICT:  地域信息精确到区级
    // COUNTRY:  地域信息精确到国家级
    /**
     * <strong>example:</strong>
     * <p>PROVINCE</p>
     */
    @NameInMap("type")
    public String type;

    // 【省】 消费金可用省
    /**
     * <strong>example:</strong>
     * <p>广东省</p>
     */
    @NameInMap("province")
    public String province;

    // 【市】 消费金可用
    /**
     * <strong>example:</strong>
     * <p>深圳市</p>
     */
    @NameInMap("city")
    public String city;

    // 【区】 消费金可用区
    /**
     * <strong>example:</strong>
     * <p>南山区</p>
     */
    @NameInMap("district")
    public String district;

    // 【国家】 消费金可用国家
    /**
     * <strong>example:</strong>
     * <p>中国大陆</p>
     */
    @NameInMap("country")
    public String country;

    public static AvailableRegion build(java.util.Map<String, ?> map) throws Exception {
        AvailableRegion self = new AvailableRegion();
        return TeaModel.build(map, self);
    }

    public AvailableRegion setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AvailableRegion setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public AvailableRegion setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public AvailableRegion setDistrict(String district) {
        this.district = district;
        return this;
    }
    public String getDistrict() {
        return this.district;
    }

    public AvailableRegion setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

}
