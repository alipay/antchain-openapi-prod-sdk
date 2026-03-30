// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class GdPotentialCustomerRecord extends TeaModel {
    // uv指数
    @NameInMap("uv")
    @Validation(required = true)
    public GdCustomerUv uv;

    // 城市编码，数据类型为店铺或者城市时返回该属性与值
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("citycode")
    public String citycode;

    // pv指数
    @NameInMap("pv")
    @Validation(required = true)
    public GdCustomerPv pv;

    // 店铺id，数据类型为店铺时返回该属性与值
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("shop_id")
    public String shopId;

    // 品牌id
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("brand_id")
    @Validation(required = true)
    public String brandId;

    // 店铺数量（dataType!=SHOP时返回该字段）
    @NameInMap("shop_num")
    public Long shopNum;

    // 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM）
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("time")
    @Validation(required = true)
    public String time;

    // 省份编码，数据类型为省份时返回该属性与值
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("pcode")
    public String pcode;

    // 数据类型为全国时返回该属性与值
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("countrycode")
    public String countrycode;

    public static GdPotentialCustomerRecord build(java.util.Map<String, ?> map) throws Exception {
        GdPotentialCustomerRecord self = new GdPotentialCustomerRecord();
        return TeaModel.build(map, self);
    }

    public GdPotentialCustomerRecord setUv(GdCustomerUv uv) {
        this.uv = uv;
        return this;
    }
    public GdCustomerUv getUv() {
        return this.uv;
    }

    public GdPotentialCustomerRecord setCitycode(String citycode) {
        this.citycode = citycode;
        return this;
    }
    public String getCitycode() {
        return this.citycode;
    }

    public GdPotentialCustomerRecord setPv(GdCustomerPv pv) {
        this.pv = pv;
        return this;
    }
    public GdCustomerPv getPv() {
        return this.pv;
    }

    public GdPotentialCustomerRecord setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public GdPotentialCustomerRecord setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    public String getBrandId() {
        return this.brandId;
    }

    public GdPotentialCustomerRecord setShopNum(Long shopNum) {
        this.shopNum = shopNum;
        return this;
    }
    public Long getShopNum() {
        return this.shopNum;
    }

    public GdPotentialCustomerRecord setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public GdPotentialCustomerRecord setPcode(String pcode) {
        this.pcode = pcode;
        return this;
    }
    public String getPcode() {
        return this.pcode;
    }

    public GdPotentialCustomerRecord setCountrycode(String countrycode) {
        this.countrycode = countrycode;
        return this;
    }
    public String getCountrycode() {
        return this.countrycode;
    }

}
