// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class CheckGuardAnswerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用方标识
    @NameInMap("app_code")
    @Validation(required = true)
    public String appCode;

    // 细分调用方标识，可与 appCode 传相同值
    @NameInMap("business_id")
    public String businessId;

    // 文本内容，最大5000字符长度
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 场景code：
    // ● llm_output_detection：大模型输出通用场景
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 是否开启流式检测功能。默认值：N：不开启
    // Y：开启
    // N：不开启
    @NameInMap("flow_detect")
    public String flowDetect;

    // 会话ID，标记本次请求内容属于同一段流式内容，文本审核引擎会自动拼接后进行审核，拼接文字片段后不超过10000字的部分
    @NameInMap("session_id")
    public String sessionId;

    // 是否要针对大模型输出的CoT、回答进行代答/改写。默认值：N：不开启
    // Y：开启
    // N：不开启
    @NameInMap("reply_proxy")
    public String replyProxy;

    // 是否要针对大模型输出的内容中的隐私数据进行脱敏。默认值：N：不开启
    // Y：开启
    // N：不开启
    @NameInMap("privacy_data_obfuscation")
    public String privacyDataObfuscation;

    public static CheckGuardAnswerRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckGuardAnswerRequest self = new CheckGuardAnswerRequest();
        return TeaModel.build(map, self);
    }

    public CheckGuardAnswerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckGuardAnswerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckGuardAnswerRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public CheckGuardAnswerRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public CheckGuardAnswerRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CheckGuardAnswerRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public CheckGuardAnswerRequest setFlowDetect(String flowDetect) {
        this.flowDetect = flowDetect;
        return this;
    }
    public String getFlowDetect() {
        return this.flowDetect;
    }

    public CheckGuardAnswerRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CheckGuardAnswerRequest setReplyProxy(String replyProxy) {
        this.replyProxy = replyProxy;
        return this;
    }
    public String getReplyProxy() {
        return this.replyProxy;
    }

    public CheckGuardAnswerRequest setPrivacyDataObfuscation(String privacyDataObfuscation) {
        this.privacyDataObfuscation = privacyDataObfuscation;
        return this;
    }
    public String getPrivacyDataObfuscation() {
        return this.privacyDataObfuscation;
    }

}
