// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class AccountSmsSendStatus extends TeaModel {
    // ⼿机号
    @NameInMap("phone_no")
    @Validation(required = true)
    public String phoneNo;

    // 批次号
    @NameInMap("batch_task_id")
    @Validation(required = true)
    public String batchTaskId;

    // 发送状态
    // SUCCESS：发送成
    // 功；
    // FAILED：发送失败；
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 发送状态描述
    @NameInMap("detail_msg")
    @Validation(required = true)
    public String detailMsg;

    public static AccountSmsSendStatus build(java.util.Map<String, ?> map) throws Exception {
        AccountSmsSendStatus self = new AccountSmsSendStatus();
        return TeaModel.build(map, self);
    }

    public AccountSmsSendStatus setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public AccountSmsSendStatus setBatchTaskId(String batchTaskId) {
        this.batchTaskId = batchTaskId;
        return this;
    }
    public String getBatchTaskId() {
        return this.batchTaskId;
    }

    public AccountSmsSendStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AccountSmsSendStatus setDetailMsg(String detailMsg) {
        this.detailMsg = detailMsg;
        return this;
    }
    public String getDetailMsg() {
        return this.detailMsg;
    }

}
