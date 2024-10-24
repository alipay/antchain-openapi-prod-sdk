// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class InsureProductInfo extends TeaModel {
    // 商品库id
    @NameInMap("product_id")
    @Validation(required = true, maxLength = 128)
    public String productId;

    // 商品设备编号
    @NameInMap("product_imei_id")
    @Validation(required = true, maxLength = 256)
    public String productImeiId;

    // 商品采购价，单位：分
    @NameInMap("purchase_amount")
    @Validation(required = true, maximum = 100000000)
    public Long purchaseAmount;

    public static InsureProductInfo build(java.util.Map<String, ?> map) throws Exception {
        InsureProductInfo self = new InsureProductInfo();
        return TeaModel.build(map, self);
    }

    public InsureProductInfo setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public InsureProductInfo setProductImeiId(String productImeiId) {
        this.productImeiId = productImeiId;
        return this;
    }
    public String getProductImeiId() {
        return this.productImeiId;
    }

    public InsureProductInfo setPurchaseAmount(Long purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
        return this;
    }
    public Long getPurchaseAmount() {
        return this.purchaseAmount;
    }

}
