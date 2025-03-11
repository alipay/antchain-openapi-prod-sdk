<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class AssetPackageOrderInfo extends Model
{
    // 订单id
    /**
     * @example 123
     *
     * @var string
     */
    public $orderId;

    // 订单状态
    /**
     * @example 123
     *
     * @var string
     */
    public $status;

    // 出包原因
    /**
     * @example 123
     *
     * @var string
     */
    public $outReason;

    // 订单用信额度
    /**
     * @example 123
     *
     * @var int
     */
    public $orderCreditLine;

    // 商户应还款金额
    /**
     * @example 123
     *
     * @var int
     */
    public $orderMerchantRepaymentMoney;

    // 订单分账起始账期
    /**
     * @example 123
     *
     * @var int
     */
    public $divideStartTermIndex;
    protected $_name = [
        'orderId'                     => 'order_id',
        'status'                      => 'status',
        'outReason'                   => 'out_reason',
        'orderCreditLine'             => 'order_credit_line',
        'orderMerchantRepaymentMoney' => 'order_merchant_repayment_money',
        'divideStartTermIndex'        => 'divide_start_term_index',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->outReason) {
            $res['out_reason'] = $this->outReason;
        }
        if (null !== $this->orderCreditLine) {
            $res['order_credit_line'] = $this->orderCreditLine;
        }
        if (null !== $this->orderMerchantRepaymentMoney) {
            $res['order_merchant_repayment_money'] = $this->orderMerchantRepaymentMoney;
        }
        if (null !== $this->divideStartTermIndex) {
            $res['divide_start_term_index'] = $this->divideStartTermIndex;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AssetPackageOrderInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['out_reason'])) {
            $model->outReason = $map['out_reason'];
        }
        if (isset($map['order_credit_line'])) {
            $model->orderCreditLine = $map['order_credit_line'];
        }
        if (isset($map['order_merchant_repayment_money'])) {
            $model->orderMerchantRepaymentMoney = $map['order_merchant_repayment_money'];
        }
        if (isset($map['divide_start_term_index'])) {
            $model->divideStartTermIndex = $map['divide_start_term_index'];
        }

        return $model;
    }
}
