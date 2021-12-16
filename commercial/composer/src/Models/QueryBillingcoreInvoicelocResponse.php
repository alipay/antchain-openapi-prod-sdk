<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class QueryBillingcoreInvoicelocResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

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
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'invoice'        => 'invoice',
        'invoiceAddress' => 'invoice_address',
        'invoiceEmail'   => 'invoice_email',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
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
     * @return QueryBillingcoreInvoicelocResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
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
