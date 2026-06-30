// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.guardrails.models;

import com.aliyun.tea.*;

public class QueryAskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用标识，非必传
    @NameInMap("app_code")
    public String appCode;

    // 接口名称，必传
    @NameInMap("interface_name")
    @Validation(required = true)
    public String interfaceName;

    // 场景编码，必传
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 会话ID，用于匹配多轮对话上下文，必传
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 数据唯一标识，必传
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 服务名称，必传。可选值参考 GuardrailsServiceCodeEnum
    @NameInMap("service_name")
    @Validation(required = true)
    public String serviceName;

    // 当前提问内容，最大长度800字符，必传
    @NameInMap("question")
    @Validation(required = true)
    public String question;

    // 提问内容格式，非必传，默认PLAINTEXT。可选值参考 GuardrailsContentFormatEnum
    @NameInMap("question_format")
    public String questionFormat;

    // 大模型Code，区分大模型类型和版本，非必传
    @NameInMap("model_code")
    public String modelCode;

    // 用户ID，非必传
    @NameInMap("user_id")
    public String userId;

    // 扩展属性，JSON字符串，非必传
    @NameInMap("business_properties")
    public String businessProperties;

    public static QueryAskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAskRequest self = new QueryAskRequest();
        return TeaModel.build(map, self);
    }

    public QueryAskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAskRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public QueryAskRequest setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }
    public String getInterfaceName() {
        return this.interfaceName;
    }

    public QueryAskRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryAskRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryAskRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAskRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public QueryAskRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public QueryAskRequest setQuestionFormat(String questionFormat) {
        this.questionFormat = questionFormat;
        return this;
    }
    public String getQuestionFormat() {
        return this.questionFormat;
    }

    public QueryAskRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public QueryAskRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAskRequest setBusinessProperties(String businessProperties) {
        this.businessProperties = businessProperties;
        return this;
    }
    public String getBusinessProperties() {
        return this.businessProperties;
    }

}
