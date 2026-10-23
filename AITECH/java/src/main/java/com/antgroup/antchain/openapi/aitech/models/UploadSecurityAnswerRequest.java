// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class UploadSecurityAnswerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // txt/pdf 文件
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // 须 answer 前缀，否则兜底 LLM_OUTPUT_DETECTION_LITE
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 租户标识
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

    // 流式消息 ID
    @NameInMap("flow_msg_id")
    public String flowMsgId;

    // 流式检测开关
    @NameInMap("flow_detect")
    public String flowDetect;

    // 流结束标记
    @NameInMap("flow_end")
    public String flowEnd;

    public static UploadSecurityAnswerRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSecurityAnswerRequest self = new UploadSecurityAnswerRequest();
        return TeaModel.build(map, self);
    }

    public UploadSecurityAnswerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadSecurityAnswerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadSecurityAnswerRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadSecurityAnswerRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public UploadSecurityAnswerRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public UploadSecurityAnswerRequest setEnterprise(String enterprise) {
        this.enterprise = enterprise;
        return this;
    }
    public String getEnterprise() {
        return this.enterprise;
    }

    public UploadSecurityAnswerRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public UploadSecurityAnswerRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public UploadSecurityAnswerRequest setFlowMsgId(String flowMsgId) {
        this.flowMsgId = flowMsgId;
        return this;
    }
    public String getFlowMsgId() {
        return this.flowMsgId;
    }

    public UploadSecurityAnswerRequest setFlowDetect(String flowDetect) {
        this.flowDetect = flowDetect;
        return this;
    }
    public String getFlowDetect() {
        return this.flowDetect;
    }

    public UploadSecurityAnswerRequest setFlowEnd(String flowEnd) {
        this.flowEnd = flowEnd;
        return this;
    }
    public String getFlowEnd() {
        return this.flowEnd;
    }

}
