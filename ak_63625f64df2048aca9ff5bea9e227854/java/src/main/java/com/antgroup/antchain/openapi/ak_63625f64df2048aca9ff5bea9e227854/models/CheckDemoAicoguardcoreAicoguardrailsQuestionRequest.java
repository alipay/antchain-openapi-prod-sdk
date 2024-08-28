// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_63625f64df2048aca9ff5bea9e227854.models;

import com.aliyun.tea.*;

public class CheckDemoAicoguardcoreAicoguardrailsQuestionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前提问内容
    @NameInMap("question")
    @Validation(required = true)
    public String question;

    // 当前提问格式
    @NameInMap("question_format")
    public String questionFormat;

    // 应用名
    @NameInMap("app_code")
    @Validation(required = true)
    public String appCode;

    // 会话ID
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 唯一定位一个问答对
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 场景code，走SOP流程申请
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 当前固定填入：TJ_QUESTION_BASIC
    @NameInMap("service_code")
    @Validation(required = true)
    public String serviceCode;

    // Agent标识
    @NameInMap("agent_code")
    @Validation(required = true)
    public String agentCode;

    // 大模型Code，区分大模型类型和版本，比如bailing_10b_0229、bailing_65b_0315
    @NameInMap("model_code")
    public String modelCode;

    // 用户ID，用于主体风险判断
    @NameInMap("user_id")
    public String userId;

    // 扩展信息，会透传到业务属性中
    @NameInMap("business_properties")
    public Map businessProperties;

    public static CheckDemoAicoguardcoreAicoguardrailsQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDemoAicoguardcoreAicoguardrailsQuestionRequest self = new CheckDemoAicoguardcoreAicoguardrailsQuestionRequest();
        return TeaModel.build(map, self);
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionRequest setQuestionFormat(String questionFormat) {
        this.questionFormat = questionFormat;
        return this;
    }
    public String getQuestionFormat() {
        return this.questionFormat;
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionRequest setAgentCode(String agentCode) {
        this.agentCode = agentCode;
        return this;
    }
    public String getAgentCode() {
        return this.agentCode;
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionRequest setBusinessProperties(Map businessProperties) {
        this.businessProperties = businessProperties;
        return this;
    }
    public Map getBusinessProperties() {
        return this.businessProperties;
    }

}
