<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class Order extends Model
{
    // 实付金额，单位分
    /**
     * @example 10000
     *
     * @var int
     */
    public $actualTotalAmount;

    // 币种，目前仅支持 CNY
    /**
     * @example CNY
     *
     * @var string
     */
    public $currency;

    // 数量
    /**
     * @example 1
     *
     * @var int
     */
    public $itemCount;

    // 唯一订单号
    /**
     * @example 1234567890
     *
     * @var string
     */
    public $orderNo;

    // 订单状态，ORDER_CREATE：订单创建，ORDER_CANCEL：订单取消
    /**
     * @example ORDER_CREATE | ORDER_CANCEL
     *
     * @var string
     */
    public $orderStatus;

    // 原始金额，单位分
    /**
     * @example 10000
     *
     * @var int
     */
    public $originalTotalAmount;

    // 确认类型，DIRECT：直接发放，TWO_STEP：两部发放。该字段可为空，默认为 TWO_STEP
    /**
     * @example DIRECT | TWO_STEP
     *
     * @var string
     */
    public $confirmType;
    protected $_name = [
        'actualTotalAmount'   => 'actual_total_amount',
        'currency'            => 'currency',
        'itemCount'           => 'item_count',
        'orderNo'             => 'order_no',
        'orderStatus'         => 'order_status',
        'originalTotalAmount' => 'original_total_amount',
        'confirmType'         => 'confirm_type',
    ];

    public function validate()
    {
        Model::validateRequired('actualTotalAmount', $this->actualTotalAmount, true);
        Model::validateRequired('itemCount', $this->itemCount, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('orderStatus', $this->orderStatus, true);
        Model::validateRequired('originalTotalAmount', $this->originalTotalAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actualTotalAmount) {
            $res['actual_total_amount'] = $this->actualTotalAmount;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->itemCount) {
            $res['item_count'] = $this->itemCount;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->originalTotalAmount) {
            $res['original_total_amount'] = $this->originalTotalAmount;
        }
        if (null !== $this->confirmType) {
            $res['confirm_type'] = $this->confirmType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Order
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['actual_total_amount'])) {
            $model->actualTotalAmount = $map['actual_total_amount'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['item_count'])) {
            $model->itemCount = $map['item_count'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['original_total_amount'])) {
            $model->originalTotalAmount = $map['original_total_amount'];
        }
        if (isset($map['confirm_type'])) {
            $model->confirmType = $map['confirm_type'];
        }

        return $model;
    }
}
