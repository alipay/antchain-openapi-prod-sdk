// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.guardrails.models;

import com.aliyun.tea.*;

public class QueryAnswerRequest extends TeaModel {
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

    // 当前提问内容，最大长度800字符，非必传
    @NameInMap("question")
    public String question;

    // 提问内容格式，非必传，默认PLAINTEXT
    @NameInMap("question_format")
    public String questionFormat;

    // 当前回答内容，最大长度800字符，回答时必传
    @NameInMap("answer")
    @Validation(required = true)
    public String answer;

    // 回答内容格式，非必传，默认PLAINTEXT。可选值参考 GuardrailsContentFormatEnum
    @NameInMap("answer_format")
    public String answerFormat;

    // 回答类型，非必传，默认NORMAL。可选值参考 GuardrailsAnswerTypeEnum
    @NameInMap("answer_type")
    public String answerType;

    // 大模型Code，非必传
    @NameInMap("model_code")
    public String modelCode;

    // 用户ID，非必传
    @NameInMap("user_id")
    public String userId;

    // 扩展属性，JSON字符串，非必传
    @NameInMap("business_properties")
    public String businessProperties;

    public static QueryAnswerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAnswerRequest self = new QueryAnswerRequest();
        return TeaModel.build(map, self);
    }

    public QueryAnswerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAnswerRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public QueryAnswerRequest setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }
    public String getInterfaceName() {
        return this.interfaceName;
    }

    public QueryAnswerRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryAnswerRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryAnswerRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAnswerRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public QueryAnswerRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public QueryAnswerRequest setQuestionFormat(String questionFormat) {
        this.questionFormat = questionFormat;
        return this;
    }
    public String getQuestionFormat() {
        return this.questionFormat;
    }

    public QueryAnswerRequest setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public QueryAnswerRequest setAnswerFormat(String answerFormat) {
        this.answerFormat = answerFormat;
        return this;
    }
    public String getAnswerFormat() {
        return this.answerFormat;
    }

    public QueryAnswerRequest setAnswerType(String answerType) {
        this.answerType = answerType;
        return this;
    }
    public String getAnswerType() {
        return this.answerType;
    }

    public QueryAnswerRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public QueryAnswerRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAnswerRequest setBusinessProperties(String businessProperties) {
        this.businessProperties = businessProperties;
        return this;
    }
    public String getBusinessProperties() {
        return this.businessProperties;
    }

}
