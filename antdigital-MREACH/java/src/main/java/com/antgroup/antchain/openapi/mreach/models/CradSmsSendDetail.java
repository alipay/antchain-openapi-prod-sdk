// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mreach.models;

import com.aliyun.tea.*;

public class CradSmsSendDetail extends TeaModel {
    // 消息ID
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    // 接收手机号
    /**
     * <strong>example:</strong>
     * <p>155xxxxxxxx</p>
     */
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 卡片短信模板ID
    /**
     * <strong>example:</strong>
     * <p>CARD_SMS_xxxx</p>
     */
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 最终接收类型: CARD_SMS-卡片短信送达, SMS-回落为普通短信送达。
    /**
     * <strong>example:</strong>
     * <p>CARD_SMS</p>
     */
    @NameInMap("final_receive_type")
    @Validation(required = true)
    public String finalReceiveType;

    // 短信发送状态。1-等待回执，2-发送失败，3-发送成功。
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 错误码（发送失败时返回）
    /**
     * <strong>example:</strong>
     * <p>FAIL</p>
     */
    @NameInMap("error_code")
    @Validation(required = true)
    public String errorCode;

    // 错误描述（发送失败时返回）
    /**
     * <strong>example:</strong>
     * <p>analysis fail</p>
     */
    @NameInMap("error_message")
    @Validation(required = true)
    public String errorMessage;

    // 回执时间,yyyy-MM-dd HH:mm:ss格式
    /**
     * <strong>example:</strong>
     * <p>1971-01-01 00:00:00</p>
     */
    @NameInMap("report_time")
    @Validation(required = true)
    public String reportTime;

    // 回落短信正文（仅 finalReceiveType=SMS 时有值）
    /**
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("content")
    public String content;

    public static CradSmsSendDetail build(java.util.Map<String, ?> map) throws Exception {
        CradSmsSendDetail self = new CradSmsSendDetail();
        return TeaModel.build(map, self);
    }

    public CradSmsSendDetail setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public CradSmsSendDetail setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CradSmsSendDetail setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CradSmsSendDetail setFinalReceiveType(String finalReceiveType) {
        this.finalReceiveType = finalReceiveType;
        return this;
    }
    public String getFinalReceiveType() {
        return this.finalReceiveType;
    }

    public CradSmsSendDetail setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public CradSmsSendDetail setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CradSmsSendDetail setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CradSmsSendDetail setReportTime(String reportTime) {
        this.reportTime = reportTime;
        return this;
    }
    public String getReportTime() {
        return this.reportTime;
    }

    public CradSmsSendDetail setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
