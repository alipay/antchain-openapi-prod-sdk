<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclCreatePromiseDetailInfo extends Model
{
    // 承诺期数，最小值：1
    /**
     * @example 1
     *
     * @var int
     */
    public $period;

    // 承诺金额，单位：分
    // 最小值：1，正整数
    /**
     * @example 1
     *
     * @var int
     */
    public $amount;

    // 每期应还的日期
    // 示例：格式 2023-06-27T10:50:23+08:00
    /**
     * @example 2023-06-27T10:50:23+08:00
     *
     * @var string
     */
    public $promiseTime;
    protected $_name = [
        'period'      => 'period',
        'amount'      => 'amount',
        'promiseTime' => 'promise_time',
    ];

    public function validate()
    {
        Model::validateRequired('period', $this->period, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('promiseTime', $this->promiseTime, true);
        Model::validateMinimum('period', $this->period, 1);
        Model::validateMinimum('amount', $this->amount, 1);
        Model::validatePattern('promiseTime', $this->promiseTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->promiseTime) {
            $res['promise_time'] = $this->promiseTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BclCreatePromiseDetailInfo
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
        if (isset($map['promise_time'])) {
            $model->promiseTime = $map['promise_time'];
        }

        return $model;
    }
}
