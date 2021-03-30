// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateCargoPayorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 收款方银行账号
    @NameInMap("bank_account_of_payee")
    public String bankAccountOfPayee;

    // 付款方银行账号,货主付款的开户银行账号
    @NameInMap("bank_account_of_payer")
    public String bankAccountOfPayer;

    // 银行流水号，云资金校验时 必传；
    // 
    @NameInMap("bank_no")
    public String bankNo;

    // 收款方开户行（平台收款）
    // 
    // MYBank_CloudCapital_2,  ## 云资金2.0
    // 
    // 
    @NameInMap("bank_of_payee")
    public String bankOfPayee;

    // 付款方开户行(货主付款)  取值
    // 
    // MYBank_CloudCapital_2,  ## 云资金2.0
    @NameInMap("bank_of_payer")
    public String bankOfPayer;

    // 账单编号
    @NameInMap("bill_id")
    public String billId;

    // 货源单号
    // 
    @NameInMap("cargo_order")
    @Validation(required = true)
    public String cargoOrder;

    // 核验渠道，请按取值约束值填入
    // MYBank_CloudCapital_2,  ## 云资金2.0
    @NameInMap("check_channel")
    public String checkChannel;

    // 币种  
    // 按下列取值：
    // CNY、USD
    // 
    // 
    @NameInMap("currency")
    public String currency;

    // 费用类型 (运费、调度费、服务费)
    // 
    @NameInMap("expense_type")
    @Validation(required = true)
    public String expenseType;

    // 收款方名称
    @NameInMap("payee")
    public String payee;

    // 付款方名称
    @NameInMap("payer")
    public String payer;

    // 费用金额（运单维度）
    // 
    @NameInMap("payment")
    @Validation(required = true)
    public String payment;

    // 是否核验
    @NameInMap("pay_check")
    public Boolean payCheck;

    // 付款方did
    // 
    @NameInMap("pay_did")
    @Validation(required = true)
    public String payDid;

    // 支付单号
    // 
    @NameInMap("pay_id")
    @Validation(required = true)
    public String payId;

    // 支付备注
    // 
    @NameInMap("pay_note")
    public String payNote;

    // 支付时间
    // 
    @NameInMap("pay_time")
    @Validation(required = true)
    public Long payTime;

    // 支付类型
    // 
    @NameInMap("pay_type")
    public String payType;

    // 所属平台did
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 收款方did
    @NameInMap("recv_did")
    @Validation(required = true)
    public String recvDid;

    // 请求唯一标识
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 运单号
    @NameInMap("tax_waybill_id")
    @Validation(required = true)
    public String taxWaybillId;

    public static CreateCargoPayorderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCargoPayorderRequest self = new CreateCargoPayorderRequest();
        return TeaModel.build(map, self);
    }

    public CreateCargoPayorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCargoPayorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCargoPayorderRequest setBankAccountOfPayee(String bankAccountOfPayee) {
        this.bankAccountOfPayee = bankAccountOfPayee;
        return this;
    }
    public String getBankAccountOfPayee() {
        return this.bankAccountOfPayee;
    }

    public CreateCargoPayorderRequest setBankAccountOfPayer(String bankAccountOfPayer) {
        this.bankAccountOfPayer = bankAccountOfPayer;
        return this;
    }
    public String getBankAccountOfPayer() {
        return this.bankAccountOfPayer;
    }

    public CreateCargoPayorderRequest setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public CreateCargoPayorderRequest setBankOfPayee(String bankOfPayee) {
        this.bankOfPayee = bankOfPayee;
        return this;
    }
    public String getBankOfPayee() {
        return this.bankOfPayee;
    }

    public CreateCargoPayorderRequest setBankOfPayer(String bankOfPayer) {
        this.bankOfPayer = bankOfPayer;
        return this;
    }
    public String getBankOfPayer() {
        return this.bankOfPayer;
    }

    public CreateCargoPayorderRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public CreateCargoPayorderRequest setCargoOrder(String cargoOrder) {
        this.cargoOrder = cargoOrder;
        return this;
    }
    public String getCargoOrder() {
        return this.cargoOrder;
    }

    public CreateCargoPayorderRequest setCheckChannel(String checkChannel) {
        this.checkChannel = checkChannel;
        return this;
    }
    public String getCheckChannel() {
        return this.checkChannel;
    }

    public CreateCargoPayorderRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public CreateCargoPayorderRequest setExpenseType(String expenseType) {
        this.expenseType = expenseType;
        return this;
    }
    public String getExpenseType() {
        return this.expenseType;
    }

    public CreateCargoPayorderRequest setPayee(String payee) {
        this.payee = payee;
        return this;
    }
    public String getPayee() {
        return this.payee;
    }

    public CreateCargoPayorderRequest setPayer(String payer) {
        this.payer = payer;
        return this;
    }
    public String getPayer() {
        return this.payer;
    }

    public CreateCargoPayorderRequest setPayment(String payment) {
        this.payment = payment;
        return this;
    }
    public String getPayment() {
        return this.payment;
    }

    public CreateCargoPayorderRequest setPayCheck(Boolean payCheck) {
        this.payCheck = payCheck;
        return this;
    }
    public Boolean getPayCheck() {
        return this.payCheck;
    }

    public CreateCargoPayorderRequest setPayDid(String payDid) {
        this.payDid = payDid;
        return this;
    }
    public String getPayDid() {
        return this.payDid;
    }

    public CreateCargoPayorderRequest setPayId(String payId) {
        this.payId = payId;
        return this;
    }
    public String getPayId() {
        return this.payId;
    }

    public CreateCargoPayorderRequest setPayNote(String payNote) {
        this.payNote = payNote;
        return this;
    }
    public String getPayNote() {
        return this.payNote;
    }

    public CreateCargoPayorderRequest setPayTime(Long payTime) {
        this.payTime = payTime;
        return this;
    }
    public Long getPayTime() {
        return this.payTime;
    }

    public CreateCargoPayorderRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateCargoPayorderRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public CreateCargoPayorderRequest setRecvDid(String recvDid) {
        this.recvDid = recvDid;
        return this;
    }
    public String getRecvDid() {
        return this.recvDid;
    }

    public CreateCargoPayorderRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCargoPayorderRequest setTaxWaybillId(String taxWaybillId) {
        this.taxWaybillId = taxWaybillId;
        return this;
    }
    public String getTaxWaybillId() {
        return this.taxWaybillId;
    }

}
