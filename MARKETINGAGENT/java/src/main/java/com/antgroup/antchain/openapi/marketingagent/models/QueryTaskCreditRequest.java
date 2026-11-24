// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class QueryTaskCreditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 从问数接口返回trace_id值
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static QueryTaskCreditRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskCreditRequest self = new QueryTaskCreditRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskCreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTaskCreditRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
