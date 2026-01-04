// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class UpdateAgentChatRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // chat id
    // 
    @NameInMap("chat_id")
    @Validation(required = true)
    public String chatId;

    // session_id
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 用户反馈[up_vote, down_vote, cancel_up, cancel_down]
    // 
    @NameInMap("user_feedback")
    @Validation(required = true)
    public String userFeedback;

    // 用户建议
    // 
    @NameInMap("user_feed_remark")
    public String userFeedRemark;

    public static UpdateAgentChatRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentChatRequest self = new UpdateAgentChatRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentChatRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAgentChatRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAgentChatRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public UpdateAgentChatRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public UpdateAgentChatRequest setUserFeedback(String userFeedback) {
        this.userFeedback = userFeedback;
        return this;
    }
    public String getUserFeedback() {
        return this.userFeedback;
    }

    public UpdateAgentChatRequest setUserFeedRemark(String userFeedRemark) {
        this.userFeedRemark = userFeedRemark;
        return this;
    }
    public String getUserFeedRemark() {
        return this.userFeedRemark;
    }

}
