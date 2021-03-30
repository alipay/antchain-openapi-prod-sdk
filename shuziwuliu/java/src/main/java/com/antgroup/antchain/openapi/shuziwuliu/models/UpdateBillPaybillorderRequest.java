// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UpdateBillPaybillorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除	
    // 
    @NameInMap("action")
    public String action;

    // 申请时间 毫秒值 业务必填
    @NameInMap("apply_date")
    public Long applyDate;

    // 银行收款账户
    @NameInMap("bank_receipt_account")
    public String bankReceiptAccount;

    // 币种 业务必填
    @NameInMap("currency")
    public String currency;

    // 开户行
    @NameInMap("deposit_bank")
    public String depositBank;

    // 账单到期日
    @NameInMap("expire_date")
    public Long expireDate;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 应付总额 业务必填
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
    @NameInMap("pay_company_cert_no")
    public String payCompanyCertNo;

    // 付款公司did
    @NameInMap("pay_company_did")
    public String payCompanyDid;

    // 付款期限
    @NameInMap("pay_deadline")
    public String payDeadline;

    // 收款客户[业务必填]
    @NameInMap("receipt_client")
    public String receiptClient;

    // 收款客户企业信用号[业务必填]
    @NameInMap("receipt_client_cert_no")
    public String receiptClientCertNo;

    // 收款客户did[业务必填]
    @NameInMap("receipt_client_did")
    public String receiptClientDid;

    // 对应应收资费项code
    @NameInMap("receipt_tariff_codes")
    public java.util.List<String> receiptTariffCodes;

    // 结算公司
    @NameInMap("settle_company")
    public String settleCompany;

    // 结算公司企业信用号
    @NameInMap("settle_company_cert_no")
    public String settleCompanyCertNo;

    // 结算公司did [业务必填]
    @NameInMap("settle_company_did")
    public String settleCompanyDid;

    // 账单结算周期
    @NameInMap("settle_cycle")
    public String settleCycle;

    // 结算状态 ：  SETTLED(已结算) ,  UNSETTLE（未结算）[业务必填]
    @NameInMap("settle_status")
    public String settleStatus;

    // 确认时间
    @NameInMap("confirm_time")
    public Long confirmTime;

    public static UpdateBillPaybillorderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBillPaybillorderRequest self = new UpdateBillPaybillorderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBillPaybillorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBillPaybillorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBillPaybillorderRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public UpdateBillPaybillorderRequest setApplyDate(Long applyDate) {
        this.applyDate = applyDate;
        return this;
    }
    public Long getApplyDate() {
        return this.applyDate;
    }

    public UpdateBillPaybillorderRequest setBankReceiptAccount(String bankReceiptAccount) {
        this.bankReceiptAccount = bankReceiptAccount;
        return this;
    }
    public String getBankReceiptAccount() {
        return this.bankReceiptAccount;
    }

    public UpdateBillPaybillorderRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public UpdateBillPaybillorderRequest setDepositBank(String depositBank) {
        this.depositBank = depositBank;
        return this;
    }
    public String getDepositBank() {
        return this.depositBank;
    }

    public UpdateBillPaybillorderRequest setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public Long getExpireDate() {
        return this.expireDate;
    }

    public UpdateBillPaybillorderRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public UpdateBillPaybillorderRequest setPayAmount(String payAmount) {
        this.payAmount = payAmount;
        return this;
    }
    public String getPayAmount() {
        return this.payAmount;
    }

    public UpdateBillPaybillorderRequest setPayBillOrderCode(String payBillOrderCode) {
        this.payBillOrderCode = payBillOrderCode;
        return this;
    }
    public String getPayBillOrderCode() {
        return this.payBillOrderCode;
    }

    public UpdateBillPaybillorderRequest setPayBillTariffParams(java.util.List<PayBillTariffParam> payBillTariffParams) {
        this.payBillTariffParams = payBillTariffParams;
        return this;
    }
    public java.util.List<PayBillTariffParam> getPayBillTariffParams() {
        return this.payBillTariffParams;
    }

    public UpdateBillPaybillorderRequest setPayCompany(String payCompany) {
        this.payCompany = payCompany;
        return this;
    }
    public String getPayCompany() {
        return this.payCompany;
    }

    public UpdateBillPaybillorderRequest setPayCompanyCertNo(String payCompanyCertNo) {
        this.payCompanyCertNo = payCompanyCertNo;
        return this;
    }
    public String getPayCompanyCertNo() {
        return this.payCompanyCertNo;
    }

    public UpdateBillPaybillorderRequest setPayCompanyDid(String payCompanyDid) {
        this.payCompanyDid = payCompanyDid;
        return this;
    }
    public String getPayCompanyDid() {
        return this.payCompanyDid;
    }

    public UpdateBillPaybillorderRequest setPayDeadline(String payDeadline) {
        this.payDeadline = payDeadline;
        return this;
    }
    public String getPayDeadline() {
        return this.payDeadline;
    }

    public UpdateBillPaybillorderRequest setReceiptClient(String receiptClient) {
        this.receiptClient = receiptClient;
        return this;
    }
    public String getReceiptClient() {
        return this.receiptClient;
    }

    public UpdateBillPaybillorderRequest setReceiptClientCertNo(String receiptClientCertNo) {
        this.receiptClientCertNo = receiptClientCertNo;
        return this;
    }
    public String getReceiptClientCertNo() {
        return this.receiptClientCertNo;
    }

    public UpdateBillPaybillorderRequest setReceiptClientDid(String receiptClientDid) {
        this.receiptClientDid = receiptClientDid;
        return this;
    }
    public String getReceiptClientDid() {
        return this.receiptClientDid;
    }

    public UpdateBillPaybillorderRequest setReceiptTariffCodes(java.util.List<String> receiptTariffCodes) {
        this.receiptTariffCodes = receiptTariffCodes;
        return this;
    }
    public java.util.List<String> getReceiptTariffCodes() {
        return this.receiptTariffCodes;
    }

    public UpdateBillPaybillorderRequest setSettleCompany(String settleCompany) {
        this.settleCompany = settleCompany;
        return this;
    }
    public String getSettleCompany() {
        return this.settleCompany;
    }

    public UpdateBillPaybillorderRequest setSettleCompanyCertNo(String settleCompanyCertNo) {
        this.settleCompanyCertNo = settleCompanyCertNo;
        return this;
    }
    public String getSettleCompanyCertNo() {
        return this.settleCompanyCertNo;
    }

    public UpdateBillPaybillorderRequest setSettleCompanyDid(String settleCompanyDid) {
        this.settleCompanyDid = settleCompanyDid;
        return this;
    }
    public String getSettleCompanyDid() {
        return this.settleCompanyDid;
    }

    public UpdateBillPaybillorderRequest setSettleCycle(String settleCycle) {
        this.settleCycle = settleCycle;
        return this;
    }
    public String getSettleCycle() {
        return this.settleCycle;
    }

    public UpdateBillPaybillorderRequest setSettleStatus(String settleStatus) {
        this.settleStatus = settleStatus;
        return this;
    }
    public String getSettleStatus() {
        return this.settleStatus;
    }

    public UpdateBillPaybillorderRequest setConfirmTime(Long confirmTime) {
        this.confirmTime = confirmTime;
        return this;
    }
    public Long getConfirmTime() {
        return this.confirmTime;
    }

}
