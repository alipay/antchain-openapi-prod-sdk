// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellidoctor.models;

import com.aliyun.tea.*;

public class QueryKnowledgeagentSseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户id
    @NameInMap("user_id")
    public String userId;

    // 会话id
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 当前轮次消息id
    @NameInMap("msg_id")
    @Validation(required = true)
    public String msgId;

    // 问题
    @NameInMap("query")
    @Validation(required = true)
    public String query;

    // 客户侧租户Code
    @NameInMap("custom_code")
    public String customCode;

    // 设备ID
    @NameInMap("device_id")
    public String deviceId;

    public static QueryKnowledgeagentSseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryKnowledgeagentSseRequest self = new QueryKnowledgeagentSseRequest();
        return TeaModel.build(map, self);
    }

    public QueryKnowledgeagentSseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryKnowledgeagentSseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryKnowledgeagentSseRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryKnowledgeagentSseRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryKnowledgeagentSseRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public QueryKnowledgeagentSseRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryKnowledgeagentSseRequest setCustomCode(String customCode) {
        this.customCode = customCode;
        return this;
    }
    public String getCustomCode() {
        return this.customCode;
    }

    public QueryKnowledgeagentSseRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
