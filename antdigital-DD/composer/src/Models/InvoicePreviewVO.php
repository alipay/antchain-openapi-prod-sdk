<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\ApplyInvoiceSeller;
use AntChain\DD\Models\ApplyInvoiceBuyer;
use AntChain\DD\Models\InvoiceLineVO;

class InvoicePreviewVO extends Model {
    protected $_name = [
        'invoiceNo' => 'invoice_no',
        'invoiceCode' => 'invoice_code',
        'invoiceDate' => 'invoice_date',
        'invoiceType' => 'invoice_type',
        'invoiceAmt' => 'invoice_amt',
        'taxAmt' => 'tax_amt',
        'invoiceSeller' => 'invoice_seller',
        'invoiceBuyer' => 'invoice_buyer',
        'invoiceNote' => 'invoice_note',
        'tenantId' => 'tenant_id',
        'invoiceId' => 'invoice_id',
        'invoiceMaterial' => 'invoice_material',
        'memo' => 'memo',
        'invoiceLines' => 'invoice_lines',
        'invoicePreviewLogNo' => 'invoice_preview_log_no',
    ];
    public function validate() {
        Model::validateRequired('invoiceType', $this->invoiceType, true);
        Model::validateRequired('invoiceAmt', $this->invoiceAmt, true);
        Model::validateRequired('taxAmt', $this->taxAmt, true);
        Model::validateRequired('invoiceSeller', $this->invoiceSeller, true);
        Model::validateRequired('invoiceBuyer', $this->invoiceBuyer, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('invoiceMaterial', $this->invoiceMaterial, true);
        Model::validateRequired('invoiceLines', $this->invoiceLines, true);
        Model::validateRequired('invoicePreviewLogNo', $this->invoicePreviewLogNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->invoiceNo) {
            $res['invoice_no'] = $this->invoiceNo;
        }
        if (null !== $this->invoiceCode) {
            $res['invoice_code'] = $this->invoiceCode;
        }
        if (null !== $this->invoiceDate) {
            $res['invoice_date'] = $this->invoiceDate;
        }
        if (null !== $this->invoiceType) {
            $res['invoice_type'] = $this->invoiceType;
        }
        if (null !== $this->invoiceAmt) {
            $res['invoice_amt'] = $this->invoiceAmt;
        }
        if (null !== $this->taxAmt) {
            $res['tax_amt'] = $this->taxAmt;
        }
        if (null !== $this->invoiceSeller) {
            $res['invoice_seller'] = null !== $this->invoiceSeller ? $this->invoiceSeller->toMap() : null;
        }
        if (null !== $this->invoiceBuyer) {
            $res['invoice_buyer'] = null !== $this->invoiceBuyer ? $this->invoiceBuyer->toMap() : null;
        }
        if (null !== $this->invoiceNote) {
            $res['invoice_note'] = $this->invoiceNote;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->invoiceId) {
            $res['invoice_id'] = $this->invoiceId;
        }
        if (null !== $this->invoiceMaterial) {
            $res['invoice_material'] = $this->invoiceMaterial;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->invoiceLines) {
            $res['invoice_lines'] = [];
            if(null !== $this->invoiceLines && is_array($this->invoiceLines)){
                $n = 0;
                foreach($this->invoiceLines as $item){
                    $res['invoice_lines'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->invoicePreviewLogNo) {
            $res['invoice_preview_log_no'] = $this->invoicePreviewLogNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return InvoicePreviewVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['invoice_no'])){
            $model->invoiceNo = $map['invoice_no'];
        }
        if(isset($map['invoice_code'])){
            $model->invoiceCode = $map['invoice_code'];
        }
        if(isset($map['invoice_date'])){
            $model->invoiceDate = $map['invoice_date'];
        }
        if(isset($map['invoice_type'])){
            $model->invoiceType = $map['invoice_type'];
        }
        if(isset($map['invoice_amt'])){
            $model->invoiceAmt = $map['invoice_amt'];
        }
        if(isset($map['tax_amt'])){
            $model->taxAmt = $map['tax_amt'];
        }
        if(isset($map['invoice_seller'])){
            $model->invoiceSeller = ApplyInvoiceSeller::fromMap($map['invoice_seller']);
        }
        if(isset($map['invoice_buyer'])){
            $model->invoiceBuyer = ApplyInvoiceBuyer::fromMap($map['invoice_buyer']);
        }
        if(isset($map['invoice_note'])){
            $model->invoiceNote = $map['invoice_note'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['invoice_id'])){
            $model->invoiceId = $map['invoice_id'];
        }
        if(isset($map['invoice_material'])){
            $model->invoiceMaterial = $map['invoice_material'];
        }
        if(isset($map['memo'])){
            $model->memo = $map['memo'];
        }
        if(isset($map['invoice_lines'])){
            if(!empty($map['invoice_lines'])){
                $model->invoiceLines = [];
                $n = 0;
                foreach($map['invoice_lines'] as $item) {
                    $model->invoiceLines[$n++] = null !== $item ? InvoiceLineVO::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['invoice_preview_log_no'])){
            $model->invoicePreviewLogNo = $map['invoice_preview_log_no'];
        }
        return $model;
    }
    // 发票号码
    /**
     * @example 3344
     * @var string
     */
    public $invoiceNo;

    // 发票代码
    /**
     * @example 323422244555
     * @var string
     */
    public $invoiceCode;

    // 开票时间
    /**
     * @example 2023-09-08
     * @var string
     */
    public $invoiceDate;

    // 发票类型
    /**
     * @example 01
     * @var string
     */
    public $invoiceType;

    // 开票金额
    /**
     * @example 34.98
     * @var string
     */
    public $invoiceAmt;

    // 税额
    /**
     * @example 34
     * @var string
     */
    public $taxAmt;

    // 销方信息
    /**
     * @example 
     * @var ApplyInvoiceSeller
     */
    public $invoiceSeller;

    // 购方信息
    /**
     * @example 
     * @var ApplyInvoiceBuyer
     */
    public $invoiceBuyer;

    // 发票票面备注
    /**
     * @example 备注
     * @var string
     */
    public $invoiceNote;

    // 租户id
    /**
     * @example 2088720671581149
     * @var string
     */
    public $tenantId;

    // 发票ID
    /**
     * @example 355566677676
     * @var string
     */
    public $invoiceId;

    // 发票介质
    /**
     * @example 01
     * @var string
     */
    public $invoiceMaterial;

    // 申请原因
    /**
     * @example 申请原因
     * @var string
     */
    public $memo;

    // 发票行信息
    /**
     * @example 
     * @var InvoiceLineVO[]
     */
    public $invoiceLines;

    // 发票预览记录号
    /**
     * @example 3344
     * @var string
     */
    public $invoicePreviewLogNo;

}
