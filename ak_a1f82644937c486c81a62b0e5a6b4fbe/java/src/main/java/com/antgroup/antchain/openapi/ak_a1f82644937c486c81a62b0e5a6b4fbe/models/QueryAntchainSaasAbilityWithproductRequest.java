// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a1f82644937c486c81a62b0e5a6b4fbe.models;

import com.aliyun.tea.*;

public class QueryAntchainSaasAbilityWithproductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品编码，源自于开放平台OPM定义的技术产品编码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static QueryAntchainSaasAbilityWithproductRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainSaasAbilityWithproductRequest self = new QueryAntchainSaasAbilityWithproductRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainSaasAbilityWithproductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainSaasAbilityWithproductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainSaasAbilityWithproductRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
