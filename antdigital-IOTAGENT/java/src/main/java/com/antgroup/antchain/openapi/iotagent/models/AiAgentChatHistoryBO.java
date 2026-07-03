// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class AiAgentChatHistoryBO extends TeaModel {
    // 客户端ID
    /**
     * <strong>example:</strong>
     * <p>00:ba:cc</p>
     */
    @NameInMap("client_id")
    @Validation(required = true)
    public String clientId;

    // 客户端类型
    /**
     * <strong>example:</strong>
     * <p>ESP32</p>
     */
    @NameInMap("client_type")
    @Validation(required = true)
    public String clientType;

    // 对话内容
    /**
     * <strong>example:</strong>
     * <p>...对话内容</p>
     */
    @NameInMap("conversation_content")
    @Validation(required = true)
    public String conversationContent;

    // 对话类型
    /**
     * <strong>example:</strong>
     * <p>request</p>
     */
    @NameInMap("conversation_type")
    @Validation(required = true)
    public String conversationType;

    // 会话ID
    /**
     * <strong>example:</strong>
     * <p>7468486322254688256</p>
     */
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 对话时间（格式化后的时间）
    /**
     * <strong>example:</strong>
     * <p>2026-06-24 21:32:59</p>
     */
    @NameInMap("time")
    @Validation(required = true)
    public String time;

    public static AiAgentChatHistoryBO build(java.util.Map<String, ?> map) throws Exception {
        AiAgentChatHistoryBO self = new AiAgentChatHistoryBO();
        return TeaModel.build(map, self);
    }

    public AiAgentChatHistoryBO setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public AiAgentChatHistoryBO setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public AiAgentChatHistoryBO setConversationContent(String conversationContent) {
        this.conversationContent = conversationContent;
        return this;
    }
    public String getConversationContent() {
        return this.conversationContent;
    }

    public AiAgentChatHistoryBO setConversationType(String conversationType) {
        this.conversationType = conversationType;
        return this;
    }
    public String getConversationType() {
        return this.conversationType;
    }

    public AiAgentChatHistoryBO setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public AiAgentChatHistoryBO setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
