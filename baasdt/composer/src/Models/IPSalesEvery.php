<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPSalesEvery extends Model
{
    // 电商系统订单编号
    /**
     * @example outOrderId0001
     *
     * @var string
     */
    public $outOrderId;

    // 数据渠道类型：0 手动录入，1 淘宝开放平台
    /**
     * @example 0
     *
     * @var int
     */
    public $dataType;

    // 实际销售渠道
    /**
     * @example TM/TB
     *
     * @var string
     */
    public $salesChannel;

    // 订单创建时间
    /**
     * @example 1694896477580
     *
     * @var int
     */
    public $orderCreateTime;

    // 订单完成时间
    /**
     * @example 1699896477580
     *
     * @var int
     */
    public $orderFinishTime;

    // 本订单销售金额，单位元
    /**
     * @example 10000.01
     *
     * @var string
     */
    public $sales;

    // 本订单退款金额，单位元
    /**
     * @example 100.01
     *
     * @var string
     */
    public $refundSales;

    // 店铺名称
    /**
     * @example XXX旗舰店
     *
     * @var string
     */
    public $shopName;

    // 商品ID/SKUID/商品编码
    /**
     * @example goodsId001
     *
     * @var string
     */
    public $goodsId;

    // 商品名称
    /**
     * @example XXX联名牙刷
     *
     * @var string
     */
    public $goodsName;

    // 商品规格
    /**
     * @example 商品规格信息
     *
     * @var string
     */
    public $goodsSpecification;

    // 本订单卖出的商品数量
    /**
     * @example 1
     *
     * @var int
     */
    public $amount;

    // 备注信息
    /**
     * @example 备注信息
     *
     * @var string
     */
    public $memo;
    protected $_name = [
        'outOrderId'         => 'out_order_id',
        'dataType'           => 'data_type',
        'salesChannel'       => 'sales_channel',
        'orderCreateTime'    => 'order_create_time',
        'orderFinishTime'    => 'order_finish_time',
        'sales'              => 'sales',
        'refundSales'        => 'refund_sales',
        'shopName'           => 'shop_name',
        'goodsId'            => 'goods_id',
        'goodsName'          => 'goods_name',
        'goodsSpecification' => 'goods_specification',
        'amount'             => 'amount',
        'memo'               => 'memo',
    ];

    public function validate()
    {
        Model::validateRequired('outOrderId', $this->outOrderId, true);
        Model::validateRequired('dataType', $this->dataType, true);
        Model::validateRequired('orderCreateTime', $this->orderCreateTime, true);
        Model::validateRequired('orderFinishTime', $this->orderFinishTime, true);
        Model::validateRequired('sales', $this->sales, true);
        Model::validateRequired('shopName', $this->shopName, true);
        Model::validateRequired('goodsId', $this->goodsId, true);
        Model::validateRequired('goodsName', $this->goodsName, true);
        Model::validateRequired('goodsSpecification', $this->goodsSpecification, true);
        Model::validateRequired('amount', $this->amount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->outOrderId) {
            $res['out_order_id'] = $this->outOrderId;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->salesChannel) {
            $res['sales_channel'] = $this->salesChannel;
        }
        if (null !== $this->orderCreateTime) {
            $res['order_create_time'] = $this->orderCreateTime;
        }
        if (null !== $this->orderFinishTime) {
            $res['order_finish_time'] = $this->orderFinishTime;
        }
        if (null !== $this->sales) {
            $res['sales'] = $this->sales;
        }
        if (null !== $this->refundSales) {
            $res['refund_sales'] = $this->refundSales;
        }
        if (null !== $this->shopName) {
            $res['shop_name'] = $this->shopName;
        }
        if (null !== $this->goodsId) {
            $res['goods_id'] = $this->goodsId;
        }
        if (null !== $this->goodsName) {
            $res['goods_name'] = $this->goodsName;
        }
        if (null !== $this->goodsSpecification) {
            $res['goods_specification'] = $this->goodsSpecification;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPSalesEvery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['out_order_id'])) {
            $model->outOrderId = $map['out_order_id'];
        }
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }
        if (isset($map['sales_channel'])) {
            $model->salesChannel = $map['sales_channel'];
        }
        if (isset($map['order_create_time'])) {
            $model->orderCreateTime = $map['order_create_time'];
        }
        if (isset($map['order_finish_time'])) {
            $model->orderFinishTime = $map['order_finish_time'];
        }
        if (isset($map['sales'])) {
            $model->sales = $map['sales'];
        }
        if (isset($map['refund_sales'])) {
            $model->refundSales = $map['refund_sales'];
        }
        if (isset($map['shop_name'])) {
            $model->shopName = $map['shop_name'];
        }
        if (isset($map['goods_id'])) {
            $model->goodsId = $map['goods_id'];
        }
        if (isset($map['goods_name'])) {
            $model->goodsName = $map['goods_name'];
        }
        if (isset($map['goods_specification'])) {
            $model->goodsSpecification = $map['goods_specification'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }

        return $model;
    }
}
