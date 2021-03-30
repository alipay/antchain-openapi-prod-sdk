// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBillReceiptbilltariffRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    @NameInMap("action")
    public String action;

    // 计费数量  业务必填
    @NameInMap("billing_number")
    public String billingNumber;

    // 计费类型 业务必填
    @NameInMap("billing_type")
    public String billingType;

    // 航运订舱号[业务必填]
    @NameInMap("bkg_no")
    public String bkgNo;

    // 订舱单号[业务必填]
    @NameInMap("booking_no")
    public String bookingNo;

    // 币种 [业务必填]
    @NameInMap("currency")
    public String currency;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 收支  INCOME--收入， EXPENSES--支出
    // 业务必填
    @NameInMap("income_or_expenses")
    public String incomeOrExpenses;

    // 电子发票网址
    @NameInMap("invoice_url")
    public String invoiceUrl;

    // 工作单号 业务必填
    @NameInMap("order_no")
    public String orderNo;

    // 含税价 业务必填
    @NameInMap("price_including_tax")
    public String priceIncludingTax;

    // 资费单据编号
    @NameInMap("receipt_tariff_code")
    @Validation(required = true)
    public String receiptTariffCode;

    // 中文描述 业务必填
    @NameInMap("receipt_tariff_desc")
    public String receiptTariffDesc;

    // 资费项目 业务必填
    @NameInMap("receipt_tariff_project")
    public String receiptTariffProject;

    // 结算客户名称
    @NameInMap("settle_client")
    public String settleClient;

    // 结算客户企业信用号
    @NameInMap("settle_client_cert_no")
    public String settleClientCertNo;

    // 结算客户did
    @NameInMap("settle_client_did")
    public String settleClientDid;

    // 税金
    @NameInMap("taxes")
    public String taxes;

    // 未税价 业务必填
    @NameInMap("untaxed_price")
    public String untaxedPrice;

    // 确认时间
    @NameInMap("confirm_time")
    public Long confirmTime;

    public static SaveBillReceiptbilltariffRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBillReceiptbilltariffRequest self = new SaveBillReceiptbilltariffRequest();
        return TeaModel.build(map, self);
    }

    public SaveBillReceiptbilltariffRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBillReceiptbilltariffRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBillReceiptbilltariffRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SaveBillReceiptbilltariffRequest setBillingNumber(String billingNumber) {
        this.billingNumber = billingNumber;
        return this;
    }
    public String getBillingNumber() {
        return this.billingNumber;
    }

    public SaveBillReceiptbilltariffRequest setBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }
    public String getBillingType() {
        return this.billingType;
    }

    public SaveBillReceiptbilltariffRequest setBkgNo(String bkgNo) {
        this.bkgNo = bkgNo;
        return this;
    }
    public String getBkgNo() {
        return this.bkgNo;
    }

    public SaveBillReceiptbilltariffRequest setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
        return this;
    }
    public String getBookingNo() {
        return this.bookingNo;
    }

    public SaveBillReceiptbilltariffRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public SaveBillReceiptbilltariffRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBillReceiptbilltariffRequest setIncomeOrExpenses(String incomeOrExpenses) {
        this.incomeOrExpenses = incomeOrExpenses;
        return this;
    }
    public String getIncomeOrExpenses() {
        return this.incomeOrExpenses;
    }

    public SaveBillReceiptbilltariffRequest setInvoiceUrl(String invoiceUrl) {
        this.invoiceUrl = invoiceUrl;
        return this;
    }
    public String getInvoiceUrl() {
        return this.invoiceUrl;
    }

    public SaveBillReceiptbilltariffRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SaveBillReceiptbilltariffRequest setPriceIncludingTax(String priceIncludingTax) {
        this.priceIncludingTax = priceIncludingTax;
        return this;
    }
    public String getPriceIncludingTax() {
        return this.priceIncludingTax;
    }

    public SaveBillReceiptbilltariffRequest setReceiptTariffCode(String receiptTariffCode) {
        this.receiptTariffCode = receiptTariffCode;
        return this;
    }
    public String getReceiptTariffCode() {
        return this.receiptTariffCode;
    }

    public SaveBillReceiptbilltariffRequest setReceiptTariffDesc(String receiptTariffDesc) {
        this.receiptTariffDesc = receiptTariffDesc;
        return this;
    }
    public String getReceiptTariffDesc() {
        return this.receiptTariffDesc;
    }

    public SaveBillReceiptbilltariffRequest setReceiptTariffProject(String receiptTariffProject) {
        this.receiptTariffProject = receiptTariffProject;
        return this;
    }
    public String getReceiptTariffProject() {
        return this.receiptTariffProject;
    }

    public SaveBillReceiptbilltariffRequest setSettleClient(String settleClient) {
        this.settleClient = settleClient;
        return this;
    }
    public String getSettleClient() {
        return this.settleClient;
    }

    public SaveBillReceiptbilltariffRequest setSettleClientCertNo(String settleClientCertNo) {
        this.settleClientCertNo = settleClientCertNo;
        return this;
    }
    public String getSettleClientCertNo() {
        return this.settleClientCertNo;
    }

    public SaveBillReceiptbilltariffRequest setSettleClientDid(String settleClientDid) {
        this.settleClientDid = settleClientDid;
        return this;
    }
    public String getSettleClientDid() {
        return this.settleClientDid;
    }

    public SaveBillReceiptbilltariffRequest setTaxes(String taxes) {
        this.taxes = taxes;
        return this;
    }
    public String getTaxes() {
        return this.taxes;
    }

    public SaveBillReceiptbilltariffRequest setUntaxedPrice(String untaxedPrice) {
        this.untaxedPrice = untaxedPrice;
        return this;
    }
    public String getUntaxedPrice() {
        return this.untaxedPrice;
    }

    public SaveBillReceiptbilltariffRequest setConfirmTime(Long confirmTime) {
        this.confirmTime = confirmTime;
        return this;
    }
    public Long getConfirmTime() {
        return this.confirmTime;
    }

}
