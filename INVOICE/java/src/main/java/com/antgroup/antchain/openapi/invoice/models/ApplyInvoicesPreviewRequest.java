// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class ApplyInvoicesPreviewRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 开票场景，默认基于订单开票
    // 
    @NameInMap("invoice_biz_scene")
    @Validation(required = true)
    public String invoiceBizScene;

    // 租户ID
    // 
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 开票操作，默认预览开票PREVIEW_INVOICING
    @NameInMap("invoice_biz_action")
    @Validation(required = true)
    public String invoiceBizAction;

    // 币种
    @NameInMap("ccy")
    @Validation(required = true)
    public String ccy;

    // ou
    @NameInMap("ou")
    @Validation(required = true)
    public String ou;

    // 合同号
    @NameInMap("ar_no")
    @Validation(required = true)
    public String arNo;

    // 调用来源
    // 
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 开票人ID
    // 
    @NameInMap("operator_no")
    @Validation(required = true)
    public String operatorNo;

    // 操作人名称
    // 
    @NameInMap("operator_name")
    @Validation(required = true)
    public String operatorName;

    // 外部申请单据号，长度不超过32位
    // 
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 发票类型， 01 专票 02 普票
    @NameInMap("invoice_type")
    @Validation(required = true)
    public String invoiceType;

    // 发票介质 01 电子发票 02 纸质发票
    // 
    @NameInMap("invoice_material")
    @Validation(required = true)
    public String invoiceMaterial;

    // 票面备注 该内容会原样展示到发票上
    // 
    @NameInMap("invoice_note")
    public String invoiceNote;

    // 申请说明	
    @NameInMap("apply_reason")
    public String applyReason;

    // 购方信息
    // 
    @NameInMap("invoice_buyer")
    @Validation(required = true)
    public ApplyInvoiceBuyer invoiceBuyer;

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

    // 发票行列表
    @NameInMap("preview_invoice_lines")
    public java.util.List<PreviewInvoiceLine> previewInvoiceLines;

    public static ApplyInvoicesPreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoicesPreviewRequest self = new ApplyInvoicesPreviewRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInvoicesPreviewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInvoicesPreviewRequest setInvoiceBizScene(String invoiceBizScene) {
        this.invoiceBizScene = invoiceBizScene;
        return this;
    }
    public String getInvoiceBizScene() {
        return this.invoiceBizScene;
    }

    public ApplyInvoicesPreviewRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApplyInvoicesPreviewRequest setInvoiceBizAction(String invoiceBizAction) {
        this.invoiceBizAction = invoiceBizAction;
        return this;
    }
    public String getInvoiceBizAction() {
        return this.invoiceBizAction;
    }

    public ApplyInvoicesPreviewRequest setCcy(String ccy) {
        this.ccy = ccy;
        return this;
    }
    public String getCcy() {
        return this.ccy;
    }

    public ApplyInvoicesPreviewRequest setOu(String ou) {
        this.ou = ou;
        return this;
    }
    public String getOu() {
        return this.ou;
    }

    public ApplyInvoicesPreviewRequest setArNo(String arNo) {
        this.arNo = arNo;
        return this;
    }
    public String getArNo() {
        return this.arNo;
    }

    public ApplyInvoicesPreviewRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ApplyInvoicesPreviewRequest setOperatorNo(String operatorNo) {
        this.operatorNo = operatorNo;
        return this;
    }
    public String getOperatorNo() {
        return this.operatorNo;
    }

    public ApplyInvoicesPreviewRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public ApplyInvoicesPreviewRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public ApplyInvoicesPreviewRequest setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }
    public String getInvoiceType() {
        return this.invoiceType;
    }

    public ApplyInvoicesPreviewRequest setInvoiceMaterial(String invoiceMaterial) {
        this.invoiceMaterial = invoiceMaterial;
        return this;
    }
    public String getInvoiceMaterial() {
        return this.invoiceMaterial;
    }

    public ApplyInvoicesPreviewRequest setInvoiceNote(String invoiceNote) {
        this.invoiceNote = invoiceNote;
        return this;
    }
    public String getInvoiceNote() {
        return this.invoiceNote;
    }

    public ApplyInvoicesPreviewRequest setApplyReason(String applyReason) {
        this.applyReason = applyReason;
        return this;
    }
    public String getApplyReason() {
        return this.applyReason;
    }

    public ApplyInvoicesPreviewRequest setInvoiceBuyer(ApplyInvoiceBuyer invoiceBuyer) {
        this.invoiceBuyer = invoiceBuyer;
        return this;
    }
    public ApplyInvoiceBuyer getInvoiceBuyer() {
        return this.invoiceBuyer;
    }

    public ApplyInvoicesPreviewRequest setApplyInvoiceDelivery(ApplyInvoiceDelivery applyInvoiceDelivery) {
        this.applyInvoiceDelivery = applyInvoiceDelivery;
        return this;
    }
    public ApplyInvoiceDelivery getApplyInvoiceDelivery() {
        return this.applyInvoiceDelivery;
    }

    public ApplyInvoicesPreviewRequest setApplyInvoiceQuota(ApplyInvoiceAmountAllocation applyInvoiceQuota) {
        this.applyInvoiceQuota = applyInvoiceQuota;
        return this;
    }
    public ApplyInvoiceAmountAllocation getApplyInvoiceQuota() {
        return this.applyInvoiceQuota;
    }

    public ApplyInvoicesPreviewRequest setPreviewInvoiceLines(java.util.List<PreviewInvoiceLine> previewInvoiceLines) {
        this.previewInvoiceLines = previewInvoiceLines;
        return this;
    }
    public java.util.List<PreviewInvoiceLine> getPreviewInvoiceLines() {
        return this.previewInvoiceLines;
    }

}
