// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRepayInfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 还款编号
    @NameInMap("repay_no")
    public String repayNo;

    // 借据编码
    @NameInMap("receipt_no")
    public String receiptNo;

    // 客户编号
    @NameInMap("custom_no")
    public String customNo;

    // 客户名称
    @NameInMap("custom_name")
    public String customName;

    // 还款类型1:提前还款，2：正常还款 3:批量还款 4：自由还款
    @NameInMap("repay_type")
    public String repayType;

    // repay_sign
    @NameInMap("repay_sign")
    public String repaySign;

    // 还款日期
    @NameInMap("repay_date")
    public String repayDate;

    // 实还总额
    @NameInMap("repay_amount")
    public Long repayAmount;

    // 实还本金
    @NameInMap("repay_principal")
    public Long repayPrincipal;

    // 实还利息
    @NameInMap("repay_interest")
    public Long repayInterest;

    // 实还通道手续费
    @NameInMap("channel_amt")
    public Long channelAmt;

    // 实还手续费
    @NameInMap("repay_fee")
    public String repayFee;

    // 实收罚息
    @NameInMap("repay_punish")
    public Long repayPunish;

    // 还款账户
    @NameInMap("repay_account")
    public String repayAccount;

    // 还款账户名称
    @NameInMap("repay_account_name")
    public String repayAccountName;

    // 还款账户的手机号
    @NameInMap("repay_mobile")
    public String repayMobile;

    // 还款账户银行行号
    @NameInMap("repay_bank_no")
    public String repayBankNo;

    // 还款账户银行名称
    @NameInMap("repay_bank_name")
    public String repayBankName;

    // 还款状态0:失败 1成功 2-审批中 3-还款中
    @NameInMap("repay_status")
    public String repayStatus;

    // 失败原因
    @NameInMap("fail_reason")
    public String failReason;

    // 授信申请编号
    @NameInMap("apply_no")
    public String applyNo;

    // 担保费
    @NameInMap("guarantee_fee")
    public Long guaranteeFee;

    // 违约金
    @NameInMap("liquidated_damages")
    public Long liquidatedDamages;

    public static QueryDubbridgeRepayInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRepayInfoResponse self = new QueryDubbridgeRepayInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRepayInfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeRepayInfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeRepayInfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeRepayInfoResponse setRepayNo(String repayNo) {
        this.repayNo = repayNo;
        return this;
    }
    public String getRepayNo() {
        return this.repayNo;
    }

    public QueryDubbridgeRepayInfoResponse setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
        return this;
    }
    public String getReceiptNo() {
        return this.receiptNo;
    }

    public QueryDubbridgeRepayInfoResponse setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public QueryDubbridgeRepayInfoResponse setCustomName(String customName) {
        this.customName = customName;
        return this;
    }
    public String getCustomName() {
        return this.customName;
    }

    public QueryDubbridgeRepayInfoResponse setRepayType(String repayType) {
        this.repayType = repayType;
        return this;
    }
    public String getRepayType() {
        return this.repayType;
    }

    public QueryDubbridgeRepayInfoResponse setRepaySign(String repaySign) {
        this.repaySign = repaySign;
        return this;
    }
    public String getRepaySign() {
        return this.repaySign;
    }

    public QueryDubbridgeRepayInfoResponse setRepayDate(String repayDate) {
        this.repayDate = repayDate;
        return this;
    }
    public String getRepayDate() {
        return this.repayDate;
    }

    public QueryDubbridgeRepayInfoResponse setRepayAmount(Long repayAmount) {
        this.repayAmount = repayAmount;
        return this;
    }
    public Long getRepayAmount() {
        return this.repayAmount;
    }

    public QueryDubbridgeRepayInfoResponse setRepayPrincipal(Long repayPrincipal) {
        this.repayPrincipal = repayPrincipal;
        return this;
    }
    public Long getRepayPrincipal() {
        return this.repayPrincipal;
    }

    public QueryDubbridgeRepayInfoResponse setRepayInterest(Long repayInterest) {
        this.repayInterest = repayInterest;
        return this;
    }
    public Long getRepayInterest() {
        return this.repayInterest;
    }

    public QueryDubbridgeRepayInfoResponse setChannelAmt(Long channelAmt) {
        this.channelAmt = channelAmt;
        return this;
    }
    public Long getChannelAmt() {
        return this.channelAmt;
    }

    public QueryDubbridgeRepayInfoResponse setRepayFee(String repayFee) {
        this.repayFee = repayFee;
        return this;
    }
    public String getRepayFee() {
        return this.repayFee;
    }

    public QueryDubbridgeRepayInfoResponse setRepayPunish(Long repayPunish) {
        this.repayPunish = repayPunish;
        return this;
    }
    public Long getRepayPunish() {
        return this.repayPunish;
    }

    public QueryDubbridgeRepayInfoResponse setRepayAccount(String repayAccount) {
        this.repayAccount = repayAccount;
        return this;
    }
    public String getRepayAccount() {
        return this.repayAccount;
    }

    public QueryDubbridgeRepayInfoResponse setRepayAccountName(String repayAccountName) {
        this.repayAccountName = repayAccountName;
        return this;
    }
    public String getRepayAccountName() {
        return this.repayAccountName;
    }

    public QueryDubbridgeRepayInfoResponse setRepayMobile(String repayMobile) {
        this.repayMobile = repayMobile;
        return this;
    }
    public String getRepayMobile() {
        return this.repayMobile;
    }

    public QueryDubbridgeRepayInfoResponse setRepayBankNo(String repayBankNo) {
        this.repayBankNo = repayBankNo;
        return this;
    }
    public String getRepayBankNo() {
        return this.repayBankNo;
    }

    public QueryDubbridgeRepayInfoResponse setRepayBankName(String repayBankName) {
        this.repayBankName = repayBankName;
        return this;
    }
    public String getRepayBankName() {
        return this.repayBankName;
    }

    public QueryDubbridgeRepayInfoResponse setRepayStatus(String repayStatus) {
        this.repayStatus = repayStatus;
        return this;
    }
    public String getRepayStatus() {
        return this.repayStatus;
    }

    public QueryDubbridgeRepayInfoResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public QueryDubbridgeRepayInfoResponse setApplyNo(String applyNo) {
        this.applyNo = applyNo;
        return this;
    }
    public String getApplyNo() {
        return this.applyNo;
    }

    public QueryDubbridgeRepayInfoResponse setGuaranteeFee(Long guaranteeFee) {
        this.guaranteeFee = guaranteeFee;
        return this;
    }
    public Long getGuaranteeFee() {
        return this.guaranteeFee;
    }

    public QueryDubbridgeRepayInfoResponse setLiquidatedDamages(Long liquidatedDamages) {
        this.liquidatedDamages = liquidatedDamages;
        return this;
    }
    public Long getLiquidatedDamages() {
        return this.liquidatedDamages;
    }

}
