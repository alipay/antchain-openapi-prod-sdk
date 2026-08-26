<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\IntlInvoiceInfoItem;

class IntlInvoiceApplyInfoItem extends Model {
    protected $_name = [
        'tenantId' => 'tenant_id',
        'invoiceApplyId' => 'invoice_apply_id',
        'invoiceAmt' => 'invoice_amt',
        'invoiceCcy' => 'invoice_ccy',
        'invoiceDate' => 'invoice_date',
        'operatorName' => 'operator_name',
        'operatorId' => 'operator_id',
        'status' => 'status',
        'bsnNo' => 'bsn_no',
        'relateInvoices' => 'relate_invoices',
        'invoiceType' => 'invoice_type',
        'applyType' => 'apply_type',
        'elcFileMap' => 'elc_file_map',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('invoiceApplyId', $this->invoiceApplyId, true);
        Model::validateRequired('invoiceAmt', $this->invoiceAmt, true);
        Model::validateRequired('invoiceCcy', $this->invoiceCcy, true);
        Model::validateRequired('invoiceDate', $this->invoiceDate, true);
        Model::validateRequired('operatorName', $this->operatorName, true);
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('bsnNo', $this->bsnNo, true);
        Model::validateRequired('invoiceType', $this->invoiceType, true);
        Model::validateRequired('applyType', $this->applyType, true);
        Model::validateRequired('elcFileMap', $this->elcFileMap, true);
        Model::validatePattern('invoiceDate', $this->invoiceDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->invoiceApplyId) {
            $res['invoice_apply_id'] = $this->invoiceApplyId;
        }
        if (null !== $this->invoiceAmt) {
            $res['invoice_amt'] = $this->invoiceAmt;
        }
        if (null !== $this->invoiceCcy) {
            $res['invoice_ccy'] = $this->invoiceCcy;
        }
        if (null !== $this->invoiceDate) {
            $res['invoice_date'] = $this->invoiceDate;
        }
        if (null !== $this->operatorName) {
            $res['operator_name'] = $this->operatorName;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->bsnNo) {
            $res['bsn_no'] = $this->bsnNo;
        }
        if (null !== $this->relateInvoices) {
            $res['relate_invoices'] = [];
            if(null !== $this->relateInvoices && is_array($this->relateInvoices)){
                $n = 0;
                foreach($this->relateInvoices as $item){
                    $res['relate_invoices'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->invoiceType) {
            $res['invoice_type'] = $this->invoiceType;
        }
        if (null !== $this->applyType) {
            $res['apply_type'] = $this->applyType;
        }
        if (null !== $this->elcFileMap) {
            $res['elc_file_map'] = $this->elcFileMap;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return IntlInvoiceApplyInfoItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['invoice_apply_id'])){
            $model->invoiceApplyId = $map['invoice_apply_id'];
        }
        if(isset($map['invoice_amt'])){
            $model->invoiceAmt = $map['invoice_amt'];
        }
        if(isset($map['invoice_ccy'])){
            $model->invoiceCcy = $map['invoice_ccy'];
        }
        if(isset($map['invoice_date'])){
            $model->invoiceDate = $map['invoice_date'];
        }
        if(isset($map['operator_name'])){
            $model->operatorName = $map['operator_name'];
        }
        if(isset($map['operator_id'])){
            $model->operatorId = $map['operator_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['bsn_no'])){
            $model->bsnNo = $map['bsn_no'];
        }
        if(isset($map['relate_invoices'])){
            if(!empty($map['relate_invoices'])){
                $model->relateInvoices = [];
                $n = 0;
                foreach($map['relate_invoices'] as $item) {
                    $model->relateInvoices[$n++] = null !== $item ? IntlInvoiceInfoItem::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['invoice_type'])){
            $model->invoiceType = $map['invoice_type'];
        }
        if(isset($map['apply_type'])){
            $model->applyType = $map['apply_type'];
        }
        if(isset($map['elc_file_map'])){
            $model->elcFileMap = $map['elc_file_map'];
        }
        return $model;
    }
    // 租户ID
    /**
     * @example 20882838383
     * @var string
     */
    public $tenantId;

    // 发票申请ID
    /**
     * @example 29394
     * @var string
     */
    public $invoiceApplyId;

    // 发票申请金额
    /**
     * @example 13.44
     * @var string
     */
    public $invoiceAmt;

    // 发票币种
    /**
     * @example 840
     * @var string
     */
    public $invoiceCcy;

    // 发票申请时间
    /**
     * @example 2025-04-93 12:03:33
     * @var string
     */
    public $invoiceDate;

    // 申请人名称
    /**
     * @example 客户名称
     * @var string
     */
    public $operatorName;

    // 申请人ID
    /**
     * @example 20882838383
     * @var string
     */
    public $operatorId;

    // 申请状态
    /**
     * @example 03
     * @var string
     */
    public $status;

    // 申请业务号
    /**
     * @example 335455
     * @var string
     */
    public $bsnNo;

    // 发票列表
    /**
     * @example undefined
     * @var IntlInvoiceInfoItem[]
     */
    public $relateInvoices;

    // 发票类型
    /**
     * @example 42
     * @var string
     */
    public $invoiceType;

    // 申请类型
    /**
     * @example new
     * @var string
     */
    public $applyType;

    // 形式发票文件映射
    /**
     * @example xx
     * @var string
     */
    public $elcFileMap;

}
