// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsUniversalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // post_body
    @NameInMap("post_body")
    @Validation(required = true)
    public String postBody;

    // tenant_id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static QueryRmsUniversalRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsUniversalRequest self = new QueryRmsUniversalRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsUniversalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRmsUniversalRequest setPostBody(String postBody) {
        this.postBody = postBody;
        return this;
    }
    public String getPostBody() {
        return this.postBody;
    }

    public QueryRmsUniversalRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
