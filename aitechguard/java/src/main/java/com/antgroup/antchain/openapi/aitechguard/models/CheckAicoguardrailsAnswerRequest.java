// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitechguard.models;

import com.aliyun.tea.*;

public class CheckAicoguardrailsAnswerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 会话ID，用于匹配多轮对话上下文
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 数据唯一标识，能够根据该值定位到该条数据
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 应用名，蚂蚁侧提供
    @NameInMap("app_code")
    @Validation(required = true)
    public String appCode;

    // 场景code，走SOP流程申请
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 当前提问内容，最大长度800个字符。
    @NameInMap("question")
    @Validation(required = true)
    public String question;

    // 当前提问内容格式, 默认值:PLAINTEXT
    @NameInMap("question_format")
    public String questionFormat;

    // 当前回答内容，最大长度800个字符。
    @NameInMap("answer")
    @Validation(required = true)
    public String answer;

    // 当前回答内容格式, 默认取PLAINTEXT
    @NameInMap("answer_format")
    public String answerFormat;

    // 用户ID，用于主体风险判断
    @NameInMap("user_id")
    public String userId;

    public static CheckAicoguardrailsAnswerRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAicoguardrailsAnswerRequest self = new CheckAicoguardrailsAnswerRequest();
        return TeaModel.build(map, self);
    }

    public CheckAicoguardrailsAnswerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckAicoguardrailsAnswerRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CheckAicoguardrailsAnswerRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckAicoguardrailsAnswerRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public CheckAicoguardrailsAnswerRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public CheckAicoguardrailsAnswerRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public CheckAicoguardrailsAnswerRequest setQuestionFormat(String questionFormat) {
        this.questionFormat = questionFormat;
        return this;
    }
    public String getQuestionFormat() {
        return this.questionFormat;
    }

    public CheckAicoguardrailsAnswerRequest setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public CheckAicoguardrailsAnswerRequest setAnswerFormat(String answerFormat) {
        this.answerFormat = answerFormat;
        return this;
    }
    public String getAnswerFormat() {
        return this.answerFormat;
    }

    public CheckAicoguardrailsAnswerRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
