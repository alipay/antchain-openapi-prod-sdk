<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OrderInfo extends Model
{
    // 订单id
    /**
     * @example SH20241017184159846222
     *
     * @var string
     */
    public $orderId;

    // 订单创建时间
    /**
     * @example 2024-10-17 18:41:59.000
     *
     * @var string
     */
    public $orderCreateTime;

    // 订单支付时间
    /**
     * @example 2024-10-17 18:41:59.000
     *
     * @var string
     */
    public $orderPayTime;

    // 租金总额(分)
    /**
     * @example 3500
     *
     * @var int
     */
    public $totalRentMoney;

    // 租期
    /**
     * @example 12
     *
     * @var int
     */
    public $rentTerm;

    // 租期单位
    /**
     * @example MONTH
     *
     * @var string
     */
    public $rentUnit;

    // 订单状态
    /**
     * @example OPEN
     *
     * @var string
     */
    public $orderStatus;

    // 订单子状态
    /**
     * @example ORDER_FULFILLMENT
     *
     * @var string
     */
    public $orderSubStatus;

    // 免押金额（分）
    /**
     * @example 200
     *
     * @var int
     */
    public $depositPrice;

    // 到期买断价(分)
    /**
     * @example 200
     *
     * @var int
     */
    public $buyOutPrice;

    // 物流方案
    /**
     * @example POST
     *
     * @var string
     */
    public $logisticType;

    // 到期形式
    // NA(0, "无意义"),
    // BUYOUT(1, "到期买断或归还"),
    // FREE_ON_RENT(2, "租满即送"),
    // RENEW_LEASE(3, "续租"),;
    /**
     * @example 1
     *
     * @var int
     */
    public $dueMode;

    // 首付款金额(分)
    /**
     * @example 200
     *
     * @var int
     */
    public $downPayment;

    // 商户统一社会信用代码
    /**
     * @example 91301010101010101A
     *
     * @var string
     */
    public $merchantId;

    // 商户名称
    /**
     * @example xxx有限公司
     *
     * @var string
     */
    public $merchantName;

    // 订单开始履约期数
    /**
     * @example 1
     *
     * @var int
     */
    public $divideStartTermIndex;

    // 订单关联的营销id
    /**
     * @example Promoionxxxxx
     *
     * @var string
     */
    public $promotionId;
    protected $_name = [
        'orderId'              => 'order_id',
        'orderCreateTime'      => 'order_create_time',
        'orderPayTime'         => 'order_pay_time',
        'totalRentMoney'       => 'total_rent_money',
        'rentTerm'             => 'rent_term',
        'rentUnit'             => 'rent_unit',
        'orderStatus'          => 'order_status',
        'orderSubStatus'       => 'order_sub_status',
        'depositPrice'         => 'deposit_price',
        'buyOutPrice'          => 'buy_out_price',
        'logisticType'         => 'logistic_type',
        'dueMode'              => 'due_mode',
        'downPayment'          => 'down_payment',
        'merchantId'           => 'merchant_id',
        'merchantName'         => 'merchant_name',
        'divideStartTermIndex' => 'divide_start_term_index',
        'promotionId'          => 'promotion_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->orderCreateTime) {
            $res['order_create_time'] = $this->orderCreateTime;
        }
        if (null !== $this->orderPayTime) {
            $res['order_pay_time'] = $this->orderPayTime;
        }
        if (null !== $this->totalRentMoney) {
            $res['total_rent_money'] = $this->totalRentMoney;
        }
        if (null !== $this->rentTerm) {
            $res['rent_term'] = $this->rentTerm;
        }
        if (null !== $this->rentUnit) {
            $res['rent_unit'] = $this->rentUnit;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->orderSubStatus) {
            $res['order_sub_status'] = $this->orderSubStatus;
        }
        if (null !== $this->depositPrice) {
            $res['deposit_price'] = $this->depositPrice;
        }
        if (null !== $this->buyOutPrice) {
            $res['buy_out_price'] = $this->buyOutPrice;
        }
        if (null !== $this->logisticType) {
            $res['logistic_type'] = $this->logisticType;
        }
        if (null !== $this->dueMode) {
            $res['due_mode'] = $this->dueMode;
        }
        if (null !== $this->downPayment) {
            $res['down_payment'] = $this->downPayment;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->divideStartTermIndex) {
            $res['divide_start_term_index'] = $this->divideStartTermIndex;
        }
        if (null !== $this->promotionId) {
            $res['promotion_id'] = $this->promotionId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['order_create_time'])) {
            $model->orderCreateTime = $map['order_create_time'];
        }
        if (isset($map['order_pay_time'])) {
            $model->orderPayTime = $map['order_pay_time'];
        }
        if (isset($map['total_rent_money'])) {
            $model->totalRentMoney = $map['total_rent_money'];
        }
        if (isset($map['rent_term'])) {
            $model->rentTerm = $map['rent_term'];
        }
        if (isset($map['rent_unit'])) {
            $model->rentUnit = $map['rent_unit'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['order_sub_status'])) {
            $model->orderSubStatus = $map['order_sub_status'];
        }
        if (isset($map['deposit_price'])) {
            $model->depositPrice = $map['deposit_price'];
        }
        if (isset($map['buy_out_price'])) {
            $model->buyOutPrice = $map['buy_out_price'];
        }
        if (isset($map['logistic_type'])) {
            $model->logisticType = $map['logistic_type'];
        }
        if (isset($map['due_mode'])) {
            $model->dueMode = $map['due_mode'];
        }
        if (isset($map['down_payment'])) {
            $model->downPayment = $map['down_payment'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }
        if (isset($map['divide_start_term_index'])) {
            $model->divideStartTermIndex = $map['divide_start_term_index'];
        }
        if (isset($map['promotion_id'])) {
            $model->promotionId = $map['promotion_id'];
        }

        return $model;
    }
}
