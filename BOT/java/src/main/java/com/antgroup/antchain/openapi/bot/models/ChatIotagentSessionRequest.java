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

    // 问题（新建模式必填；携 resume 续接时互斥不传）
    @NameInMap("query")
    public String query;

    // 附件
    @NameInMap("attach_files")
    public java.util.List<FileInfo> attachFiles;

    // josn字符串
    @NameInMap("extra_params")
    public String extraParams;

    // 续接结构体 JSON（系分 §8.1.1）：{turnId 必填, afterSequence 可选, command 可选={type:DECIDE/ANSWER/CANCEL, expectedVersion, payload}}；payload 键 camelCase：DECIDE={interactionId,decision,scope} ANSWER={interactionId,answer} CANCEL={reason}
    @NameInMap("resume")
    public String resume;

    // 用户侧模型选择（§8.1.2）：本地模型目录稳定键（如 dtmaas/deepseek-flash），独立顶层参数唯一入口；仅新建 Turn 可传，省略沿默认配置，空/非法值拒绝；不得经 extra_params 携带
    @NameInMap("model_key")
    public String modelKey;

    // 用户侧思考等级选择（§8.1.2）：受控选项，须为选中模型目录声明 supported_efforts 内取值（model.list 返回），非法值拒绝；仅新建 Turn 可传，不得经 extra_params 携带
    @NameInMap("reasoning_effort")
    public String reasoningEffort;

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

    public ChatIotagentSessionRequest setResume(String resume) {
        this.resume = resume;
        return this;
    }
    public String getResume() {
        return this.resume;
    }

    public ChatIotagentSessionRequest setModelKey(String modelKey) {
        this.modelKey = modelKey;
        return this;
    }
    public String getModelKey() {
        return this.modelKey;
    }

    public ChatIotagentSessionRequest setReasoningEffort(String reasoningEffort) {
        this.reasoningEffort = reasoningEffort;
        return this;
    }
    public String getReasoningEffort() {
        return this.reasoningEffort;
    }

}
