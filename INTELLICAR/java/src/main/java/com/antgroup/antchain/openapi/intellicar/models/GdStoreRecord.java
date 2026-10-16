// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class GdStoreRecord extends TeaModel {
    // 店铺ID
    /**
     * <strong>example:</strong>
     * <p>01cc5d1cc0</p>
     */
    @NameInMap("shop_id")
    @Validation(required = true)
    public String shopId;

    // 店铺名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 店铺地址
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 店铺所在省份
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("pname")
    @Validation(required = true)
    public String pname;

    // 店铺所在城市
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("cityname")
    @Validation(required = true)
    public String cityname;

    // 品牌id
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("brand_id")
    @Validation(required = true)
    public String brandId;

    // 品牌名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("brand_name")
    @Validation(required = true)
    public String brandName;

    // 经销商代码
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("office_code")
    @Validation(required = true)
    public String officeCode;

    // 经度
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("lon")
    @Validation(required = true)
    public String lon;

    // 纬度
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("lat")
    @Validation(required = true)
    public String lat;

    // 店铺数据版本集合
    @NameInMap("version_list")
    @Validation(required = true)
    public java.util.List<String> versionList;

    public static GdStoreRecord build(java.util.Map<String, ?> map) throws Exception {
        GdStoreRecord self = new GdStoreRecord();
        return TeaModel.build(map, self);
    }

    public GdStoreRecord setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public GdStoreRecord setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GdStoreRecord setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public GdStoreRecord setPname(String pname) {
        this.pname = pname;
        return this;
    }
    public String getPname() {
        return this.pname;
    }

    public GdStoreRecord setCityname(String cityname) {
        this.cityname = cityname;
        return this;
    }
    public String getCityname() {
        return this.cityname;
    }

    public GdStoreRecord setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    public String getBrandId() {
        return this.brandId;
    }

    public GdStoreRecord setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public GdStoreRecord setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
        return this;
    }
    public String getOfficeCode() {
        return this.officeCode;
    }

    public GdStoreRecord setLon(String lon) {
        this.lon = lon;
        return this;
    }
    public String getLon() {
        return this.lon;
    }

    public GdStoreRecord setLat(String lat) {
        this.lat = lat;
        return this;
    }
    public String getLat() {
        return this.lat;
    }

    public GdStoreRecord setVersionList(java.util.List<String> versionList) {
        this.versionList = versionList;
        return this;
    }
    public java.util.List<String> getVersionList() {
        return this.versionList;
    }

}
