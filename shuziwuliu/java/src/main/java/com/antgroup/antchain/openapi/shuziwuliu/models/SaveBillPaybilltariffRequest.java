// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBillPaybilltariffRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    @NameInMap("action")
    public String action;

    // 计费数量 业务必填
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

    // 币种 业务必填
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

    // 资费单据编号
    @NameInMap("pay_tariff_code")
    @Validation(required = true)
    public String payTariffCode;

    // 资费项中文描述 业务必填
    @NameInMap("pay_tariff_desc")
    public String payTariffDesc;

    // 资费项目 业务必填
    @NameInMap("pay_tariff_project")
    public String payTariffProject;

    // 含税价 业务必填
    @NameInMap("price_including_tax")
    public String priceIncludingTax;

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

    public static SaveBillPaybilltariffRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBillPaybilltariffRequest self = new SaveBillPaybilltariffRequest();
        return TeaModel.build(map, self);
    }

    public SaveBillPaybilltariffRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBillPaybilltariffRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBillPaybilltariffRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SaveBillPaybilltariffRequest setBillingNumber(String billingNumber) {
        this.billingNumber = billingNumber;
        return this;
    }
    public String getBillingNumber() {
        return this.billingNumber;
    }

    public SaveBillPaybilltariffRequest setBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }
    public String getBillingType() {
        return this.billingType;
    }

    public SaveBillPaybilltariffRequest setBkgNo(String bkgNo) {
        this.bkgNo = bkgNo;
        return this;
    }
    public String getBkgNo() {
        return this.bkgNo;
    }

    public SaveBillPaybilltariffRequest setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
        return this;
    }
    public String getBookingNo() {
        return this.bookingNo;
    }

    public SaveBillPaybilltariffRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public SaveBillPaybilltariffRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBillPaybilltariffRequest setIncomeOrExpenses(String incomeOrExpenses) {
        this.incomeOrExpenses = incomeOrExpenses;
        return this;
    }
    public String getIncomeOrExpenses() {
        return this.incomeOrExpenses;
    }

    public SaveBillPaybilltariffRequest setInvoiceUrl(String invoiceUrl) {
        this.invoiceUrl = invoiceUrl;
        return this;
    }
    public String getInvoiceUrl() {
        return this.invoiceUrl;
    }

    public SaveBillPaybilltariffRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SaveBillPaybilltariffRequest setPayTariffCode(String payTariffCode) {
        this.payTariffCode = payTariffCode;
        return this;
    }
    public String getPayTariffCode() {
        return this.payTariffCode;
    }

    public SaveBillPaybilltariffRequest setPayTariffDesc(String payTariffDesc) {
        this.payTariffDesc = payTariffDesc;
        return this;
    }
    public String getPayTariffDesc() {
        return this.payTariffDesc;
    }

    public SaveBillPaybilltariffRequest setPayTariffProject(String payTariffProject) {
        this.payTariffProject = payTariffProject;
        return this;
    }
    public String getPayTariffProject() {
        return this.payTariffProject;
    }

    public SaveBillPaybilltariffRequest setPriceIncludingTax(String priceIncludingTax) {
        this.priceIncludingTax = priceIncludingTax;
        return this;
    }
    public String getPriceIncludingTax() {
        return this.priceIncludingTax;
    }

    public SaveBillPaybilltariffRequest setSettleClient(String settleClient) {
        this.settleClient = settleClient;
        return this;
    }
    public String getSettleClient() {
        return this.settleClient;
    }

    public SaveBillPaybilltariffRequest setSettleClientCertNo(String settleClientCertNo) {
        this.settleClientCertNo = settleClientCertNo;
        return this;
    }
    public String getSettleClientCertNo() {
        return this.settleClientCertNo;
    }

    public SaveBillPaybilltariffRequest setSettleClientDid(String settleClientDid) {
        this.settleClientDid = settleClientDid;
        return this;
    }
    public String getSettleClientDid() {
        return this.settleClientDid;
    }

    public SaveBillPaybilltariffRequest setTaxes(String taxes) {
        this.taxes = taxes;
        return this;
    }
    public String getTaxes() {
        return this.taxes;
    }

    public SaveBillPaybilltariffRequest setUntaxedPrice(String untaxedPrice) {
        this.untaxedPrice = untaxedPrice;
        return this;
    }
    public String getUntaxedPrice() {
        return this.untaxedPrice;
    }

    public SaveBillPaybilltariffRequest setConfirmTime(Long confirmTime) {
        this.confirmTime = confirmTime;
        return this;
    }
    public Long getConfirmTime() {
        return this.confirmTime;
    }

}
