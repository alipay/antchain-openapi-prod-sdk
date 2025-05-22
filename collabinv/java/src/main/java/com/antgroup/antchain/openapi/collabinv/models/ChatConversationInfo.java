// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class ChatConversationInfo extends TeaModel {
    // 会话ID
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // agent ID
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 会话名称
    @NameInMap("title")
    public String title;

    // 创建时间
    @NameInMap("create_date")
    @Validation(required = true)
    public String createDate;

    public static ChatConversationInfo build(java.util.Map<String, ?> map) throws Exception {
        ChatConversationInfo self = new ChatConversationInfo();
        return TeaModel.build(map, self);
    }

    public ChatConversationInfo setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ChatConversationInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ChatConversationInfo setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ChatConversationInfo setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ChatConversationInfo setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

}
