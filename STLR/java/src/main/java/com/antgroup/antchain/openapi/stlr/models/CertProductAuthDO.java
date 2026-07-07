// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class CertProductAuthDO extends TeaModel {
    // 三方平台产品ID
    /**
     * <strong>example:</strong>
     * <p>产品ID</p>
     */
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 三方平台产品名称
    /**
     * <strong>example:</strong>
     * <p>产品名称</p>
     */
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    public static CertProductAuthDO build(java.util.Map<String, ?> map) throws Exception {
        CertProductAuthDO self = new CertProductAuthDO();
        return TeaModel.build(map, self);
    }

    public CertProductAuthDO setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CertProductAuthDO setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

}
