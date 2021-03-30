<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class PayBillInvoiceParam extends Model
{
    // 账单发票code
    /**
     * @example xxx
     *
     * @var string
     */
    public $payBillInvoiceCode;

    // 账单编号
    /**
     * @example xxx
     *
     * @var string
     */
    public $payBillOrderCode;

    // 账单金额
    /**
     * @example 123123
     *
     * @var string
     */
    public $payBillAmount;

    // 发票金额
    /**
     * @example 123123
     *
     * @var string
     */
    public $invoiceAmount;

    // 操作动作
    /**
     * @example UPDATE、DELETE、INSERT
     *
     * @var string
     */
    public $action;
    protected $_name = [
        'payBillInvoiceCode' => 'pay_bill_invoice_code',
        'payBillOrderCode'   => 'pay_bill_order_code',
        'payBillAmount'      => 'pay_bill_amount',
        'invoiceAmount'      => 'invoice_amount',
        'action'             => 'action',
    ];

    public function validate()
    {
        Model::validateRequired('payBillInvoiceCode', $this->payBillInvoiceCode, true);
        Model::validateRequired('payBillOrderCode', $this->payBillOrderCode, true);
        Model::validateRequired('payBillAmount', $this->payBillAmount, true);
        Model::validateRequired('invoiceAmount', $this->invoiceAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->payBillInvoiceCode) {
            $res['pay_bill_invoice_code'] = $this->payBillInvoiceCode;
        }
        if (null !== $this->payBillOrderCode) {
            $res['pay_bill_order_code'] = $this->payBillOrderCode;
        }
        if (null !== $this->payBillAmount) {
            $res['pay_bill_amount'] = $this->payBillAmount;
        }
        if (null !== $this->invoiceAmount) {
            $res['invoice_amount'] = $this->invoiceAmount;
        }
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PayBillInvoiceParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pay_bill_invoice_code'])) {
            $model->payBillInvoiceCode = $map['pay_bill_invoice_code'];
        }
        if (isset($map['pay_bill_order_code'])) {
            $model->payBillOrderCode = $map['pay_bill_order_code'];
        }
        if (isset($map['pay_bill_amount'])) {
            $model->payBillAmount = $map['pay_bill_amount'];
        }
        if (isset($map['invoice_amount'])) {
            $model->invoiceAmount = $map['invoice_amount'];
        }
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }

        return $model;
    }
}
