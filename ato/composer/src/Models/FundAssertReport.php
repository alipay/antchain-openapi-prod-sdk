<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class FundAssertReport extends Model
{
    // 投放月份 (整月)
    /**
     * @example 2024-12
     *
     * @var string
     */
    public $deliveryMonth;

    // 账单金额
    /**
     * @example 1000（单位分）
     *
     * @var int
     */
    public $totalBillAmount;

    // 平均期限
    /**
     * @example 12
     *
     * @var string
     */
    public $averageTerm;

    // 状态为取消的账单金额
    /**
     * @example 1000（单位分）
     *
     * @var int
     */
    public $cancelledBillAmount;

    // 状态为逾期1天及以上的账单金额
    /**
     * @example 1000（单位分）
     *
     * @var int
     */
    public $billAmountOverdueBy1dayOrMore;

    // 状态为逾期30天及以上的账单金额
    /**
     * @example 1000（单位分）
     *
     * @var int
     */
    public $billAmountOverdueBy30DaysOrMore;

    // Y期的订单的账单金额
    /**
     * @example 1000（单位分）
     *
     * @var int
     */
    public $totalBillAmountYPeriod;

    // 已到Y期订单中Y期平均期限(y期订单的平均期限)
    /**
     * @example 12
     *
     * @var string
     */
    public $averageTermYPeriod;

    // Y期的订单中状态为取消的账单金额
    /**
     * @example 1000（单位分）
     *
     * @var int
     */
    public $cancelledBillAmountYPeriod;

    // Y期的订单中状态为逾期1天及以上的账单金额
    /**
     * @example 1000（单位分）
     *
     * @var int
     */
    public $billAmountOverdueBy1dayOrMoreYPeriod;

    // Y期的订单中状态为逾期30天及以上的账单金额
    /**
     * @example 1000（单位分）
     *
     * @var int
     */
    public $billAmountOverdueBy30DaysOrMoreYPeriod;
    protected $_name = [
        'deliveryMonth'                          => 'delivery_month',
        'totalBillAmount'                        => 'total_bill_amount',
        'averageTerm'                            => 'average_term',
        'cancelledBillAmount'                    => 'cancelled_bill_amount',
        'billAmountOverdueBy1dayOrMore'          => 'bill_amount_overdue_by_1day_or_more',
        'billAmountOverdueBy30DaysOrMore'        => 'bill_amount_overdue_by_30_days_or_more',
        'totalBillAmountYPeriod'                 => 'total_bill_amount_y_period',
        'averageTermYPeriod'                     => 'average_term_y_period',
        'cancelledBillAmountYPeriod'             => 'cancelled_bill_amount_y_period',
        'billAmountOverdueBy1dayOrMoreYPeriod'   => 'bill_amount_overdue_by_1day_or_more_y_period',
        'billAmountOverdueBy30DaysOrMoreYPeriod' => 'bill_amount_overdue_by_30_days_or_more_y_period',
    ];

    public function validate()
    {
        Model::validateRequired('deliveryMonth', $this->deliveryMonth, true);
        Model::validateRequired('totalBillAmount', $this->totalBillAmount, true);
        Model::validateRequired('averageTerm', $this->averageTerm, true);
        Model::validateRequired('cancelledBillAmount', $this->cancelledBillAmount, true);
        Model::validateRequired('billAmountOverdueBy1dayOrMore', $this->billAmountOverdueBy1dayOrMore, true);
        Model::validateRequired('billAmountOverdueBy30DaysOrMore', $this->billAmountOverdueBy30DaysOrMore, true);
        Model::validateRequired('totalBillAmountYPeriod', $this->totalBillAmountYPeriod, true);
        Model::validateRequired('averageTermYPeriod', $this->averageTermYPeriod, true);
        Model::validateRequired('cancelledBillAmountYPeriod', $this->cancelledBillAmountYPeriod, true);
        Model::validateRequired('billAmountOverdueBy1dayOrMoreYPeriod', $this->billAmountOverdueBy1dayOrMoreYPeriod, true);
        Model::validateRequired('billAmountOverdueBy30DaysOrMoreYPeriod', $this->billAmountOverdueBy30DaysOrMoreYPeriod, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deliveryMonth) {
            $res['delivery_month'] = $this->deliveryMonth;
        }
        if (null !== $this->totalBillAmount) {
            $res['total_bill_amount'] = $this->totalBillAmount;
        }
        if (null !== $this->averageTerm) {
            $res['average_term'] = $this->averageTerm;
        }
        if (null !== $this->cancelledBillAmount) {
            $res['cancelled_bill_amount'] = $this->cancelledBillAmount;
        }
        if (null !== $this->billAmountOverdueBy1dayOrMore) {
            $res['bill_amount_overdue_by_1day_or_more'] = $this->billAmountOverdueBy1dayOrMore;
        }
        if (null !== $this->billAmountOverdueBy30DaysOrMore) {
            $res['bill_amount_overdue_by_30_days_or_more'] = $this->billAmountOverdueBy30DaysOrMore;
        }
        if (null !== $this->totalBillAmountYPeriod) {
            $res['total_bill_amount_y_period'] = $this->totalBillAmountYPeriod;
        }
        if (null !== $this->averageTermYPeriod) {
            $res['average_term_y_period'] = $this->averageTermYPeriod;
        }
        if (null !== $this->cancelledBillAmountYPeriod) {
            $res['cancelled_bill_amount_y_period'] = $this->cancelledBillAmountYPeriod;
        }
        if (null !== $this->billAmountOverdueBy1dayOrMoreYPeriod) {
            $res['bill_amount_overdue_by_1day_or_more_y_period'] = $this->billAmountOverdueBy1dayOrMoreYPeriod;
        }
        if (null !== $this->billAmountOverdueBy30DaysOrMoreYPeriod) {
            $res['bill_amount_overdue_by_30_days_or_more_y_period'] = $this->billAmountOverdueBy30DaysOrMoreYPeriod;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FundAssertReport
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['delivery_month'])) {
            $model->deliveryMonth = $map['delivery_month'];
        }
        if (isset($map['total_bill_amount'])) {
            $model->totalBillAmount = $map['total_bill_amount'];
        }
        if (isset($map['average_term'])) {
            $model->averageTerm = $map['average_term'];
        }
        if (isset($map['cancelled_bill_amount'])) {
            $model->cancelledBillAmount = $map['cancelled_bill_amount'];
        }
        if (isset($map['bill_amount_overdue_by_1day_or_more'])) {
            $model->billAmountOverdueBy1dayOrMore = $map['bill_amount_overdue_by_1day_or_more'];
        }
        if (isset($map['bill_amount_overdue_by_30_days_or_more'])) {
            $model->billAmountOverdueBy30DaysOrMore = $map['bill_amount_overdue_by_30_days_or_more'];
        }
        if (isset($map['total_bill_amount_y_period'])) {
            $model->totalBillAmountYPeriod = $map['total_bill_amount_y_period'];
        }
        if (isset($map['average_term_y_period'])) {
            $model->averageTermYPeriod = $map['average_term_y_period'];
        }
        if (isset($map['cancelled_bill_amount_y_period'])) {
            $model->cancelledBillAmountYPeriod = $map['cancelled_bill_amount_y_period'];
        }
        if (isset($map['bill_amount_overdue_by_1day_or_more_y_period'])) {
            $model->billAmountOverdueBy1dayOrMoreYPeriod = $map['bill_amount_overdue_by_1day_or_more_y_period'];
        }
        if (isset($map['bill_amount_overdue_by_30_days_or_more_y_period'])) {
            $model->billAmountOverdueBy30DaysOrMoreYPeriod = $map['bill_amount_overdue_by_30_days_or_more_y_period'];
        }

        return $model;
    }
}
