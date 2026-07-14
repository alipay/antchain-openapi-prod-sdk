// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class InvoicePreviewVO extends TeaModel {
    // 发票号码
    /**
     * <strong>example:</strong>
     * <p>3344</p>
     */
    @NameInMap("invoice_no")
    public String invoiceNo;

    // 发票代码
    /**
     * <strong>example:</strong>
     * <p>323422244555</p>
     */
    @NameInMap("invoice_code")
    public String invoiceCode;

    // 开票时间
    /**
     * <strong>example:</strong>
     * <p>2023-09-08</p>
     */
    @NameInMap("invoice_date")
    public String invoiceDate;

    // 发票类型
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("invoice_type")
    @Validation(required = true)
    public String invoiceType;

    // 开票金额
    /**
     * <strong>example:</strong>
     * <p>34.98</p>
     */
    @NameInMap("invoice_amt")
    @Validation(required = true)
    public String invoiceAmt;

    // 税额
    /**
     * <strong>example:</strong>
     * <p>34</p>
     */
    @NameInMap("tax_amt")
    @Validation(required = true)
    public String taxAmt;

    // 销方信息
    @NameInMap("invoice_seller")
    @Validation(required = true)
    public ApplyInvoiceSeller invoiceSeller;

    // 购方信息
    @NameInMap("invoice_buyer")
    @Validation(required = true)
    public ApplyInvoiceBuyer invoiceBuyer;

    // 发票票面备注
    /**
     * <strong>example:</strong>
     * <p>备注</p>
     */
    @NameInMap("invoice_note")
    public String invoiceNote;

    // 租户id
    /**
     * <strong>example:</strong>
     * <p>2088720671581149</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 发票ID
    /**
     * <strong>example:</strong>
     * <p>355566677676</p>
     */
    @NameInMap("invoice_id")
    public String invoiceId;

    // 发票介质
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("invoice_material")
    @Validation(required = true)
    public String invoiceMaterial;

    // 申请原因
    /**
     * <strong>example:</strong>
     * <p>申请原因</p>
     */
    @NameInMap("memo")
    public String memo;

    // 发票行信息
    @NameInMap("invoice_lines")
    @Validation(required = true)
    public java.util.List<InvoiceLineVO> invoiceLines;

    // 发票预览记录号
    /**
     * <strong>example:</strong>
     * <p>3344</p>
     */
    @NameInMap("invoice_preview_log_no")
    @Validation(required = true)
    public String invoicePreviewLogNo;

    public static InvoicePreviewVO build(java.util.Map<String, ?> map) throws Exception {
        InvoicePreviewVO self = new InvoicePreviewVO();
        return TeaModel.build(map, self);
    }

    public InvoicePreviewVO setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
        return this;
    }
    public String getInvoiceNo() {
        return this.invoiceNo;
    }

    public InvoicePreviewVO setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }
    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public InvoicePreviewVO setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }
    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public InvoicePreviewVO setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }
    public String getInvoiceType() {
        return this.invoiceType;
    }

    public InvoicePreviewVO setInvoiceAmt(String invoiceAmt) {
        this.invoiceAmt = invoiceAmt;
        return this;
    }
    public String getInvoiceAmt() {
        return this.invoiceAmt;
    }

    public InvoicePreviewVO setTaxAmt(String taxAmt) {
        this.taxAmt = taxAmt;
        return this;
    }
    public String getTaxAmt() {
        return this.taxAmt;
    }

    public InvoicePreviewVO setInvoiceSeller(ApplyInvoiceSeller invoiceSeller) {
        this.invoiceSeller = invoiceSeller;
        return this;
    }
    public ApplyInvoiceSeller getInvoiceSeller() {
        return this.invoiceSeller;
    }

    public InvoicePreviewVO setInvoiceBuyer(ApplyInvoiceBuyer invoiceBuyer) {
        this.invoiceBuyer = invoiceBuyer;
        return this;
    }
    public ApplyInvoiceBuyer getInvoiceBuyer() {
        return this.invoiceBuyer;
    }

    public InvoicePreviewVO setInvoiceNote(String invoiceNote) {
        this.invoiceNote = invoiceNote;
        return this;
    }
    public String getInvoiceNote() {
        return this.invoiceNote;
    }

    public InvoicePreviewVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public InvoicePreviewVO setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }
    public String getInvoiceId() {
        return this.invoiceId;
    }

    public InvoicePreviewVO setInvoiceMaterial(String invoiceMaterial) {
        this.invoiceMaterial = invoiceMaterial;
        return this;
    }
    public String getInvoiceMaterial() {
        return this.invoiceMaterial;
    }

    public InvoicePreviewVO setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public InvoicePreviewVO setInvoiceLines(java.util.List<InvoiceLineVO> invoiceLines) {
        this.invoiceLines = invoiceLines;
        return this;
    }
    public java.util.List<InvoiceLineVO> getInvoiceLines() {
        return this.invoiceLines;
    }

    public InvoicePreviewVO setInvoicePreviewLogNo(String invoicePreviewLogNo) {
        this.invoicePreviewLogNo = invoicePreviewLogNo;
        return this;
    }
    public String getInvoicePreviewLogNo() {
        return this.invoicePreviewLogNo;
    }

}
