<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class CreditUtilizationOrder extends Model
{
    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $orderId;

    // 订单用信额度，单位为分
    /**
     * @example 100
     *
     * @var int
     */
    public $orderCreditLine;

    // 订单商户应还金额，单位为分
    /**
     * @example 100
     *
     * @var int
     */
    public $orderMerchantRepaymentMoney;

    // 分账起始日期
    /**
     * @example 1
     *
     * @var int
     */
    public $divideStartTermIndex;
    protected $_name = [
        'orderId'                     => 'order_id',
        'orderCreditLine'             => 'order_credit_line',
        'orderMerchantRepaymentMoney' => 'order_merchant_repayment_money',
        'divideStartTermIndex'        => 'divide_start_term_index',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('orderCreditLine', $this->orderCreditLine, true);
        Model::validateRequired('orderMerchantRepaymentMoney', $this->orderMerchantRepaymentMoney, true);
        Model::validateRequired('divideStartTermIndex', $this->divideStartTermIndex, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMinLength('orderId', $this->orderId, 6);
        Model::validateMinimum('orderCreditLine', $this->orderCreditLine, 1);
        Model::validateMinimum('orderMerchantRepaymentMoney', $this->orderMerchantRepaymentMoney, 1);
        Model::validateMinimum('divideStartTermIndex', $this->divideStartTermIndex, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
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
     * @return CreditUtilizationOrder
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
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
