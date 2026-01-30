<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class CommodityInstance extends Model
{
    // 订单号
    /**
     * @example 2088123412341234
     *
     * @var string
     */
    public $bizNo;

    // 商品编码
    /**
     * @example KKAASP00001001
     *
     * @var string
     */
    public $commodityCode;

    // 销售主体，不传默认ZL6
    /**
     * @example ZL6,ZL7,ZJ9
     *
     * @var string
     */
    public $ou;

    // 订单类型，NEW：新购；RENEW：续费； MODIFY：变配 不填默认新购
    /**
     * @example NEW
     *
     * @var string
     */
    public $orderType;

    // 订购时长
    /**
     * @example
     *
     * @var OrderDuration
     */
    public $duration;

    // 优惠券ID
    /**
     * @example 12345678
     *
     * @var string
     */
    public $couponId;

    // 数量，不填默认1
    /**
     * @example
     *
     * @var int
     */
    public $quantity;

    //
    // 商品订购属性，开通型商品部需要填写
    /**
     * @example []
     *
     * @var CommodityOrderAttribute[]
     */
    public $commodityAttrs;

    // 履约选项
    /**
     * @example
     *
     * @var FulfillmentOptions
     */
    public $fulfillmentOptions;

    // 实例ID，续费/变配场景必传
    /**
     * @example A0BQBHFM00034877FVDJWUXR1ZXEMOD1U4G
     *
     * @var string
     */
    public $instanceId;

    // 预付费订单金额。仅白名单商品且batchBizNo是合法的合同ID的情况，才允许指定预付订单金额
    /**
     * @example
     *
     * @var PrepayAmount
     */
    public $prepayAmount;

    // 后付商品签约价，用于在履约阶段生成一客一价
    /**
     * @example
     *
     * @var PostPayPrice
     */
    public $postPayPrice;
    protected $_name = [
        'bizNo'              => 'biz_no',
        'commodityCode'      => 'commodity_code',
        'ou'                 => 'ou',
        'orderType'          => 'order_type',
        'duration'           => 'duration',
        'couponId'           => 'coupon_id',
        'quantity'           => 'quantity',
        'commodityAttrs'     => 'commodity_attrs',
        'fulfillmentOptions' => 'fulfillment_options',
        'instanceId'         => 'instance_id',
        'prepayAmount'       => 'prepay_amount',
        'postPayPrice'       => 'post_pay_price',
    ];

    public function validate()
    {
        Model::validateRequired('commodityCode', $this->commodityCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->prepayAmount) {
            $res['prepay_amount'] = null !== $this->prepayAmount ? $this->prepayAmount->toMap() : null;
        }
        if (null !== $this->postPayPrice) {
            $res['post_pay_price'] = null !== $this->postPayPrice ? $this->postPayPrice->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommodityInstance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['prepay_amount'])) {
            $model->prepayAmount = PrepayAmount::fromMap($map['prepay_amount']);
        }
        if (isset($map['post_pay_price'])) {
            $model->postPayPrice = PostPayPrice::fromMap($map['post_pay_price']);
        }

        return $model;
    }
}
