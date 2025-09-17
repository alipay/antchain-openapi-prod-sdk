// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RepayDubbridgeRepayWithholdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 授信申请订单号
    @NameInMap("original_order_no")
    @Validation(required = true)
    public String originalOrderNo;

    // 还款类型1:当期结清，2：正常还款3：全部结清
    @NameInMap("repay_type")
    @Validation(required = true)
    public String repayType;

    // 逾期期次列表（担保渠道）
    @NameInMap("period_list")
    public java.util.List<Long> periodList;

    // 校验还款金额
    @NameInMap("valid_repay_amount")
    public String validRepayAmount;

    // 银行卡号
    @NameInMap("bank_card_no")
    public String bankCardNo;

    // 是否支付代扣，Y是N否（Y：支付代扣，N：无需走支付通道，直接信息流入账--线下还款模式）；（担保渠道）
    @NameInMap("payment_flag")
    public String paymentFlag;

    // 账号开户名，payment_flag=Y时，必填；（担保渠道）
    @NameInMap("account_name")
    public String accountName;

    // 银行预留手机号，payment_flag=Y时，必填；（担保渠道）
    @NameInMap("reserved_mobile")
    public String reservedMobile;

    // 账号开户行编码（担保渠道）
    @NameInMap("account_open_bank")
    public String accountOpenBank;

    // 扣款渠道代码（担保渠道）
    @NameInMap("deduction_code")
    public String deductionCode;

    // 通道签约协议号（担保渠道）
    @NameInMap("signing_agreement_num")
    public String signingAgreementNum;

    public static RepayDubbridgeRepayWithholdRequest build(java.util.Map<String, ?> map) throws Exception {
        RepayDubbridgeRepayWithholdRequest self = new RepayDubbridgeRepayWithholdRequest();
        return TeaModel.build(map, self);
    }

    public RepayDubbridgeRepayWithholdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RepayDubbridgeRepayWithholdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RepayDubbridgeRepayWithholdRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public RepayDubbridgeRepayWithholdRequest setOriginalOrderNo(String originalOrderNo) {
        this.originalOrderNo = originalOrderNo;
        return this;
    }
    public String getOriginalOrderNo() {
        return this.originalOrderNo;
    }

    public RepayDubbridgeRepayWithholdRequest setRepayType(String repayType) {
        this.repayType = repayType;
        return this;
    }
    public String getRepayType() {
        return this.repayType;
    }

    public RepayDubbridgeRepayWithholdRequest setPeriodList(java.util.List<Long> periodList) {
        this.periodList = periodList;
        return this;
    }
    public java.util.List<Long> getPeriodList() {
        return this.periodList;
    }

    public RepayDubbridgeRepayWithholdRequest setValidRepayAmount(String validRepayAmount) {
        this.validRepayAmount = validRepayAmount;
        return this;
    }
    public String getValidRepayAmount() {
        return this.validRepayAmount;
    }

    public RepayDubbridgeRepayWithholdRequest setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public RepayDubbridgeRepayWithholdRequest setPaymentFlag(String paymentFlag) {
        this.paymentFlag = paymentFlag;
        return this;
    }
    public String getPaymentFlag() {
        return this.paymentFlag;
    }

    public RepayDubbridgeRepayWithholdRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public RepayDubbridgeRepayWithholdRequest setReservedMobile(String reservedMobile) {
        this.reservedMobile = reservedMobile;
        return this;
    }
    public String getReservedMobile() {
        return this.reservedMobile;
    }

    public RepayDubbridgeRepayWithholdRequest setAccountOpenBank(String accountOpenBank) {
        this.accountOpenBank = accountOpenBank;
        return this;
    }
    public String getAccountOpenBank() {
        return this.accountOpenBank;
    }

    public RepayDubbridgeRepayWithholdRequest setDeductionCode(String deductionCode) {
        this.deductionCode = deductionCode;
        return this;
    }
    public String getDeductionCode() {
        return this.deductionCode;
    }

    public RepayDubbridgeRepayWithholdRequest setSigningAgreementNum(String signingAgreementNum) {
        this.signingAgreementNum = signingAgreementNum;
        return this;
    }
    public String getSigningAgreementNum() {
        return this.signingAgreementNum;
    }

}
