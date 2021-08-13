<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SalesByDay extends Model
{
    // 订单ID
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $ipOrderId;

    // 版权方ID
    /**
     * @example ACBDEFCABCFE381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $sellerId;

    // 商家ID
    /**
     * @example ACBDEFCABCFE381055Afc982d96fAB65b3a49cAc8b878184Cb16638783
     *
     * @var string
     */
    public $buyerId;

    // 版权方名称
    /**
     * @example 版权方
     *
     * @var string
     */
    public $sellerName;

    // 商家名称
    /**
     * @example 商家名称
     *
     * @var string
     */
    public $buyerName;

    // 日期
    /**
     * @example 20210721
     *
     * @var string
     */
    public $date;

    // 统计周期-开始时间
    /**
     * @example 1594896477580
     *
     * @var int
     */
    public $statisticBeginPeriod;

    // 统计周期-结束时间
    /**
     * @example 1694896477580
     *
     * @var int
     */
    public $statisticEndPeriod;

    // 商品销售数量
    /**
     * @example 10000
     *
     * @var int
     */
    public $amount;

    // 商品总销售额
    /**
     * @example 100000.00
     *
     * @var string
     */
    public $sales;

    // 总回退销售额
    /**
     * @example 100.00
     *
     * @var string
     */
    public $refundSales;

    // 需支付给版权方的总费用
    /**
     * @example 1000.00
     *
     * @var string
     */
    public $payment;
    protected $_name = [
        'ipOrderId'            => 'ip_order_id',
        'sellerId'             => 'seller_id',
        'buyerId'              => 'buyer_id',
        'sellerName'           => 'seller_name',
        'buyerName'            => 'buyer_name',
        'date'                 => 'date',
        'statisticBeginPeriod' => 'statistic_begin_period',
        'statisticEndPeriod'   => 'statistic_end_period',
        'amount'               => 'amount',
        'sales'                => 'sales',
        'refundSales'          => 'refund_sales',
        'payment'              => 'payment',
    ];

    public function validate()
    {
        Model::validateRequired('ipOrderId', $this->ipOrderId, true);
        Model::validateRequired('sellerId', $this->sellerId, true);
        Model::validateRequired('buyerId', $this->buyerId, true);
        Model::validateRequired('sellerName', $this->sellerName, true);
        Model::validateRequired('buyerName', $this->buyerName, true);
        Model::validateRequired('date', $this->date, true);
        Model::validateRequired('statisticBeginPeriod', $this->statisticBeginPeriod, true);
        Model::validateRequired('statisticEndPeriod', $this->statisticEndPeriod, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('sales', $this->sales, true);
        Model::validateRequired('refundSales', $this->refundSales, true);
        Model::validateRequired('payment', $this->payment, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ipOrderId) {
            $res['ip_order_id'] = $this->ipOrderId;
        }
        if (null !== $this->sellerId) {
            $res['seller_id'] = $this->sellerId;
        }
        if (null !== $this->buyerId) {
            $res['buyer_id'] = $this->buyerId;
        }
        if (null !== $this->sellerName) {
            $res['seller_name'] = $this->sellerName;
        }
        if (null !== $this->buyerName) {
            $res['buyer_name'] = $this->buyerName;
        }
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->statisticBeginPeriod) {
            $res['statistic_begin_period'] = $this->statisticBeginPeriod;
        }
        if (null !== $this->statisticEndPeriod) {
            $res['statistic_end_period'] = $this->statisticEndPeriod;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->sales) {
            $res['sales'] = $this->sales;
        }
        if (null !== $this->refundSales) {
            $res['refund_sales'] = $this->refundSales;
        }
        if (null !== $this->payment) {
            $res['payment'] = $this->payment;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SalesByDay
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip_order_id'])) {
            $model->ipOrderId = $map['ip_order_id'];
        }
        if (isset($map['seller_id'])) {
            $model->sellerId = $map['seller_id'];
        }
        if (isset($map['buyer_id'])) {
            $model->buyerId = $map['buyer_id'];
        }
        if (isset($map['seller_name'])) {
            $model->sellerName = $map['seller_name'];
        }
        if (isset($map['buyer_name'])) {
            $model->buyerName = $map['buyer_name'];
        }
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }
        if (isset($map['statistic_begin_period'])) {
            $model->statisticBeginPeriod = $map['statistic_begin_period'];
        }
        if (isset($map['statistic_end_period'])) {
            $model->statisticEndPeriod = $map['statistic_end_period'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['sales'])) {
            $model->sales = $map['sales'];
        }
        if (isset($map['refund_sales'])) {
            $model->refundSales = $map['refund_sales'];
        }
        if (isset($map['payment'])) {
            $model->payment = $map['payment'];
        }

        return $model;
    }
}
