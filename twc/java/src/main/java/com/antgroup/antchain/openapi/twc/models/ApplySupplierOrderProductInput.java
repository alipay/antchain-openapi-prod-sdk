// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplySupplierOrderProductInput extends TeaModel {
    // 采购商品id
    /**
     * <strong>example:</strong>
     * <p>202024234234</p>
     */
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 采购商品数量
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("product_num")
    @Validation(required = true)
    public Long productNum;

    public static ApplySupplierOrderProductInput build(java.util.Map<String, ?> map) throws Exception {
        ApplySupplierOrderProductInput self = new ApplySupplierOrderProductInput();
        return TeaModel.build(map, self);
    }

    public ApplySupplierOrderProductInput setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ApplySupplierOrderProductInput setProductNum(Long productNum) {
        this.productNum = productNum;
        return this;
    }
    public Long getProductNum() {
        return this.productNum;
    }

}
