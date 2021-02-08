// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class AddressInfo extends TeaModel {
    // 省份编码
    @NameInMap("province_code")
    @Validation(required = true)
    public String provinceCode;

    // 城市编码
    @NameInMap("city_code")
    @Validation(required = true)
    public String cityCode;

    // 区域编码
    @NameInMap("district_code")
    @Validation(required = true)
    public String districtCode;

    // 详细地址
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    public static AddressInfo build(java.util.Map<String, ?> map) throws Exception {
        AddressInfo self = new AddressInfo();
        return TeaModel.build(map, self);
    }

    public AddressInfo setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }
    public String getProvinceCode() {
        return this.provinceCode;
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

}
