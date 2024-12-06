// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class QueryUnderwritingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 承保申请号（蚂蚁内部）
    @NameInMap("insurance_application_no_inner")
    @Validation(required = true)
    public String insuranceApplicationNoInner;

    public static QueryUnderwritingRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnderwritingRequest self = new QueryUnderwritingRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnderwritingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUnderwritingRequest setInsuranceApplicationNoInner(String insuranceApplicationNoInner) {
        this.insuranceApplicationNoInner = insuranceApplicationNoInner;
        return this;
    }
    public String getInsuranceApplicationNoInner() {
        return this.insuranceApplicationNoInner;
    }

}
