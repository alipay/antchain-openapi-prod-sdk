// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_63625f64df2048aca9ff5bea9e227854.models;

import com.aliyun.tea.*;

public class CheckAntcloudAitechguardAicoguardrailsAnswerRequest extends TeaModel {
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
    public String question;

    // 当前回答内容，最大长度10000个字符。
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 用户ID，用于主体风险判断
    @NameInMap("user_id")
    public String userId;

    public static CheckAntcloudAitechguardAicoguardrailsAnswerRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAntcloudAitechguardAicoguardrailsAnswerRequest self = new CheckAntcloudAitechguardAicoguardrailsAnswerRequest();
        return TeaModel.build(map, self);
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
