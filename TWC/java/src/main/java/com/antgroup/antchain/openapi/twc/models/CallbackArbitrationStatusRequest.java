// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CallbackArbitrationStatusRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 案件文书号
    @NameInMap("acceptance_number")
    public String acceptanceNumber;

    // 案件编号
    @NameInMap("case_no")
    @Validation(required = true)
    public String caseNo;

    // 确认时间时间戳
    @NameInMap("confirm_time")
    public Long confirmTime;

    // 预处理案号
    @NameInMap("preacceptance_number")
    public String preacceptanceNumber;

    // 发送时间时间戳
    @NameInMap("send_time")
    public Long sendTime;

    // 案件状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static CallbackArbitrationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackArbitrationStatusRequest self = new CallbackArbitrationStatusRequest();
        return TeaModel.build(map, self);
    }

    public CallbackArbitrationStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackArbitrationStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackArbitrationStatusRequest setAcceptanceNumber(String acceptanceNumber) {
        this.acceptanceNumber = acceptanceNumber;
        return this;
    }
    public String getAcceptanceNumber() {
        return this.acceptanceNumber;
    }

    public CallbackArbitrationStatusRequest setCaseNo(String caseNo) {
        this.caseNo = caseNo;
        return this;
    }
    public String getCaseNo() {
        return this.caseNo;
    }

    public CallbackArbitrationStatusRequest setConfirmTime(Long confirmTime) {
        this.confirmTime = confirmTime;
        return this;
    }
    public Long getConfirmTime() {
        return this.confirmTime;
    }

    public CallbackArbitrationStatusRequest setPreacceptanceNumber(String preacceptanceNumber) {
        this.preacceptanceNumber = preacceptanceNumber;
        return this;
    }
    public String getPreacceptanceNumber() {
        return this.preacceptanceNumber;
    }

    public CallbackArbitrationStatusRequest setSendTime(Long sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    public Long getSendTime() {
        return this.sendTime;
    }

    public CallbackArbitrationStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
