// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class IntlInvoiceInfoItem extends TeaModel {
    // 发票号
    /**
     * <strong>example:</strong>
     * <p>34555</p>
     */
    @NameInMap("invoice_no")
    @Validation(required = true)
    public String invoiceNo;

    // 发票金额
    /**
     * <strong>example:</strong>
     * <p>34.23</p>
     */
    @NameInMap("invoice_amt")
    @Validation(required = true)
    public String invoiceAmt;

    // 不含税金
    /**
     * <strong>example:</strong>
     * <p>23.12</p>
     */
    @NameInMap("excluding_tax_invoice_amt")
    @Validation(required = true)
    public String excludingTaxInvoiceAmt;

    // 税额
    /**
     * <strong>example:</strong>
     * <p>2.23</p>
     */
    @NameInMap("tax_amt")
    @Validation(required = true)
    public String taxAmt;

    // 税率
    /**
     * <strong>example:</strong>
     * <p>0.09</p>
     */
    @NameInMap("tax")
    @Validation(required = true)
    public String tax;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>INVED</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static IntlInvoiceInfoItem build(java.util.Map<String, ?> map) throws Exception {
        IntlInvoiceInfoItem self = new IntlInvoiceInfoItem();
        return TeaModel.build(map, self);
    }

    public IntlInvoiceInfoItem setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
        return this;
    }
    public String getInvoiceNo() {
        return this.invoiceNo;
    }

    public IntlInvoiceInfoItem setInvoiceAmt(String invoiceAmt) {
        this.invoiceAmt = invoiceAmt;
        return this;
    }
    public String getInvoiceAmt() {
        return this.invoiceAmt;
    }

    public IntlInvoiceInfoItem setExcludingTaxInvoiceAmt(String excludingTaxInvoiceAmt) {
        this.excludingTaxInvoiceAmt = excludingTaxInvoiceAmt;
        return this;
    }
    public String getExcludingTaxInvoiceAmt() {
        return this.excludingTaxInvoiceAmt;
    }

    public IntlInvoiceInfoItem setTaxAmt(String taxAmt) {
        this.taxAmt = taxAmt;
        return this;
    }
    public String getTaxAmt() {
        return this.taxAmt;
    }

    public IntlInvoiceInfoItem setTax(String tax) {
        this.tax = tax;
        return this;
    }
    public String getTax() {
        return this.tax;
    }

    public IntlInvoiceInfoItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
