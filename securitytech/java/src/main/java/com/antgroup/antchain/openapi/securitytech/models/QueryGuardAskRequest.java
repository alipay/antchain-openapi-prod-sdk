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

    // 大模型提问护栏服务, 用于区分提供的服务类别，当前支持：TJ_QUESTION_BASIC、TJ_ANSWER_BASIC 两种
    @NameInMap("service_name")
    @Validation(required = true, maxLength = 128)
    public String serviceName;

    // 当前提问内容，最大长度10000个字符。
    @NameInMap("question")
    @Validation(required = true, maxLength = 10000)
    public String question;

    // 用户ID，用于主体风险判断，如果是2088开头的阿里体系用户，请传入2088开头的用户ID
    @NameInMap("user_id")
    @Validation(required = true, maxLength = 32)
    public String userId;

    // 提问内容类型，纯文本: PLAINTEXT，图片url: PICTURE_URL
    @NameInMap("question_format")
    @Validation(maxLength = 32)
    public String questionFormat;

    // 大模型ID，表示大模型版本
    @NameInMap("model_code")
    @Validation(maxLength = 128)
    public String modelCode;

    // 扩展属性Map，key限定为：aigcType、serviceScene、triggerSource、bizOwner，对应的value取值为： aigcType： ● 文生文：text_text ● 文生图：text_pic ● 图生文：pic_text ● 图生图：pic_pic serviceScene: 根据业务使用的不同情况支持自定义入参做策略个性化配置，私域或者公域，以及不同的业务应用 比如领域： serviceScene = insurance 表示保险 serviceScene = medical 表示医疗 serviceScene = government 表示政务 比如业务活动应用： serviceScene = xiacu 表示夏促 serviceScene = qixi 表示七夕 triggerSource: 不同的来源，比如移动端、web端、API
    @NameInMap("business_properties")
    public KeyValueMap businessProperties;

    // scene_code
    @NameInMap("scene_code")
    public String sceneCode;

    // serviceCode
    @NameInMap("service_code")
    public String serviceCode;

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

    public QueryGuardAskRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public QueryGuardAskRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public QueryGuardAskRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryGuardAskRequest setQuestionFormat(String questionFormat) {
        this.questionFormat = questionFormat;
        return this;
    }
    public String getQuestionFormat() {
        return this.questionFormat;
    }

    public QueryGuardAskRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public QueryGuardAskRequest setBusinessProperties(KeyValueMap businessProperties) {
        this.businessProperties = businessProperties;
        return this;
    }
    public KeyValueMap getBusinessProperties() {
        return this.businessProperties;
    }

    public QueryGuardAskRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryGuardAskRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
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
