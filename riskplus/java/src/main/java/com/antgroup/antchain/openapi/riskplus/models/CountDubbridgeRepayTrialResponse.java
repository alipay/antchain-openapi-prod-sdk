// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CountDubbridgeRepayTrialResponse extends TeaModel {
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

    // 担保费
    @NameInMap("real_guarantee_fee")
    public Long realGuaranteeFee;

    // 违约金
    @NameInMap("real_liquidated_damages")
    public Long realLiquidatedDamages;

    // 试算期次还款计划结果
    @NameInMap("repay_result_list")
    public java.util.List<RepayResult> repayResultList;

    public static CountDubbridgeRepayTrialResponse build(java.util.Map<String, ?> map) throws Exception {
        CountDubbridgeRepayTrialResponse self = new CountDubbridgeRepayTrialResponse();
        return TeaModel.build(map, self);
    }

    public CountDubbridgeRepayTrialResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountDubbridgeRepayTrialResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountDubbridgeRepayTrialResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountDubbridgeRepayTrialResponse setRealPrincipal(Long realPrincipal) {
        this.realPrincipal = realPrincipal;
        return this;
    }
    public Long getRealPrincipal() {
        return this.realPrincipal;
    }

    public CountDubbridgeRepayTrialResponse setRealInterest(Long realInterest) {
        this.realInterest = realInterest;
        return this;
    }
    public Long getRealInterest() {
        return this.realInterest;
    }

    public CountDubbridgeRepayTrialResponse setRealOverAmt(Long realOverAmt) {
        this.realOverAmt = realOverAmt;
        return this;
    }
    public Long getRealOverAmt() {
        return this.realOverAmt;
    }

    public CountDubbridgeRepayTrialResponse setServiceCharge(Long serviceCharge) {
        this.serviceCharge = serviceCharge;
        return this;
    }
    public Long getServiceCharge() {
        return this.serviceCharge;
    }

    public CountDubbridgeRepayTrialResponse setRealGuaranteeFee(Long realGuaranteeFee) {
        this.realGuaranteeFee = realGuaranteeFee;
        return this;
    }
    public Long getRealGuaranteeFee() {
        return this.realGuaranteeFee;
    }

    public CountDubbridgeRepayTrialResponse setRealLiquidatedDamages(Long realLiquidatedDamages) {
        this.realLiquidatedDamages = realLiquidatedDamages;
        return this;
    }
    public Long getRealLiquidatedDamages() {
        return this.realLiquidatedDamages;
    }

    public CountDubbridgeRepayTrialResponse setRepayResultList(java.util.List<RepayResult> repayResultList) {
        this.repayResultList = repayResultList;
        return this;
    }
    public java.util.List<RepayResult> getRepayResultList() {
        return this.repayResultList;
    }

}
