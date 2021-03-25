// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SKUItem extends TeaModel {
    // 集分宝销售费率
    @NameInMap("rate")
    @Validation(required = true)
    public String rate;

    // 包含集分宝个数
    @NameInMap("sku_amount")
    @Validation(required = true)
    public Long skuAmount;

    // 商品ID
    @NameInMap("sku_id")
    @Validation(required = true)
    public String skuId;

    // 商品名称
    @NameInMap("sku_name")
    @Validation(required = true)
    public String skuName;

    // 商品面值（单位：元）
    @NameInMap("sku_price")
    @Validation(required = true)
    public String skuPrice;

    // 商品状态：0可用，1冻结，2下线
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    public static SKUItem build(java.util.Map<String, ?> map) throws Exception {
        SKUItem self = new SKUItem();
        return TeaModel.build(map, self);
    }

    public SKUItem setRate(String rate) {
        this.rate = rate;
        return this;
    }
    public String getRate() {
        return this.rate;
    }

    public SKUItem setSkuAmount(Long skuAmount) {
        this.skuAmount = skuAmount;
        return this;
    }
    public Long getSkuAmount() {
        return this.skuAmount;
    }

    public SKUItem setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public SKUItem setSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }
    public String getSkuName() {
        return this.skuName;
    }

    public SKUItem setSkuPrice(String skuPrice) {
        this.skuPrice = skuPrice;
        return this;
    }
    public String getSkuPrice() {
        return this.skuPrice;
    }

    public SKUItem setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
