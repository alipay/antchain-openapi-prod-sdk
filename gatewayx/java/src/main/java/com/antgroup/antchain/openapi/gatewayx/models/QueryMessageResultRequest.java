// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gatewayx.models;

import com.aliyun.tea.*;

public class QueryMessageResultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 消息id
    @NameInMap("msg_id")
    @Validation(required = true)
    public String msgId;

    public static QueryMessageResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageResultRequest self = new QueryMessageResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryMessageResultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMessageResultRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

}
