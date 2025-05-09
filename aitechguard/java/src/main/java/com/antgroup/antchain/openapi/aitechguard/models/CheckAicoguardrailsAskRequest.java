// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitechguard.models;

import com.aliyun.tea.*;

public class CheckAicoguardrailsAskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 数据唯一标识，能够根据该值定位到该条数据
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 会话ID，用于匹配多轮对话上下文
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 应用名，蚂蚁侧提供
    @NameInMap("app_code")
    @Validation(required = true)
    public String appCode;

    // 场景code，走SOP流程申请
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 当前提问内容
    @NameInMap("question")
    @Validation(required = true)
    public String question;

    // 当前提问格式，默认PLAINTEXT，详见3.2 questionFormat&answerFormat说明
    @NameInMap("question_format")
    @Validation(required = true)
    public String questionFormat;

    // 加密的uid，仅用于唯一标示调用方
    @NameInMap("user_id")
    public String userId;

    // 多轮对话最后一次回答
    @NameInMap("last_answer")
    public String lastAnswer;

    // 需要个性化处理的标签
    @NameInMap("personal_label_customization")
    public PersonalLabelCustomization personalLabelCustomization;

    // 是否需要开启针对大模型提问prompt攻击手法的防御功能，包括越狱攻击（劫持、诱导、其他）、注入攻击、内容泛化攻击（文本变形变种）等常见攻击手法。默认值：N：不开启
    // Y：开启
    // N：不开启
    @NameInMap("attack_defense")
    public String attackDefense;

    public static CheckAicoguardrailsAskRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAicoguardrailsAskRequest self = new CheckAicoguardrailsAskRequest();
        return TeaModel.build(map, self);
    }

    public CheckAicoguardrailsAskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckAicoguardrailsAskRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckAicoguardrailsAskRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CheckAicoguardrailsAskRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public CheckAicoguardrailsAskRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public CheckAicoguardrailsAskRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public CheckAicoguardrailsAskRequest setQuestionFormat(String questionFormat) {
        this.questionFormat = questionFormat;
        return this;
    }
    public String getQuestionFormat() {
        return this.questionFormat;
    }

    public CheckAicoguardrailsAskRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CheckAicoguardrailsAskRequest setLastAnswer(String lastAnswer) {
        this.lastAnswer = lastAnswer;
        return this;
    }
    public String getLastAnswer() {
        return this.lastAnswer;
    }

    public CheckAicoguardrailsAskRequest setPersonalLabelCustomization(PersonalLabelCustomization personalLabelCustomization) {
        this.personalLabelCustomization = personalLabelCustomization;
        return this;
    }
    public PersonalLabelCustomization getPersonalLabelCustomization() {
        return this.personalLabelCustomization;
    }

    public CheckAicoguardrailsAskRequest setAttackDefense(String attackDefense) {
        this.attackDefense = attackDefense;
        return this;
    }
    public String getAttackDefense() {
        return this.attackDefense;
    }

}
