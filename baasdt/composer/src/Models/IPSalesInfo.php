<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPSalesInfo extends Model
{
    // 终端商品名称
    /**
     * @example XXX联名牙膏
     *
     * @var string
     */
    public $goodsName;

    // 终端商品图片
    /**
     * @example oss://myexchange/1259371fc8f77d37...5dfb6d130facf32dd6d4257fa0.jpeg
     *
     * @var string
     */
    public $goodsImage;

    // 终端销售渠道
    /**
     * @example 天猫
     *
     * @var string
     */
    public $salesChannel;

    // 终端商品链接
    /**
     * @example https://xxx.xxx.com
     *
     * @var string
     */
    public $goodsUrl;

    // 零售价
    /**
     * @example 65
     *
     * @var string
     */
    public $price;

    // 商品销售数量
    /**
     * @example 10000
     *
     * @var int
     */
    public $amount;

    // 销售金额
    /**
     * @example 650000
     *
     * @var string
     */
    public $sales;

    // 实付金额（授权交易）
    /**
     * @example 65
     *
     * @var string
     */
    public $payment;

    // 统计周期开始时间（毫秒时间戳）
    /**
     * @example
     *
     * @var int
     */
    public $settlementBeginTime;

    // 统计周期结束时间（毫秒时间戳）
    /**
     * @example
     *
     * @var int
     */
    public $settlementEndTime;

    // 备注信息
    /**
     * @example 备注信息
     *
     * @var string
     */
    public $memo;

    // 数据上传操作人
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16647534587
     *
     * @var string
     */
    public $operator;

    // 销售数据上传操作时间（毫秒时间戳）
    /**
     * @example
     *
     * @var int
     */
    public $operateTime;

    // 商品信息
    /**
     * @example XXX联名款
     *
     * @var string
     */
    public $goodsInfo;
    protected $_name = [
        'goodsName'           => 'goods_name',
        'goodsImage'          => 'goods_image',
        'salesChannel'        => 'sales_channel',
        'goodsUrl'            => 'goods_url',
        'price'               => 'price',
        'amount'              => 'amount',
        'sales'               => 'sales',
        'payment'             => 'payment',
        'settlementBeginTime' => 'settlement_begin_time',
        'settlementEndTime'   => 'settlement_end_time',
        'memo'                => 'memo',
        'operator'            => 'operator',
        'operateTime'         => 'operate_time',
        'goodsInfo'           => 'goods_info',
    ];

    public function validate()
    {
        Model::validateRequired('goodsName', $this->goodsName, true);
        Model::validateRequired('goodsImage', $this->goodsImage, true);
        Model::validateRequired('salesChannel', $this->salesChannel, true);
        Model::validateRequired('goodsUrl', $this->goodsUrl, true);
        Model::validateRequired('price', $this->price, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('sales', $this->sales, true);
        Model::validateRequired('payment', $this->payment, true);
        Model::validateRequired('settlementBeginTime', $this->settlementBeginTime, true);
        Model::validateRequired('settlementEndTime', $this->settlementEndTime, true);
        Model::validateRequired('memo', $this->memo, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('operateTime', $this->operateTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->goodsName) {
            $res['goods_name'] = $this->goodsName;
        }
        if (null !== $this->goodsImage) {
            $res['goods_image'] = $this->goodsImage;
        }
        if (null !== $this->salesChannel) {
            $res['sales_channel'] = $this->salesChannel;
        }
        if (null !== $this->goodsUrl) {
            $res['goods_url'] = $this->goodsUrl;
        }
        if (null !== $this->price) {
            $res['price'] = $this->price;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->sales) {
            $res['sales'] = $this->sales;
        }
        if (null !== $this->payment) {
            $res['payment'] = $this->payment;
        }
        if (null !== $this->settlementBeginTime) {
            $res['settlement_begin_time'] = $this->settlementBeginTime;
        }
        if (null !== $this->settlementEndTime) {
            $res['settlement_end_time'] = $this->settlementEndTime;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->operateTime) {
            $res['operate_time'] = $this->operateTime;
        }
        if (null !== $this->goodsInfo) {
            $res['goods_info'] = $this->goodsInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPSalesInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['goods_name'])) {
            $model->goodsName = $map['goods_name'];
        }
        if (isset($map['goods_image'])) {
            $model->goodsImage = $map['goods_image'];
        }
        if (isset($map['sales_channel'])) {
            $model->salesChannel = $map['sales_channel'];
        }
        if (isset($map['goods_url'])) {
            $model->goodsUrl = $map['goods_url'];
        }
        if (isset($map['price'])) {
            $model->price = $map['price'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['sales'])) {
            $model->sales = $map['sales'];
        }
        if (isset($map['payment'])) {
            $model->payment = $map['payment'];
        }
        if (isset($map['settlement_begin_time'])) {
            $model->settlementBeginTime = $map['settlement_begin_time'];
        }
        if (isset($map['settlement_end_time'])) {
            $model->settlementEndTime = $map['settlement_end_time'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['operate_time'])) {
            $model->operateTime = $map['operate_time'];
        }
        if (isset($map['goods_info'])) {
            $model->goodsInfo = $map['goods_info'];
        }

        return $model;
    }
}
