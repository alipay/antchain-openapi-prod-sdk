// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class GdDest extends TeaModel {
    // 流出指数uv指数
    @NameInMap("uv")
    @Validation(required = true)
    public GdCustomerUv uv;

    // 流出指数pv指数
    @NameInMap("pv")
    @Validation(required = true)
    public GdCustomerPv pv;

    // 流出品牌id
    /**
     * <strong>example:</strong>
     * <p>103</p>
     */
    @NameInMap("brand_id")
    @Validation(required = true)
    public String brandId;

    // 流出店铺id，数据类型为店铺时返回该属性与值
    /**
     * <strong>example:</strong>
     * <p>26nZz8dsa4</p>
     */
    @NameInMap("shop_id")
    @Validation(required = true)
    public String shopId;

    // 城市编码，数据类型为店铺或者城市时返回该属性与值
    /**
     * <strong>example:</strong>
     * <p>021</p>
     */
    @NameInMap("citycode")
    @Validation(required = true)
    public String citycode;

    public static GdDest build(java.util.Map<String, ?> map) throws Exception {
        GdDest self = new GdDest();
        return TeaModel.build(map, self);
    }

    public GdDest setUv(GdCustomerUv uv) {
        this.uv = uv;
        return this;
    }
    public GdCustomerUv getUv() {
        return this.uv;
    }

    public GdDest setPv(GdCustomerPv pv) {
        this.pv = pv;
        return this;
    }
    public GdCustomerPv getPv() {
        return this.pv;
    }

    public GdDest setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    public String getBrandId() {
        return this.brandId;
    }

    public GdDest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public GdDest setCitycode(String citycode) {
        this.citycode = citycode;
        return this;
    }
    public String getCitycode() {
        return this.citycode;
    }

}
