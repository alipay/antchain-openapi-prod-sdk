// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class ApplyInvoiceBuyer extends TeaModel {
    // 购方地址
    /**
     * <strong>example:</strong>
     * <p>上海市黄浦区</p>
     */
    @NameInMap("buyer_address")
    public String buyerAddress;

    // 银行账号
    /**
     * <strong>example:</strong>
     * <p>23355434</p>
     */
    @NameInMap("buyer_bank_account")
    public String buyerBankAccount;

    // 银行名称
    /**
     * <strong>example:</strong>
     * <p>招商银行</p>
     */
    @NameInMap("buyer_bank_name")
    public String buyerBankName;

    // 抬头
    /**
     * <strong>example:</strong>
     * <p>xxxx公司</p>
     */
    @NameInMap("buyer_invoice_title")
    @Validation(required = true)
    public String buyerInvoiceTitle;

    // 税号
    /**
     * <strong>example:</strong>
     * <p>3344555</p>
     */
    @NameInMap("buyer_tax_no")
    public String buyerTaxNo;

    // 电话
    /**
     * <strong>example:</strong>
     * <p>0571-94848</p>
     */
    @NameInMap("buyer_telephone")
    public String buyerTelephone;

    // 纳税人资格类型
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("tax_payer_qualification")
    @Validation(required = true)
    public String taxPayerQualification;

    // 客户开票配置ID
    /**
     * <strong>example:</strong>
     * <p>2344</p>
     */
    @NameInMap("buyer_config_id")
    public String buyerConfigId;

    public static ApplyInvoiceBuyer build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoiceBuyer self = new ApplyInvoiceBuyer();
        return TeaModel.build(map, self);
    }

    public ApplyInvoiceBuyer setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
        return this;
    }
    public String getBuyerAddress() {
        return this.buyerAddress;
    }

    public ApplyInvoiceBuyer setBuyerBankAccount(String buyerBankAccount) {
        this.buyerBankAccount = buyerBankAccount;
        return this;
    }
    public String getBuyerBankAccount() {
        return this.buyerBankAccount;
    }

    public ApplyInvoiceBuyer setBuyerBankName(String buyerBankName) {
        this.buyerBankName = buyerBankName;
        return this;
    }
    public String getBuyerBankName() {
        return this.buyerBankName;
    }

    public ApplyInvoiceBuyer setBuyerInvoiceTitle(String buyerInvoiceTitle) {
        this.buyerInvoiceTitle = buyerInvoiceTitle;
        return this;
    }
    public String getBuyerInvoiceTitle() {
        return this.buyerInvoiceTitle;
    }

    public ApplyInvoiceBuyer setBuyerTaxNo(String buyerTaxNo) {
        this.buyerTaxNo = buyerTaxNo;
        return this;
    }
    public String getBuyerTaxNo() {
        return this.buyerTaxNo;
    }

    public ApplyInvoiceBuyer setBuyerTelephone(String buyerTelephone) {
        this.buyerTelephone = buyerTelephone;
        return this;
    }
    public String getBuyerTelephone() {
        return this.buyerTelephone;
    }

    public ApplyInvoiceBuyer setTaxPayerQualification(String taxPayerQualification) {
        this.taxPayerQualification = taxPayerQualification;
        return this;
    }
    public String getTaxPayerQualification() {
        return this.taxPayerQualification;
    }

    public ApplyInvoiceBuyer setBuyerConfigId(String buyerConfigId) {
        this.buyerConfigId = buyerConfigId;
        return this;
    }
    public String getBuyerConfigId() {
        return this.buyerConfigId;
    }

}
