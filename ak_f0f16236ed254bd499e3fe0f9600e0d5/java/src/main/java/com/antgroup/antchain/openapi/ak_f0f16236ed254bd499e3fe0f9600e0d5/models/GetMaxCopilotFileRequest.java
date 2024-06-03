// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_f0f16236ed254bd499e3fe0f9600e0d5.models;

import com.aliyun.tea.*;

public class GetMaxCopilotFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 会话id
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 消息id
    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    public static GetMaxCopilotFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMaxCopilotFileRequest self = new GetMaxCopilotFileRequest();
        return TeaModel.build(map, self);
    }

    public GetMaxCopilotFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetMaxCopilotFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetMaxCopilotFileRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetMaxCopilotFileRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetMaxCopilotFileRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
