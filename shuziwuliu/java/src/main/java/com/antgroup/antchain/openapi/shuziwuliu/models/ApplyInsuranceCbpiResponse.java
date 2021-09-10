// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsuranceCbpiResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 投保唯一码
    // 
    @NameInMap("trade_no")
    public String tradeNo;

    // 保单号
    // 
    @NameInMap("policy_no")
    public String policyNo;

    // 保费
    // 
    @NameInMap("premium")
    public String premium;

    // 保额
    // 
    @NameInMap("insured_amount")
    public String insuredAmount;

    // 保险起期
    // 
    @NameInMap("insure_start")
    public String insureStart;

    // 保险止期
    // 
    @NameInMap("insure_end")
    public String insureEnd;

    public static ApplyInsuranceCbpiResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsuranceCbpiResponse self = new ApplyInsuranceCbpiResponse();
        return TeaModel.build(map, self);
    }

    public ApplyInsuranceCbpiResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyInsuranceCbpiResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyInsuranceCbpiResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyInsuranceCbpiResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ApplyInsuranceCbpiResponse setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public ApplyInsuranceCbpiResponse setPremium(String premium) {
        this.premium = premium;
        return this;
    }
    public String getPremium() {
        return this.premium;
    }

    public ApplyInsuranceCbpiResponse setInsuredAmount(String insuredAmount) {
        this.insuredAmount = insuredAmount;
        return this;
    }
    public String getInsuredAmount() {
        return this.insuredAmount;
    }

    public ApplyInsuranceCbpiResponse setInsureStart(String insureStart) {
        this.insureStart = insureStart;
        return this;
    }
    public String getInsureStart() {
        return this.insureStart;
    }

    public ApplyInsuranceCbpiResponse setInsureEnd(String insureEnd) {
        this.insureEnd = insureEnd;
        return this;
    }
    public String getInsureEnd() {
        return this.insureEnd;
    }

}
