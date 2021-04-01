// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConfigDelegaterelationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被代理的租户ID
    @NameInMap("delegated_tenant_id")
    @Validation(required = true)
    public String delegatedTenantId;

    public static QueryConfigDelegaterelationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigDelegaterelationRequest self = new QueryConfigDelegaterelationRequest();
        return TeaModel.build(map, self);
    }

    public QueryConfigDelegaterelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryConfigDelegaterelationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryConfigDelegaterelationRequest setDelegatedTenantId(String delegatedTenantId) {
        this.delegatedTenantId = delegatedTenantId;
        return this;
    }
    public String getDelegatedTenantId() {
        return this.delegatedTenantId;
    }

}
