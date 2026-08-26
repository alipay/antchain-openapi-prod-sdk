<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\InvoiceInfoVO;

class InvoiceApplyInfoVO extends Model {
    protected $_name = [
        'tenantId' => 'tenant_id',
        'invoiceApplyId' => 'invoice_apply_id',
        'invoiceAmt' => 'invoice_amt',
        'invoiceApplyDate' => 'invoice_apply_date',
        'invoiceType' => 'invoice_type',
        'applyType' => 'apply_type',
        'operatorName' => 'operator_name',
        'operatorId' => 'operator_id',
        'status' => 'status',
        'relateInvoices' => 'relate_invoices',
        'bsnNo' => 'bsn_no',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('invoiceAmt', $this->invoiceAmt, true);
        Model::validateRequired('invoiceApplyDate', $this->invoiceApplyDate, true);
        Model::validateRequired('invoiceType', $this->invoiceType, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('bsnNo', $this->bsnNo, true);
        Model::validatePattern('invoiceApplyDate', $this->invoiceApplyDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->invoiceApplyDate) {
            $res['invoice_apply_date'] = $this->invoiceApplyDate;
        }
        if (null !== $this->invoiceType) {
            $res['invoice_type'] = $this->invoiceType;
        }
        if (null !== $this->applyType) {
            $res['apply_type'] = $this->applyType;
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
        if (null !== $this->relateInvoices) {
            $res['relate_invoices'] = [];
            if(null !== $this->relateInvoices && is_array($this->relateInvoices)){
                $n = 0;
                foreach($this->relateInvoices as $item){
                    $res['relate_invoices'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->bsnNo) {
            $res['bsn_no'] = $this->bsnNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return InvoiceApplyInfoVO
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
        if(isset($map['invoice_apply_date'])){
            $model->invoiceApplyDate = $map['invoice_apply_date'];
        }
        if(isset($map['invoice_type'])){
            $model->invoiceType = $map['invoice_type'];
        }
        if(isset($map['apply_type'])){
            $model->applyType = $map['apply_type'];
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
        if(isset($map['relate_invoices'])){
            if(!empty($map['relate_invoices'])){
                $model->relateInvoices = [];
                $n = 0;
                foreach($map['relate_invoices'] as $item) {
                    $model->relateInvoices[$n++] = null !== $item ? InvoiceInfoVO::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['bsn_no'])){
            $model->bsnNo = $map['bsn_no'];
        }
        return $model;
    }
    // 租户ID
    /**
     * @example 2088720671581149
     * @var string
     */
    public $tenantId;

    // 发票申请ID
    /**
     * @example 2234345667
     * @var string
     */
    public $invoiceApplyId;

    // 申请金额
    /**
     * @example 34.98
     * @var string
     */
    public $invoiceAmt;

    // 发票申请日期
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $invoiceApplyDate;

    // 发票类型
    /**
     * @example 01
     * @var string
     */
    public $invoiceType;

    // 申请类型
    /**
     * @example new
     * @var string
     */
    public $applyType;

    // 申请人名称
    /**
     * @example 测试
     * @var string
     */
    public $operatorName;

    // 申请人ID
    /**
     * @example 2088720671581149
     * @var string
     */
    public $operatorId;

    // 申请状态，01：处理中，03：已完成，04：审批中，05：已驳回，06：已撤回，10：申请终止
    /**
     * @example 03
     * @var string
     */
    public $status;

    // 关联的发票列表
    /**
     * @example 
     * @var InvoiceInfoVO[]
     */
    public $relateInvoices;

    // 业务号
    /**
     * @example 323422244555
     * @var string
     */
    public $bsnNo;

}
