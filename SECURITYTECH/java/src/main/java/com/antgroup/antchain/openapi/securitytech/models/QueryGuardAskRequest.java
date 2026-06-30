// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryGuardAskRequest extends TeaModel {
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

    // serviceCode
    @NameInMap("service_code")
    @Validation(required = true)
    public String serviceCode;

    // 当前提问内容，最大长度10000个字符。
    @NameInMap("question")
    @Validation(required = true, maxLength = 10000)
    public String question;

    // 提问内容类型，纯文本: PLAINTEXT，图片url: PICTURE_URL
    @NameInMap("question_format")
    @Validation(maxLength = 32)
    public String questionFormat;

    // scene_code
    @NameInMap("scene_code")
    public String sceneCode;

    // app_code
    @NameInMap("app_code")
    public String appCode;

    // raas_products
    @NameInMap("raas_products")
    public String raasProducts;

    public static QueryGuardAskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGuardAskRequest self = new QueryGuardAskRequest();
        return TeaModel.build(map, self);
    }

    public QueryGuardAskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGuardAskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGuardAskRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryGuardAskRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGuardAskRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public QueryGuardAskRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public QueryGuardAskRequest setQuestionFormat(String questionFormat) {
        this.questionFormat = questionFormat;
        return this;
    }
    public String getQuestionFormat() {
        return this.questionFormat;
    }

    public QueryGuardAskRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryGuardAskRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public QueryGuardAskRequest setRaasProducts(String raasProducts) {
        this.raasProducts = raasProducts;
        return this;
    }
    public String getRaasProducts() {
        return this.raasProducts;
    }

}
