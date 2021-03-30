// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateCargoPayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    //  收款方银行账号
    @NameInMap("bank_account_of_payee")
    public String bankAccountOfPayee;

    // 付款方银行账号,货主付款的开户银行账号
    @NameInMap("bank_account_of_payer")
    public String bankAccountOfPayer;

    // 银行流水号
    @NameInMap("bank_no")
    @Validation(required = true)
    public String bankNo;

    // 收款方开户行（平台收款）
    // 取值：
    // MYBank_CloudCapital_2,  ## 云资金2.0
    @NameInMap("bank_of_payee")
    public String bankOfPayee;

    // MYBank_CloudCapital_2,  ## 云资金2.0
    @NameInMap("bank_of_payer")
    public String bankOfPayer;

    // 货源单号
    @NameInMap("cargo_order")
    @Validation(required = true)
    public String cargoOrder;

    // 核验渠道，请按取值约束值填入。
    // 
    // YBank_CloudCapital_2,  ## 云资金2.0
    @NameInMap("check_channel")
    public String checkChannel;

    // CNY、USD
    // 币种
    @NameInMap("currency")
    public String currency;

    // 费用类型 (运费、调度费、服务费)
    @NameInMap("expense_type")
    @Validation(required = true)
    public String expenseType;

    // 收款方名称
    @NameInMap("payee")
    public String payee;

    // 付款方名称
    @NameInMap("payer")
    public String payer;

    // 费用金额
    @NameInMap("payment")
    @Validation(required = true)
    public String payment;

    // 是否核验
    @NameInMap("pay_check")
    public Boolean payCheck;

    // 付款方did
    @NameInMap("pay_did")
    @Validation(required = true)
    public String payDid;

    // 平台支付单号
    @NameInMap("pay_id")
    @Validation(required = true)
    public String payId;

    // 支付备注
    @NameInMap("pay_note")
    public String payNote;

    // 支付时间
    @NameInMap("pay_time")
    @Validation(required = true)
    public Long payTime;

    // 支付类型
    @NameInMap("pay_type")
    public String payType;

    // 收款方did
    @NameInMap("recv_did")
    @Validation(required = true)
    public String recvDid;

    // 支持关联单个运单和多个运单
    @NameInMap("tax_waybill_ids")
    @Validation(required = true)
    public java.util.List<String> taxWaybillIds;

    public static CreateCargoPayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCargoPayRequest self = new CreateCargoPayRequest();
        return TeaModel.build(map, self);
    }

    public CreateCargoPayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCargoPayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCargoPayRequest setBankAccountOfPayee(String bankAccountOfPayee) {
        this.bankAccountOfPayee = bankAccountOfPayee;
        return this;
    }
    public String getBankAccountOfPayee() {
        return this.bankAccountOfPayee;
    }

    public CreateCargoPayRequest setBankAccountOfPayer(String bankAccountOfPayer) {
        this.bankAccountOfPayer = bankAccountOfPayer;
        return this;
    }
    public String getBankAccountOfPayer() {
        return this.bankAccountOfPayer;
    }

    public CreateCargoPayRequest setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public CreateCargoPayRequest setBankOfPayee(String bankOfPayee) {
        this.bankOfPayee = bankOfPayee;
        return this;
    }
    public String getBankOfPayee() {
        return this.bankOfPayee;
    }

    public CreateCargoPayRequest setBankOfPayer(String bankOfPayer) {
        this.bankOfPayer = bankOfPayer;
        return this;
    }
    public String getBankOfPayer() {
        return this.bankOfPayer;
    }

    public CreateCargoPayRequest setCargoOrder(String cargoOrder) {
        this.cargoOrder = cargoOrder;
        return this;
    }
    public String getCargoOrder() {
        return this.cargoOrder;
    }

    public CreateCargoPayRequest setCheckChannel(String checkChannel) {
        this.checkChannel = checkChannel;
        return this;
    }
    public String getCheckChannel() {
        return this.checkChannel;
    }

    public CreateCargoPayRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public CreateCargoPayRequest setExpenseType(String expenseType) {
        this.expenseType = expenseType;
        return this;
    }
    public String getExpenseType() {
        return this.expenseType;
    }

    public CreateCargoPayRequest setPayee(String payee) {
        this.payee = payee;
        return this;
    }
    public String getPayee() {
        return this.payee;
    }

    public CreateCargoPayRequest setPayer(String payer) {
        this.payer = payer;
        return this;
    }
    public String getPayer() {
        return this.payer;
    }

    public CreateCargoPayRequest setPayment(String payment) {
        this.payment = payment;
        return this;
    }
    public String getPayment() {
        return this.payment;
    }

    public CreateCargoPayRequest setPayCheck(Boolean payCheck) {
        this.payCheck = payCheck;
        return this;
    }
    public Boolean getPayCheck() {
        return this.payCheck;
    }

    public CreateCargoPayRequest setPayDid(String payDid) {
        this.payDid = payDid;
        return this;
    }
    public String getPayDid() {
        return this.payDid;
    }

    public CreateCargoPayRequest setPayId(String payId) {
        this.payId = payId;
        return this;
    }
    public String getPayId() {
        return this.payId;
    }

    public CreateCargoPayRequest setPayNote(String payNote) {
        this.payNote = payNote;
        return this;
    }
    public String getPayNote() {
        return this.payNote;
    }

    public CreateCargoPayRequest setPayTime(Long payTime) {
        this.payTime = payTime;
        return this;
    }
    public Long getPayTime() {
        return this.payTime;
    }

    public CreateCargoPayRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateCargoPayRequest setRecvDid(String recvDid) {
        this.recvDid = recvDid;
        return this;
    }
    public String getRecvDid() {
        return this.recvDid;
    }

    public CreateCargoPayRequest setTaxWaybillIds(java.util.List<String> taxWaybillIds) {
        this.taxWaybillIds = taxWaybillIds;
        return this;
    }
    public java.util.List<String> getTaxWaybillIds() {
        return this.taxWaybillIds;
    }

}
