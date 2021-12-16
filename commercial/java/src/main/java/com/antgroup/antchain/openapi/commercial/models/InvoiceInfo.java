// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class InvoiceInfo extends TeaModel {
    // 发票类型
    @NameInMap("invoice_type")
    @Validation(required = true)
    public String invoiceType;

    // 发票编码
    @NameInMap("invoice_code")
    @Validation(required = true)
    public String invoiceCode;

    // 开票日期
    @NameInMap("invoice_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String invoiceDate;

    // 发票信息槽
    @NameInMap("invoice_slots")
    @Validation(required = true)
    public String invoiceSlots;

    // 税价合计
    @NameInMap("total_amt")
    @Validation(required = true)
    public String totalAmt;

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

    public InvoiceInfo setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }
    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public InvoiceInfo setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }
    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public InvoiceInfo setInvoiceSlots(String invoiceSlots) {
        this.invoiceSlots = invoiceSlots;
        return this;
    }
    public String getInvoiceSlots() {
        return this.invoiceSlots;
    }

    public InvoiceInfo setTotalAmt(String totalAmt) {
        this.totalAmt = totalAmt;
        return this;
    }
    public String getTotalAmt() {
        return this.totalAmt;
    }

}
