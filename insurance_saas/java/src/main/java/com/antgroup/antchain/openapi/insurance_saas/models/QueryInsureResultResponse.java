// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class QueryInsureResultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 通知单号
    @NameInMap("notice_no")
    public String noticeNo;

    // 付款状态
    @NameInMap("payment_status")
    public String paymentStatus;

    // 保单号
    @NameInMap("policy_no")
    public String policyNo;

    // 保额(人民币)
    @NameInMap("insurance_amount")
    public String insuranceAmount;

    // 保费(人民币)
    @NameInMap("insurance_premium")
    public String insurancePremium;

    // 保险起期
    @NameInMap("effect_date")
    public String effectDate;

    // 保险止期
    @NameInMap("expire_date")
    public String expireDate;

    // 电子保单URL
    @NameInMap("out_policy_url")
    public String outPolicyUrl;

    // 投保申请号-外部
    @NameInMap("insurance_application_no")
    public String insuranceApplicationNo;

    // 交易流水号
    @NameInMap("insurance_application_no_inner")
    public String insuranceApplicationNoInner;

    public static QueryInsureResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInsureResultResponse self = new QueryInsureResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryInsureResultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInsureResultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInsureResultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInsureResultResponse setNoticeNo(String noticeNo) {
        this.noticeNo = noticeNo;
        return this;
    }
    public String getNoticeNo() {
        return this.noticeNo;
    }

    public QueryInsureResultResponse setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }
    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    public QueryInsureResultResponse setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public QueryInsureResultResponse setInsuranceAmount(String insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
        return this;
    }
    public String getInsuranceAmount() {
        return this.insuranceAmount;
    }

    public QueryInsureResultResponse setInsurancePremium(String insurancePremium) {
        this.insurancePremium = insurancePremium;
        return this;
    }
    public String getInsurancePremium() {
        return this.insurancePremium;
    }

    public QueryInsureResultResponse setEffectDate(String effectDate) {
        this.effectDate = effectDate;
        return this;
    }
    public String getEffectDate() {
        return this.effectDate;
    }

    public QueryInsureResultResponse setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public QueryInsureResultResponse setOutPolicyUrl(String outPolicyUrl) {
        this.outPolicyUrl = outPolicyUrl;
        return this;
    }
    public String getOutPolicyUrl() {
        return this.outPolicyUrl;
    }

    public QueryInsureResultResponse setInsuranceApplicationNo(String insuranceApplicationNo) {
        this.insuranceApplicationNo = insuranceApplicationNo;
        return this;
    }
    public String getInsuranceApplicationNo() {
        return this.insuranceApplicationNo;
    }

    public QueryInsureResultResponse setInsuranceApplicationNoInner(String insuranceApplicationNoInner) {
        this.insuranceApplicationNoInner = insuranceApplicationNoInner;
        return this;
    }
    public String getInsuranceApplicationNoInner() {
        return this.insuranceApplicationNoInner;
    }

}
