// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBillReceiptinvoiceRequest extends TeaModel {
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

    // 开票方名称 业务必填
    @NameInMap("drawer_name")
    public String drawerName;

    // 开票纳税人识别号 业务必填
    @NameInMap("drawer_taxpayer_code")
    public String drawerTaxpayerCode;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 应收发票唯一标识
    @NameInMap("invoice_code")
    @Validation(required = true)
    public String invoiceCode;

    // 发票号码 业务必填
    @NameInMap("invoice_number")
    public String invoiceNumber;

    // 开票类型 业务必填
    @NameInMap("invoice_type")
    public String invoiceType;

    // 开票日期 毫秒值 业务必填
    @NameInMap("make_invoice_date")
    public Long makeInvoiceDate;

    // 资费项发票 业务必填
    @NameInMap("receipt_tariff_invoice_params")
    public java.util.List<ReceiptTariffInvoiceParam> receiptTariffInvoiceParams;

    // 不含税金额 业务必填
    @NameInMap("untaxed_price")
    public String untaxedPrice;

    // 发票税务号
    @NameInMap("invoice_tax_code")
    public String invoiceTaxCode;

    public static SaveBillReceiptinvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBillReceiptinvoiceRequest self = new SaveBillReceiptinvoiceRequest();
        return TeaModel.build(map, self);
    }

    public SaveBillReceiptinvoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBillReceiptinvoiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBillReceiptinvoiceRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SaveBillReceiptinvoiceRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public SaveBillReceiptinvoiceRequest setCheckCode(String checkCode) {
        this.checkCode = checkCode;
        return this;
    }
    public String getCheckCode() {
        return this.checkCode;
    }

    public SaveBillReceiptinvoiceRequest setDrawerName(String drawerName) {
        this.drawerName = drawerName;
        return this;
    }
    public String getDrawerName() {
        return this.drawerName;
    }

    public SaveBillReceiptinvoiceRequest setDrawerTaxpayerCode(String drawerTaxpayerCode) {
        this.drawerTaxpayerCode = drawerTaxpayerCode;
        return this;
    }
    public String getDrawerTaxpayerCode() {
        return this.drawerTaxpayerCode;
    }

    public SaveBillReceiptinvoiceRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBillReceiptinvoiceRequest setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }
    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public SaveBillReceiptinvoiceRequest setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }
    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public SaveBillReceiptinvoiceRequest setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }
    public String getInvoiceType() {
        return this.invoiceType;
    }

    public SaveBillReceiptinvoiceRequest setMakeInvoiceDate(Long makeInvoiceDate) {
        this.makeInvoiceDate = makeInvoiceDate;
        return this;
    }
    public Long getMakeInvoiceDate() {
        return this.makeInvoiceDate;
    }

    public SaveBillReceiptinvoiceRequest setReceiptTariffInvoiceParams(java.util.List<ReceiptTariffInvoiceParam> receiptTariffInvoiceParams) {
        this.receiptTariffInvoiceParams = receiptTariffInvoiceParams;
        return this;
    }
    public java.util.List<ReceiptTariffInvoiceParam> getReceiptTariffInvoiceParams() {
        return this.receiptTariffInvoiceParams;
    }

    public SaveBillReceiptinvoiceRequest setUntaxedPrice(String untaxedPrice) {
        this.untaxedPrice = untaxedPrice;
        return this;
    }
    public String getUntaxedPrice() {
        return this.untaxedPrice;
    }

    public SaveBillReceiptinvoiceRequest setInvoiceTaxCode(String invoiceTaxCode) {
        this.invoiceTaxCode = invoiceTaxCode;
        return this;
    }
    public String getInvoiceTaxCode() {
        return this.invoiceTaxCode;
    }

}
