// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class PreviewInvoiceRequest extends TeaModel {
    // 开票场景，默认基于订单开票
    /**
     * <strong>example:</strong>
     * <p>LTC_RCPT_BILL</p>
     */
    @NameInMap("invoice_biz_scene")
    public String invoiceBizScene;

    // 租户ID
    /**
     * <strong>example:</strong>
     * <p>2088720671581149</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 开票操作，默认预览开票PREVIEW_INVOICING
    /**
     * <strong>example:</strong>
     * <p>PREVIEW_INVOICING</p>
     */
    @NameInMap("invoice_biz_action")
    public String invoiceBizAction;

    // 币种
    /**
     * <strong>example:</strong>
     * <p>156</p>
     */
    @NameInMap("ccy")
    @Validation(required = true)
    public String ccy;

    // ou
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

    // 调用来源
    /**
     * <strong>example:</strong>
     * <p>IOT</p>
     */
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 开票人ID
    /**
     * <strong>example:</strong>
     * <p>2088720671581149</p>
     */
    @NameInMap("operator_no")
    @Validation(required = true)
    public String operatorNo;

    // 操作人名称
    /**
     * <strong>example:</strong>
     * <p>XXXD</p>
     */
    @NameInMap("operator_name")
    @Validation(required = true)
    public String operatorName;

    // 外部申请单据号，长度不超过32位
    /**
     * <strong>example:</strong>
     * <p>3455444</p>
     */
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 发票类型， 01 专票 02 普票
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("invoice_type")
    @Validation(required = true)
    public String invoiceType;

    // 发票介质 01 电子发票 02 纸质发票
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("invoice_material")
    @Validation(required = true)
    public String invoiceMaterial;

    // 票面备注 该内容会原样展示到发票上
    /**
     * <strong>example:</strong>
     * <p>备注</p>
     */
    @NameInMap("invoice_note")
    public String invoiceNote;

    // 申请说明
    /**
     * <strong>example:</strong>
     * <p>申请说明</p>
     */
    @NameInMap("apply_reason")
    public String applyReason;

    // 购方信息
    @NameInMap("invoice_buyer")
    @Validation(required = true)
    public ApplyInvoiceBuyer invoiceBuyer;

    // 寄送信息
    @NameInMap("apply_invoice_delivery")
    @Validation(required = true)
    public ApplyInvoiceDelivery applyInvoiceDelivery;

    // 发票需要占用的额度信息
    @NameInMap("apply_invoice_quota")
    @Validation(required = true)
    public ApplyInvoiceAmountAllocation applyInvoiceQuota;

    // 发票行列表
    @NameInMap("preview_invoice_lines")
    public java.util.List<PreviewInvoiceLine> previewInvoiceLines;

    public static PreviewInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewInvoiceRequest self = new PreviewInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public PreviewInvoiceRequest setInvoiceBizScene(String invoiceBizScene) {
        this.invoiceBizScene = invoiceBizScene;
        return this;
    }
    public String getInvoiceBizScene() {
        return this.invoiceBizScene;
    }

    public PreviewInvoiceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PreviewInvoiceRequest setInvoiceBizAction(String invoiceBizAction) {
        this.invoiceBizAction = invoiceBizAction;
        return this;
    }
    public String getInvoiceBizAction() {
        return this.invoiceBizAction;
    }

    public PreviewInvoiceRequest setCcy(String ccy) {
        this.ccy = ccy;
        return this;
    }
    public String getCcy() {
        return this.ccy;
    }

    public PreviewInvoiceRequest setOu(String ou) {
        this.ou = ou;
        return this;
    }
    public String getOu() {
        return this.ou;
    }

    public PreviewInvoiceRequest setArNo(String arNo) {
        this.arNo = arNo;
        return this;
    }
    public String getArNo() {
        return this.arNo;
    }

    public PreviewInvoiceRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public PreviewInvoiceRequest setOperatorNo(String operatorNo) {
        this.operatorNo = operatorNo;
        return this;
    }
    public String getOperatorNo() {
        return this.operatorNo;
    }

    public PreviewInvoiceRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public PreviewInvoiceRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public PreviewInvoiceRequest setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }
    public String getInvoiceType() {
        return this.invoiceType;
    }

    public PreviewInvoiceRequest setInvoiceMaterial(String invoiceMaterial) {
        this.invoiceMaterial = invoiceMaterial;
        return this;
    }
    public String getInvoiceMaterial() {
        return this.invoiceMaterial;
    }

    public PreviewInvoiceRequest setInvoiceNote(String invoiceNote) {
        this.invoiceNote = invoiceNote;
        return this;
    }
    public String getInvoiceNote() {
        return this.invoiceNote;
    }

    public PreviewInvoiceRequest setApplyReason(String applyReason) {
        this.applyReason = applyReason;
        return this;
    }
    public String getApplyReason() {
        return this.applyReason;
    }

    public PreviewInvoiceRequest setInvoiceBuyer(ApplyInvoiceBuyer invoiceBuyer) {
        this.invoiceBuyer = invoiceBuyer;
        return this;
    }
    public ApplyInvoiceBuyer getInvoiceBuyer() {
        return this.invoiceBuyer;
    }

    public PreviewInvoiceRequest setApplyInvoiceDelivery(ApplyInvoiceDelivery applyInvoiceDelivery) {
        this.applyInvoiceDelivery = applyInvoiceDelivery;
        return this;
    }
    public ApplyInvoiceDelivery getApplyInvoiceDelivery() {
        return this.applyInvoiceDelivery;
    }

    public PreviewInvoiceRequest setApplyInvoiceQuota(ApplyInvoiceAmountAllocation applyInvoiceQuota) {
        this.applyInvoiceQuota = applyInvoiceQuota;
        return this;
    }
    public ApplyInvoiceAmountAllocation getApplyInvoiceQuota() {
        return this.applyInvoiceQuota;
    }

    public PreviewInvoiceRequest setPreviewInvoiceLines(java.util.List<PreviewInvoiceLine> previewInvoiceLines) {
        this.previewInvoiceLines = previewInvoiceLines;
        return this;
    }
    public java.util.List<PreviewInvoiceLine> getPreviewInvoiceLines() {
        return this.previewInvoiceLines;
    }

}
