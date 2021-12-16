<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class QueryBillingcoreMerchantinvoiceResponse extends Model
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

    // 主键id
    /**
     * @var int
     */
    public $id;

    // 商户id
    /**
     * @var string
     */
    public $merchantId;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 订单金额
    /**
     * @var string
     */
    public $orderAmt;

    // 币种
    /**
     * @var string
     */
    public $ccy;

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

    // 创建时间
    /**
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'id'             => 'id',
        'merchantId'     => 'merchant_id',
        'orderNo'        => 'order_no',
        'orderAmt'       => 'order_amt',
        'ccy'            => 'ccy',
        'invoice'        => 'invoice',
        'invoiceAddress' => 'invoice_address',
        'invoiceEmail'   => 'invoice_email',
        'gmtCreate'      => 'gmt_create',
        'gmtModified'    => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->orderAmt) {
            $res['order_amt'] = $this->orderAmt;
        }
        if (null !== $this->ccy) {
            $res['ccy'] = $this->ccy;
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
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBillingcoreMerchantinvoiceResponse
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['order_amt'])) {
            $model->orderAmt = $map['order_amt'];
        }
        if (isset($map['ccy'])) {
            $model->ccy = $map['ccy'];
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
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
