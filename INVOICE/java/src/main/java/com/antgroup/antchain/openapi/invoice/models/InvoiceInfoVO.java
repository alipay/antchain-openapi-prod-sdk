// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class InvoiceInfoVO extends TeaModel {
    // 发票ID
    /**
     * <strong>example:</strong>
     * <p>233445656676</p>
     */
    @NameInMap("invoice_id")
    @Validation(required = true)
    public String invoiceId;

    // 发票编号
    /**
     * <strong>example:</strong>
     * <p>FULL_ELECTRONIC_INVOICE</p>
     */
    @NameInMap("invoice_code")
    public String invoiceCode;

    // 发票号码
    /**
     * <strong>example:</strong>
     * <p>3455666767777</p>
     */
    @NameInMap("invoice_no")
    public String invoiceNo;

    // 发票金额
    /**
     * <strong>example:</strong>
     * <p>220.09</p>
     */
    @NameInMap("invoice_amt")
    @Validation(required = true)
    public String invoiceAmt;

    // 发票类型,01专票 02普票 03营业税发票 04国际形式发票 05其它发票
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("invoice_type")
    @Validation(required = true)
    public String invoiceType;

    // 发票的业务状态, 待开票: TO_INV, 开票中: INV_ING, 已开票: INVED, 退票中: INV_RETURN, 换票中: INV_REPLACE, 已失效: INV_DEP
    /**
     * <strong>example:</strong>
     * <p>INVED</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 发票介质，01：电子，02：纸质
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("invoice_material")
    public String invoiceMaterial;

    // 发票行信息
    @NameInMap("invoice_lines")
    public java.util.List<InvoiceLineVO> invoiceLines;

    // 开票日期
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("invoice_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String invoiceDate;

    public static InvoiceInfoVO build(java.util.Map<String, ?> map) throws Exception {
        InvoiceInfoVO self = new InvoiceInfoVO();
        return TeaModel.build(map, self);
    }

    public InvoiceInfoVO setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }
    public String getInvoiceId() {
        return this.invoiceId;
    }

    public InvoiceInfoVO setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }
    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public InvoiceInfoVO setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
        return this;
    }
    public String getInvoiceNo() {
        return this.invoiceNo;
    }

    public InvoiceInfoVO setInvoiceAmt(String invoiceAmt) {
        this.invoiceAmt = invoiceAmt;
        return this;
    }
    public String getInvoiceAmt() {
        return this.invoiceAmt;
    }

    public InvoiceInfoVO setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }
    public String getInvoiceType() {
        return this.invoiceType;
    }

    public InvoiceInfoVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public InvoiceInfoVO setInvoiceMaterial(String invoiceMaterial) {
        this.invoiceMaterial = invoiceMaterial;
        return this;
    }
    public String getInvoiceMaterial() {
        return this.invoiceMaterial;
    }

    public InvoiceInfoVO setInvoiceLines(java.util.List<InvoiceLineVO> invoiceLines) {
        this.invoiceLines = invoiceLines;
        return this;
    }
    public java.util.List<InvoiceLineVO> getInvoiceLines() {
        return this.invoiceLines;
    }

    public InvoiceInfoVO setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }
    public String getInvoiceDate() {
        return this.invoiceDate;
    }

}
