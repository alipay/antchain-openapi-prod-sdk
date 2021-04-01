<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPBill extends Model
{
    // 订单ID
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $ipOrderId;

    // 账单ID
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16534523
     *
     * @var string
     */
    public $ipBillId;

    // 上传销售数据时的bizId
    /**
     * @example bizId0000001
     *
     * @var string
     */
    public $bizId;

    // 收款方
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb165345237549274
     *
     * @var string
     */
    public $sellerId;

    // 付款方
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb163472346869786987
     *
     * @var string
     */
    public $buyerId;

    // 账单状态
    /**
     * @example 4
     *
     * @var int
     */
    public $status;

    // 账单创建时间，时间戳（毫秒）
    /**
     * @example 1694896477580
     *
     * @var int
     */
    public $createTime;

    // 备注信息
    /**
     * @example 备注信息
     *
     * @var string
     */
    public $memo;

    // 交易类型：0套餐交易，1定向授权
    /**
     * @example 0
     *
     * @var int
     */
    public $tradeType;

    // 支付链接
    /**
     * @example https://....
     *
     * @var string
     */
    public $payUrl;

    // 账单金额，支付金额
    /**
     * @example 100.11
     *
     * @var string
     */
    public $billPayAmount;

    // 销售金额
    /**
     * @example 10011.00
     *
     * @var string
     */
    public $billSales;

    // 账单周期开始时间，时间戳（毫秒）
    /**
     * @example 1694896477580
     *
     * @var int
     */
    public $cycleStartTime;

    // 账单周期结束时间，时间戳（毫秒）
    /**
     * @example 1594896477580
     *
     * @var int
     */
    public $cycleEndTime;
    protected $_name = [
        'ipOrderId'      => 'ip_order_id',
        'ipBillId'       => 'ip_bill_id',
        'bizId'          => 'biz_id',
        'sellerId'       => 'seller_id',
        'buyerId'        => 'buyer_id',
        'status'         => 'status',
        'createTime'     => 'create_time',
        'memo'           => 'memo',
        'tradeType'      => 'trade_type',
        'payUrl'         => 'pay_url',
        'billPayAmount'  => 'bill_pay_amount',
        'billSales'      => 'bill_sales',
        'cycleStartTime' => 'cycle_start_time',
        'cycleEndTime'   => 'cycle_end_time',
    ];

    public function validate()
    {
        Model::validateRequired('ipOrderId', $this->ipOrderId, true);
        Model::validateRequired('ipBillId', $this->ipBillId, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('sellerId', $this->sellerId, true);
        Model::validateRequired('buyerId', $this->buyerId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('memo', $this->memo, true);
        Model::validateRequired('tradeType', $this->tradeType, true);
        Model::validateRequired('payUrl', $this->payUrl, true);
        Model::validateRequired('billPayAmount', $this->billPayAmount, true);
        Model::validateRequired('billSales', $this->billSales, true);
        Model::validateRequired('cycleStartTime', $this->cycleStartTime, true);
        Model::validateRequired('cycleEndTime', $this->cycleEndTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ipOrderId) {
            $res['ip_order_id'] = $this->ipOrderId;
        }
        if (null !== $this->ipBillId) {
            $res['ip_bill_id'] = $this->ipBillId;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->sellerId) {
            $res['seller_id'] = $this->sellerId;
        }
        if (null !== $this->buyerId) {
            $res['buyer_id'] = $this->buyerId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->tradeType) {
            $res['trade_type'] = $this->tradeType;
        }
        if (null !== $this->payUrl) {
            $res['pay_url'] = $this->payUrl;
        }
        if (null !== $this->billPayAmount) {
            $res['bill_pay_amount'] = $this->billPayAmount;
        }
        if (null !== $this->billSales) {
            $res['bill_sales'] = $this->billSales;
        }
        if (null !== $this->cycleStartTime) {
            $res['cycle_start_time'] = $this->cycleStartTime;
        }
        if (null !== $this->cycleEndTime) {
            $res['cycle_end_time'] = $this->cycleEndTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPBill
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip_order_id'])) {
            $model->ipOrderId = $map['ip_order_id'];
        }
        if (isset($map['ip_bill_id'])) {
            $model->ipBillId = $map['ip_bill_id'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['seller_id'])) {
            $model->sellerId = $map['seller_id'];
        }
        if (isset($map['buyer_id'])) {
            $model->buyerId = $map['buyer_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['trade_type'])) {
            $model->tradeType = $map['trade_type'];
        }
        if (isset($map['pay_url'])) {
            $model->payUrl = $map['pay_url'];
        }
        if (isset($map['bill_pay_amount'])) {
            $model->billPayAmount = $map['bill_pay_amount'];
        }
        if (isset($map['bill_sales'])) {
            $model->billSales = $map['bill_sales'];
        }
        if (isset($map['cycle_start_time'])) {
            $model->cycleStartTime = $map['cycle_start_time'];
        }
        if (isset($map['cycle_end_time'])) {
            $model->cycleEndTime = $map['cycle_end_time'];
        }

        return $model;
    }
}
