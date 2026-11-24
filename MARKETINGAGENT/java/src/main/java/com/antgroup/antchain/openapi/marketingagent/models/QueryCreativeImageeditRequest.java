// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class QueryCreativeImageeditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 子图编辑接口返回的独立消息 ID，必须属于当前调用用户及租户。
    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    public static QueryCreativeImageeditRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreativeImageeditRequest self = new QueryCreativeImageeditRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreativeImageeditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreativeImageeditRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
