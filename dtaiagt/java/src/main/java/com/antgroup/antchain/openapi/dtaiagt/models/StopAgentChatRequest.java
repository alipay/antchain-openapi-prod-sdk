// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class StopAgentChatRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // chat_id
    @NameInMap("chat_id")
    @Validation(required = true)
    public String chatId;

    // agent_id
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 会话ID，非必填，拓展用
    @NameInMap("session_id")
    public String sessionId;

    public static StopAgentChatRequest build(java.util.Map<String, ?> map) throws Exception {
        StopAgentChatRequest self = new StopAgentChatRequest();
        return TeaModel.build(map, self);
    }

    public StopAgentChatRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StopAgentChatRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StopAgentChatRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public StopAgentChatRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public StopAgentChatRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
