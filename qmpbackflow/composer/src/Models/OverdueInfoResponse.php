<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class OverdueInfoResponse extends Model
{
    // 逾期标识
    // true：逾期
    // false：未逾期
    /**
     * @example true
     *
     * @var bool
     */
    public $overDueFlag;

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

    // 当前应还总额
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

    // 数据日期
    /**
     * @example
     *
     * @var string
     */
    public $settleDate;

    // 借款唯一编号
    /**
     * @example R2022xxxxxx
     *
     * @var string
     */
    public $receiptNo;

    // 已还期数
    /**
     * @example
     *
     * @var int
     */
    public $alreadyRepayPeriodCount;

    // 贷款期数
    /**
     * @example
     *
     * @var int
     */
    public $loanPeriodCount;

    // 未还本金
    /**
     * @example
     *
     * @var int
     */
    public $outstandingPrincipal;

    // 放款日期
    /**
     * @example
     *
     * @var string
     */
    public $loanTime;

    // 结清标志
    /**
     * @example true, false
     *
     * @var bool
     */
    public $settleFlag;

    // 最近一次还款日期
    /**
     * @example
     *
     * @var string
     */
    public $nearestRepayTime;
    protected $_name = [
        'overDueFlag'             => 'over_due_flag',
        'overDays'                => 'over_days',
        'valuableOverDays'        => 'valuable_over_days',
        'overPeriodCount'         => 'over_period_count',
        'overPrincipal'           => 'over_principal',
        'overInterest'            => 'over_interest',
        'overPunish'              => 'over_punish',
        'needOverdueAmount'       => 'need_overdue_amount',
        'currentNeedAmount'       => 'current_need_amount',
        'totalAmount'             => 'total_amount',
        'settleDate'              => 'settle_date',
        'receiptNo'               => 'receipt_no',
        'alreadyRepayPeriodCount' => 'already_repay_period_count',
        'loanPeriodCount'         => 'loan_period_count',
        'outstandingPrincipal'    => 'outstanding_principal',
        'loanTime'                => 'loan_time',
        'settleFlag'              => 'settle_flag',
        'nearestRepayTime'        => 'nearest_repay_time',
    ];

    public function validate()
    {
        Model::validateRequired('overDueFlag', $this->overDueFlag, true);
        Model::validateRequired('overDays', $this->overDays, true);
        Model::validateRequired('valuableOverDays', $this->valuableOverDays, true);
        Model::validateRequired('overPeriodCount', $this->overPeriodCount, true);
        Model::validateRequired('overPrincipal', $this->overPrincipal, true);
        Model::validateRequired('overInterest', $this->overInterest, true);
        Model::validateRequired('overPunish', $this->overPunish, true);
        Model::validateRequired('needOverdueAmount', $this->needOverdueAmount, true);
        Model::validateRequired('currentNeedAmount', $this->currentNeedAmount, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('settleDate', $this->settleDate, true);
        Model::validateRequired('receiptNo', $this->receiptNo, true);
        Model::validateRequired('alreadyRepayPeriodCount', $this->alreadyRepayPeriodCount, true);
        Model::validateRequired('loanPeriodCount', $this->loanPeriodCount, true);
        Model::validateRequired('outstandingPrincipal', $this->outstandingPrincipal, true);
        Model::validateRequired('loanTime', $this->loanTime, true);
        Model::validateRequired('settleFlag', $this->settleFlag, true);
        Model::validateRequired('nearestRepayTime', $this->nearestRepayTime, true);
        Model::validatePattern('settleDate', $this->settleDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('loanTime', $this->loanTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('nearestRepayTime', $this->nearestRepayTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->overDueFlag) {
            $res['over_due_flag'] = $this->overDueFlag;
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
        if (null !== $this->settleDate) {
            $res['settle_date'] = $this->settleDate;
        }
        if (null !== $this->receiptNo) {
            $res['receipt_no'] = $this->receiptNo;
        }
        if (null !== $this->alreadyRepayPeriodCount) {
            $res['already_repay_period_count'] = $this->alreadyRepayPeriodCount;
        }
        if (null !== $this->loanPeriodCount) {
            $res['loan_period_count'] = $this->loanPeriodCount;
        }
        if (null !== $this->outstandingPrincipal) {
            $res['outstanding_principal'] = $this->outstandingPrincipal;
        }
        if (null !== $this->loanTime) {
            $res['loan_time'] = $this->loanTime;
        }
        if (null !== $this->settleFlag) {
            $res['settle_flag'] = $this->settleFlag;
        }
        if (null !== $this->nearestRepayTime) {
            $res['nearest_repay_time'] = $this->nearestRepayTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OverdueInfoResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['over_due_flag'])) {
            $model->overDueFlag = $map['over_due_flag'];
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
        if (isset($map['settle_date'])) {
            $model->settleDate = $map['settle_date'];
        }
        if (isset($map['receipt_no'])) {
            $model->receiptNo = $map['receipt_no'];
        }
        if (isset($map['already_repay_period_count'])) {
            $model->alreadyRepayPeriodCount = $map['already_repay_period_count'];
        }
        if (isset($map['loan_period_count'])) {
            $model->loanPeriodCount = $map['loan_period_count'];
        }
        if (isset($map['outstanding_principal'])) {
            $model->outstandingPrincipal = $map['outstanding_principal'];
        }
        if (isset($map['loan_time'])) {
            $model->loanTime = $map['loan_time'];
        }
        if (isset($map['settle_flag'])) {
            $model->settleFlag = $map['settle_flag'];
        }
        if (isset($map['nearest_repay_time'])) {
            $model->nearestRepayTime = $map['nearest_repay_time'];
        }

        return $model;
    }
}
