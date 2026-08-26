<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\ApplyInvoiceBuyer;
use AntChain\DD\Models\ApplyInvoiceDelivery;
use AntChain\DD\Models\ApplyInvoiceAmountAllocation;
use AntChain\DD\Models\PreviewInvoiceLine;

class PreviewInvoiceRequest extends Model {
    protected $_name = [
        'invoiceBizScene' => 'invoice_biz_scene',
        'tenantId' => 'tenant_id',
        'invoiceBizAction' => 'invoice_biz_action',
        'ccy' => 'ccy',
        'ou' => 'ou',
        'arNo' => 'ar_no',
        'source' => 'source',
        'operatorNo' => 'operator_no',
        'operatorName' => 'operator_name',
        'outBizNo' => 'out_biz_no',
        'invoiceType' => 'invoice_type',
        'invoiceMaterial' => 'invoice_material',
        'invoiceNote' => 'invoice_note',
        'applyReason' => 'apply_reason',
        'invoiceBuyer' => 'invoice_buyer',
        'applyInvoiceDelivery' => 'apply_invoice_delivery',
        'applyInvoiceQuota' => 'apply_invoice_quota',
        'previewInvoiceLines' => 'preview_invoice_lines',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('ccy', $this->ccy, true);
        Model::validateRequired('ou', $this->ou, true);
        Model::validateRequired('arNo', $this->arNo, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('operatorNo', $this->operatorNo, true);
        Model::validateRequired('operatorName', $this->operatorName, true);
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('invoiceType', $this->invoiceType, true);
        Model::validateRequired('invoiceMaterial', $this->invoiceMaterial, true);
        Model::validateRequired('invoiceBuyer', $this->invoiceBuyer, true);
        Model::validateRequired('applyInvoiceDelivery', $this->applyInvoiceDelivery, true);
        Model::validateRequired('applyInvoiceQuota', $this->applyInvoiceQuota, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->invoiceBizScene) {
            $res['invoice_biz_scene'] = $this->invoiceBizScene;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->invoiceBizAction) {
            $res['invoice_biz_action'] = $this->invoiceBizAction;
        }
        if (null !== $this->ccy) {
            $res['ccy'] = $this->ccy;
        }
        if (null !== $this->ou) {
            $res['ou'] = $this->ou;
        }
        if (null !== $this->arNo) {
            $res['ar_no'] = $this->arNo;
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
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->invoiceType) {
            $res['invoice_type'] = $this->invoiceType;
        }
        if (null !== $this->invoiceMaterial) {
            $res['invoice_material'] = $this->invoiceMaterial;
        }
        if (null !== $this->invoiceNote) {
            $res['invoice_note'] = $this->invoiceNote;
        }
        if (null !== $this->applyReason) {
            $res['apply_reason'] = $this->applyReason;
        }
        if (null !== $this->invoiceBuyer) {
            $res['invoice_buyer'] = null !== $this->invoiceBuyer ? $this->invoiceBuyer->toMap() : null;
        }
        if (null !== $this->applyInvoiceDelivery) {
            $res['apply_invoice_delivery'] = null !== $this->applyInvoiceDelivery ? $this->applyInvoiceDelivery->toMap() : null;
        }
        if (null !== $this->applyInvoiceQuota) {
            $res['apply_invoice_quota'] = null !== $this->applyInvoiceQuota ? $this->applyInvoiceQuota->toMap() : null;
        }
        if (null !== $this->previewInvoiceLines) {
            $res['preview_invoice_lines'] = [];
            if(null !== $this->previewInvoiceLines && is_array($this->previewInvoiceLines)){
                $n = 0;
                foreach($this->previewInvoiceLines as $item){
                    $res['preview_invoice_lines'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PreviewInvoiceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['invoice_biz_scene'])){
            $model->invoiceBizScene = $map['invoice_biz_scene'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['invoice_biz_action'])){
            $model->invoiceBizAction = $map['invoice_biz_action'];
        }
        if(isset($map['ccy'])){
            $model->ccy = $map['ccy'];
        }
        if(isset($map['ou'])){
            $model->ou = $map['ou'];
        }
        if(isset($map['ar_no'])){
            $model->arNo = $map['ar_no'];
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
        if(isset($map['out_biz_no'])){
            $model->outBizNo = $map['out_biz_no'];
        }
        if(isset($map['invoice_type'])){
            $model->invoiceType = $map['invoice_type'];
        }
        if(isset($map['invoice_material'])){
            $model->invoiceMaterial = $map['invoice_material'];
        }
        if(isset($map['invoice_note'])){
            $model->invoiceNote = $map['invoice_note'];
        }
        if(isset($map['apply_reason'])){
            $model->applyReason = $map['apply_reason'];
        }
        if(isset($map['invoice_buyer'])){
            $model->invoiceBuyer = ApplyInvoiceBuyer::fromMap($map['invoice_buyer']);
        }
        if(isset($map['apply_invoice_delivery'])){
            $model->applyInvoiceDelivery = ApplyInvoiceDelivery::fromMap($map['apply_invoice_delivery']);
        }
        if(isset($map['apply_invoice_quota'])){
            $model->applyInvoiceQuota = ApplyInvoiceAmountAllocation::fromMap($map['apply_invoice_quota']);
        }
        if(isset($map['preview_invoice_lines'])){
            if(!empty($map['preview_invoice_lines'])){
                $model->previewInvoiceLines = [];
                $n = 0;
                foreach($map['preview_invoice_lines'] as $item) {
                    $model->previewInvoiceLines[$n++] = null !== $item ? PreviewInvoiceLine::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 开票场景，默认基于订单开票
    /**
     * @example LTC_RCPT_BILL
     * @var string
     */
    public $invoiceBizScene;

    // 租户ID
    /**
     * @example 2088720671581149
     * @var string
     */
    public $tenantId;

    // 开票操作，默认预览开票PREVIEW_INVOICING
    /**
     * @example PREVIEW_INVOICING
     * @var string
     */
    public $invoiceBizAction;

    // 币种
    /**
     * @example 156
     * @var string
     */
    public $ccy;

    // ou
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

    // 调用来源
    /**
     * @example IOT
     * @var string
     */
    public $source;

    // 开票人ID
    /**
     * @example 2088720671581149
     * @var string
     */
    public $operatorNo;

    // 操作人名称
    /**
     * @example XXXD
     * @var string
     */
    public $operatorName;

    // 外部申请单据号，长度不超过32位
    /**
     * @example 3455444
     * @var string
     */
    public $outBizNo;

    // 发票类型， 01 专票 02 普票
    /**
     * @example 01
     * @var string
     */
    public $invoiceType;

    // 发票介质 01 电子发票 02 纸质发票
    /**
     * @example 01
     * @var string
     */
    public $invoiceMaterial;

    // 票面备注 该内容会原样展示到发票上
    /**
     * @example 备注
     * @var string
     */
    public $invoiceNote;

    // 申请说明
    /**
     * @example 申请说明
     * @var string
     */
    public $applyReason;

    // 购方信息
    /**
     * @example 
     * @var ApplyInvoiceBuyer
     */
    public $invoiceBuyer;

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

    // 发票行列表
    /**
     * @example 
     * @var PreviewInvoiceLine[]
     */
    public $previewInvoiceLines;

}
