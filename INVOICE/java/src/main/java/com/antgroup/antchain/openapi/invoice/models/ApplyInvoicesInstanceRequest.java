// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class ApplyInvoicesInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    // 
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // ou
    @NameInMap("ou")
    @Validation(required = true)
    public String ou;

    // 合同号
    // 
    @NameInMap("ar_no")
    @Validation(required = true)
    public String arNo;

    // 开票业务场景
    // 
    @NameInMap("invoice_biz_scene")
    @Validation(required = true)
    public String invoiceBizScene;

    // 业务操作
    // 
    @NameInMap("invoice_biz_action")
    @Validation(required = true)
    public String invoiceBizAction;

    // 系统来源
    // 
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 操作人员工号
    // 
    @NameInMap("operator_no")
    @Validation(required = true)
    public String operatorNo;

    // 操作人员名称
    // 
    @NameInMap("operator_name")
    @Validation(required = true)
    public String operatorName;

    // 外部业务号
    // 
    @NameInMap("invoice_apply_biz_no")
    @Validation(required = true)
    public String invoiceApplyBizNo;

    // 发票介质
    // 
    @NameInMap("invoice_material")
    @Validation(required = true)
    public String invoiceMaterial;

    // 申请原因
    // 
    @NameInMap("apply_reason")
    public String applyReason;

    // 寄送信息
    // 
    @NameInMap("apply_invoice_delivery")
    @Validation(required = true)
    public ApplyInvoiceDelivery applyInvoiceDelivery;

    // 发票需要占用的额度信息
    // 
    @NameInMap("apply_invoice_quota")
    @Validation(required = true)
    public ApplyInvoiceAmountAllocation applyInvoiceQuota;

    // 发票信息列表，一次申请可能会拆分出多张票
    // 
    @NameInMap("apply_invoices")
    @Validation(required = true)
    public java.util.List<ApplyInvoice> applyInvoices;

    // 预览记录号
    @NameInMap("preview_log_no")
    @Validation(required = true)
    public String previewLogNo;

    public static ApplyInvoicesInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoicesInstanceRequest self = new ApplyInvoicesInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInvoicesInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInvoicesInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApplyInvoicesInstanceRequest setOu(String ou) {
        this.ou = ou;
        return this;
    }
    public String getOu() {
        return this.ou;
    }

    public ApplyInvoicesInstanceRequest setArNo(String arNo) {
        this.arNo = arNo;
        return this;
    }
    public String getArNo() {
        return this.arNo;
    }

    public ApplyInvoicesInstanceRequest setInvoiceBizScene(String invoiceBizScene) {
        this.invoiceBizScene = invoiceBizScene;
        return this;
    }
    public String getInvoiceBizScene() {
        return this.invoiceBizScene;
    }

    public ApplyInvoicesInstanceRequest setInvoiceBizAction(String invoiceBizAction) {
        this.invoiceBizAction = invoiceBizAction;
        return this;
    }
    public String getInvoiceBizAction() {
        return this.invoiceBizAction;
    }

    public ApplyInvoicesInstanceRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ApplyInvoicesInstanceRequest setOperatorNo(String operatorNo) {
        this.operatorNo = operatorNo;
        return this;
    }
    public String getOperatorNo() {
        return this.operatorNo;
    }

    public ApplyInvoicesInstanceRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public ApplyInvoicesInstanceRequest setInvoiceApplyBizNo(String invoiceApplyBizNo) {
        this.invoiceApplyBizNo = invoiceApplyBizNo;
        return this;
    }
    public String getInvoiceApplyBizNo() {
        return this.invoiceApplyBizNo;
    }

    public ApplyInvoicesInstanceRequest setInvoiceMaterial(String invoiceMaterial) {
        this.invoiceMaterial = invoiceMaterial;
        return this;
    }
    public String getInvoiceMaterial() {
        return this.invoiceMaterial;
    }

    public ApplyInvoicesInstanceRequest setApplyReason(String applyReason) {
        this.applyReason = applyReason;
        return this;
    }
    public String getApplyReason() {
        return this.applyReason;
    }

    public ApplyInvoicesInstanceRequest setApplyInvoiceDelivery(ApplyInvoiceDelivery applyInvoiceDelivery) {
        this.applyInvoiceDelivery = applyInvoiceDelivery;
        return this;
    }
    public ApplyInvoiceDelivery getApplyInvoiceDelivery() {
        return this.applyInvoiceDelivery;
    }

    public ApplyInvoicesInstanceRequest setApplyInvoiceQuota(ApplyInvoiceAmountAllocation applyInvoiceQuota) {
        this.applyInvoiceQuota = applyInvoiceQuota;
        return this;
    }
    public ApplyInvoiceAmountAllocation getApplyInvoiceQuota() {
        return this.applyInvoiceQuota;
    }

    public ApplyInvoicesInstanceRequest setApplyInvoices(java.util.List<ApplyInvoice> applyInvoices) {
        this.applyInvoices = applyInvoices;
        return this;
    }
    public java.util.List<ApplyInvoice> getApplyInvoices() {
        return this.applyInvoices;
    }

    public ApplyInvoicesInstanceRequest setPreviewLogNo(String previewLogNo) {
        this.previewLogNo = previewLogNo;
        return this;
    }
    public String getPreviewLogNo() {
        return this.previewLogNo;
    }

}
