// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CancelLeaseInsuranceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 退保状态：CALCE_FAIL退保失败、CACEL_SUCCESS退保成功、CANCELING退保中
    @NameInMap("status")
    public String status;

    // 退保保单号
    @NameInMap("policy_no")
    public String policyNo;

    // 是否为实收保单退保：ture实收退保，涉及实体账户退费；false未实收退保，不涉及账户退费；
    @NameInMap("repay_flag")
    public String repayFlag;

    // 退还保费，单位：分
    @NameInMap("srd_premium")
    public String srdPremium;

    // 结果码
    @NameInMap("code")
    public String code;

    // 结果描述
    @NameInMap("message")
    public String message;

    public static CancelLeaseInsuranceResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelLeaseInsuranceResponse self = new CancelLeaseInsuranceResponse();
        return TeaModel.build(map, self);
    }

    public CancelLeaseInsuranceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CancelLeaseInsuranceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CancelLeaseInsuranceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CancelLeaseInsuranceResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CancelLeaseInsuranceResponse setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public CancelLeaseInsuranceResponse setRepayFlag(String repayFlag) {
        this.repayFlag = repayFlag;
        return this;
    }
    public String getRepayFlag() {
        return this.repayFlag;
    }

    public CancelLeaseInsuranceResponse setSrdPremium(String srdPremium) {
        this.srdPremium = srdPremium;
        return this;
    }
    public String getSrdPremium() {
        return this.srdPremium;
    }

    public CancelLeaseInsuranceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelLeaseInsuranceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
