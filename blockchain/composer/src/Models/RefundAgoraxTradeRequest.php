<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class RefundAgoraxTradeRequest extends Model
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

    // 商户编号
    /**
     * @var string
     */
    public $externalId;

    // 退款金额（元）
    /**
     * @var string
     */
    public $refundAmount;

    // 商户订单号
    /**
     * @var string
     */
    public $outTradeNo;

    // 支付宝交易号
    /**
     * @var string
     */
    public $tradeNo;

    // 退款原因说明
    /**
     * @var string
     */
    public $refundReason;

    // 退款请求号，部分退款时必选
    /**
     * @var string
     */
    public $outRequestNo;

    // 退款包含的商品列表信息
    /**
     * @var RefundGoodsDetail[]
     */
    public $refundGoodsDetail;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'externalId'        => 'external_id',
        'refundAmount'      => 'refund_amount',
        'outTradeNo'        => 'out_trade_no',
        'tradeNo'           => 'trade_no',
        'refundReason'      => 'refund_reason',
        'outRequestNo'      => 'out_request_no',
        'refundGoodsDetail' => 'refund_goods_detail',
    ];

    public function validate()
    {
        Model::validateRequired('externalId', $this->externalId, true);
        Model::validateRequired('refundAmount', $this->refundAmount, true);
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
        if (null !== $this->externalId) {
            $res['external_id'] = $this->externalId;
        }
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }
        if (null !== $this->outTradeNo) {
            $res['out_trade_no'] = $this->outTradeNo;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->refundReason) {
            $res['refund_reason'] = $this->refundReason;
        }
        if (null !== $this->outRequestNo) {
            $res['out_request_no'] = $this->outRequestNo;
        }
        if (null !== $this->refundGoodsDetail) {
            $res['refund_goods_detail'] = [];
            if (null !== $this->refundGoodsDetail && \is_array($this->refundGoodsDetail)) {
                $n = 0;
                foreach ($this->refundGoodsDetail as $item) {
                    $res['refund_goods_detail'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RefundAgoraxTradeRequest
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
        if (isset($map['external_id'])) {
            $model->externalId = $map['external_id'];
        }
        if (isset($map['refund_amount'])) {
            $model->refundAmount = $map['refund_amount'];
        }
        if (isset($map['out_trade_no'])) {
            $model->outTradeNo = $map['out_trade_no'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['refund_reason'])) {
            $model->refundReason = $map['refund_reason'];
        }
        if (isset($map['out_request_no'])) {
            $model->outRequestNo = $map['out_request_no'];
        }
        if (isset($map['refund_goods_detail'])) {
            if (!empty($map['refund_goods_detail'])) {
                $model->refundGoodsDetail = [];
                $n                        = 0;
                foreach ($map['refund_goods_detail'] as $item) {
                    $model->refundGoodsDetail[$n++] = null !== $item ? RefundGoodsDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
