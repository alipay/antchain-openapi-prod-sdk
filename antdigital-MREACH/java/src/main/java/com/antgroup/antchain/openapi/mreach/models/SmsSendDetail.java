// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mreach.models;

import com.aliyun.tea.*;

public class SmsSendDetail extends TeaModel {
    // 错误码
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("err_code")
    @Validation(required = true)
    public String errCode;

    // 接受日期
    /**
     * <strong>example:</strong>
     * <p>2026-04-21T09:47:51Z</p>
     */
    @NameInMap("receive_date")
    @Validation(required = true)
    public String receiveDate;

    // 发送日期
    /**
     * <strong>example:</strong>
     * <p>2026-04-21T09:47:44Z</p>
     */
    @NameInMap("send_date")
    @Validation(required = true)
    public String sendDate;

    // 接收短信的手机号码
    /**
     * <strong>example:</strong>
     * <p>155xxxxxxxx</p>
     */
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 短信内容
    /**
     * <strong>example:</strong>
     * <p>蚂蚁数字科技】您的订单已发货,请查收。</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 模板id
    /**
     * <strong>example:</strong>
     * <p>SMS_xxxx</p>
     */
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 短信发送状态：1-等待回执，2-发送失败，3-发送成功。
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    public static SmsSendDetail build(java.util.Map<String, ?> map) throws Exception {
        SmsSendDetail self = new SmsSendDetail();
        return TeaModel.build(map, self);
    }

    public SmsSendDetail setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public SmsSendDetail setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
        return this;
    }
    public String getReceiveDate() {
        return this.receiveDate;
    }

    public SmsSendDetail setSendDate(String sendDate) {
        this.sendDate = sendDate;
        return this;
    }
    public String getSendDate() {
        return this.sendDate;
    }

    public SmsSendDetail setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public SmsSendDetail setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SmsSendDetail setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SmsSendDetail setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
