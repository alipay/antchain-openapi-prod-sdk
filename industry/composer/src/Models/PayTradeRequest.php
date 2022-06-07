<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class PayTradeRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
    /**
     * @var string
     */
    public $merchantOrderNo;

    // 来源场景码, 由中台分配给业务方
    /**
     * @var string
     */
    public $source;

    // 渠道
    /**
     * @var string
     */
    public $channel;

    // 收单金额，"10.11"代表10.11元,最小粒度到分,小数点后2位，不支持高精度和负数
    /**
     * @var string
     */
    public $totalAmount;

    // 交易币种，默认：人民币（156）
    /**
     * @var string
     */
    public $currencyValue;

    // 交易标题等。注意：不可使用特殊字符，如 /，=，& 等。不超过256
    /**
     * @var string
     */
    public $subject;

    // 交易信息
    /**
     * @var string
     */
    public $body;

    // 收款方id
    /**
     * @var string
     */
    public $payeeId;

    // 付款方id
    /**
     * @var string
     */
    public $payerId;

    // ZFT
    /**
     * @var string
     */
    public $payProductCode;

    // 交易创建时间
    /**
     * @var string
     */
    public $gmtTradeCreate;

    // 交易支付时间
    /**
     * @var string
     */
    public $gmtTradePay;

    // 交易完成时间
    /**
     * @var string
     */
    public $gmtTradeComplete;

    // 交易状态
    /**
     * @var string
     */
    public $tradeStatus;

    // 扩展字段，json串
    /**
     * @var string
     */
    public $properties;
    protected $_name = [
        'authToken'        => 'auth_token',
        'merchantOrderNo'  => 'merchant_order_no',
        'source'           => 'source',
        'channel'          => 'channel',
        'totalAmount'      => 'total_amount',
        'currencyValue'    => 'currency_value',
        'subject'          => 'subject',
        'body'             => 'body',
        'payeeId'          => 'payee_id',
        'payerId'          => 'payer_id',
        'payProductCode'   => 'pay_product_code',
        'gmtTradeCreate'   => 'gmt_trade_create',
        'gmtTradePay'      => 'gmt_trade_pay',
        'gmtTradeComplete' => 'gmt_trade_complete',
        'tradeStatus'      => 'trade_status',
        'properties'       => 'properties',
    ];

    public function validate()
    {
        Model::validateRequired('merchantOrderNo', $this->merchantOrderNo, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('payeeId', $this->payeeId, true);
        Model::validateRequired('payerId', $this->payerId, true);
        Model::validateRequired('payProductCode', $this->payProductCode, true);
        Model::validateRequired('gmtTradeCreate', $this->gmtTradeCreate, true);
        Model::validatePattern('gmtTradeCreate', $this->gmtTradeCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtTradePay', $this->gmtTradePay, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtTradeComplete', $this->gmtTradeComplete, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->merchantOrderNo) {
            $res['merchant_order_no'] = $this->merchantOrderNo;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->currencyValue) {
            $res['currency_value'] = $this->currencyValue;
        }
        if (null !== $this->subject) {
            $res['subject'] = $this->subject;
        }
        if (null !== $this->body) {
            $res['body'] = $this->body;
        }
        if (null !== $this->payeeId) {
            $res['payee_id'] = $this->payeeId;
        }
        if (null !== $this->payerId) {
            $res['payer_id'] = $this->payerId;
        }
        if (null !== $this->payProductCode) {
            $res['pay_product_code'] = $this->payProductCode;
        }
        if (null !== $this->gmtTradeCreate) {
            $res['gmt_trade_create'] = $this->gmtTradeCreate;
        }
        if (null !== $this->gmtTradePay) {
            $res['gmt_trade_pay'] = $this->gmtTradePay;
        }
        if (null !== $this->gmtTradeComplete) {
            $res['gmt_trade_complete'] = $this->gmtTradeComplete;
        }
        if (null !== $this->tradeStatus) {
            $res['trade_status'] = $this->tradeStatus;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PayTradeRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['merchant_order_no'])) {
            $model->merchantOrderNo = $map['merchant_order_no'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['currency_value'])) {
            $model->currencyValue = $map['currency_value'];
        }
        if (isset($map['subject'])) {
            $model->subject = $map['subject'];
        }
        if (isset($map['body'])) {
            $model->body = $map['body'];
        }
        if (isset($map['payee_id'])) {
            $model->payeeId = $map['payee_id'];
        }
        if (isset($map['payer_id'])) {
            $model->payerId = $map['payer_id'];
        }
        if (isset($map['pay_product_code'])) {
            $model->payProductCode = $map['pay_product_code'];
        }
        if (isset($map['gmt_trade_create'])) {
            $model->gmtTradeCreate = $map['gmt_trade_create'];
        }
        if (isset($map['gmt_trade_pay'])) {
            $model->gmtTradePay = $map['gmt_trade_pay'];
        }
        if (isset($map['gmt_trade_complete'])) {
            $model->gmtTradeComplete = $map['gmt_trade_complete'];
        }
        if (isset($map['trade_status'])) {
            $model->tradeStatus = $map['trade_status'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }

        return $model;
    }
}
