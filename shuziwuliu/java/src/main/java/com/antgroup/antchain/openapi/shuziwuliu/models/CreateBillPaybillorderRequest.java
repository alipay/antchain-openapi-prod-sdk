// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateBillPaybillorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申请时间
    @NameInMap("apply_date")
    public Long applyDate;

    // 银行收款账户
    @NameInMap("bank_receipt_account")
    public String bankReceiptAccount;

    // 币种
    @NameInMap("currency")
    public String currency;

    // 开户行
    @NameInMap("deposit_bank")
    public String depositBank;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 应付总额
    @NameInMap("pay_amount")
    public String payAmount;

    // 付款单编号
    @NameInMap("pay_bill_order_code")
    @Validation(required = true)
    public String payBillOrderCode;

    // 应付账单资费项 业务必填
    @NameInMap("pay_bill_tariff_params")
    public java.util.List<PayBillTariffParam> payBillTariffParams;

    // 付款公司
    @NameInMap("pay_company")
    public String payCompany;

    // 付款公司企业信用号
    // 
    @NameInMap("pay_company_cert_no")
    public String payCompanyCertNo;

    // 付款公司did
    @NameInMap("pay_company_did")
    public String payCompanyDid;

    // 付款期限
    @NameInMap("pay_deadline")
    public String payDeadline;

    // 收款客户
    @NameInMap("receipt_client")
    public String receiptClient;

    // 收款客户企业信用号
    // 
    @NameInMap("receipt_client_cert_no")
    public String receiptClientCertNo;

    // 收款客户did
    @NameInMap("receipt_client_did")
    public String receiptClientDid;

    // 对应应收资费项code
    @NameInMap("receipt_tariff_codes")
    public java.util.List<String> receiptTariffCodes;

    // 结算公司
    @NameInMap("settle_company")
    public String settleCompany;

    // 结算公司企业信用号
    // 
    @NameInMap("settle_company_cert_no")
    public String settleCompanyCertNo;

    // 结算公司did
    @NameInMap("settle_company_did")
    public String settleCompanyDid;

    // 账单结算周期
    @NameInMap("settle_cycle")
    public String settleCycle;

    public static CreateBillPaybillorderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBillPaybillorderRequest self = new CreateBillPaybillorderRequest();
        return TeaModel.build(map, self);
    }

    public CreateBillPaybillorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBillPaybillorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBillPaybillorderRequest setApplyDate(Long applyDate) {
        this.applyDate = applyDate;
        return this;
    }
    public Long getApplyDate() {
        return this.applyDate;
    }

    public CreateBillPaybillorderRequest setBankReceiptAccount(String bankReceiptAccount) {
        this.bankReceiptAccount = bankReceiptAccount;
        return this;
    }
    public String getBankReceiptAccount() {
        return this.bankReceiptAccount;
    }

    public CreateBillPaybillorderRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public CreateBillPaybillorderRequest setDepositBank(String depositBank) {
        this.depositBank = depositBank;
        return this;
    }
    public String getDepositBank() {
        return this.depositBank;
    }

    public CreateBillPaybillorderRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public CreateBillPaybillorderRequest setPayAmount(String payAmount) {
        this.payAmount = payAmount;
        return this;
    }
    public String getPayAmount() {
        return this.payAmount;
    }

    public CreateBillPaybillorderRequest setPayBillOrderCode(String payBillOrderCode) {
        this.payBillOrderCode = payBillOrderCode;
        return this;
    }
    public String getPayBillOrderCode() {
        return this.payBillOrderCode;
    }

    public CreateBillPaybillorderRequest setPayBillTariffParams(java.util.List<PayBillTariffParam> payBillTariffParams) {
        this.payBillTariffParams = payBillTariffParams;
        return this;
    }
    public java.util.List<PayBillTariffParam> getPayBillTariffParams() {
        return this.payBillTariffParams;
    }

    public CreateBillPaybillorderRequest setPayCompany(String payCompany) {
        this.payCompany = payCompany;
        return this;
    }
    public String getPayCompany() {
        return this.payCompany;
    }

    public CreateBillPaybillorderRequest setPayCompanyCertNo(String payCompanyCertNo) {
        this.payCompanyCertNo = payCompanyCertNo;
        return this;
    }
    public String getPayCompanyCertNo() {
        return this.payCompanyCertNo;
    }

    public CreateBillPaybillorderRequest setPayCompanyDid(String payCompanyDid) {
        this.payCompanyDid = payCompanyDid;
        return this;
    }
    public String getPayCompanyDid() {
        return this.payCompanyDid;
    }

    public CreateBillPaybillorderRequest setPayDeadline(String payDeadline) {
        this.payDeadline = payDeadline;
        return this;
    }
    public String getPayDeadline() {
        return this.payDeadline;
    }

    public CreateBillPaybillorderRequest setReceiptClient(String receiptClient) {
        this.receiptClient = receiptClient;
        return this;
    }
    public String getReceiptClient() {
        return this.receiptClient;
    }

    public CreateBillPaybillorderRequest setReceiptClientCertNo(String receiptClientCertNo) {
        this.receiptClientCertNo = receiptClientCertNo;
        return this;
    }
    public String getReceiptClientCertNo() {
        return this.receiptClientCertNo;
    }

    public CreateBillPaybillorderRequest setReceiptClientDid(String receiptClientDid) {
        this.receiptClientDid = receiptClientDid;
        return this;
    }
    public String getReceiptClientDid() {
        return this.receiptClientDid;
    }

    public CreateBillPaybillorderRequest setReceiptTariffCodes(java.util.List<String> receiptTariffCodes) {
        this.receiptTariffCodes = receiptTariffCodes;
        return this;
    }
    public java.util.List<String> getReceiptTariffCodes() {
        return this.receiptTariffCodes;
    }

    public CreateBillPaybillorderRequest setSettleCompany(String settleCompany) {
        this.settleCompany = settleCompany;
        return this;
    }
    public String getSettleCompany() {
        return this.settleCompany;
    }

    public CreateBillPaybillorderRequest setSettleCompanyCertNo(String settleCompanyCertNo) {
        this.settleCompanyCertNo = settleCompanyCertNo;
        return this;
    }
    public String getSettleCompanyCertNo() {
        return this.settleCompanyCertNo;
    }

    public CreateBillPaybillorderRequest setSettleCompanyDid(String settleCompanyDid) {
        this.settleCompanyDid = settleCompanyDid;
        return this;
    }
    public String getSettleCompanyDid() {
        return this.settleCompanyDid;
    }

    public CreateBillPaybillorderRequest setSettleCycle(String settleCycle) {
        this.settleCycle = settleCycle;
        return this;
    }
    public String getSettleCycle() {
        return this.settleCycle;
    }

}
