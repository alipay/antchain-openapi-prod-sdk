// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AddressInfo extends TeaModel {
    // 城市编码
    /**
     * <strong>example:</strong>
     * <p>371000</p>
     */
    @NameInMap("city_code")
    @Validation(required = true)
    public String cityCode;

    // 区县编码
    /**
     * <strong>example:</strong>
     * <p>371002</p>
     */
    @NameInMap("district_code")
    @Validation(required = true)
    public String districtCode;

    // 地址
    /**
     * <strong>example:</strong>
     * <p>万塘路18号黄龙时代广场B座</p>
     */
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 省份编码
    /**
     * <strong>example:</strong>
     * <p>370000</p>
     */
    @NameInMap("province_code")
    @Validation(required = true)
    public String provinceCode;

    // 高德 poiid
    /**
     * <strong>example:</strong>
     * <p>B0FFIVU189</p>
     */
    @NameInMap("poiid")
    public String poiid;

    // 经度
    /**
     * <strong>example:</strong>
     * <p>120.760001</p>
     */
    @NameInMap("longitude")
    public String longitude;

    // 纬度
    /**
     * <strong>example:</strong>
     * <p>60.270001</p>
     */
    @NameInMap("latitude")
    public String latitude;

    // 地址类型
    /**
     * <strong>example:</strong>
     * <p>BUSINESS_ADDRESS</p>
     */
    @NameInMap("type")
    public String type;

    public static AddressInfo build(java.util.Map<String, ?> map) throws Exception {
        AddressInfo self = new AddressInfo();
        return TeaModel.build(map, self);
    }

    public AddressInfo setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public AddressInfo setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }
    public String getDistrictCode() {
        return this.districtCode;
    }

    public AddressInfo setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public AddressInfo setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }
    public String getProvinceCode() {
        return this.provinceCode;
    }

    public AddressInfo setPoiid(String poiid) {
        this.poiid = poiid;
        return this;
    }
    public String getPoiid() {
        return this.poiid;
    }

    public AddressInfo setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public AddressInfo setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public AddressInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
