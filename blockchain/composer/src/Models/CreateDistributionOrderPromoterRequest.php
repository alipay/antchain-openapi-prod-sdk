<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateDistributionOrderPromoterRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 购买用户id
    /**
     * @var string
     */
    public $buyerId;

    // 佣金
    /**
     * @var string
     */
    public $commission;

    // 佣金比例 10表示10%
    /**
     * @var string
     */
    public $commissionRate;

    // 推广订单id
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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'buyerId'           => 'buyer_id',
        'commission'        => 'commission',
        'commissionRate'    => 'commission_rate',
        'orderId'           => 'order_id',
        'orderPrice'        => 'order_price',
        'prevPromoterId'    => 'prev_promoter_id',
        'prevPromoterPrice' => 'prev_promoter_price',
        'productId'         => 'product_id',
        'promoterId'        => 'promoter_id',
    ];

    public function validate()
    {
        Model::validateRequired('buyerId', $this->buyerId, true);
        Model::validateRequired('commission', $this->commission, true);
        Model::validateRequired('commissionRate', $this->commissionRate, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('orderPrice', $this->orderPrice, true);
        Model::validateRequired('prevPromoterId', $this->prevPromoterId, true);
        Model::validateRequired('prevPromoterPrice', $this->prevPromoterPrice, true);
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('promoterId', $this->promoterId, true);
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
        if (null !== $this->buyerId) {
            $res['buyer_id'] = $this->buyerId;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDistributionOrderPromoterRequest
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
        if (isset($map['buyer_id'])) {
            $model->buyerId = $map['buyer_id'];
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

        return $model;
    }
}
