<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPSalesSummary extends Model
{
    // 订单ID
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $ipOrderId;

    // 销售数据ID
    /**
     * @example BizIdbcjvdshgcvashcxgvsdhcgvshdcg
     *
     * @var string
     */
    public $salesBizId;

    // 总销售量
    /**
     * @example 10000
     *
     * @var int
     */
    public $amount;

    // 数量校正
    /**
     * @example -100
     *
     * @var int
     */
    public $correctAmount;

    // 实际总销售量
    /**
     * @example 9900
     *
     * @var int
     */
    public $totalAmount;

    // 总销售额
    /**
     * @example 100.00
     *
     * @var string
     */
    public $sales;

    // 金额校正
    /**
     * @example -10.00
     *
     * @var string
     */
    public $correctSales;

    // 实际总销售金额
    /**
     * @example 90.00
     *
     * @var string
     */
    public $totalSales;

    // 最后操作时间
    /**
     * @example 1694896477580
     *
     * @var int
     */
    public $operatorTime;

    // 销售数据状态：1初始化，2商户确认，3版权方确认，4账单生成，5商户已校正，6版权方拒绝
    /**
     * @example 1
     *
     * @var int
     */
    public $status;

    // 销售数据最终是否需要生成支付账单
    /**
     * @example true, false
     *
     * @var bool
     */
    public $needToPay;

    // 备注信息
    /**
     * @example 备注信息
     *
     * @var string
     */
    public $memo;

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
    protected $_name = [
        'ipOrderId'           => 'ip_order_id',
        'salesBizId'          => 'sales_biz_id',
        'amount'              => 'amount',
        'correctAmount'       => 'correct_amount',
        'totalAmount'         => 'total_amount',
        'sales'               => 'sales',
        'correctSales'        => 'correct_sales',
        'totalSales'          => 'total_sales',
        'operatorTime'        => 'operator_time',
        'status'              => 'status',
        'needToPay'           => 'need_to_pay',
        'memo'                => 'memo',
        'settlementBeginTime' => 'settlement_begin_time',
        'settlementEndTime'   => 'settlement_end_time',
    ];

    public function validate()
    {
        Model::validateRequired('ipOrderId', $this->ipOrderId, true);
        Model::validateRequired('salesBizId', $this->salesBizId, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('correctAmount', $this->correctAmount, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('sales', $this->sales, true);
        Model::validateRequired('correctSales', $this->correctSales, true);
        Model::validateRequired('totalSales', $this->totalSales, true);
        Model::validateRequired('operatorTime', $this->operatorTime, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('needToPay', $this->needToPay, true);
        Model::validateRequired('memo', $this->memo, true);
        Model::validateRequired('settlementBeginTime', $this->settlementBeginTime, true);
        Model::validateRequired('settlementEndTime', $this->settlementEndTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ipOrderId) {
            $res['ip_order_id'] = $this->ipOrderId;
        }
        if (null !== $this->salesBizId) {
            $res['sales_biz_id'] = $this->salesBizId;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->correctAmount) {
            $res['correct_amount'] = $this->correctAmount;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->sales) {
            $res['sales'] = $this->sales;
        }
        if (null !== $this->correctSales) {
            $res['correct_sales'] = $this->correctSales;
        }
        if (null !== $this->totalSales) {
            $res['total_sales'] = $this->totalSales;
        }
        if (null !== $this->operatorTime) {
            $res['operator_time'] = $this->operatorTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->needToPay) {
            $res['need_to_pay'] = $this->needToPay;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->settlementBeginTime) {
            $res['settlement_begin_time'] = $this->settlementBeginTime;
        }
        if (null !== $this->settlementEndTime) {
            $res['settlement_end_time'] = $this->settlementEndTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPSalesSummary
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip_order_id'])) {
            $model->ipOrderId = $map['ip_order_id'];
        }
        if (isset($map['sales_biz_id'])) {
            $model->salesBizId = $map['sales_biz_id'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['correct_amount'])) {
            $model->correctAmount = $map['correct_amount'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['sales'])) {
            $model->sales = $map['sales'];
        }
        if (isset($map['correct_sales'])) {
            $model->correctSales = $map['correct_sales'];
        }
        if (isset($map['total_sales'])) {
            $model->totalSales = $map['total_sales'];
        }
        if (isset($map['operator_time'])) {
            $model->operatorTime = $map['operator_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['need_to_pay'])) {
            $model->needToPay = $map['need_to_pay'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['settlement_begin_time'])) {
            $model->settlementBeginTime = $map['settlement_begin_time'];
        }
        if (isset($map['settlement_end_time'])) {
            $model->settlementEndTime = $map['settlement_end_time'];
        }

        return $model;
    }
}
