<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RepayInfo extends Model
{
    // true：逾期
    // false：未逾期
    /**
     * @example true, false
     *
     * @var bool
     */
    public $overdueFlag;

    // 逾期天数
    /**
     * @example
     *
     * @var int
     */
    public $overDays;

    // 逾期金额在50元以上的客户的逾期天数
    /**
     * @example
     *
     * @var int
     */
    public $valuableOverDays;

    // 逾期期数
    /**
     * @example
     *
     * @var int
     */
    public $overPeriodCount;

    // 逾期本金
    /**
     * @example
     *
     * @var int
     */
    public $overPrincipal;

    // 逾期利息
    /**
     * @example
     *
     * @var int
     */
    public $overInterest;

    // 应还罚息
    /**
     * @example
     *
     * @var int
     */
    public $overPunish;

    // 应还逾期总额
    /**
     * @example
     *
     * @var int
     */
    public $needOverdueAmount;

    // 当前应还总额（包含逾期和当前期）
    /**
     * @example
     *
     * @var int
     */
    public $currentNeedAmount;

    // 总剩余应还
    /**
     * @example
     *
     * @var int
     */
    public $totalAmount;
    protected $_name = [
        'overdueFlag'       => 'overdue_flag',
        'overDays'          => 'over_days',
        'valuableOverDays'  => 'valuable_over_days',
        'overPeriodCount'   => 'over_period_count',
        'overPrincipal'     => 'over_principal',
        'overInterest'      => 'over_interest',
        'overPunish'        => 'over_punish',
        'needOverdueAmount' => 'need_overdue_amount',
        'currentNeedAmount' => 'current_need_amount',
        'totalAmount'       => 'total_amount',
    ];

    public function validate()
    {
        Model::validateRequired('overdueFlag', $this->overdueFlag, true);
        Model::validateRequired('overDays', $this->overDays, true);
        Model::validateRequired('valuableOverDays', $this->valuableOverDays, true);
        Model::validateRequired('overPeriodCount', $this->overPeriodCount, true);
        Model::validateRequired('overPrincipal', $this->overPrincipal, true);
        Model::validateRequired('overInterest', $this->overInterest, true);
        Model::validateRequired('overPunish', $this->overPunish, true);
        Model::validateRequired('needOverdueAmount', $this->needOverdueAmount, true);
        Model::validateRequired('currentNeedAmount', $this->currentNeedAmount, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->overdueFlag) {
            $res['overdue_flag'] = $this->overdueFlag;
        }
        if (null !== $this->overDays) {
            $res['over_days'] = $this->overDays;
        }
        if (null !== $this->valuableOverDays) {
            $res['valuable_over_days'] = $this->valuableOverDays;
        }
        if (null !== $this->overPeriodCount) {
            $res['over_period_count'] = $this->overPeriodCount;
        }
        if (null !== $this->overPrincipal) {
            $res['over_principal'] = $this->overPrincipal;
        }
        if (null !== $this->overInterest) {
            $res['over_interest'] = $this->overInterest;
        }
        if (null !== $this->overPunish) {
            $res['over_punish'] = $this->overPunish;
        }
        if (null !== $this->needOverdueAmount) {
            $res['need_overdue_amount'] = $this->needOverdueAmount;
        }
        if (null !== $this->currentNeedAmount) {
            $res['current_need_amount'] = $this->currentNeedAmount;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RepayInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['overdue_flag'])) {
            $model->overdueFlag = $map['overdue_flag'];
        }
        if (isset($map['over_days'])) {
            $model->overDays = $map['over_days'];
        }
        if (isset($map['valuable_over_days'])) {
            $model->valuableOverDays = $map['valuable_over_days'];
        }
        if (isset($map['over_period_count'])) {
            $model->overPeriodCount = $map['over_period_count'];
        }
        if (isset($map['over_principal'])) {
            $model->overPrincipal = $map['over_principal'];
        }
        if (isset($map['over_interest'])) {
            $model->overInterest = $map['over_interest'];
        }
        if (isset($map['over_punish'])) {
            $model->overPunish = $map['over_punish'];
        }
        if (isset($map['need_overdue_amount'])) {
            $model->needOverdueAmount = $map['need_overdue_amount'];
        }
        if (isset($map['current_need_amount'])) {
            $model->currentNeedAmount = $map['current_need_amount'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }

        return $model;
    }
}
