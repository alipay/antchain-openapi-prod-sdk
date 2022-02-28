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
    ];

    public function validate()
    {
        Model::validateRequired('merchantOrderNo', $this->merchantOrderNo, true);
        Model::validateRequired('outTradeNo', $this->outTradeNo, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('tradeStatus', $this->tradeStatus, true);
        Model::validateRequired('channel', $this->channel, true);
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

        return $model;
    }
}
