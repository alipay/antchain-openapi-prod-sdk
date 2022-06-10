// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class CancelInsuranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 原保单号
    @NameInMap("policy_no")
    @Validation(required = true)
    public String policyNo;

    // 保单终止日期 毫秒值
    @NameInMap("policy_end_time")
    @Validation(required = true)
    public Long policyEndTime;

    // 退保原因
    @NameInMap("reason_for_quit")
    @Validation(required = true)
    public String reasonForQuit;

    // 退保保费金额，单位分
    @NameInMap("quit_total_amount")
    @Validation(required = true)
    public Long quitTotalAmount;

    // 扩展信息
    @NameInMap("extend")
    public String extend;

    public static CancelInsuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelInsuranceRequest self = new CancelInsuranceRequest();
        return TeaModel.build(map, self);
    }

    public CancelInsuranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelInsuranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelInsuranceRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public CancelInsuranceRequest setPolicyEndTime(Long policyEndTime) {
        this.policyEndTime = policyEndTime;
        return this;
    }
    public Long getPolicyEndTime() {
        return this.policyEndTime;
    }

    public CancelInsuranceRequest setReasonForQuit(String reasonForQuit) {
        this.reasonForQuit = reasonForQuit;
        return this;
    }
    public String getReasonForQuit() {
        return this.reasonForQuit;
    }

    public CancelInsuranceRequest setQuitTotalAmount(Long quitTotalAmount) {
        this.quitTotalAmount = quitTotalAmount;
        return this;
    }
    public Long getQuitTotalAmount() {
        return this.quitTotalAmount;
    }

    public CancelInsuranceRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

}
