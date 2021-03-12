<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDistributionOrderPromoterResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 佣金
    /**
     * @var string
     */
    public $commission;

    // 佣金比例 10表示 10%
    /**
     * @var string
     */
    public $commissionRate;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 订单金额
    /**
     * @var string
     */
    public $orderPrice;

    // 推广人上级ID
    /**
     * @var string
     */
    public $prevPromoterId;

    // 推广人上级分佣金额
    /**
     * @var string
     */
    public $prevPromoterPrice;

    // 商品id
    /**
     * @var string
     */
    public $productId;

    // 推广人id
    /**
     * @var string
     */
    public $promoterId;

    // 链上地址
    /**
     * @var string
     */
    public $txHash;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'commission'        => 'commission',
        'commissionRate'    => 'commission_rate',
        'orderId'           => 'order_id',
        'orderPrice'        => 'order_price',
        'prevPromoterId'    => 'prev_promoter_id',
        'prevPromoterPrice' => 'prev_promoter_price',
        'productId'         => 'product_id',
        'promoterId'        => 'promoter_id',
        'txHash'            => 'tx_hash',
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
        if (null !== $this->commission) {
            $res['commission'] = $this->commission;
        }
        if (null !== $this->commissionRate) {
            $res['commission_rate'] = $this->commissionRate;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->orderPrice) {
            $res['order_price'] = $this->orderPrice;
        }
        if (null !== $this->prevPromoterId) {
            $res['prev_promoter_id'] = $this->prevPromoterId;
        }
        if (null !== $this->prevPromoterPrice) {
            $res['prev_promoter_price'] = $this->prevPromoterPrice;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->promoterId) {
            $res['promoter_id'] = $this->promoterId;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDistributionOrderPromoterResponse
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
        if (isset($map['commission'])) {
            $model->commission = $map['commission'];
        }
        if (isset($map['commission_rate'])) {
            $model->commissionRate = $map['commission_rate'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['order_price'])) {
            $model->orderPrice = $map['order_price'];
        }
        if (isset($map['prev_promoter_id'])) {
            $model->prevPromoterId = $map['prev_promoter_id'];
        }
        if (isset($map['prev_promoter_price'])) {
            $model->prevPromoterPrice = $map['prev_promoter_price'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['promoter_id'])) {
            $model->promoterId = $map['promoter_id'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
