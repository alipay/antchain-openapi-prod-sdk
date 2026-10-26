// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryAiotdatalinkAskdataRequest extends TeaModel {
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

    // 问数的问题
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

    public static QueryAiotdatalinkAskdataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAiotdatalinkAskdataRequest self = new QueryAiotdatalinkAskdataRequest();
        return TeaModel.build(map, self);
    }

    public QueryAiotdatalinkAskdataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAiotdatalinkAskdataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAiotdatalinkAskdataRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAiotdatalinkAskdataRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryAiotdatalinkAskdataRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public QueryAiotdatalinkAskdataRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public QueryAiotdatalinkAskdataRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAiotdatalinkAskdataRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

}
