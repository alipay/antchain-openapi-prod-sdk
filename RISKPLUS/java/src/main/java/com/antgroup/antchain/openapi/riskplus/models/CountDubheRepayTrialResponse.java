// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CountDubheRepayTrialResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 还款本金
    @NameInMap("real_principal")
    public Long realPrincipal;

    // 还款利息
    @NameInMap("real_interest")
    public Long realInterest;

    // 还款费用
    @NameInMap("real_over_amt")
    public Long realOverAmt;

    // 服务费
    @NameInMap("service_charge")
    public Long serviceCharge;

    public static CountDubheRepayTrialResponse build(java.util.Map<String, ?> map) throws Exception {
        CountDubheRepayTrialResponse self = new CountDubheRepayTrialResponse();
        return TeaModel.build(map, self);
    }

    public CountDubheRepayTrialResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountDubheRepayTrialResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountDubheRepayTrialResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountDubheRepayTrialResponse setRealPrincipal(Long realPrincipal) {
        this.realPrincipal = realPrincipal;
        return this;
    }
    public Long getRealPrincipal() {
        return this.realPrincipal;
    }

    public CountDubheRepayTrialResponse setRealInterest(Long realInterest) {
        this.realInterest = realInterest;
        return this;
    }
    public Long getRealInterest() {
        return this.realInterest;
    }

    public CountDubheRepayTrialResponse setRealOverAmt(Long realOverAmt) {
        this.realOverAmt = realOverAmt;
        return this;
    }
    public Long getRealOverAmt() {
        return this.realOverAmt;
    }

    public CountDubheRepayTrialResponse setServiceCharge(Long serviceCharge) {
        this.serviceCharge = serviceCharge;
        return this;
    }
    public Long getServiceCharge() {
        return this.serviceCharge;
    }

}
