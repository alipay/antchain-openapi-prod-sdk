// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class InvoiceApplyInfoVO extends TeaModel {
    // 租户ID
    /**
     * <strong>example:</strong>
     * <p>2088720671581149</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 发票申请ID
    /**
     * <strong>example:</strong>
     * <p>2234345667</p>
     */
    @NameInMap("invoice_apply_id")
    public String invoiceApplyId;

    // 申请金额
    /**
     * <strong>example:</strong>
     * <p>34.98</p>
     */
    @NameInMap("invoice_amt")
    @Validation(required = true)
    public String invoiceAmt;

    // 发票申请日期
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("invoice_apply_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String invoiceApplyDate;

    // 发票类型
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("invoice_type")
    @Validation(required = true)
    public String invoiceType;

    // 申请类型
    /**
     * <strong>example:</strong>
     * <p>new</p>
     */
    @NameInMap("apply_type")
    public String applyType;

    // 申请人名称
    /**
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("operator_name")
    public String operatorName;

    // 申请人ID
    /**
     * <strong>example:</strong>
     * <p>2088720671581149</p>
     */
    @NameInMap("operator_id")
    public String operatorId;

    // 申请状态，01：处理中，03：已完成，04：审批中，05：已驳回，06：已撤回，10：申请终止
    /**
     * <strong>example:</strong>
     * <p>03</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 关联的发票列表
    @NameInMap("relate_invoices")
    public java.util.List<InvoiceInfoVO> relateInvoices;

    // 业务号
    /**
     * <strong>example:</strong>
     * <p>323422244555</p>
     */
    @NameInMap("bsn_no")
    @Validation(required = true)
    public String bsnNo;

    public static InvoiceApplyInfoVO build(java.util.Map<String, ?> map) throws Exception {
        InvoiceApplyInfoVO self = new InvoiceApplyInfoVO();
        return TeaModel.build(map, self);
    }

    public InvoiceApplyInfoVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public InvoiceApplyInfoVO setInvoiceApplyId(String invoiceApplyId) {
        this.invoiceApplyId = invoiceApplyId;
        return this;
    }
    public String getInvoiceApplyId() {
        return this.invoiceApplyId;
    }

    public InvoiceApplyInfoVO setInvoiceAmt(String invoiceAmt) {
        this.invoiceAmt = invoiceAmt;
        return this;
    }
    public String getInvoiceAmt() {
        return this.invoiceAmt;
    }

    public InvoiceApplyInfoVO setInvoiceApplyDate(String invoiceApplyDate) {
        this.invoiceApplyDate = invoiceApplyDate;
        return this;
    }
    public String getInvoiceApplyDate() {
        return this.invoiceApplyDate;
    }

    public InvoiceApplyInfoVO setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }
    public String getInvoiceType() {
        return this.invoiceType;
    }

    public InvoiceApplyInfoVO setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public InvoiceApplyInfoVO setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public InvoiceApplyInfoVO setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public InvoiceApplyInfoVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public InvoiceApplyInfoVO setRelateInvoices(java.util.List<InvoiceInfoVO> relateInvoices) {
        this.relateInvoices = relateInvoices;
        return this;
    }
    public java.util.List<InvoiceInfoVO> getRelateInvoices() {
        return this.relateInvoices;
    }

    public InvoiceApplyInfoVO setBsnNo(String bsnNo) {
        this.bsnNo = bsnNo;
        return this;
    }
    public String getBsnNo() {
        return this.bsnNo;
    }

}
