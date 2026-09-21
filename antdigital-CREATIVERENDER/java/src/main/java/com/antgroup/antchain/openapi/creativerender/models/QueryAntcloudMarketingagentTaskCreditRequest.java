// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class QueryAntcloudMarketingagentTaskCreditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 从问数接口返回trace_id值
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static QueryAntcloudMarketingagentTaskCreditRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudMarketingagentTaskCreditRequest self = new QueryAntcloudMarketingagentTaskCreditRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudMarketingagentTaskCreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudMarketingagentTaskCreditRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
