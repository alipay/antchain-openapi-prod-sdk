// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class QueryPolicyFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 蚂蚁侧保单唯一ID
    @NameInMap("insurance_policy_no_inner")
    @Validation(required = true)
    public String insurancePolicyNoInner;

    public static QueryPolicyFileRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPolicyFileRequest self = new QueryPolicyFileRequest();
        return TeaModel.build(map, self);
    }

    public QueryPolicyFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPolicyFileRequest setInsurancePolicyNoInner(String insurancePolicyNoInner) {
        this.insurancePolicyNoInner = insurancePolicyNoInner;
        return this;
    }
    public String getInsurancePolicyNoInner() {
        return this.insurancePolicyNoInner;
    }

}
