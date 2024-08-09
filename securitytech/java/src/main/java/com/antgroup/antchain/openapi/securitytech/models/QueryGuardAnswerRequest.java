// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryGuardAnswerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 会话ID，用于匹配多轮对话上下文
    @NameInMap("session_id")
    @Validation(required = true, maxLength = 128)
    public String sessionId;

    // 数据唯一标识，能够根据该值定位到该条数据
    @NameInMap("request_id")
    @Validation(required = true, maxLength = 64)
    public String requestId;

    // service_code
    @NameInMap("service_code")
    @Validation(required = true, maxLength = 128)
    public String serviceCode;

    // 作为一个人工智能语言模型，我还没有学习到相关信息，不过我觉得梦里啥都有，建议您保持充分的睡眠。
    @NameInMap("answer")
    @Validation(required = true, maxLength = 10000, minLength = 1)
    public String answer;

    // 作为一个解梦者，你的任务是解释以下梦境:[上证30000点，没错，是三万不是三千]。根据梦中出现的符号和主题，请提供一份客观且基于事实的解释。
    @NameInMap("question")
    @Validation(maxLength = 800, minLength = 1)
    public String question;

    // 纯文本: PLAINTEXT，图片url: PICTURE_URL
    @NameInMap("question_format")
    @Validation(maxLength = 32)
    public String questionFormat;

    // 纯文本: PLAINTEXT
    // 图片url: PICTURE_URL
    @NameInMap("answer_format")
    @Validation(maxLength = 32)
    public String answerFormat;

    // scene_code
    @NameInMap("scene_code")
    @Validation(maxLength = 128, minLength = 1)
    public String sceneCode;

    // app_code
    @NameInMap("app_code")
    public String appCode;

    // raas_products
    @NameInMap("raas_products")
    public String raasProducts;

    public static QueryGuardAnswerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGuardAnswerRequest self = new QueryGuardAnswerRequest();
        return TeaModel.build(map, self);
    }

    public QueryGuardAnswerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGuardAnswerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGuardAnswerRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryGuardAnswerRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGuardAnswerRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public QueryGuardAnswerRequest setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public QueryGuardAnswerRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public QueryGuardAnswerRequest setQuestionFormat(String questionFormat) {
        this.questionFormat = questionFormat;
        return this;
    }
    public String getQuestionFormat() {
        return this.questionFormat;
    }

    public QueryGuardAnswerRequest setAnswerFormat(String answerFormat) {
        this.answerFormat = answerFormat;
        return this;
    }
    public String getAnswerFormat() {
        return this.answerFormat;
    }

    public QueryGuardAnswerRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryGuardAnswerRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public QueryGuardAnswerRequest setRaasProducts(String raasProducts) {
        this.raasProducts = raasProducts;
        return this;
    }
    public String getRaasProducts() {
        return this.raasProducts;
    }

}
