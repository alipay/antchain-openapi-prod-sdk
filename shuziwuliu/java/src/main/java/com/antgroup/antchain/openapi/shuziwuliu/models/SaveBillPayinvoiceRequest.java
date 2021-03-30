// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBillPayinvoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    @NameInMap("action")
    public String action;

    // 总金额 业务必填
    @NameInMap("amount")
    public String amount;

    // 校验码后六位
    @NameInMap("check_code")
    public String checkCode;

    // 币种 CNY/USD [业务必填]
    @NameInMap("currency")
    public String currency;

    // 美元金额
    @NameInMap("dollar_amount")
    public String dollarAmount;

    // 开票方名称  业务必填
    @NameInMap("drawer_name")
    public String drawerName;

    // 开票纳税人识别号 业务必填
    @NameInMap("drawer_taxpayer_code")
    public String drawerTaxpayerCode;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 发票唯一标识
    @NameInMap("invoice_code")
    @Validation(required = true)
    public String invoiceCode;

    // 发票抬头did[业务必填]
    @NameInMap("invoice_header_did")
    public String invoiceHeaderDid;

    // 发票抬头企业名称[业务必填]
    @NameInMap("invoice_header_name")
    public String invoiceHeaderName;

    // 发票抬头企业信用代码[业务必填]
    @NameInMap("invoice_header_social_no")
    public String invoiceHeaderSocialNo;

    // 发票号码 业务必填
    @NameInMap("invoice_number")
    public String invoiceNumber;

    // 发票税务号
    @NameInMap("invoice_tax_code")
    public String invoiceTaxCode;

    // 开票类型 业务必填
    @NameInMap("invoice_type")
    public String invoiceType;

    // 开票日期 业务必填
    @NameInMap("make_invoice_date")
    public Long makeInvoiceDate;

    // 账单关联项目
    @NameInMap("pay_bill_invoice_params")
    public java.util.List<PayBillInvoiceParam> payBillInvoiceParams;

    // 资费项发票 业务必填
    @NameInMap("pay_tariff_invoice_params")
    public java.util.List<PayTariffInvoiceParam> payTariffInvoiceParams;

    // 不含税金额 业务必填
    @NameInMap("untaxed_price")
    public String untaxedPrice;

    public static SaveBillPayinvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBillPayinvoiceRequest self = new SaveBillPayinvoiceRequest();
        return TeaModel.build(map, self);
    }

    public SaveBillPayinvoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBillPayinvoiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBillPayinvoiceRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SaveBillPayinvoiceRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public SaveBillPayinvoiceRequest setCheckCode(String checkCode) {
        this.checkCode = checkCode;
        return this;
    }
    public String getCheckCode() {
        return this.checkCode;
    }

    public SaveBillPayinvoiceRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public SaveBillPayinvoiceRequest setDollarAmount(String dollarAmount) {
        this.dollarAmount = dollarAmount;
        return this;
    }
    public String getDollarAmount() {
        return this.dollarAmount;
    }

    public SaveBillPayinvoiceRequest setDrawerName(String drawerName) {
        this.drawerName = drawerName;
        return this;
    }
    public String getDrawerName() {
        return this.drawerName;
    }

    public SaveBillPayinvoiceRequest setDrawerTaxpayerCode(String drawerTaxpayerCode) {
        this.drawerTaxpayerCode = drawerTaxpayerCode;
        return this;
    }
    public String getDrawerTaxpayerCode() {
        return this.drawerTaxpayerCode;
    }

    public SaveBillPayinvoiceRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBillPayinvoiceRequest setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }
    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public SaveBillPayinvoiceRequest setInvoiceHeaderDid(String invoiceHeaderDid) {
        this.invoiceHeaderDid = invoiceHeaderDid;
        return this;
    }
    public String getInvoiceHeaderDid() {
        return this.invoiceHeaderDid;
    }

    public SaveBillPayinvoiceRequest setInvoiceHeaderName(String invoiceHeaderName) {
        this.invoiceHeaderName = invoiceHeaderName;
        return this;
    }
    public String getInvoiceHeaderName() {
        return this.invoiceHeaderName;
    }

    public SaveBillPayinvoiceRequest setInvoiceHeaderSocialNo(String invoiceHeaderSocialNo) {
        this.invoiceHeaderSocialNo = invoiceHeaderSocialNo;
        return this;
    }
    public String getInvoiceHeaderSocialNo() {
        return this.invoiceHeaderSocialNo;
    }

    public SaveBillPayinvoiceRequest setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }
    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public SaveBillPayinvoiceRequest setInvoiceTaxCode(String invoiceTaxCode) {
        this.invoiceTaxCode = invoiceTaxCode;
        return this;
    }
    public String getInvoiceTaxCode() {
        return this.invoiceTaxCode;
    }

    public SaveBillPayinvoiceRequest setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }
    public String getInvoiceType() {
        return this.invoiceType;
    }

    public SaveBillPayinvoiceRequest setMakeInvoiceDate(Long makeInvoiceDate) {
        this.makeInvoiceDate = makeInvoiceDate;
        return this;
    }
    public Long getMakeInvoiceDate() {
        return this.makeInvoiceDate;
    }

    public SaveBillPayinvoiceRequest setPayBillInvoiceParams(java.util.List<PayBillInvoiceParam> payBillInvoiceParams) {
        this.payBillInvoiceParams = payBillInvoiceParams;
        return this;
    }
    public java.util.List<PayBillInvoiceParam> getPayBillInvoiceParams() {
        return this.payBillInvoiceParams;
    }

    public SaveBillPayinvoiceRequest setPayTariffInvoiceParams(java.util.List<PayTariffInvoiceParam> payTariffInvoiceParams) {
        this.payTariffInvoiceParams = payTariffInvoiceParams;
        return this;
    }
    public java.util.List<PayTariffInvoiceParam> getPayTariffInvoiceParams() {
        return this.payTariffInvoiceParams;
    }

    public SaveBillPayinvoiceRequest setUntaxedPrice(String untaxedPrice) {
        this.untaxedPrice = untaxedPrice;
        return this;
    }
    public String getUntaxedPrice() {
        return this.untaxedPrice;
    }

}
