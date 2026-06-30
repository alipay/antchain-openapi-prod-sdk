// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class InvoiceInfo extends TeaModel {
    // 发票类型 InvoiceTypeEnum目前只支持普票
    // (NORMAL,ELC,普票)
    // (SPECIAL,VAT,专票)
    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("invoice_type")
    @Validation(required = true)
    public String invoiceType;

    // 发票抬头（著作权人之一）
    /**
     * <strong>example:</strong>
     * <p>000</p>
     */
    @NameInMap("invoice_header")
    @Validation(required = true)
    public String invoiceHeader;

    // 纳税人识别号（机构必填）
    /**
     * <strong>example:</strong>
     * <p>纳税人识别号</p>
     */
    @NameInMap("taxpayer_number")
    public String taxpayerNumber;

    // 注册地址（专票必填）
    /**
     * <strong>example:</strong>
     * <p>注册地址</p>
     */
    @NameInMap("registered_address")
    public String registeredAddress;

    // 注册电话（专票必填）
    /**
     * <strong>example:</strong>
     * <p>注册电话</p>
     */
    @NameInMap("registered_tel")
    public String registeredTel;

    // 开户电话（专票必填）
    /**
     * <strong>example:</strong>
     * <p>开户电话</p>
     */
    @NameInMap("open_account_tel")
    public String openAccountTel;

    // 开户银行（专票必填）
    /**
     * <strong>example:</strong>
     * <p>开户银行</p>
     */
    @NameInMap("open_account_bank")
    public String openAccountBank;

    // 银行账号（专票必填）
    /**
     * <strong>example:</strong>
     * <p>银行账号</p>
     */
    @NameInMap("bank_account")
    public String bankAccount;

    public static InvoiceInfo build(java.util.Map<String, ?> map) throws Exception {
        InvoiceInfo self = new InvoiceInfo();
        return TeaModel.build(map, self);
    }

    public InvoiceInfo setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }
    public String getInvoiceType() {
        return this.invoiceType;
    }

    public InvoiceInfo setInvoiceHeader(String invoiceHeader) {
        this.invoiceHeader = invoiceHeader;
        return this;
    }
    public String getInvoiceHeader() {
        return this.invoiceHeader;
    }

    public InvoiceInfo setTaxpayerNumber(String taxpayerNumber) {
        this.taxpayerNumber = taxpayerNumber;
        return this;
    }
    public String getTaxpayerNumber() {
        return this.taxpayerNumber;
    }

    public InvoiceInfo setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
        return this;
    }
    public String getRegisteredAddress() {
        return this.registeredAddress;
    }

    public InvoiceInfo setRegisteredTel(String registeredTel) {
        this.registeredTel = registeredTel;
        return this;
    }
    public String getRegisteredTel() {
        return this.registeredTel;
    }

    public InvoiceInfo setOpenAccountTel(String openAccountTel) {
        this.openAccountTel = openAccountTel;
        return this;
    }
    public String getOpenAccountTel() {
        return this.openAccountTel;
    }

    public InvoiceInfo setOpenAccountBank(String openAccountBank) {
        this.openAccountBank = openAccountBank;
        return this;
    }
    public String getOpenAccountBank() {
        return this.openAccountBank;
    }

    public InvoiceInfo setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }
    public String getBankAccount() {
        return this.bankAccount;
    }

}
