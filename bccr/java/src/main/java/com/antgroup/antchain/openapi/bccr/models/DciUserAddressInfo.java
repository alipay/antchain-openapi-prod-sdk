// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class DciUserAddressInfo extends TeaModel {
    // 所在国家
    /**
     * <strong>example:</strong>
     * <p>所在国家</p>
     */
    @NameInMap("country")
    public String country;

    // 所在省份
    /**
     * <strong>example:</strong>
     * <p>所在省份</p>
     */
    @NameInMap("province")
    public String province;

    // 所在城市
    /**
     * <strong>example:</strong>
     * <p>所在城市</p>
     */
    @NameInMap("city")
    public String city;

    // 识别出的地区
    /**
     * <strong>example:</strong>
     * <p>识别出的地区</p>
     */
    @NameInMap("district")
    public String district;

    // 识别出的街道
    /**
     * <strong>example:</strong>
     * <p>识别出的街道</p>
     */
    @NameInMap("town")
    public String town;

    // 识别出的路
    /**
     * <strong>example:</strong>
     * <p>识别出的路</p>
     */
    @NameInMap("road")
    public String road;

    // 识别出的路号牌
    /**
     * <strong>example:</strong>
     * <p>识别出的路号牌</p>
     */
    @NameInMap("road_no")
    public String roadNo;

    // 地址详情
    /**
     * <strong>example:</strong>
     * <p>地址详情</p>
     */
    @NameInMap("address_detail")
    public String addressDetail;

    public static DciUserAddressInfo build(java.util.Map<String, ?> map) throws Exception {
        DciUserAddressInfo self = new DciUserAddressInfo();
        return TeaModel.build(map, self);
    }

    public DciUserAddressInfo setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DciUserAddressInfo setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public DciUserAddressInfo setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public DciUserAddressInfo setDistrict(String district) {
        this.district = district;
        return this;
    }
    public String getDistrict() {
        return this.district;
    }

    public DciUserAddressInfo setTown(String town) {
        this.town = town;
        return this;
    }
    public String getTown() {
        return this.town;
    }

    public DciUserAddressInfo setRoad(String road) {
        this.road = road;
        return this;
    }
    public String getRoad() {
        return this.road;
    }

    public DciUserAddressInfo setRoadNo(String roadNo) {
        this.roadNo = roadNo;
        return this;
    }
    public String getRoadNo() {
        return this.roadNo;
    }

    public DciUserAddressInfo setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
        return this;
    }
    public String getAddressDetail() {
        return this.addressDetail;
    }

}
