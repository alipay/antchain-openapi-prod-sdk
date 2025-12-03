// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeInstallmentCreditamtResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授信申请状态：
    // 0- 通过 
    // 1- 拒绝 
    // 2- 审批中
    // 3- 失败
    // 
    @NameInMap("apply_status")
    public String applyStatus;

    // 额度状态：
    // 0- 正常 
    // 1- 冻结 
    // 2- 过期
    @NameInMap("credit_status")
    public String creditStatus;

    // 授信总额度，单位：元
    @NameInMap("credit_amount")
    public Long creditAmount;

    // 可用余额
    @NameInMap("rest_amount")
    public Long restAmount;

    // 发放日期，yyyy-MM-dd
    @NameInMap("pay_date")
    public String payDate;

    // 到期日期，yyyy-MM-dd
    @NameInMap("expire_date")
    public String expireDate;

    // 授信年利率。精确到小数点后四位0.1250，表示年利率为12.5%
    @NameInMap("rate_value")
    public Long rateValue;

    // 资金方编号
    @NameInMap("fund_code")
    public String fundCode;

    // 资金方简称
    @NameInMap("abbre_fund_name")
    public String abbreFundName;

    // 1：现金贷、2：分期付
    @NameInMap("prod_type")
    public String prodType;

    // Y- 可用
    // N- 不可用
    @NameInMap("installment_status")
    public String installmentStatus;

    public static QueryDubbridgeInstallmentCreditamtResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeInstallmentCreditamtResponse self = new QueryDubbridgeInstallmentCreditamtResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeInstallmentCreditamtResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeInstallmentCreditamtResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeInstallmentCreditamtResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeInstallmentCreditamtResponse setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
        return this;
    }
    public String getApplyStatus() {
        return this.applyStatus;
    }

    public QueryDubbridgeInstallmentCreditamtResponse setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
        return this;
    }
    public String getCreditStatus() {
        return this.creditStatus;
    }

    public QueryDubbridgeInstallmentCreditamtResponse setCreditAmount(Long creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public Long getCreditAmount() {
        return this.creditAmount;
    }

    public QueryDubbridgeInstallmentCreditamtResponse setRestAmount(Long restAmount) {
        this.restAmount = restAmount;
        return this;
    }
    public Long getRestAmount() {
        return this.restAmount;
    }

    public QueryDubbridgeInstallmentCreditamtResponse setPayDate(String payDate) {
        this.payDate = payDate;
        return this;
    }
    public String getPayDate() {
        return this.payDate;
    }

    public QueryDubbridgeInstallmentCreditamtResponse setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public QueryDubbridgeInstallmentCreditamtResponse setRateValue(Long rateValue) {
        this.rateValue = rateValue;
        return this;
    }
    public Long getRateValue() {
        return this.rateValue;
    }

    public QueryDubbridgeInstallmentCreditamtResponse setFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }
    public String getFundCode() {
        return this.fundCode;
    }

    public QueryDubbridgeInstallmentCreditamtResponse setAbbreFundName(String abbreFundName) {
        this.abbreFundName = abbreFundName;
        return this;
    }
    public String getAbbreFundName() {
        return this.abbreFundName;
    }

    public QueryDubbridgeInstallmentCreditamtResponse setProdType(String prodType) {
        this.prodType = prodType;
        return this;
    }
    public String getProdType() {
        return this.prodType;
    }

    public QueryDubbridgeInstallmentCreditamtResponse setInstallmentStatus(String installmentStatus) {
        this.installmentStatus = installmentStatus;
        return this;
    }
    public String getInstallmentStatus() {
        return this.installmentStatus;
    }

}
