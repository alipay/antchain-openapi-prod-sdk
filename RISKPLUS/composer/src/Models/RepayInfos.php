<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RepayInfos extends Model
{
    // 期次
    /**
     * @example 1
     *
     * @var int
     */
    public $period;

    // 实还总额
    /**
     * @example 1
     *
     * @var int
     */
    public $amount;

    // 实还本金
    /**
     * @example 1
     *
     * @var int
     */
    public $principal;

    // 实还利息
    /**
     * @example 1
     *
     * @var int
     */
    public $interest;

    // 实还通道手续费
    /**
     * @example 1
     *
     * @var int
     */
    public $channelAmt;

    // 实还手续费
    /**
     * @example 1
     *
     * @var int
     */
    public $fee;

    // 实收罚息
    /**
     * @example 1
     *
     * @var int
     */
    public $punish;

    // 担保费
    /**
     * @example 1
     *
     * @var int
     */
    public $guaranteeFee;

    // 违约金
    /**
     * @example 1
     *
     * @var int
     */
    public $liquidatedDamages;
    protected $_name = [
        'period'            => 'period',
        'amount'            => 'amount',
        'principal'         => 'principal',
        'interest'          => 'interest',
        'channelAmt'        => 'channel_amt',
        'fee'               => 'fee',
        'punish'            => 'punish',
        'guaranteeFee'      => 'guarantee_fee',
        'liquidatedDamages' => 'liquidated_damages',
    ];

    public function validate()
    {
        Model::validateRequired('period', $this->period, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('principal', $this->principal, true);
        Model::validateRequired('interest', $this->interest, true);
        Model::validateRequired('channelAmt', $this->channelAmt, true);
        Model::validateRequired('fee', $this->fee, true);
        Model::validateRequired('punish', $this->punish, true);
        Model::validateRequired('guaranteeFee', $this->guaranteeFee, true);
        Model::validateRequired('liquidatedDamages', $this->liquidatedDamages, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->principal) {
            $res['principal'] = $this->principal;
        }
        if (null !== $this->interest) {
            $res['interest'] = $this->interest;
        }
        if (null !== $this->channelAmt) {
            $res['channel_amt'] = $this->channelAmt;
        }
        if (null !== $this->fee) {
            $res['fee'] = $this->fee;
        }
        if (null !== $this->punish) {
            $res['punish'] = $this->punish;
        }
        if (null !== $this->guaranteeFee) {
            $res['guarantee_fee'] = $this->guaranteeFee;
        }
        if (null !== $this->liquidatedDamages) {
            $res['liquidated_damages'] = $this->liquidatedDamages;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RepayInfos
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['period'])) {
            $model->period = $map['period'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['principal'])) {
            $model->principal = $map['principal'];
        }
        if (isset($map['interest'])) {
            $model->interest = $map['interest'];
        }
        if (isset($map['channel_amt'])) {
            $model->channelAmt = $map['channel_amt'];
        }
        if (isset($map['fee'])) {
            $model->fee = $map['fee'];
        }
        if (isset($map['punish'])) {
            $model->punish = $map['punish'];
        }
        if (isset($map['guarantee_fee'])) {
            $model->guaranteeFee = $map['guarantee_fee'];
        }
        if (isset($map['liquidated_damages'])) {
            $model->liquidatedDamages = $map['liquidated_damages'];
        }

        return $model;
    }
}
