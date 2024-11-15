// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class QueryBusinessruleMatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求的reqMsgId
    @NameInMap("request_msg_id")
    @Validation(required = true)
    public String requestMsgId;

    public static QueryBusinessruleMatchRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessruleMatchRequest self = new QueryBusinessruleMatchRequest();
        return TeaModel.build(map, self);
    }

    public QueryBusinessruleMatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBusinessruleMatchRequest setRequestMsgId(String requestMsgId) {
        this.requestMsgId = requestMsgId;
        return this;
    }
    public String getRequestMsgId() {
        return this.requestMsgId;
    }

}
