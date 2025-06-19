<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ASSET\Models;

use AlibabaCloud\Tea\Model;

class TradeRangeData extends Model
{
    // 区间开始
    /**
     * @example 0
     *
     * @var string
     */
    public $start;

    // 区间结束
    /**
     * @example max/500
     *
     * @var string
     */
    public $end;

    // 区间内统计值
    /**
     * @example 100
     *
     * @var int
     */
    public $value;

    // 百分比
    /**
     * @example 0.12
     *
     * @var string
     */
    public $rate;
    protected $_name = [
        'start' => 'start',
        'end'   => 'end',
        'value' => 'value',
        'rate'  => 'rate',
    ];

    public function validate()
    {
        Model::validateRequired('start', $this->start, true);
        Model::validateRequired('end', $this->end, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('rate', $this->rate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        if (null !== $this->end) {
            $res['end'] = $this->end;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->rate) {
            $res['rate'] = $this->rate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TradeRangeData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['start'])) {
            $model->start = $map['start'];
        }
        if (isset($map['end'])) {
            $model->end = $map['end'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['rate'])) {
            $model->rate = $map['rate'];
        }

        return $model;
    }
}
