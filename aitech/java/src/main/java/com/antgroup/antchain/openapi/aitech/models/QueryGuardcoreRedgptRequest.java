// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QueryGuardcoreRedgptRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 唯一请求ID
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 多轮对话会话ID
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 场景code
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 调用方AppCode
    @NameInMap("app_code")
    @Validation(required = true)
    public String appCode;

    // 提问内容
    @NameInMap("question")
    @Validation(required = true)
    public String question;

    // 提问内容格式,当前仅支持PLAINTEXT
    @NameInMap("question_format")
    @Validation(required = true)
    public String questionFormat;

    // 加密的调用方业务UserId
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 是否流式输出
    @NameInMap("stream")
    @Validation(required = true)
    public Boolean stream;

    public static QueryGuardcoreRedgptRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGuardcoreRedgptRequest self = new QueryGuardcoreRedgptRequest();
        return TeaModel.build(map, self);
    }

    public QueryGuardcoreRedgptRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGuardcoreRedgptRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGuardcoreRedgptRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGuardcoreRedgptRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryGuardcoreRedgptRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryGuardcoreRedgptRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public QueryGuardcoreRedgptRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public QueryGuardcoreRedgptRequest setQuestionFormat(String questionFormat) {
        this.questionFormat = questionFormat;
        return this;
    }
    public String getQuestionFormat() {
        return this.questionFormat;
    }

    public QueryGuardcoreRedgptRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryGuardcoreRedgptRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

}
