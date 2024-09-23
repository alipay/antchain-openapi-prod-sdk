<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RepayTrail extends Model
{
    // 期数
    /**
     * @example 1
     *
     * @var string
     */
    public $period;

    // 每期应还金额
    /**
     * @example
     *
     * @var int
     */
    public $needAmt;

    // 每期已还金额
    /**
     * @example
     *
     * @var int
     */
    public $alreadyAmt;

    // 每期应还本金
    /**
     * @example
     *
     * @var int
     */
    public $transPrincipal;

    // 每期应还利息
    /**
     * @example
     *
     * @var int
     */
    public $transInterest;

    // 每期还款费用
    /**
     * @example
     *
     * @var int
     */
    public $transFee;

    // 剩余本金
    /**
     * @example
     *
     * @var int
     */
    public $remainPrincipal;

    // 还款时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $repayTime;

    // 计息开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startTime;

    // 计息结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $endTime;

    // 试算编号
    /**
     * @example ss
     *
     * @var string
     */
    public $trialNo;

    // 优惠后应还金额
    /**
     * @example
     *
     * @var int
     */
    public $discountAfterNeedAmt;

    // 优惠后应还利息
    /**
     * @example
     *
     * @var int
     */
    public $discountAfterInterest;

    // 优惠利息
    /**
     * @example
     *
     * @var int
     */
    public $discountInterest;
    protected $_name = [
        'period'                => 'period',
        'needAmt'               => 'need_amt',
        'alreadyAmt'            => 'already_amt',
        'transPrincipal'        => 'trans_principal',
        'transInterest'         => 'trans_interest',
        'transFee'              => 'trans_fee',
        'remainPrincipal'       => 'remain_principal',
        'repayTime'             => 'repay_time',
        'startTime'             => 'start_time',
        'endTime'               => 'end_time',
        'trialNo'               => 'trial_no',
        'discountAfterNeedAmt'  => 'discount_after_need_amt',
        'discountAfterInterest' => 'discount_after_interest',
        'discountInterest'      => 'discount_interest',
    ];

    public function validate()
    {
        Model::validateRequired('period', $this->period, true);
        Model::validateRequired('needAmt', $this->needAmt, true);
        Model::validateRequired('alreadyAmt', $this->alreadyAmt, true);
        Model::validateRequired('transPrincipal', $this->transPrincipal, true);
        Model::validateRequired('transInterest', $this->transInterest, true);
        Model::validateRequired('transFee', $this->transFee, true);
        Model::validateRequired('remainPrincipal', $this->remainPrincipal, true);
        Model::validateRequired('repayTime', $this->repayTime, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('trialNo', $this->trialNo, true);
        Model::validatePattern('repayTime', $this->repayTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->needAmt) {
            $res['need_amt'] = $this->needAmt;
        }
        if (null !== $this->alreadyAmt) {
            $res['already_amt'] = $this->alreadyAmt;
        }
        if (null !== $this->transPrincipal) {
            $res['trans_principal'] = $this->transPrincipal;
        }
        if (null !== $this->transInterest) {
            $res['trans_interest'] = $this->transInterest;
        }
        if (null !== $this->transFee) {
            $res['trans_fee'] = $this->transFee;
        }
        if (null !== $this->remainPrincipal) {
            $res['remain_principal'] = $this->remainPrincipal;
        }
        if (null !== $this->repayTime) {
            $res['repay_time'] = $this->repayTime;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->trialNo) {
            $res['trial_no'] = $this->trialNo;
        }
        if (null !== $this->discountAfterNeedAmt) {
            $res['discount_after_need_amt'] = $this->discountAfterNeedAmt;
        }
        if (null !== $this->discountAfterInterest) {
            $res['discount_after_interest'] = $this->discountAfterInterest;
        }
        if (null !== $this->discountInterest) {
            $res['discount_interest'] = $this->discountInterest;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RepayTrail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['period'])) {
            $model->period = $map['period'];
        }
        if (isset($map['need_amt'])) {
            $model->needAmt = $map['need_amt'];
        }
        if (isset($map['already_amt'])) {
            $model->alreadyAmt = $map['already_amt'];
        }
        if (isset($map['trans_principal'])) {
            $model->transPrincipal = $map['trans_principal'];
        }
        if (isset($map['trans_interest'])) {
            $model->transInterest = $map['trans_interest'];
        }
        if (isset($map['trans_fee'])) {
            $model->transFee = $map['trans_fee'];
        }
        if (isset($map['remain_principal'])) {
            $model->remainPrincipal = $map['remain_principal'];
        }
        if (isset($map['repay_time'])) {
            $model->repayTime = $map['repay_time'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['trial_no'])) {
            $model->trialNo = $map['trial_no'];
        }
        if (isset($map['discount_after_need_amt'])) {
            $model->discountAfterNeedAmt = $map['discount_after_need_amt'];
        }
        if (isset($map['discount_after_interest'])) {
            $model->discountAfterInterest = $map['discount_after_interest'];
        }
        if (isset($map['discount_interest'])) {
            $model->discountInterest = $map['discount_interest'];
        }

        return $model;
    }
}
