<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class RefuseBlockchainBotDigitalkeyWithholdRequest extends Model
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

    // 订单支付时传入的商户订单号,不能和 trade_no同时为空。
    /**
     * @var string
     */
    public $outTradeNo;

    // 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
    /**
     * @var int
     */
    public $refundAmount;

    // 标识一次退款请求，同一笔交易多次退款需要保证唯一。
    /**
     * @var string
     */
    public $outRequestNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outTradeNo'        => 'out_trade_no',
        'refundAmount'      => 'refund_amount',
        'outRequestNo'      => 'out_request_no',
    ];

    public function validate()
    {
        Model::validateRequired('outTradeNo', $this->outTradeNo, true);
        Model::validateRequired('refundAmount', $this->refundAmount, true);
        Model::validateRequired('outRequestNo', $this->outRequestNo, true);
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
        if (null !== $this->outTradeNo) {
            $res['out_trade_no'] = $this->outTradeNo;
        }
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }
        if (null !== $this->outRequestNo) {
            $res['out_request_no'] = $this->outRequestNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RefuseBlockchainBotDigitalkeyWithholdRequest
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
        if (isset($map['out_trade_no'])) {
            $model->outTradeNo = $map['out_trade_no'];
        }
        if (isset($map['refund_amount'])) {
            $model->refundAmount = $map['refund_amount'];
        }
        if (isset($map['out_request_no'])) {
            $model->outRequestNo = $map['out_request_no'];
        }

        return $model;
    }
}
