// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class QueryAbilityWithproductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品编码，源自于开放平台OPM定义的技术产品编码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static QueryAbilityWithproductRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAbilityWithproductRequest self = new QueryAbilityWithproductRequest();
        return TeaModel.build(map, self);
    }

    public QueryAbilityWithproductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAbilityWithproductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAbilityWithproductRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
