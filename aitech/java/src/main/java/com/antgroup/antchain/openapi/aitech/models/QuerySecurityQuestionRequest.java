// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QuerySecurityQuestionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用方唯一标示
    @NameInMap("enterprise")
    public String enterprise;

    // 提问内容
    @NameInMap("question")
    @Validation(required = true, maxLength = 10000)
    public String question;

    // 调用方标示
    @NameInMap("business_id")
    @Validation(required = true)
    public String businessId;

    // 场景code
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 标示是否是同一个Q&A
    @NameInMap("message_id")
    public String messageId;

    // 会话ID
    @NameInMap("session_id")
    public String sessionId;

    // 是否开启流式检测功能。默认值：N：不开启，Y：开启
    @NameInMap("multi_session_detect")
    public String multiSessionDetect;

    // 是否开启针对大模型输入文本的的安全改写和增强功能。默认值：N：不开启，Y：开启
    @NameInMap("prompt_reword")
    public String promptReword;

    // 是否需要针对提问内容的进行金融合规检测。默认值：N：不开启，Y：开启
    @NameInMap("finance_compliance_detection")
    public String financeComplianceDetection;

    // 是否需要针对提问内容的进行领域识别
    @NameInMap("field_identify")
    @Validation(required = true)
    public String fieldIdentify;

    // 是否开启提示词攻击防御功能
    @NameInMap("prompt_attack_defense")
    public String promptAttackDefense;

    // 是否开启隐私数据泄露的专项检测
    @NameInMap("privacy_data_detection")
    public String privacyDataDetection;

    public static QuerySecurityQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityQuestionRequest self = new QuerySecurityQuestionRequest();
        return TeaModel.build(map, self);
    }

    public QuerySecurityQuestionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySecurityQuestionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySecurityQuestionRequest setEnterprise(String enterprise) {
        this.enterprise = enterprise;
        return this;
    }
    public String getEnterprise() {
        return this.enterprise;
    }

    public QuerySecurityQuestionRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public QuerySecurityQuestionRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public QuerySecurityQuestionRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QuerySecurityQuestionRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public QuerySecurityQuestionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QuerySecurityQuestionRequest setMultiSessionDetect(String multiSessionDetect) {
        this.multiSessionDetect = multiSessionDetect;
        return this;
    }
    public String getMultiSessionDetect() {
        return this.multiSessionDetect;
    }

    public QuerySecurityQuestionRequest setPromptReword(String promptReword) {
        this.promptReword = promptReword;
        return this;
    }
    public String getPromptReword() {
        return this.promptReword;
    }

    public QuerySecurityQuestionRequest setFinanceComplianceDetection(String financeComplianceDetection) {
        this.financeComplianceDetection = financeComplianceDetection;
        return this;
    }
    public String getFinanceComplianceDetection() {
        return this.financeComplianceDetection;
    }

    public QuerySecurityQuestionRequest setFieldIdentify(String fieldIdentify) {
        this.fieldIdentify = fieldIdentify;
        return this;
    }
    public String getFieldIdentify() {
        return this.fieldIdentify;
    }

    public QuerySecurityQuestionRequest setPromptAttackDefense(String promptAttackDefense) {
        this.promptAttackDefense = promptAttackDefense;
        return this;
    }
    public String getPromptAttackDefense() {
        return this.promptAttackDefense;
    }

    public QuerySecurityQuestionRequest setPrivacyDataDetection(String privacyDataDetection) {
        this.privacyDataDetection = privacyDataDetection;
        return this;
    }
    public String getPrivacyDataDetection() {
        return this.privacyDataDetection;
    }

}
