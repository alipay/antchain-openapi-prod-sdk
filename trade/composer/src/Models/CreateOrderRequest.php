<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class CreateOrderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 业务流水号，调用方指定，幂等号
    /**
     * @var string
     */
    public $bizNo;

    // 租户ID，和租户名称二选一必填
    /**
     * @var string
     */
    public $tenantId;

    // 租户名称，和租户ID二选一必填
    /**
     * @var string
     */
    public $tenantName;

    // 操作人ID，不填则默认和租户ID一致
    /**
     * @var string
     */
    public $operatorId;

    // 商品编码
    /**
     * @var string
     */
    public $commodityCode;

    // 销售主体，不传默认ZL6
    /**
     * @var string
     */
    public $ou;

    // 订单类型，NEW：新购；RENEW：续费； MODIFY：变配
    // 不填默认新购
    /**
     * @var string
     */
    public $orderType;

    // 订购周期对象，当商品是周期订阅类型时，必填
    /**
     * @var OrderDuration
     */
    public $duration;

    // 优惠券ID
    /**
     * @var string
     */
    public $couponId;

    // 数量，不填默认1
    /**
     * @var int
     */
    public $quantity;

    // 商品订购属性，开通型商品部需要填写
    /**
     * @var CommodityOrderAttribute[]
     */
    public $commodityAttrs;

    // 履约选项
    /**
     * @var FulfillmentOptions
     */
    public $fulfillmentOptions;

    // 支付选项
    /**
     * @var PayOptions
     */
    public $payOptions;

    // 价格策略
    /**
     * @var PriceStrategy
     */
    public $priceStrategy;

    // 实例ID，续费/变配场景必传
    /**
     * @var string
     */
    public $instanceId;

    // 售卖市场。10100000：鹊凿市场；12000002：国际ZAN市场；其他市场编码请联系中台获取
    /**
     * @var string
     */
    public $saleMarket;

    // 扩展属性，JSON字符串
    /**
     * @var string
     */
    public $extendedProperties;
    protected $_name = [
        'authToken'          => 'auth_token',
        'bizNo'              => 'biz_no',
        'tenantId'           => 'tenant_id',
        'tenantName'         => 'tenant_name',
        'operatorId'         => 'operator_id',
        'commodityCode'      => 'commodity_code',
        'ou'                 => 'ou',
        'orderType'          => 'order_type',
        'duration'           => 'duration',
        'couponId'           => 'coupon_id',
        'quantity'           => 'quantity',
        'commodityAttrs'     => 'commodity_attrs',
        'fulfillmentOptions' => 'fulfillment_options',
        'payOptions'         => 'pay_options',
        'priceStrategy'      => 'price_strategy',
        'instanceId'         => 'instance_id',
        'saleMarket'         => 'sale_market',
        'extendedProperties' => 'extended_properties',
    ];

    public function validate()
    {
        Model::validateRequired('bizNo', $this->bizNo, true);
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('saleMarket', $this->saleMarket, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->ou) {
            $res['ou'] = $this->ou;
        }
        if (null !== $this->orderType) {
            $res['order_type'] = $this->orderType;
        }
        if (null !== $this->duration) {
            $res['duration'] = null !== $this->duration ? $this->duration->toMap() : null;
        }
        if (null !== $this->couponId) {
            $res['coupon_id'] = $this->couponId;
        }
        if (null !== $this->quantity) {
            $res['quantity'] = $this->quantity;
        }
        if (null !== $this->commodityAttrs) {
            $res['commodity_attrs'] = [];
            if (null !== $this->commodityAttrs && \is_array($this->commodityAttrs)) {
                $n = 0;
                foreach ($this->commodityAttrs as $item) {
                    $res['commodity_attrs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->fulfillmentOptions) {
            $res['fulfillment_options'] = null !== $this->fulfillmentOptions ? $this->fulfillmentOptions->toMap() : null;
        }
        if (null !== $this->payOptions) {
            $res['pay_options'] = null !== $this->payOptions ? $this->payOptions->toMap() : null;
        }
        if (null !== $this->priceStrategy) {
            $res['price_strategy'] = null !== $this->priceStrategy ? $this->priceStrategy->toMap() : null;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->saleMarket) {
            $res['sale_market'] = $this->saleMarket;
        }
        if (null !== $this->extendedProperties) {
            $res['extended_properties'] = $this->extendedProperties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateOrderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['commodity_code'])) {
            $model->commodityCode = $map['commodity_code'];
        }
        if (isset($map['ou'])) {
            $model->ou = $map['ou'];
        }
        if (isset($map['order_type'])) {
            $model->orderType = $map['order_type'];
        }
        if (isset($map['duration'])) {
            $model->duration = OrderDuration::fromMap($map['duration']);
        }
        if (isset($map['coupon_id'])) {
            $model->couponId = $map['coupon_id'];
        }
        if (isset($map['quantity'])) {
            $model->quantity = $map['quantity'];
        }
        if (isset($map['commodity_attrs'])) {
            if (!empty($map['commodity_attrs'])) {
                $model->commodityAttrs = [];
                $n                     = 0;
                foreach ($map['commodity_attrs'] as $item) {
                    $model->commodityAttrs[$n++] = null !== $item ? CommodityOrderAttribute::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['fulfillment_options'])) {
            $model->fulfillmentOptions = FulfillmentOptions::fromMap($map['fulfillment_options']);
        }
        if (isset($map['pay_options'])) {
            $model->payOptions = PayOptions::fromMap($map['pay_options']);
        }
        if (isset($map['price_strategy'])) {
            $model->priceStrategy = PriceStrategy::fromMap($map['price_strategy']);
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['sale_market'])) {
            $model->saleMarket = $map['sale_market'];
        }
        if (isset($map['extended_properties'])) {
            $model->extendedProperties = $map['extended_properties'];
        }

        return $model;
    }
}
