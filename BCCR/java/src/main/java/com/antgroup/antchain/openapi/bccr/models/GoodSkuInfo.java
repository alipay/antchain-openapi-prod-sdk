// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class GoodSkuInfo extends TeaModel {
    // 授权规格序号
    /**
     * <strong>example:</strong>
     * <p>001</p>
     */
    @NameInMap("sku_num")
    @Validation(required = true)
    public String skuNum;

    // 授权规格价格(单位：分)
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("price")
    @Validation(required = true)
    public Long price;

    public static GoodSkuInfo build(java.util.Map<String, ?> map) throws Exception {
        GoodSkuInfo self = new GoodSkuInfo();
        return TeaModel.build(map, self);
    }

    public GoodSkuInfo setSkuNum(String skuNum) {
        this.skuNum = skuNum;
        return this;
    }
    public String getSkuNum() {
        return this.skuNum;
    }

    public GoodSkuInfo setPrice(Long price) {
        this.price = price;
        return this;
    }
    public Long getPrice() {
        return this.price;
    }

}
