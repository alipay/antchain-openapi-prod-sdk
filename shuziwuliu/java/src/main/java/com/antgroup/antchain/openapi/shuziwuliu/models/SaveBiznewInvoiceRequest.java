// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBiznewInvoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 发票唯一标识
    @NameInMap("invoice_code")
    @Validation(required = true)
    public String invoiceCode;

    // 发票税务号 [业务必填]
    @NameInMap("invoice_tax_code")
    public String invoiceTaxCode;

    // 发票号 [业务必填]
    @NameInMap("invoice_number")
    public String invoiceNumber;

    // 发票类型 [业务必填]
    @NameInMap("invoice_type")
    public String invoiceType;

    // 开票类型 pay/receipt (应付/应收) [业务必填]
    // 
    // 
    @NameInMap("type")
    public String type;

    // 校验码
    // 
    // 
    @NameInMap("check_code")
    public String checkCode;

    // 开票方名称 [业务必填]
    // 
    // 
    @NameInMap("drawer_name")
    public String drawerName;

    // 开票纳税人识别号 [业务必填]
    // 
    // 
    @NameInMap("drawer_taxpayer_code")
    public String drawerTaxpayerCode;

    // 受票方企业名称 [业务必填]
    // 
    // 
    @NameInMap("invoice_header_name")
    public String invoiceHeaderName;

    // 受票方企业信用证代码 [业务必填]
    // 
    // 
    @NameInMap("invoice_header_social_no")
    public String invoiceHeaderSocialNo;

    // 开票时间 [业务必填]
    // 
    // 
    @NameInMap("make_invoice_date")
    public Long makeInvoiceDate;

    // 发票金额 [业务必填]
    // 
    // 
    @NameInMap("amount")
    public String amount;

    // 币种 [业务必填]
    @NameInMap("currency")
    public String currency;

    // 美元 
    @NameInMap("dollar_amount")
    public String dollarAmount;

    // 不含税金额 [业务必填]
    @NameInMap("untaxed_price")
    public String untaxedPrice;

    // 发票文件ID [业务必填]
    @NameInMap("file_id")
    public String fileId;

    // 发票文件hash [业务必填]
    @NameInMap("file_hash")
    public String fileHash;

    public static SaveBiznewInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBiznewInvoiceRequest self = new SaveBiznewInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public SaveBiznewInvoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBiznewInvoiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBiznewInvoiceRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBiznewInvoiceRequest setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }
    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public SaveBiznewInvoiceRequest setInvoiceTaxCode(String invoiceTaxCode) {
        this.invoiceTaxCode = invoiceTaxCode;
        return this;
    }
    public String getInvoiceTaxCode() {
        return this.invoiceTaxCode;
    }

    public SaveBiznewInvoiceRequest setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }
    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public SaveBiznewInvoiceRequest setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }
    public String getInvoiceType() {
        return this.invoiceType;
    }

    public SaveBiznewInvoiceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SaveBiznewInvoiceRequest setCheckCode(String checkCode) {
        this.checkCode = checkCode;
        return this;
    }
    public String getCheckCode() {
        return this.checkCode;
    }

    public SaveBiznewInvoiceRequest setDrawerName(String drawerName) {
        this.drawerName = drawerName;
        return this;
    }
    public String getDrawerName() {
        return this.drawerName;
    }

    public SaveBiznewInvoiceRequest setDrawerTaxpayerCode(String drawerTaxpayerCode) {
        this.drawerTaxpayerCode = drawerTaxpayerCode;
        return this;
    }
    public String getDrawerTaxpayerCode() {
        return this.drawerTaxpayerCode;
    }

    public SaveBiznewInvoiceRequest setInvoiceHeaderName(String invoiceHeaderName) {
        this.invoiceHeaderName = invoiceHeaderName;
        return this;
    }
    public String getInvoiceHeaderName() {
        return this.invoiceHeaderName;
    }

    public SaveBiznewInvoiceRequest setInvoiceHeaderSocialNo(String invoiceHeaderSocialNo) {
        this.invoiceHeaderSocialNo = invoiceHeaderSocialNo;
        return this;
    }
    public String getInvoiceHeaderSocialNo() {
        return this.invoiceHeaderSocialNo;
    }

    public SaveBiznewInvoiceRequest setMakeInvoiceDate(Long makeInvoiceDate) {
        this.makeInvoiceDate = makeInvoiceDate;
        return this;
    }
    public Long getMakeInvoiceDate() {
        return this.makeInvoiceDate;
    }

    public SaveBiznewInvoiceRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public SaveBiznewInvoiceRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public SaveBiznewInvoiceRequest setDollarAmount(String dollarAmount) {
        this.dollarAmount = dollarAmount;
        return this;
    }
    public String getDollarAmount() {
        return this.dollarAmount;
    }

    public SaveBiznewInvoiceRequest setUntaxedPrice(String untaxedPrice) {
        this.untaxedPrice = untaxedPrice;
        return this;
    }
    public String getUntaxedPrice() {
        return this.untaxedPrice;
    }

    public SaveBiznewInvoiceRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public SaveBiznewInvoiceRequest setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

}
