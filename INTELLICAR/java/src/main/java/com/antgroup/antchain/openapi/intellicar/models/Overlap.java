// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class Overlap extends TeaModel {
    // 重叠指数uv指数
    @NameInMap("uv")
    @Validation(required = true)
    public GdCustomerUv uv;

    // 重叠指数pv指数
    @NameInMap("pv")
    @Validation(required = true)
    public GdCustomerPv pv;

    // 重叠品牌id
    /**
     * <strong>example:</strong>
     * <p>104</p>
     */
    @NameInMap("brand_id")
    @Validation(required = true)
    public String brandId;

    // 重叠店铺id，数据类型为店铺时返回该属性与值
    /**
     * <strong>example:</strong>
     * <p>26nhJ8duzh</p>
     */
    @NameInMap("shop_id")
    public String shopId;

    // 重叠城市编码，数据类型为城市时返回该属性与值
    /**
     * <strong>example:</strong>
     * <p>021</p>
     */
    @NameInMap("citycode")
    public String citycode;

    // 重叠省份编码，数据类型为省份时返回该属性与值
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

    public static Overlap build(java.util.Map<String, ?> map) throws Exception {
        Overlap self = new Overlap();
        return TeaModel.build(map, self);
    }

    public Overlap setUv(GdCustomerUv uv) {
        this.uv = uv;
        return this;
    }
    public GdCustomerUv getUv() {
        return this.uv;
    }

    public Overlap setPv(GdCustomerPv pv) {
        this.pv = pv;
        return this;
    }
    public GdCustomerPv getPv() {
        return this.pv;
    }

    public Overlap setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    public String getBrandId() {
        return this.brandId;
    }

    public Overlap setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public Overlap setCitycode(String citycode) {
        this.citycode = citycode;
        return this;
    }
    public String getCitycode() {
        return this.citycode;
    }

    public Overlap setPcode(String pcode) {
        this.pcode = pcode;
        return this;
    }
    public String getPcode() {
        return this.pcode;
    }

    public Overlap setCountrycode(String countrycode) {
        this.countrycode = countrycode;
        return this;
    }
    public String getCountrycode() {
        return this.countrycode;
    }

}
