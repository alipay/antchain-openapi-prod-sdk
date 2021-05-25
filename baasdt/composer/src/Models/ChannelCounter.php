<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ChannelCounter extends Model
{
    // 渠道名字
    /**
     * @example x x x x x
     *
     * @var string
     */
    public $channelName;

    // 统计值
    /**
     * @example 1111
     *
     * @var int
     */
    public $counter;

    // 月份。如果月份有具体值则数据为该月份数据，月份为空则为全部统计数据。
    /**
     * @example 2021-04
     *
     * @var string
     */
    public $month;

    // 渠道交易金额
    /**
     * @example 1000111.00
     *
     * @var string
     */
    public $totalPrice;
    protected $_name = [
        'channelName' => 'channel_name',
        'counter'     => 'counter',
        'month'       => 'month',
        'totalPrice'  => 'total_price',
    ];

    public function validate()
    {
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('counter', $this->counter, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->counter) {
            $res['counter'] = $this->counter;
        }
        if (null !== $this->month) {
            $res['month'] = $this->month;
        }
        if (null !== $this->totalPrice) {
            $res['total_price'] = $this->totalPrice;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChannelCounter
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['counter'])) {
            $model->counter = $map['counter'];
        }
        if (isset($map['month'])) {
            $model->month = $map['month'];
        }
        if (isset($map['total_price'])) {
            $model->totalPrice = $map['total_price'];
        }

        return $model;
    }
}
