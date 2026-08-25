// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.skintellidoctor.models;

import com.aliyun.tea.*;

public class QueryAntdigitalIntellidoctorKnowledgeagentSseRequest extends TeaModel {
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

    public static QueryAntdigitalIntellidoctorKnowledgeagentSseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalIntellidoctorKnowledgeagentSseRequest self = new QueryAntdigitalIntellidoctorKnowledgeagentSseRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalIntellidoctorKnowledgeagentSseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntdigitalIntellidoctorKnowledgeagentSseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntdigitalIntellidoctorKnowledgeagentSseRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAntdigitalIntellidoctorKnowledgeagentSseRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryAntdigitalIntellidoctorKnowledgeagentSseRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public QueryAntdigitalIntellidoctorKnowledgeagentSseRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryAntdigitalIntellidoctorKnowledgeagentSseRequest setCustomCode(String customCode) {
        this.customCode = customCode;
        return this;
    }
    public String getCustomCode() {
        return this.customCode;
    }

    public QueryAntdigitalIntellidoctorKnowledgeagentSseRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
