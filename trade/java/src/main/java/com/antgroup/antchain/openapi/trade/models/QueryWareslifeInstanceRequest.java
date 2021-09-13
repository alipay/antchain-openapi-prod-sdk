// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class QueryWareslifeInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商品code
    @NameInMap("product_codes")
    @Validation(required = true)
    public java.util.List<String> productCodes;

    public static QueryWareslifeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWareslifeInstanceRequest self = new QueryWareslifeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryWareslifeInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWareslifeInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryWareslifeInstanceRequest setProductCodes(java.util.List<String> productCodes) {
        this.productCodes = productCodes;
        return this;
    }
    public java.util.List<String> getProductCodes() {
        return this.productCodes;
    }

}
