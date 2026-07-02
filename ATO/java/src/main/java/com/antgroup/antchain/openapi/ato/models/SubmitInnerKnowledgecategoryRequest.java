// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitInnerKnowledgecategoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static SubmitInnerKnowledgecategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInnerKnowledgecategoryRequest self = new SubmitInnerKnowledgecategoryRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInnerKnowledgecategoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitInnerKnowledgecategoryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitInnerKnowledgecategoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
