// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class NotaryInvoiceInfo extends TeaModel {
    // 开票类型
    /**
     * <strong>example:</strong>
     * <p>PAPER纸质，ELECTRIC电子</p>
     */
    @NameInMap("billing_type")
    @Validation(required = true)
    public String billingType;

    // 发票类型
    /**
     * <strong>example:</strong>
     * <p>NORMAL增值税普通发票、SPECIAL增值税专用发票 个人只能开具普通发票</p>
     */
    @NameInMap("invoice_type")
    @Validation(required = true)
    public String invoiceType;

    // 主体类型
    /**
     * <strong>example:</strong>
     * <p>个人PERSON，机构ENTERPRISE</p>
     */
    @NameInMap("subject_type")
    @Validation(required = true)
    public String subjectType;

    // 发票抬头
    /**
     * <strong>example:</strong>
     * <p>姓名/单位名称</p>
     */
    @NameInMap("invoice_name")
    @Validation(required = true)
    public String invoiceName;

    // 纳税人识别号
    /**
     * <strong>example:</strong>
     * <p>发票抬头为机构时必填</p>
     */
    @NameInMap("ratepayer_code")
    public String ratepayerCode;

    // 开户行
    /**
     * <strong>example:</strong>
     * <p>发票抬头为机构时必填</p>
     */
    @NameInMap("bank_type")
    public String bankType;

    // 开户行账号
    /**
     * <strong>example:</strong>
     * <p>发票抬头为机构时必填</p>
     */
    @NameInMap("bank_account")
    public String bankAccount;

    // 单位地址
    /**
     * <strong>example:</strong>
     * <p>发票抬头为机构时必填</p>
     */
    @NameInMap("unit_address")
    public String unitAddress;

    // 单位电话
    /**
     * <strong>example:</strong>
     * <p>发票抬头为机构时必填</p>
     */
    @NameInMap("unit_phone")
    public String unitPhone;

    // 发票收件信息
    @NameInMap("delivery")
    public DeliveryInfo delivery;

    public static NotaryInvoiceInfo build(java.util.Map<String, ?> map) throws Exception {
        NotaryInvoiceInfo self = new NotaryInvoiceInfo();
        return TeaModel.build(map, self);
    }

    public NotaryInvoiceInfo setBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }
    public String getBillingType() {
        return this.billingType;
    }

    public NotaryInvoiceInfo setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }
    public String getInvoiceType() {
        return this.invoiceType;
    }

    public NotaryInvoiceInfo setSubjectType(String subjectType) {
        this.subjectType = subjectType;
        return this;
    }
    public String getSubjectType() {
        return this.subjectType;
    }

    public NotaryInvoiceInfo setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
        return this;
    }
    public String getInvoiceName() {
        return this.invoiceName;
    }

    public NotaryInvoiceInfo setRatepayerCode(String ratepayerCode) {
        this.ratepayerCode = ratepayerCode;
        return this;
    }
    public String getRatepayerCode() {
        return this.ratepayerCode;
    }

    public NotaryInvoiceInfo setBankType(String bankType) {
        this.bankType = bankType;
        return this;
    }
    public String getBankType() {
        return this.bankType;
    }

    public NotaryInvoiceInfo setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }
    public String getBankAccount() {
        return this.bankAccount;
    }

    public NotaryInvoiceInfo setUnitAddress(String unitAddress) {
        this.unitAddress = unitAddress;
        return this;
    }
    public String getUnitAddress() {
        return this.unitAddress;
    }

    public NotaryInvoiceInfo setUnitPhone(String unitPhone) {
        this.unitPhone = unitPhone;
        return this;
    }
    public String getUnitPhone() {
        return this.unitPhone;
    }

    public NotaryInvoiceInfo setDelivery(DeliveryInfo delivery) {
        this.delivery = delivery;
        return this;
    }
    public DeliveryInfo getDelivery() {
        return this.delivery;
    }

}
