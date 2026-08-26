<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\ApplyInvoiceLine;
use AntChain\DD\Models\ApplyInvoiceSeller;
use AntChain\DD\Models\ApplyInvoiceBuyer;

class ApplyInvoice extends Model {
    protected $_name = [
        'invoiceType' => 'invoice_type',
        'invoiceAmt' => 'invoice_amt',
        'applyInvoiceLines' => 'apply_invoice_lines',
        'applyInvoiceSeller' => 'apply_invoice_seller',
        'applyInvoiceBuyer' => 'apply_invoice_buyer',
        'invoiceNote' => 'invoice_note',
        'ccy' => 'ccy',
        'applyInvoiceId' => 'apply_invoice_id',
    ];
    public function validate() {
        Model::validateRequired('invoiceType', $this->invoiceType, true);
        Model::validateRequired('invoiceAmt', $this->invoiceAmt, true);
        Model::validateRequired('applyInvoiceLines', $this->applyInvoiceLines, true);
        Model::validateRequired('applyInvoiceSeller', $this->applyInvoiceSeller, true);
        Model::validateRequired('applyInvoiceBuyer', $this->applyInvoiceBuyer, true);
        Model::validateRequired('applyInvoiceId', $this->applyInvoiceId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->invoiceType) {
            $res['invoice_type'] = $this->invoiceType;
        }
        if (null !== $this->invoiceAmt) {
            $res['invoice_amt'] = $this->invoiceAmt;
        }
        if (null !== $this->applyInvoiceLines) {
            $res['apply_invoice_lines'] = [];
            if(null !== $this->applyInvoiceLines && is_array($this->applyInvoiceLines)){
                $n = 0;
                foreach($this->applyInvoiceLines as $item){
                    $res['apply_invoice_lines'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->applyInvoiceSeller) {
            $res['apply_invoice_seller'] = null !== $this->applyInvoiceSeller ? $this->applyInvoiceSeller->toMap() : null;
        }
        if (null !== $this->applyInvoiceBuyer) {
            $res['apply_invoice_buyer'] = null !== $this->applyInvoiceBuyer ? $this->applyInvoiceBuyer->toMap() : null;
        }
        if (null !== $this->invoiceNote) {
            $res['invoice_note'] = $this->invoiceNote;
        }
        if (null !== $this->ccy) {
            $res['ccy'] = $this->ccy;
        }
        if (null !== $this->applyInvoiceId) {
            $res['apply_invoice_id'] = $this->applyInvoiceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyInvoice
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['invoice_type'])){
            $model->invoiceType = $map['invoice_type'];
        }
        if(isset($map['invoice_amt'])){
            $model->invoiceAmt = $map['invoice_amt'];
        }
        if(isset($map['apply_invoice_lines'])){
            if(!empty($map['apply_invoice_lines'])){
                $model->applyInvoiceLines = [];
                $n = 0;
                foreach($map['apply_invoice_lines'] as $item) {
                    $model->applyInvoiceLines[$n++] = null !== $item ? ApplyInvoiceLine::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['apply_invoice_seller'])){
            $model->applyInvoiceSeller = ApplyInvoiceSeller::fromMap($map['apply_invoice_seller']);
        }
        if(isset($map['apply_invoice_buyer'])){
            $model->applyInvoiceBuyer = ApplyInvoiceBuyer::fromMap($map['apply_invoice_buyer']);
        }
        if(isset($map['invoice_note'])){
            $model->invoiceNote = $map['invoice_note'];
        }
        if(isset($map['ccy'])){
            $model->ccy = $map['ccy'];
        }
        if(isset($map['apply_invoice_id'])){
            $model->applyInvoiceId = $map['apply_invoice_id'];
        }
        return $model;
    }
    // 发票类型，01,增值税专用发票; * 02,增值税普通发票; * 04,国际形式发票; * 05,其它发票
    /**
     * @example 01
     * @var string
     */
    public $invoiceType;

    // 发票金额
    /**
     * @example 3244.98
     * @var string
     */
    public $invoiceAmt;

    // 发票行信息
    /**
     * @example 
     * @var ApplyInvoiceLine[]
     */
    public $applyInvoiceLines;

    // 销方信息
    /**
     * @example 
     * @var ApplyInvoiceSeller
     */
    public $applyInvoiceSeller;

    // 购方信息
    /**
     * @example 
     * @var ApplyInvoiceBuyer
     */
    public $applyInvoiceBuyer;

    // 发票备注
    /**
     * @example 备注
     * @var string
     */
    public $invoiceNote;

    // 币种
    /**
     * @example 156
     * @var string
     */
    public $ccy;

    // 发票ID
    /**
     * @example 334556666
     * @var string
     */
    public $applyInvoiceId;

}
