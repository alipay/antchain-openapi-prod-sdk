// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class ProductCodes extends TeaModel {
    // 产品code列表
    @NameInMap("product_codes")
    @Validation(required = true)
    public java.util.List<String> productCodes;

    public static ProductCodes build(java.util.Map<String, ?> map) throws Exception {
        ProductCodes self = new ProductCodes();
        return TeaModel.build(map, self);
    }

    public ProductCodes setProductCodes(java.util.List<String> productCodes) {
        this.productCodes = productCodes;
        return this;
    }
    public java.util.List<String> getProductCodes() {
        return this.productCodes;
    }

}
