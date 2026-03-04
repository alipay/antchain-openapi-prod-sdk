<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class TransactionDetails extends Model
{
    // 金额
    /**
     * @example 85000.00
     *
     * @var int
     */
    public $amount;

    // 币种
    /**
     * @example CNY
     *
     * @var string
     */
    public $currency;

    // 渠道
    /**
     * @example ATM
     *
     * @var string
     */
    public $channel;

    // 地址
    /**
     * @example 上海分行
     *
     * @var string
     */
    public $location;

    // 时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $time;
    protected $_name = [
        'amount'   => 'amount',
        'currency' => 'currency',
        'channel'  => 'channel',
        'location' => 'location',
        'time'     => 'time',
    ];

    public function validate()
    {
        Model::validatePattern('time', $this->time, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransactionDetails
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['location'])) {
            $model->location = $map['location'];
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }

        return $model;
    }
}
