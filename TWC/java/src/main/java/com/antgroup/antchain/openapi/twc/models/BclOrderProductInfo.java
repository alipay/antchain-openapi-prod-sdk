// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclOrderProductInfo extends TeaModel {
    // 创建商品后返回的商品id
    /**
     * <strong>example:</strong>
     * <p>PROD1223</p>
     */
    @NameInMap("product_id")
    @Validation(required = true, maxLength = 32)
    public String productId;

    // 商品数量
    // 目前只允许一个商品
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("product_number")
    @Validation(required = true, minimum = 1)
    public Long productNumber;

    public static BclOrderProductInfo build(java.util.Map<String, ?> map) throws Exception {
        BclOrderProductInfo self = new BclOrderProductInfo();
        return TeaModel.build(map, self);
    }

    public BclOrderProductInfo setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public BclOrderProductInfo setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
        return this;
    }
    public Long getProductNumber() {
        return this.productNumber;
    }

}
