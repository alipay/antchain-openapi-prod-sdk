// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class ApplyInvoiceRequest extends TeaModel {
    // 租户ID
    /**
     * <strong>example:</strong>
     * <p>2088720671581149</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // OU
    /**
     * <strong>example:</strong>
     * <p>ZL6</p>
     */
    @NameInMap("ou")
    @Validation(required = true)
    public String ou;

    // 合同号
    /**
     * <strong>example:</strong>
     * <p>2088720671581149-ZNHYFM01222234</p>
     */
    @NameInMap("ar_no")
    @Validation(required = true)
    public String arNo;

    // 开票业务场景
    /**
     * <strong>example:</strong>
     * <p>LTC_RCPT_BILL</p>
     */
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 业务操作
    /**
     * <strong>example:</strong>
     * <p>PREVIEW_INVOICING</p>
     */
    @NameInMap("biz_action")
    @Validation(required = true)
    public String bizAction;

    // 系统来源
    /**
     * <strong>example:</strong>
     * <p>IOT</p>
     */
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 操作人员工号
    /**
     * <strong>example:</strong>
     * <p>2334</p>
     */
    @NameInMap("operator_no")
    @Validation(required = true)
    public String operatorNo;

    // 操作人员名称
    /**
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("operator_name")
    @Validation(required = true)
    public String operatorName;

    // 外部业务号
    /**
     * <strong>example:</strong>
     * <p>34445</p>
     */
    @NameInMap("invoice_apply_biz_no")
    @Validation(required = true)
    public String invoiceApplyBizNo;

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
     * <p>原因</p>
     */
    @NameInMap("apply_reason")
    public String applyReason;

    // 寄送信息
    @NameInMap("apply_invoice_delivery")
    @Validation(required = true)
    public ApplyInvoiceDelivery applyInvoiceDelivery;

    // 发票需要占用的额度信息
    @NameInMap("apply_invoice_quota")
    @Validation(required = true)
    public ApplyInvoiceAmountAllocation applyInvoiceQuota;

    // 发票信息列表，一次申请可能会拆分出多张票
    @NameInMap("apply_invoices")
    @Validation(required = true)
    public java.util.List<ApplyInvoiceLine> applyInvoices;

    // 预览记录号
    /**
     * <strong>example:</strong>
     * <p>20234566767</p>
     */
    @NameInMap("preview_log_no")
    @Validation(required = true)
    public String previewLogNo;

    public static ApplyInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoiceRequest self = new ApplyInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInvoiceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApplyInvoiceRequest setOu(String ou) {
        this.ou = ou;
        return this;
    }
    public String getOu() {
        return this.ou;
    }

    public ApplyInvoiceRequest setArNo(String arNo) {
        this.arNo = arNo;
        return this;
    }
    public String getArNo() {
        return this.arNo;
    }

    public ApplyInvoiceRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public ApplyInvoiceRequest setBizAction(String bizAction) {
        this.bizAction = bizAction;
        return this;
    }
    public String getBizAction() {
        return this.bizAction;
    }

    public ApplyInvoiceRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ApplyInvoiceRequest setOperatorNo(String operatorNo) {
        this.operatorNo = operatorNo;
        return this;
    }
    public String getOperatorNo() {
        return this.operatorNo;
    }

    public ApplyInvoiceRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public ApplyInvoiceRequest setInvoiceApplyBizNo(String invoiceApplyBizNo) {
        this.invoiceApplyBizNo = invoiceApplyBizNo;
        return this;
    }
    public String getInvoiceApplyBizNo() {
        return this.invoiceApplyBizNo;
    }

    public ApplyInvoiceRequest setInvoiceMaterial(String invoiceMaterial) {
        this.invoiceMaterial = invoiceMaterial;
        return this;
    }
    public String getInvoiceMaterial() {
        return this.invoiceMaterial;
    }

    public ApplyInvoiceRequest setApplyReason(String applyReason) {
        this.applyReason = applyReason;
        return this;
    }
    public String getApplyReason() {
        return this.applyReason;
    }

    public ApplyInvoiceRequest setApplyInvoiceDelivery(ApplyInvoiceDelivery applyInvoiceDelivery) {
        this.applyInvoiceDelivery = applyInvoiceDelivery;
        return this;
    }
    public ApplyInvoiceDelivery getApplyInvoiceDelivery() {
        return this.applyInvoiceDelivery;
    }

    public ApplyInvoiceRequest setApplyInvoiceQuota(ApplyInvoiceAmountAllocation applyInvoiceQuota) {
        this.applyInvoiceQuota = applyInvoiceQuota;
        return this;
    }
    public ApplyInvoiceAmountAllocation getApplyInvoiceQuota() {
        return this.applyInvoiceQuota;
    }

    public ApplyInvoiceRequest setApplyInvoices(java.util.List<ApplyInvoiceLine> applyInvoices) {
        this.applyInvoices = applyInvoices;
        return this;
    }
    public java.util.List<ApplyInvoiceLine> getApplyInvoices() {
        return this.applyInvoices;
    }

    public ApplyInvoiceRequest setPreviewLogNo(String previewLogNo) {
        this.previewLogNo = previewLogNo;
        return this;
    }
    public String getPreviewLogNo() {
        return this.previewLogNo;
    }

}
