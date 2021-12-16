// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class QueryCommercialcoreCommodityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static QueryCommercialcoreCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCommercialcoreCommodityRequest self = new QueryCommercialcoreCommodityRequest();
        return TeaModel.build(map, self);
    }

    public QueryCommercialcoreCommodityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCommercialcoreCommodityRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
