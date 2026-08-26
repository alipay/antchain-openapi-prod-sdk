<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class InvoiceApplyItem extends Model {
    protected $_name = [
        'itemName' => 'item_name',
        'excludingTaxOfAmount' => 'excluding_tax_of_amount',
        'itemCode' => 'item_code',
        'amount' => 'amount',
        'invoiceRcptNo' => 'invoice_rcpt_no',
    ];
    public function validate() {
        Model::validateRequired('itemName', $this->itemName, true);
        Model::validateRequired('excludingTaxOfAmount', $this->excludingTaxOfAmount, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->itemName) {
            $res['item_name'] = $this->itemName;
        }
        if (null !== $this->excludingTaxOfAmount) {
            $res['excluding_tax_of_amount'] = $this->excludingTaxOfAmount;
        }
        if (null !== $this->itemCode) {
            $res['item_code'] = $this->itemCode;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->invoiceRcptNo) {
            $res['invoice_rcpt_no'] = $this->invoiceRcptNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return InvoiceApplyItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['item_name'])){
            $model->itemName = $map['item_name'];
        }
        if(isset($map['excluding_tax_of_amount'])){
            $model->excludingTaxOfAmount = $map['excluding_tax_of_amount'];
        }
        if(isset($map['item_code'])){
            $model->itemCode = $map['item_code'];
        }
        if(isset($map['amount'])){
            $model->amount = $map['amount'];
        }
        if(isset($map['invoice_rcpt_no'])){
            $model->invoiceRcptNo = $map['invoice_rcpt_no'];
        }
        return $model;
    }
    // 商品名称
    /**
     * @example xxx
     * @var string
     */
    public $itemName;

    // 不含税金额
    /**
     * @example 5520
     * @var string
     */
    public $excludingTaxOfAmount;

    // 商品CODE
    /**
     * @example 001
     * @var string
     */
    public $itemCode;

    // 含税金额
    /**
     * @example 3452
     * @var string
     */
    public $amount;

    // 关联单据号
    /**
     * @example 123123
     * @var string
     */
    public $invoiceRcptNo;

}
