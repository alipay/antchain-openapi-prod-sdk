// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateBillReceiptbillorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实际收款结算公司
    @NameInMap("actual_settle_company")
    public String actualSettleCompany;

    // 实际收款结算公司企业信用号
    @NameInMap("actual_settle_company_cert_no")
    public String actualSettleCompanyCertNo;

    // 实际收款结算公司did
    @NameInMap("actual_settle_company_did")
    public String actualSettleCompanyDid;

    // 确认时间  业务必填
    @NameInMap("apply_date")
    public Long applyDate;

    // 揽货类型
    @NameInMap("client_type")
    public String clientType;

    // 币种 业务必填
    @NameInMap("currency")
    public String currency;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 开票抬头
    @NameInMap("invoice_title")
    public String invoiceTitle;

    // 含税价
    @NameInMap("price_including_tax")
    public String priceIncludingTax;

    // 收款账号
    @NameInMap("receipt_account")
    public String receiptAccount;

    // 收款总额 业务必填
    @NameInMap("receipt_amount")
    public String receiptAmount;

    // 收款账单编号
    @NameInMap("receipt_bill_order_code")
    @Validation(required = true)
    public String receiptBillOrderCode;

    // 应收资费项账单 业务必填
    @NameInMap("receipt_bill_tariff_params")
    public java.util.List<ReceiptBillTariffParam> receiptBillTariffParams;

    // 结算客户名称
    @NameInMap("settle_client")
    public String settleClient;

    // 结算客户企业信用号
    @NameInMap("settle_client_cert_no")
    public String settleClientCertNo;

    // 结算客户名称did
    @NameInMap("settle_client_did")
    public String settleClientDid;

    // 结算公司
    @NameInMap("settle_company")
    public String settleCompany;

    // 结算公司企业信用号
    @NameInMap("settle_company_cert_no")
    public String settleCompanyCertNo;

    // 结算公司did
    @NameInMap("settle_company_did")
    public String settleCompanyDid;

    // 账单结算周期
    @NameInMap("settle_cycle")
    public String settleCycle;

    // 税金
    @NameInMap("taxes")
    public String taxes;

    // 未税价
    @NameInMap("untaxed_price")
    public String untaxedPrice;

    public static CreateBillReceiptbillorderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBillReceiptbillorderRequest self = new CreateBillReceiptbillorderRequest();
        return TeaModel.build(map, self);
    }

    public CreateBillReceiptbillorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBillReceiptbillorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBillReceiptbillorderRequest setActualSettleCompany(String actualSettleCompany) {
        this.actualSettleCompany = actualSettleCompany;
        return this;
    }
    public String getActualSettleCompany() {
        return this.actualSettleCompany;
    }

    public CreateBillReceiptbillorderRequest setActualSettleCompanyCertNo(String actualSettleCompanyCertNo) {
        this.actualSettleCompanyCertNo = actualSettleCompanyCertNo;
        return this;
    }
    public String getActualSettleCompanyCertNo() {
        return this.actualSettleCompanyCertNo;
    }

    public CreateBillReceiptbillorderRequest setActualSettleCompanyDid(String actualSettleCompanyDid) {
        this.actualSettleCompanyDid = actualSettleCompanyDid;
        return this;
    }
    public String getActualSettleCompanyDid() {
        return this.actualSettleCompanyDid;
    }

    public CreateBillReceiptbillorderRequest setApplyDate(Long applyDate) {
        this.applyDate = applyDate;
        return this;
    }
    public Long getApplyDate() {
        return this.applyDate;
    }

    public CreateBillReceiptbillorderRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public CreateBillReceiptbillorderRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public CreateBillReceiptbillorderRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public CreateBillReceiptbillorderRequest setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
        return this;
    }
    public String getInvoiceTitle() {
        return this.invoiceTitle;
    }

    public CreateBillReceiptbillorderRequest setPriceIncludingTax(String priceIncludingTax) {
        this.priceIncludingTax = priceIncludingTax;
        return this;
    }
    public String getPriceIncludingTax() {
        return this.priceIncludingTax;
    }

    public CreateBillReceiptbillorderRequest setReceiptAccount(String receiptAccount) {
        this.receiptAccount = receiptAccount;
        return this;
    }
    public String getReceiptAccount() {
        return this.receiptAccount;
    }

    public CreateBillReceiptbillorderRequest setReceiptAmount(String receiptAmount) {
        this.receiptAmount = receiptAmount;
        return this;
    }
    public String getReceiptAmount() {
        return this.receiptAmount;
    }

    public CreateBillReceiptbillorderRequest setReceiptBillOrderCode(String receiptBillOrderCode) {
        this.receiptBillOrderCode = receiptBillOrderCode;
        return this;
    }
    public String getReceiptBillOrderCode() {
        return this.receiptBillOrderCode;
    }

    public CreateBillReceiptbillorderRequest setReceiptBillTariffParams(java.util.List<ReceiptBillTariffParam> receiptBillTariffParams) {
        this.receiptBillTariffParams = receiptBillTariffParams;
        return this;
    }
    public java.util.List<ReceiptBillTariffParam> getReceiptBillTariffParams() {
        return this.receiptBillTariffParams;
    }

    public CreateBillReceiptbillorderRequest setSettleClient(String settleClient) {
        this.settleClient = settleClient;
        return this;
    }
    public String getSettleClient() {
        return this.settleClient;
    }

    public CreateBillReceiptbillorderRequest setSettleClientCertNo(String settleClientCertNo) {
        this.settleClientCertNo = settleClientCertNo;
        return this;
    }
    public String getSettleClientCertNo() {
        return this.settleClientCertNo;
    }

    public CreateBillReceiptbillorderRequest setSettleClientDid(String settleClientDid) {
        this.settleClientDid = settleClientDid;
        return this;
    }
    public String getSettleClientDid() {
        return this.settleClientDid;
    }

    public CreateBillReceiptbillorderRequest setSettleCompany(String settleCompany) {
        this.settleCompany = settleCompany;
        return this;
    }
    public String getSettleCompany() {
        return this.settleCompany;
    }

    public CreateBillReceiptbillorderRequest setSettleCompanyCertNo(String settleCompanyCertNo) {
        this.settleCompanyCertNo = settleCompanyCertNo;
        return this;
    }
    public String getSettleCompanyCertNo() {
        return this.settleCompanyCertNo;
    }

    public CreateBillReceiptbillorderRequest setSettleCompanyDid(String settleCompanyDid) {
        this.settleCompanyDid = settleCompanyDid;
        return this;
    }
    public String getSettleCompanyDid() {
        return this.settleCompanyDid;
    }

    public CreateBillReceiptbillorderRequest setSettleCycle(String settleCycle) {
        this.settleCycle = settleCycle;
        return this;
    }
    public String getSettleCycle() {
        return this.settleCycle;
    }

    public CreateBillReceiptbillorderRequest setTaxes(String taxes) {
        this.taxes = taxes;
        return this;
    }
    public String getTaxes() {
        return this.taxes;
    }

    public CreateBillReceiptbillorderRequest setUntaxedPrice(String untaxedPrice) {
        this.untaxedPrice = untaxedPrice;
        return this;
    }
    public String getUntaxedPrice() {
        return this.untaxedPrice;
    }

}
