<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SyncTradePromoorderinfoRequest extends Model
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

    // 商户社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 营销id
    /**
     * @var string
     */
    public $promotionId;

    // 订单创建时间
    /**
     * @var string
     */
    public $orderCreateTime;

    // 买断价，单位为分
    /**
     * @var int
     */
    public $buyOutPrice;

    // 代扣履约总金额，单位为分
    /**
     * @var int
     */
    public $orderPromiseTotalMoney;

    // 商户公司的名字
    /**
     * @var string
     */
    public $merchantName;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'merchantId'             => 'merchant_id',
        'orderId'                => 'order_id',
        'promotionId'            => 'promotion_id',
        'orderCreateTime'        => 'order_create_time',
        'buyOutPrice'            => 'buy_out_price',
        'orderPromiseTotalMoney' => 'order_promise_total_money',
        'merchantName'           => 'merchant_name',
    ];

    public function validate()
    {
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('promotionId', $this->promotionId, true);
        Model::validateRequired('orderCreateTime', $this->orderCreateTime, true);
        Model::validateRequired('buyOutPrice', $this->buyOutPrice, true);
        Model::validateRequired('orderPromiseTotalMoney', $this->orderPromiseTotalMoney, true);
        Model::validateRequired('merchantName', $this->merchantName, true);
        Model::validateMaxLength('merchantId', $this->merchantId, 63);
        Model::validateMaxLength('orderId', $this->orderId, 49);
        Model::validateMaxLength('promotionId', $this->promotionId, 63);
        Model::validateMaxLength('orderCreateTime', $this->orderCreateTime, 20);
        Model::validateMaxLength('merchantName', $this->merchantName, 199);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('orderId', $this->orderId, 7);
        Model::validateMinLength('promotionId', $this->promotionId, 1);
        Model::validateMinLength('orderCreateTime', $this->orderCreateTime, 1);
        Model::validateMinLength('merchantName', $this->merchantName, 1);
        Model::validateMinimum('buyOutPrice', $this->buyOutPrice, 0);
        Model::validateMinimum('orderPromiseTotalMoney', $this->orderPromiseTotalMoney, 1);
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
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->promotionId) {
            $res['promotion_id'] = $this->promotionId;
        }
        if (null !== $this->orderCreateTime) {
            $res['order_create_time'] = $this->orderCreateTime;
        }
        if (null !== $this->buyOutPrice) {
            $res['buy_out_price'] = $this->buyOutPrice;
        }
        if (null !== $this->orderPromiseTotalMoney) {
            $res['order_promise_total_money'] = $this->orderPromiseTotalMoney;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncTradePromoorderinfoRequest
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
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['promotion_id'])) {
            $model->promotionId = $map['promotion_id'];
        }
        if (isset($map['order_create_time'])) {
            $model->orderCreateTime = $map['order_create_time'];
        }
        if (isset($map['buy_out_price'])) {
            $model->buyOutPrice = $map['buy_out_price'];
        }
        if (isset($map['order_promise_total_money'])) {
            $model->orderPromiseTotalMoney = $map['order_promise_total_money'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }

        return $model;
    }
}
