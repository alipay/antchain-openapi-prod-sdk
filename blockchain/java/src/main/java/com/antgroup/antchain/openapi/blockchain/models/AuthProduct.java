// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AuthProduct extends TeaModel {
    // 产品code
    /**
     * <strong>example:</strong>
     * <p>SOCIAL_INSURANCE</p>
     */
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 产品简称
    /**
     * <strong>example:</strong>
     * <p>社保</p>
     */
    @NameInMap("product_abbr")
    @Validation(required = true)
    public String productAbbr;

    public static AuthProduct build(java.util.Map<String, ?> map) throws Exception {
        AuthProduct self = new AuthProduct();
        return TeaModel.build(map, self);
    }

    public AuthProduct setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public AuthProduct setProductAbbr(String productAbbr) {
        this.productAbbr = productAbbr;
        return this;
    }
    public String getProductAbbr() {
        return this.productAbbr;
    }

}
