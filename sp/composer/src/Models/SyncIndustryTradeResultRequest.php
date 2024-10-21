<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class SyncIndustryTradeResultRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $productAccessCode;

    // 外部商户订单号，不超过32位
    /**
     * @var string
     */
    public $merchantOrderNo;

    // 原支付请求的商户订单号
    /**
     * @var string
     */
    public $outTradeNo;

    // 支付宝交易号
    /**
     * @var string
     */
    public $tradeNo;

    // 交易状态。
    // WAIT_BUYER_PAY	交易创建，等待买家付款。
    // TRADE_CLOSED	未付款交易超时关闭，或支付完成后全额退款。
    // TRADE_SUCCESS	交易支付成功。
    /**
     * @var string
     */
    public $tradeStatus;

    // 错误码。
    /**
     * @var string
     */
    public $errorCode;

    // 错误原因
    /**
     * @var string
     */
    public $errorMsg;

    // 渠道 自营平台、第三方平台等
    /**
     * @var string
     */
    public $channel;

    // 交易金额，单位元，支持到分
    /**
     * @var string
     */
    public $totalAmount;

    // 币种
    /**
     * @var string
     */
    public $currencyValue;

    // 交易付款成功时间
    /**
     * @var string
     */
    public $gmtTrade;

    // 来源编码
    /**
     * @var string
     */
    public $source;

    // 扩展属性
    /**
     * @var string
     */
    public $properties;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productAccessCode' => 'product_access_code',
        'merchantOrderNo'   => 'merchant_order_no',
        'outTradeNo'        => 'out_trade_no',
        'tradeNo'           => 'trade_no',
        'tradeStatus'       => 'trade_status',
        'errorCode'         => 'error_code',
        'errorMsg'          => 'error_msg',
        'channel'           => 'channel',
        'totalAmount'       => 'total_amount',
        'currencyValue'     => 'currency_value',
        'gmtTrade'          => 'gmt_trade',
        'source'            => 'source',
        'properties'        => 'properties',
    ];

    public function validate()
    {
        Model::validateRequired('merchantOrderNo', $this->merchantOrderNo, true);
        Model::validateRequired('outTradeNo', $this->outTradeNo, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('tradeStatus', $this->tradeStatus, true);
        Model::validateRequired('channel', $this->channel, true);
        Model::validatePattern('gmtTrade', $this->gmtTrade, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->productAccessCode) {
            $res['product_access_code'] = $this->productAccessCode;
        }
        if (null !== $this->merchantOrderNo) {
            $res['merchant_order_no'] = $this->merchantOrderNo;
        }
        if (null !== $this->outTradeNo) {
            $res['out_trade_no'] = $this->outTradeNo;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->tradeStatus) {
            $res['trade_status'] = $this->tradeStatus;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
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
        if (null !== $this->gmtTrade) {
            $res['gmt_trade'] = $this->gmtTrade;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncIndustryTradeResultRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['product_access_code'])) {
            $model->productAccessCode = $map['product_access_code'];
        }
        if (isset($map['merchant_order_no'])) {
            $model->merchantOrderNo = $map['merchant_order_no'];
        }
        if (isset($map['out_trade_no'])) {
            $model->outTradeNo = $map['out_trade_no'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['trade_status'])) {
            $model->tradeStatus = $map['trade_status'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
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
        if (isset($map['gmt_trade'])) {
            $model->gmtTrade = $map['gmt_trade'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }

        return $model;
    }
}
