// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class IntlInvoiceApplyInfoItem extends TeaModel {
    // 租户ID
    /**
     * <strong>example:</strong>
     * <p>20882838383</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 发票申请ID
    /**
     * <strong>example:</strong>
     * <p>29394</p>
     */
    @NameInMap("invoice_apply_id")
    @Validation(required = true)
    public String invoiceApplyId;

    // 发票申请金额
    /**
     * <strong>example:</strong>
     * <p>13.44</p>
     */
    @NameInMap("invoice_amt")
    @Validation(required = true)
    public String invoiceAmt;

    // 发票币种
    /**
     * <strong>example:</strong>
     * <p>840</p>
     */
    @NameInMap("invoice_ccy")
    @Validation(required = true)
    public String invoiceCcy;

    // 发票申请时间
    /**
     * <strong>example:</strong>
     * <p>2025-04-93 12:03:33</p>
     */
    @NameInMap("invoice_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String invoiceDate;

    // 申请人名称
    /**
     * <strong>example:</strong>
     * <p>客户名称</p>
     */
    @NameInMap("operator_name")
    @Validation(required = true)
    public String operatorName;

    // 申请人ID
    /**
     * <strong>example:</strong>
     * <p>20882838383</p>
     */
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 申请状态
    /**
     * <strong>example:</strong>
     * <p>03</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 申请业务号
    /**
     * <strong>example:</strong>
     * <p>335455</p>
     */
    @NameInMap("bsn_no")
    @Validation(required = true)
    public String bsnNo;

    // 发票列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("relate_invoices")
    public java.util.List<IntlInvoiceInfoItem> relateInvoices;

    public static IntlInvoiceApplyInfoItem build(java.util.Map<String, ?> map) throws Exception {
        IntlInvoiceApplyInfoItem self = new IntlInvoiceApplyInfoItem();
        return TeaModel.build(map, self);
    }

    public IntlInvoiceApplyInfoItem setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public IntlInvoiceApplyInfoItem setInvoiceApplyId(String invoiceApplyId) {
        this.invoiceApplyId = invoiceApplyId;
        return this;
    }
    public String getInvoiceApplyId() {
        return this.invoiceApplyId;
    }

    public IntlInvoiceApplyInfoItem setInvoiceAmt(String invoiceAmt) {
        this.invoiceAmt = invoiceAmt;
        return this;
    }
    public String getInvoiceAmt() {
        return this.invoiceAmt;
    }

    public IntlInvoiceApplyInfoItem setInvoiceCcy(String invoiceCcy) {
        this.invoiceCcy = invoiceCcy;
        return this;
    }
    public String getInvoiceCcy() {
        return this.invoiceCcy;
    }

    public IntlInvoiceApplyInfoItem setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }
    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public IntlInvoiceApplyInfoItem setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public IntlInvoiceApplyInfoItem setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public IntlInvoiceApplyInfoItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public IntlInvoiceApplyInfoItem setBsnNo(String bsnNo) {
        this.bsnNo = bsnNo;
        return this;
    }
    public String getBsnNo() {
        return this.bsnNo;
    }

    public IntlInvoiceApplyInfoItem setRelateInvoices(java.util.List<IntlInvoiceInfoItem> relateInvoices) {
        this.relateInvoices = relateInvoices;
        return this;
    }
    public java.util.List<IntlInvoiceInfoItem> getRelateInvoices() {
        return this.relateInvoices;
    }

}
