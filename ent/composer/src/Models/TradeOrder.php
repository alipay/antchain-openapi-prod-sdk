<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class TradeOrder extends Model
{
    // 订单唯一编号
    /**
     * @example f0aa07eb022d0504ba33d0d1bb99e0afee30d810393dcacc022aa220
     *
     * @var string
     */
    public $orderNo;

    // 订单原始金额，单位分
    /**
     * @example 100
     *
     * @var int
     */
    public $originalTotalAmount;

    // 订单实付金额，单位分
    /**
     * @example 90
     *
     * @var int
     */
    public $actualTotalAmount;

    // 数量
    /**
     * @example 2
     *
     * @var int
     */
    public $itemCount;

    // 币种，暂时只支持人民币 CNY
    /**
     * @example CNY
     *
     * @var string
     */
    public $currency;
    protected $_name = [
        'orderNo'             => 'order_no',
        'originalTotalAmount' => 'original_total_amount',
        'actualTotalAmount'   => 'actual_total_amount',
        'itemCount'           => 'item_count',
        'currency'            => 'currency',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('originalTotalAmount', $this->originalTotalAmount, true);
        Model::validateRequired('actualTotalAmount', $this->actualTotalAmount, true);
        Model::validateRequired('itemCount', $this->itemCount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->originalTotalAmount) {
            $res['original_total_amount'] = $this->originalTotalAmount;
        }
        if (null !== $this->actualTotalAmount) {
            $res['actual_total_amount'] = $this->actualTotalAmount;
        }
        if (null !== $this->itemCount) {
            $res['item_count'] = $this->itemCount;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TradeOrder
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['original_total_amount'])) {
            $model->originalTotalAmount = $map['original_total_amount'];
        }
        if (isset($map['actual_total_amount'])) {
            $model->actualTotalAmount = $map['actual_total_amount'];
        }
        if (isset($map['item_count'])) {
            $model->itemCount = $map['item_count'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }

        return $model;
    }
}
