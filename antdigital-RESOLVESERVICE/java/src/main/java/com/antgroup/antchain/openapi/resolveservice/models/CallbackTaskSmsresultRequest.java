// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.resolveservice.models;

import com.aliyun.tea.*;

public class CallbackTaskSmsresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户号
    @NameInMap("a_case_id")
    @Validation(required = true)
    public String aCaseId;

    // 批次号
    @NameInMap("batch_no")
    @Validation(required = true)
    public String batchNo;

    // 案件主联系人姓名 AES加密
    @NameInMap("collected_name")
    @Validation(required = true)
    public String collectedName;

    // 联系人姓名 AES加密
    @NameInMap("contact_name")
    @Validation(required = true)
    public String contactName;

    // 联系人号码 AES加密
    @NameInMap("contact_phone")
    @Validation(required = true)
    public String contactPhone;

    // 联系人状态（有意愿还款之类）
    @NameInMap("contact_status")
    @Validation(required = true)
    public String contactStatus;

    // 短信内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 还款日
    @NameInMap("overdue_date")
    @Validation(required = true)
    public String overdueDate;

    // 备注
    @NameInMap("remark")
    public String remark;

    // 发送结果 21:客户回复接收成功 10:失败 11:成功
    @NameInMap("send_result")
    @Validation(required = true)
    public String sendResult;

    // 发送方式：如果是系统发送，那么为必填(1-短信，2-语音，3-智能语音)
    @NameInMap("send_way")
    @Validation(required = true)
    public Long sendWay;

    // 唯一标识(可用来判重)
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 发送时间(毫秒)
    @NameInMap("time")
    @Validation(required = true)
    public Long time;

    // 1 发送 2 接收 -客户回复
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 约定固定值-一般是对应平台的缩写
    @NameInMap("create_by")
    @Validation(required = true)
    public String createBy;

    // 短信模板
    @NameInMap("template_no")
    @Validation(required = true)
    public String templateNo;

    public static CallbackTaskSmsresultRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackTaskSmsresultRequest self = new CallbackTaskSmsresultRequest();
        return TeaModel.build(map, self);
    }

    public CallbackTaskSmsresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackTaskSmsresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackTaskSmsresultRequest setACaseId(String aCaseId) {
        this.aCaseId = aCaseId;
        return this;
    }
    public String getACaseId() {
        return this.aCaseId;
    }

    public CallbackTaskSmsresultRequest setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

    public CallbackTaskSmsresultRequest setCollectedName(String collectedName) {
        this.collectedName = collectedName;
        return this;
    }
    public String getCollectedName() {
        return this.collectedName;
    }

    public CallbackTaskSmsresultRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CallbackTaskSmsresultRequest setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    public String getContactPhone() {
        return this.contactPhone;
    }

    public CallbackTaskSmsresultRequest setContactStatus(String contactStatus) {
        this.contactStatus = contactStatus;
        return this;
    }
    public String getContactStatus() {
        return this.contactStatus;
    }

    public CallbackTaskSmsresultRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CallbackTaskSmsresultRequest setOverdueDate(String overdueDate) {
        this.overdueDate = overdueDate;
        return this;
    }
    public String getOverdueDate() {
        return this.overdueDate;
    }

    public CallbackTaskSmsresultRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CallbackTaskSmsresultRequest setSendResult(String sendResult) {
        this.sendResult = sendResult;
        return this;
    }
    public String getSendResult() {
        return this.sendResult;
    }

    public CallbackTaskSmsresultRequest setSendWay(Long sendWay) {
        this.sendWay = sendWay;
        return this;
    }
    public Long getSendWay() {
        return this.sendWay;
    }

    public CallbackTaskSmsresultRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CallbackTaskSmsresultRequest setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public CallbackTaskSmsresultRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CallbackTaskSmsresultRequest setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }
    public String getCreateBy() {
        return this.createBy;
    }

    public CallbackTaskSmsresultRequest setTemplateNo(String templateNo) {
        this.templateNo = templateNo;
        return this;
    }
    public String getTemplateNo() {
        return this.templateNo;
    }

}
