// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twoe.models;

import com.aliyun.tea.*;

public class QueryEvidenceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // session编号
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    public static QueryEvidenceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEvidenceRequest self = new QueryEvidenceRequest();
        return TeaModel.build(map, self);
    }

    public QueryEvidenceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEvidenceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEvidenceRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
