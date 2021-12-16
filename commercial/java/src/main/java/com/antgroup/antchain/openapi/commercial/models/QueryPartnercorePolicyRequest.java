// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class QueryPartnercorePolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 政策id
    @NameInMap("policy_id")
    @Validation(required = true)
    public String policyId;

    public static QueryPartnercorePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPartnercorePolicyRequest self = new QueryPartnercorePolicyRequest();
        return TeaModel.build(map, self);
    }

    public QueryPartnercorePolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPartnercorePolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
