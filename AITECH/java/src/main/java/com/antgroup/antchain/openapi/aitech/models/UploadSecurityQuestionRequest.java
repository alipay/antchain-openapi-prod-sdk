// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class UploadSecurityQuestionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // txt/pdf 文件，解析为文本（FileParseUtil），空内容报「文件内容为空」
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // 归一化后须 question 前缀，否则兜底 LLM_INPUT_DETECTION
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 租户标识（老值兼容替换）
    @NameInMap("business_id")
    @Validation(required = true)
    public String businessId;

    // 企业标识
    @NameInMap("enterprise")
    public String enterprise;

    // 访问控制维度
    @NameInMap("account_id")
    public String accountId;

    // 消息 ID
    @NameInMap("message_id")
    public String messageId;

    // 多轮会话 ID
    @NameInMap("session_id")
    public String sessionId;

    // 多轮检测开关
    @NameInMap("multi_session_detect")
    public String multiSessionDetect;

    // 安全改写开关
    @NameInMap("prompt_reword")
    public String promptReword;

    // 安全代答开关
    @NameInMap("security_answer")
    public String securityAnswer;

    // 领域识别开关
    @NameInMap("field_identify")
    public String fieldIdentify;

    public static UploadSecurityQuestionRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSecurityQuestionRequest self = new UploadSecurityQuestionRequest();
        return TeaModel.build(map, self);
    }

    public UploadSecurityQuestionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadSecurityQuestionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadSecurityQuestionRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadSecurityQuestionRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public UploadSecurityQuestionRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public UploadSecurityQuestionRequest setEnterprise(String enterprise) {
        this.enterprise = enterprise;
        return this;
    }
    public String getEnterprise() {
        return this.enterprise;
    }

    public UploadSecurityQuestionRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public UploadSecurityQuestionRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public UploadSecurityQuestionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public UploadSecurityQuestionRequest setMultiSessionDetect(String multiSessionDetect) {
        this.multiSessionDetect = multiSessionDetect;
        return this;
    }
    public String getMultiSessionDetect() {
        return this.multiSessionDetect;
    }

    public UploadSecurityQuestionRequest setPromptReword(String promptReword) {
        this.promptReword = promptReword;
        return this;
    }
    public String getPromptReword() {
        return this.promptReword;
    }

    public UploadSecurityQuestionRequest setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
        return this;
    }
    public String getSecurityAnswer() {
        return this.securityAnswer;
    }

    public UploadSecurityQuestionRequest setFieldIdentify(String fieldIdentify) {
        this.fieldIdentify = fieldIdentify;
        return this;
    }
    public String getFieldIdentify() {
        return this.fieldIdentify;
    }

}
