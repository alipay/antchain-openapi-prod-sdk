<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class IntlInvoiceInfoItem extends Model {
    protected $_name = [
        'invoiceNo' => 'invoice_no',
        'invoiceAmt' => 'invoice_amt',
        'excludingTaxInvoiceAmt' => 'excluding_tax_invoice_amt',
        'taxAmt' => 'tax_amt',
        'tax' => 'tax',
        'status' => 'status',
        'invoiceId' => 'invoice_id',
    ];
    public function validate() {
        Model::validateRequired('invoiceNo', $this->invoiceNo, true);
        Model::validateRequired('invoiceAmt', $this->invoiceAmt, true);
        Model::validateRequired('excludingTaxInvoiceAmt', $this->excludingTaxInvoiceAmt, true);
        Model::validateRequired('taxAmt', $this->taxAmt, true);
        Model::validateRequired('tax', $this->tax, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('invoiceId', $this->invoiceId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->invoiceNo) {
            $res['invoice_no'] = $this->invoiceNo;
        }
        if (null !== $this->invoiceAmt) {
            $res['invoice_amt'] = $this->invoiceAmt;
        }
        if (null !== $this->excludingTaxInvoiceAmt) {
            $res['excluding_tax_invoice_amt'] = $this->excludingTaxInvoiceAmt;
        }
        if (null !== $this->taxAmt) {
            $res['tax_amt'] = $this->taxAmt;
        }
        if (null !== $this->tax) {
            $res['tax'] = $this->tax;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->invoiceId) {
            $res['invoice_id'] = $this->invoiceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return IntlInvoiceInfoItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['invoice_no'])){
            $model->invoiceNo = $map['invoice_no'];
        }
        if(isset($map['invoice_amt'])){
            $model->invoiceAmt = $map['invoice_amt'];
        }
        if(isset($map['excluding_tax_invoice_amt'])){
            $model->excludingTaxInvoiceAmt = $map['excluding_tax_invoice_amt'];
        }
        if(isset($map['tax_amt'])){
            $model->taxAmt = $map['tax_amt'];
        }
        if(isset($map['tax'])){
            $model->tax = $map['tax'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['invoice_id'])){
            $model->invoiceId = $map['invoice_id'];
        }
        return $model;
    }
    // 发票号
    /**
     * @example 34555
     * @var string
     */
    public $invoiceNo;

    // 发票金额
    /**
     * @example 34.23
     * @var string
     */
    public $invoiceAmt;

    // 不含税金
    /**
     * @example 23.12
     * @var string
     */
    public $excludingTaxInvoiceAmt;

    // 税额
    /**
     * @example 2.23
     * @var string
     */
    public $taxAmt;

    // 税率
    /**
     * @example 0.09
     * @var string
     */
    public $tax;

    // 状态
    /**
     * @example INVED
     * @var string
     */
    public $status;

    // 发票ID
    /**
     * @example 20260716107315002131450000476631
     * @var string
     */
    public $invoiceId;

}
