<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class ApplyBillingcoreMerchantinvoiceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 发票信息
    /**
     * @var Invoice
     */
    public $invoice;

    // 发票寄送地址
    /**
     * @var InvoiceAddress
     */
    public $invoiceAddress;

    // 发票电子邮箱
    /**
     * @var InvoiceEmail
     */
    public $invoiceEmail;
    protected $_name = [
        'authToken'      => 'auth_token',
        'orderNo'        => 'order_no',
        'invoice'        => 'invoice',
        'invoiceAddress' => 'invoice_address',
        'invoiceEmail'   => 'invoice_email',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('invoice', $this->invoice, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->invoice) {
            $res['invoice'] = null !== $this->invoice ? $this->invoice->toMap() : null;
        }
        if (null !== $this->invoiceAddress) {
            $res['invoice_address'] = null !== $this->invoiceAddress ? $this->invoiceAddress->toMap() : null;
        }
        if (null !== $this->invoiceEmail) {
            $res['invoice_email'] = null !== $this->invoiceEmail ? $this->invoiceEmail->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyBillingcoreMerchantinvoiceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['invoice'])) {
            $model->invoice = Invoice::fromMap($map['invoice']);
        }
        if (isset($map['invoice_address'])) {
            $model->invoiceAddress = InvoiceAddress::fromMap($map['invoice_address']);
        }
        if (isset($map['invoice_email'])) {
            $model->invoiceEmail = InvoiceEmail::fromMap($map['invoice_email']);
        }

        return $model;
    }
}
