// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class MaoOperateAddress extends TeaModel {
    // 省
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("province")
    @Validation(required = true)
    public MaoDistrictCode province;

    // 市
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("city")
    @Validation(required = true)
    public MaoDistrictCode city;

    // 区
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("district")
    @Validation(required = true)
    public MaoDistrictCode district;

    // 详细地址
    /**
     * <strong>example:</strong>
     * <p>详细地址</p>
     */
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 经度
    /**
     * <strong>example:</strong>
     * <p>经度</p>
     */
    @NameInMap("longitude")
    public String longitude;

    // 纬度
    /**
     * <strong>example:</strong>
     * <p>纬度</p>
     */
    @NameInMap("latitude")
    public String latitude;

    public static MaoOperateAddress build(java.util.Map<String, ?> map) throws Exception {
        MaoOperateAddress self = new MaoOperateAddress();
        return TeaModel.build(map, self);
    }

    public MaoOperateAddress setProvince(MaoDistrictCode province) {
        this.province = province;
        return this;
    }
    public MaoDistrictCode getProvince() {
        return this.province;
    }

    public MaoOperateAddress setCity(MaoDistrictCode city) {
        this.city = city;
        return this;
    }
    public MaoDistrictCode getCity() {
        return this.city;
    }

    public MaoOperateAddress setDistrict(MaoDistrictCode district) {
        this.district = district;
        return this;
    }
    public MaoDistrictCode getDistrict() {
        return this.district;
    }

    public MaoOperateAddress setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public MaoOperateAddress setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public MaoOperateAddress setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

}
