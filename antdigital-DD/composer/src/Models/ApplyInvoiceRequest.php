<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\ApplyInvoiceDelivery;
use AntChain\DD\Models\ApplyInvoiceAmountAllocation;
use AntChain\DD\Models\ApplyInvoiceLine;

class ApplyInvoiceRequest extends Model {
    protected $_name = [
        'tenantId' => 'tenant_id',
        'ou' => 'ou',
        'arNo' => 'ar_no',
        'bizScene' => 'biz_scene',
        'bizAction' => 'biz_action',
        'source' => 'source',
        'operatorNo' => 'operator_no',
        'operatorName' => 'operator_name',
        'invoiceApplyBizNo' => 'invoice_apply_biz_no',
        'invoiceMaterial' => 'invoice_material',
        'applyReason' => 'apply_reason',
        'applyInvoiceDelivery' => 'apply_invoice_delivery',
        'applyInvoiceQuota' => 'apply_invoice_quota',
        'applyInvoices' => 'apply_invoices',
        'previewLogNo' => 'preview_log_no',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('ou', $this->ou, true);
        Model::validateRequired('arNo', $this->arNo, true);
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('bizAction', $this->bizAction, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('operatorNo', $this->operatorNo, true);
        Model::validateRequired('operatorName', $this->operatorName, true);
        Model::validateRequired('invoiceApplyBizNo', $this->invoiceApplyBizNo, true);
        Model::validateRequired('invoiceMaterial', $this->invoiceMaterial, true);
        Model::validateRequired('applyInvoiceDelivery', $this->applyInvoiceDelivery, true);
        Model::validateRequired('applyInvoiceQuota', $this->applyInvoiceQuota, true);
        Model::validateRequired('applyInvoices', $this->applyInvoices, true);
        Model::validateRequired('previewLogNo', $this->previewLogNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->ou) {
            $res['ou'] = $this->ou;
        }
        if (null !== $this->arNo) {
            $res['ar_no'] = $this->arNo;
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->bizAction) {
            $res['biz_action'] = $this->bizAction;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->operatorNo) {
            $res['operator_no'] = $this->operatorNo;
        }
        if (null !== $this->operatorName) {
            $res['operator_name'] = $this->operatorName;
        }
        if (null !== $this->invoiceApplyBizNo) {
            $res['invoice_apply_biz_no'] = $this->invoiceApplyBizNo;
        }
        if (null !== $this->invoiceMaterial) {
            $res['invoice_material'] = $this->invoiceMaterial;
        }
        if (null !== $this->applyReason) {
            $res['apply_reason'] = $this->applyReason;
        }
        if (null !== $this->applyInvoiceDelivery) {
            $res['apply_invoice_delivery'] = null !== $this->applyInvoiceDelivery ? $this->applyInvoiceDelivery->toMap() : null;
        }
        if (null !== $this->applyInvoiceQuota) {
            $res['apply_invoice_quota'] = null !== $this->applyInvoiceQuota ? $this->applyInvoiceQuota->toMap() : null;
        }
        if (null !== $this->applyInvoices) {
            $res['apply_invoices'] = [];
            if(null !== $this->applyInvoices && is_array($this->applyInvoices)){
                $n = 0;
                foreach($this->applyInvoices as $item){
                    $res['apply_invoices'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->previewLogNo) {
            $res['preview_log_no'] = $this->previewLogNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyInvoiceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['ou'])){
            $model->ou = $map['ou'];
        }
        if(isset($map['ar_no'])){
            $model->arNo = $map['ar_no'];
        }
        if(isset($map['biz_scene'])){
            $model->bizScene = $map['biz_scene'];
        }
        if(isset($map['biz_action'])){
            $model->bizAction = $map['biz_action'];
        }
        if(isset($map['source'])){
            $model->source = $map['source'];
        }
        if(isset($map['operator_no'])){
            $model->operatorNo = $map['operator_no'];
        }
        if(isset($map['operator_name'])){
            $model->operatorName = $map['operator_name'];
        }
        if(isset($map['invoice_apply_biz_no'])){
            $model->invoiceApplyBizNo = $map['invoice_apply_biz_no'];
        }
        if(isset($map['invoice_material'])){
            $model->invoiceMaterial = $map['invoice_material'];
        }
        if(isset($map['apply_reason'])){
            $model->applyReason = $map['apply_reason'];
        }
        if(isset($map['apply_invoice_delivery'])){
            $model->applyInvoiceDelivery = ApplyInvoiceDelivery::fromMap($map['apply_invoice_delivery']);
        }
        if(isset($map['apply_invoice_quota'])){
            $model->applyInvoiceQuota = ApplyInvoiceAmountAllocation::fromMap($map['apply_invoice_quota']);
        }
        if(isset($map['apply_invoices'])){
            if(!empty($map['apply_invoices'])){
                $model->applyInvoices = [];
                $n = 0;
                foreach($map['apply_invoices'] as $item) {
                    $model->applyInvoices[$n++] = null !== $item ? ApplyInvoiceLine::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['preview_log_no'])){
            $model->previewLogNo = $map['preview_log_no'];
        }
        return $model;
    }
    // 租户ID
    /**
     * @example 2088720671581149
     * @var string
     */
    public $tenantId;

    // OU
    /**
     * @example ZL6
     * @var string
     */
    public $ou;

    // 合同号
    /**
     * @example 2088720671581149-ZNHYFM01222234
     * @var string
     */
    public $arNo;

    // 开票业务场景
    /**
     * @example LTC_RCPT_BILL
     * @var string
     */
    public $bizScene;

    // 业务操作
    /**
     * @example PREVIEW_INVOICING
     * @var string
     */
    public $bizAction;

    // 系统来源
    /**
     * @example IOT
     * @var string
     */
    public $source;

    // 操作人员工号
    /**
     * @example 2334
     * @var string
     */
    public $operatorNo;

    // 操作人员名称
    /**
     * @example 测试
     * @var string
     */
    public $operatorName;

    // 外部业务号
    /**
     * @example 34445
     * @var string
     */
    public $invoiceApplyBizNo;

    // 发票介质
    /**
     * @example 01
     * @var string
     */
    public $invoiceMaterial;

    // 申请原因
    /**
     * @example 原因
     * @var string
     */
    public $applyReason;

    // 寄送信息
    /**
     * @example 
     * @var ApplyInvoiceDelivery
     */
    public $applyInvoiceDelivery;

    // 发票需要占用的额度信息
    /**
     * @example 
     * @var ApplyInvoiceAmountAllocation
     */
    public $applyInvoiceQuota;

    // 发票信息列表，一次申请可能会拆分出多张票
    /**
     * @example 
     * @var ApplyInvoiceLine[]
     */
    public $applyInvoices;

    // 预览记录号
    /**
     * @example 20234566767
     * @var string
     */
    public $previewLogNo;

}
