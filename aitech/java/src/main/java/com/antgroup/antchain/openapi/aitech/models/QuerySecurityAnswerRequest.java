// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QuerySecurityAnswerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用标示
    @NameInMap("enterprise")
    public String enterprise;

    // 细分调用方标识
    @NameInMap("business_id")
    @Validation(required = true)
    public String businessId;

    // 当前回答内容，最大长度40000个字符
    @NameInMap("content")
    @Validation(required = true, maxLength = 40000)
    public String content;

    // 场景code
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 是否开启流式检测功能。默认值：N：不开启，Y：开启
    @NameInMap("flow_detect")
    public String flowDetect;

    // 会话id
    @NameInMap("flow_msg_id")
    public String flowMsgId;

    // 流失内容结束标示
    @NameInMap("flow_end")
    public String flowEnd;

    // 表示是同一个Q&A
    @NameInMap("message_id")
    public String messageId;

    // 是否要针对大模型输出的内容中的隐私数据进行脱敏。默认值：N：不开启，Y：开启
    @NameInMap("privacy_data_obfuscation")
    public String privacyDataObfuscation;

    public static QuerySecurityAnswerRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityAnswerRequest self = new QuerySecurityAnswerRequest();
        return TeaModel.build(map, self);
    }

    public QuerySecurityAnswerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySecurityAnswerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySecurityAnswerRequest setEnterprise(String enterprise) {
        this.enterprise = enterprise;
        return this;
    }
    public String getEnterprise() {
        return this.enterprise;
    }

    public QuerySecurityAnswerRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public QuerySecurityAnswerRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QuerySecurityAnswerRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QuerySecurityAnswerRequest setFlowDetect(String flowDetect) {
        this.flowDetect = flowDetect;
        return this;
    }
    public String getFlowDetect() {
        return this.flowDetect;
    }

    public QuerySecurityAnswerRequest setFlowMsgId(String flowMsgId) {
        this.flowMsgId = flowMsgId;
        return this;
    }
    public String getFlowMsgId() {
        return this.flowMsgId;
    }

    public QuerySecurityAnswerRequest setFlowEnd(String flowEnd) {
        this.flowEnd = flowEnd;
        return this;
    }
    public String getFlowEnd() {
        return this.flowEnd;
    }

    public QuerySecurityAnswerRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public QuerySecurityAnswerRequest setPrivacyDataObfuscation(String privacyDataObfuscation) {
        this.privacyDataObfuscation = privacyDataObfuscation;
        return this;
    }
    public String getPrivacyDataObfuscation() {
        return this.privacyDataObfuscation;
    }

}
