<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclPromiseDetailInfo extends Model
{
    // 承诺期数
    /**
     * @example 1
     *
     * @var int
     */
    public $period;

    // 承诺金额 单位分
    /**
     * @example 12322
     *
     * @var int
     */
    public $amount;

    // 本期还款状态
    // 已还款，PAID
    // 部分还款，PART_PAID
    // 未还款，UN_PAID
    /**
     * @example UN_PAID
     *
     * @var string
     */
    public $status;

    // 每期约定还款时间
    /**
     * @example 2023-04-05 12:12:23
     *
     * @var string
     */
    public $promiseTime;

    // 履约日期
    /**
     * @example 2023-04-05 12:12:23
     *
     * @var string
     */
    public $payTime;

    // 归还方式，取值范围如下： ACTIVE_REPAYMENT：主动还款， MY_BANK_PROXY_WITHHOLDING：网商委托代扣, PRE_AUTHORIZATION_WITHHOLDING: 预授权代扣
    /**
     * @example ACTIVE_REPAYMENT
     *
     * @var string
     */
    public $way;
    protected $_name = [
        'period'      => 'period',
        'amount'      => 'amount',
        'status'      => 'status',
        'promiseTime' => 'promise_time',
        'payTime'     => 'pay_time',
        'way'         => 'way',
    ];

    public function validate()
    {
        Model::validateRequired('period', $this->period, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('promiseTime', $this->promiseTime, true);
        Model::validateRequired('way', $this->way, true);
        Model::validatePattern('promiseTime', $this->promiseTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('payTime', $this->payTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateMaxLength('way', $this->way, 32);
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->promiseTime) {
            $res['promise_time'] = $this->promiseTime;
        }
        if (null !== $this->payTime) {
            $res['pay_time'] = $this->payTime;
        }
        if (null !== $this->way) {
            $res['way'] = $this->way;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BclPromiseDetailInfo
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['promise_time'])) {
            $model->promiseTime = $map['promise_time'];
        }
        if (isset($map['pay_time'])) {
            $model->payTime = $map['pay_time'];
        }
        if (isset($map['way'])) {
            $model->way = $map['way'];
        }

        return $model;
    }
}
