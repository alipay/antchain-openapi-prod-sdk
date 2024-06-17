<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RepayResult extends Model
{
    // 客户编码
    /**
     * @example xxx
     *
     * @var string
     */
    public $customNo;

    // 当前期数
    /**
     * @example 1
     *
     * @var string
     */
    public $period;

    // 应还总额
    /**
     * @example
     *
     * @var int
     */
    public $needAmount;

    // 应还本金
    /**
     * @example
     *
     * @var int
     */
    public $needCorpus;

    // 应还利息
    /**
     * @example
     *
     * @var int
     */
    public $needAccrual;

    // 应还手续费
    /**
     * @example
     *
     * @var int
     */
    public $needFee;

    // 已还总额
    /**
     * @example
     *
     * @var int
     */
    public $alreadyAmount;

    // 已还本金
    /**
     * @example
     *
     * @var int
     */
    public $alreadyCorpus;

    // 已还逾期本金
    /**
     * @example
     *
     * @var int
     */
    public $alreadyOvercorpus;

    // 已还利息
    /**
     * @example
     *
     * @var int
     */
    public $alreadyAccrual;

    // 已还逾期息
    /**
     * @example
     *
     * @var int
     */
    public $alreadyPunish;

    // 已还手续费
    /**
     * @example
     *
     * @var int
     */
    public $alreadyFee;

    // 利率
    /**
     * @example
     *
     * @var int
     */
    public $rate;

    // 罚息率
    /**
     * @example
     *
     * @var int
     */
    public $penaltyValue;

    // 当期剩余总额
    /**
     * @example
     *
     * @var int
     */
    public $restAmount;

    // 当期剩余本金
    /**
     * @example
     *
     * @var int
     */
    public $restCorpus;

    // 当期剩余利息
    /**
     * @example
     *
     * @var int
     */
    public $restAccrual;

    // 当期剩余罚息
    /**
     * @example
     *
     * @var int
     */
    public $restPunish;

    // 期末本金
    /**
     * @example
     *
     * @var int
     */
    public $remainCorpus;

    // 借据编号
    /**
     * @example sss
     *
     * @var string
     */
    public $receiptNo;

    // 还款状态1：已还清 2 未还 3 部分还款
    /**
     * @example 1
     *
     * @var string
     */
    public $status;

    // 应还日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $settleDate;

    // 还款日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $tradeDate;

    // 已还担保费
    /**
     * @example
     *
     * @var int
     */
    public $alreadyGuaranteeFee;

    // 已还违约金
    /**
     * @example
     *
     * @var int
     */
    public $alreadyLiquidatedDamages;

    // 当期剩余担保费
    /**
     * @example
     *
     * @var int
     */
    public $restGuaranteeFee;

    // 当期剩余违约金
    /**
     * @example
     *
     * @var int
     */
    public $restLiquidatedDamages;

    // 应还担保费
    /**
     * @example
     *
     * @var int
     */
    public $needGuaranteeFee;

    // 应还违约金
    /**
     * @example
     *
     * @var int
     */
    public $needLiquidatedDamages;

    // 逾期天数
    /**
     * @example
     *
     * @var int
     */
    public $overdueDays;
    protected $_name = [
        'customNo'                 => 'custom_no',
        'period'                   => 'period',
        'needAmount'               => 'need_amount',
        'needCorpus'               => 'need_corpus',
        'needAccrual'              => 'need_accrual',
        'needFee'                  => 'need_fee',
        'alreadyAmount'            => 'already_amount',
        'alreadyCorpus'            => 'already_corpus',
        'alreadyOvercorpus'        => 'already_overcorpus',
        'alreadyAccrual'           => 'already_accrual',
        'alreadyPunish'            => 'already_punish',
        'alreadyFee'               => 'already_fee',
        'rate'                     => 'rate',
        'penaltyValue'             => 'penalty_value',
        'restAmount'               => 'rest_amount',
        'restCorpus'               => 'rest_corpus',
        'restAccrual'              => 'rest_accrual',
        'restPunish'               => 'rest_punish',
        'remainCorpus'             => 'remain_corpus',
        'receiptNo'                => 'receipt_no',
        'status'                   => 'status',
        'settleDate'               => 'settle_date',
        'tradeDate'                => 'trade_date',
        'alreadyGuaranteeFee'      => 'already_guarantee_fee',
        'alreadyLiquidatedDamages' => 'already_liquidated_damages',
        'restGuaranteeFee'         => 'rest_guarantee_fee',
        'restLiquidatedDamages'    => 'rest_liquidated_damages',
        'needGuaranteeFee'         => 'need_guarantee_fee',
        'needLiquidatedDamages'    => 'need_liquidated_damages',
        'overdueDays'              => 'overdue_days',
    ];

    public function validate()
    {
        Model::validateRequired('customNo', $this->customNo, true);
        Model::validateRequired('period', $this->period, true);
        Model::validateRequired('needAmount', $this->needAmount, true);
        Model::validateRequired('needCorpus', $this->needCorpus, true);
        Model::validateRequired('needAccrual', $this->needAccrual, true);
        Model::validateRequired('needFee', $this->needFee, true);
        Model::validateRequired('alreadyAmount', $this->alreadyAmount, true);
        Model::validateRequired('alreadyCorpus', $this->alreadyCorpus, true);
        Model::validateRequired('alreadyOvercorpus', $this->alreadyOvercorpus, true);
        Model::validateRequired('alreadyAccrual', $this->alreadyAccrual, true);
        Model::validateRequired('alreadyPunish', $this->alreadyPunish, true);
        Model::validateRequired('alreadyFee', $this->alreadyFee, true);
        Model::validateRequired('rate', $this->rate, true);
        Model::validateRequired('penaltyValue', $this->penaltyValue, true);
        Model::validateRequired('restAmount', $this->restAmount, true);
        Model::validateRequired('restCorpus', $this->restCorpus, true);
        Model::validateRequired('restAccrual', $this->restAccrual, true);
        Model::validateRequired('restPunish', $this->restPunish, true);
        Model::validateRequired('remainCorpus', $this->remainCorpus, true);
        Model::validateRequired('receiptNo', $this->receiptNo, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('settleDate', $this->settleDate, true);
        Model::validateRequired('tradeDate', $this->tradeDate, true);
        Model::validateRequired('alreadyGuaranteeFee', $this->alreadyGuaranteeFee, true);
        Model::validateRequired('alreadyLiquidatedDamages', $this->alreadyLiquidatedDamages, true);
        Model::validateRequired('restGuaranteeFee', $this->restGuaranteeFee, true);
        Model::validateRequired('restLiquidatedDamages', $this->restLiquidatedDamages, true);
        Model::validateRequired('needGuaranteeFee', $this->needGuaranteeFee, true);
        Model::validateRequired('needLiquidatedDamages', $this->needLiquidatedDamages, true);
        Model::validateRequired('overdueDays', $this->overdueDays, true);
        Model::validatePattern('settleDate', $this->settleDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('tradeDate', $this->tradeDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->customNo) {
            $res['custom_no'] = $this->customNo;
        }
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->needAmount) {
            $res['need_amount'] = $this->needAmount;
        }
        if (null !== $this->needCorpus) {
            $res['need_corpus'] = $this->needCorpus;
        }
        if (null !== $this->needAccrual) {
            $res['need_accrual'] = $this->needAccrual;
        }
        if (null !== $this->needFee) {
            $res['need_fee'] = $this->needFee;
        }
        if (null !== $this->alreadyAmount) {
            $res['already_amount'] = $this->alreadyAmount;
        }
        if (null !== $this->alreadyCorpus) {
            $res['already_corpus'] = $this->alreadyCorpus;
        }
        if (null !== $this->alreadyOvercorpus) {
            $res['already_overcorpus'] = $this->alreadyOvercorpus;
        }
        if (null !== $this->alreadyAccrual) {
            $res['already_accrual'] = $this->alreadyAccrual;
        }
        if (null !== $this->alreadyPunish) {
            $res['already_punish'] = $this->alreadyPunish;
        }
        if (null !== $this->alreadyFee) {
            $res['already_fee'] = $this->alreadyFee;
        }
        if (null !== $this->rate) {
            $res['rate'] = $this->rate;
        }
        if (null !== $this->penaltyValue) {
            $res['penalty_value'] = $this->penaltyValue;
        }
        if (null !== $this->restAmount) {
            $res['rest_amount'] = $this->restAmount;
        }
        if (null !== $this->restCorpus) {
            $res['rest_corpus'] = $this->restCorpus;
        }
        if (null !== $this->restAccrual) {
            $res['rest_accrual'] = $this->restAccrual;
        }
        if (null !== $this->restPunish) {
            $res['rest_punish'] = $this->restPunish;
        }
        if (null !== $this->remainCorpus) {
            $res['remain_corpus'] = $this->remainCorpus;
        }
        if (null !== $this->receiptNo) {
            $res['receipt_no'] = $this->receiptNo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->settleDate) {
            $res['settle_date'] = $this->settleDate;
        }
        if (null !== $this->tradeDate) {
            $res['trade_date'] = $this->tradeDate;
        }
        if (null !== $this->alreadyGuaranteeFee) {
            $res['already_guarantee_fee'] = $this->alreadyGuaranteeFee;
        }
        if (null !== $this->alreadyLiquidatedDamages) {
            $res['already_liquidated_damages'] = $this->alreadyLiquidatedDamages;
        }
        if (null !== $this->restGuaranteeFee) {
            $res['rest_guarantee_fee'] = $this->restGuaranteeFee;
        }
        if (null !== $this->restLiquidatedDamages) {
            $res['rest_liquidated_damages'] = $this->restLiquidatedDamages;
        }
        if (null !== $this->needGuaranteeFee) {
            $res['need_guarantee_fee'] = $this->needGuaranteeFee;
        }
        if (null !== $this->needLiquidatedDamages) {
            $res['need_liquidated_damages'] = $this->needLiquidatedDamages;
        }
        if (null !== $this->overdueDays) {
            $res['overdue_days'] = $this->overdueDays;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RepayResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['custom_no'])) {
            $model->customNo = $map['custom_no'];
        }
        if (isset($map['period'])) {
            $model->period = $map['period'];
        }
        if (isset($map['need_amount'])) {
            $model->needAmount = $map['need_amount'];
        }
        if (isset($map['need_corpus'])) {
            $model->needCorpus = $map['need_corpus'];
        }
        if (isset($map['need_accrual'])) {
            $model->needAccrual = $map['need_accrual'];
        }
        if (isset($map['need_fee'])) {
            $model->needFee = $map['need_fee'];
        }
        if (isset($map['already_amount'])) {
            $model->alreadyAmount = $map['already_amount'];
        }
        if (isset($map['already_corpus'])) {
            $model->alreadyCorpus = $map['already_corpus'];
        }
        if (isset($map['already_overcorpus'])) {
            $model->alreadyOvercorpus = $map['already_overcorpus'];
        }
        if (isset($map['already_accrual'])) {
            $model->alreadyAccrual = $map['already_accrual'];
        }
        if (isset($map['already_punish'])) {
            $model->alreadyPunish = $map['already_punish'];
        }
        if (isset($map['already_fee'])) {
            $model->alreadyFee = $map['already_fee'];
        }
        if (isset($map['rate'])) {
            $model->rate = $map['rate'];
        }
        if (isset($map['penalty_value'])) {
            $model->penaltyValue = $map['penalty_value'];
        }
        if (isset($map['rest_amount'])) {
            $model->restAmount = $map['rest_amount'];
        }
        if (isset($map['rest_corpus'])) {
            $model->restCorpus = $map['rest_corpus'];
        }
        if (isset($map['rest_accrual'])) {
            $model->restAccrual = $map['rest_accrual'];
        }
        if (isset($map['rest_punish'])) {
            $model->restPunish = $map['rest_punish'];
        }
        if (isset($map['remain_corpus'])) {
            $model->remainCorpus = $map['remain_corpus'];
        }
        if (isset($map['receipt_no'])) {
            $model->receiptNo = $map['receipt_no'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['settle_date'])) {
            $model->settleDate = $map['settle_date'];
        }
        if (isset($map['trade_date'])) {
            $model->tradeDate = $map['trade_date'];
        }
        if (isset($map['already_guarantee_fee'])) {
            $model->alreadyGuaranteeFee = $map['already_guarantee_fee'];
        }
        if (isset($map['already_liquidated_damages'])) {
            $model->alreadyLiquidatedDamages = $map['already_liquidated_damages'];
        }
        if (isset($map['rest_guarantee_fee'])) {
            $model->restGuaranteeFee = $map['rest_guarantee_fee'];
        }
        if (isset($map['rest_liquidated_damages'])) {
            $model->restLiquidatedDamages = $map['rest_liquidated_damages'];
        }
        if (isset($map['need_guarantee_fee'])) {
            $model->needGuaranteeFee = $map['need_guarantee_fee'];
        }
        if (isset($map['need_liquidated_damages'])) {
            $model->needLiquidatedDamages = $map['need_liquidated_damages'];
        }
        if (isset($map['overdue_days'])) {
            $model->overdueDays = $map['overdue_days'];
        }

        return $model;
    }
}
