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

}
