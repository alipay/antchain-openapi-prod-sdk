// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class ApplyInvoice extends TeaModel {
    // 发票类型，01,增值税专用发票; * 02,增值税普通发票; * 04,国际形式发票; * 05,其它发票
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("invoice_type")
    @Validation(required = true)
    public String invoiceType;

    // 发票金额
    /**
     * <strong>example:</strong>
     * <p>3244.98</p>
     */
    @NameInMap("invoice_amt")
    @Validation(required = true)
    public String invoiceAmt;

    // 发票行信息
    @NameInMap("apply_invoice_lines")
    @Validation(required = true)
    public java.util.List<ApplyInvoiceLine> applyInvoiceLines;

    // 销方信息
    @NameInMap("apply_invoice_seller")
    @Validation(required = true)
    public ApplyInvoiceSeller applyInvoiceSeller;

    // 购方信息
    @NameInMap("apply_invoice_buyer")
    @Validation(required = true)
    public ApplyInvoiceBuyer applyInvoiceBuyer;

    // 发票备注
    /**
     * <strong>example:</strong>
     * <p>备注</p>
     */
    @NameInMap("invoice_note")
    public String invoiceNote;

    // 币种
    /**
     * <strong>example:</strong>
     * <p>156</p>
     */
    @NameInMap("ccy")
    public String ccy;

    // 发票ID
    /**
     * <strong>example:</strong>
     * <p>334556666</p>
     */
    @NameInMap("apply_invoice_id")
    @Validation(required = true)
    public String applyInvoiceId;

    public static ApplyInvoice build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoice self = new ApplyInvoice();
        return TeaModel.build(map, self);
    }

    public ApplyInvoice setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }
    public String getInvoiceType() {
        return this.invoiceType;
    }

    public ApplyInvoice setInvoiceAmt(String invoiceAmt) {
        this.invoiceAmt = invoiceAmt;
        return this;
    }
    public String getInvoiceAmt() {
        return this.invoiceAmt;
    }

    public ApplyInvoice setApplyInvoiceLines(java.util.List<ApplyInvoiceLine> applyInvoiceLines) {
        this.applyInvoiceLines = applyInvoiceLines;
        return this;
    }
    public java.util.List<ApplyInvoiceLine> getApplyInvoiceLines() {
        return this.applyInvoiceLines;
    }

    public ApplyInvoice setApplyInvoiceSeller(ApplyInvoiceSeller applyInvoiceSeller) {
        this.applyInvoiceSeller = applyInvoiceSeller;
        return this;
    }
    public ApplyInvoiceSeller getApplyInvoiceSeller() {
        return this.applyInvoiceSeller;
    }

    public ApplyInvoice setApplyInvoiceBuyer(ApplyInvoiceBuyer applyInvoiceBuyer) {
        this.applyInvoiceBuyer = applyInvoiceBuyer;
        return this;
    }
    public ApplyInvoiceBuyer getApplyInvoiceBuyer() {
        return this.applyInvoiceBuyer;
    }

    public ApplyInvoice setInvoiceNote(String invoiceNote) {
        this.invoiceNote = invoiceNote;
        return this;
    }
    public String getInvoiceNote() {
        return this.invoiceNote;
    }

    public ApplyInvoice setCcy(String ccy) {
        this.ccy = ccy;
        return this;
    }
    public String getCcy() {
        return this.ccy;
    }

    public ApplyInvoice setApplyInvoiceId(String applyInvoiceId) {
        this.applyInvoiceId = applyInvoiceId;
        return this;
    }
    public String getApplyInvoiceId() {
        return this.applyInvoiceId;
    }

}
