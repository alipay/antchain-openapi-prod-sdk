// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class ListCommercialcoreCommodityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static ListCommercialcoreCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCommercialcoreCommodityRequest self = new ListCommercialcoreCommodityRequest();
        return TeaModel.build(map, self);
    }

    public ListCommercialcoreCommodityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListCommercialcoreCommodityRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
