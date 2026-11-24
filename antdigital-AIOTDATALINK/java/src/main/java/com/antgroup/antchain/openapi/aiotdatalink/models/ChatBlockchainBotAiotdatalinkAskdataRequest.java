// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiotdatalink.models;

import com.aliyun.tea.*;

public class ChatBlockchainBotAiotdatalinkAskdataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 场景编码
    @NameInMap("scene_code")
    public String sceneCode;

    // 问数问题
    @NameInMap("question")
    @Validation(required = true)
    public String question;

    // 会话ID
    @NameInMap("conversation_id")
    @Validation(required = true)
    public String conversationId;

    // 用户ID
    @NameInMap("user_id")
    public String userId;

    // 序列号，用于表示同一时间请求序号
    @NameInMap("caller")
    public String caller;

    public static ChatBlockchainBotAiotdatalinkAskdataRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatBlockchainBotAiotdatalinkAskdataRequest self = new ChatBlockchainBotAiotdatalinkAskdataRequest();
        return TeaModel.build(map, self);
    }

    public ChatBlockchainBotAiotdatalinkAskdataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ChatBlockchainBotAiotdatalinkAskdataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ChatBlockchainBotAiotdatalinkAskdataRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ChatBlockchainBotAiotdatalinkAskdataRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public ChatBlockchainBotAiotdatalinkAskdataRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public ChatBlockchainBotAiotdatalinkAskdataRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public ChatBlockchainBotAiotdatalinkAskdataRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ChatBlockchainBotAiotdatalinkAskdataRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

}
