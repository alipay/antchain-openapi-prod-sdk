// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class QueryBusinessruleServicesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 提交人域账号
    @NameInMap("submitter_id")
    @Validation(required = true)
    public String submitterId;

    public static QueryBusinessruleServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessruleServicesRequest self = new QueryBusinessruleServicesRequest();
        return TeaModel.build(map, self);
    }

    public QueryBusinessruleServicesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBusinessruleServicesRequest setSubmitterId(String submitterId) {
        this.submitterId = submitterId;
        return this;
    }
    public String getSubmitterId() {
        return this.submitterId;
    }

}
