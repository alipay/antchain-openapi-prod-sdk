// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ChatIotagentSessionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 智能体id
    @NameInMap("agent_id")
    @Validation(required = true)
    public String agentId;

    // 会话id
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 用户ID
    @NameInMap("user_id")
    public String userId;

    // 会话类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 问题
    @NameInMap("query")
    @Validation(required = true)
    public String query;

    // 附件
    @NameInMap("attach_files")
    public java.util.List<FileInfo> attachFiles;

    // josn字符串
    @NameInMap("extra_params")
    public String extraParams;

    public static ChatIotagentSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatIotagentSessionRequest self = new ChatIotagentSessionRequest();
        return TeaModel.build(map, self);
    }

    public ChatIotagentSessionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ChatIotagentSessionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ChatIotagentSessionRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ChatIotagentSessionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ChatIotagentSessionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ChatIotagentSessionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ChatIotagentSessionRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ChatIotagentSessionRequest setAttachFiles(java.util.List<FileInfo> attachFiles) {
        this.attachFiles = attachFiles;
        return this;
    }
    public java.util.List<FileInfo> getAttachFiles() {
        return this.attachFiles;
    }

    public ChatIotagentSessionRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

}
