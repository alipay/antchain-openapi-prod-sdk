<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class OrderDuration extends Model
{
    // 周期类型，YEAR：年；MONTH：月；DAY：日
    /**
     * @example YEAR
     *
     * @var string
     */
    public $durationType;

    // 订购周期值
    /**
     * @example 1
     *
     * @var int
     */
    public $durationValue;
    protected $_name = [
        'durationType'  => 'duration_type',
        'durationValue' => 'duration_value',
    ];

    public function validate()
    {
        Model::validateRequired('durationType', $this->durationType, true);
        Model::validateRequired('durationValue', $this->durationValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->durationType) {
            $res['duration_type'] = $this->durationType;
        }
        if (null !== $this->durationValue) {
            $res['duration_value'] = $this->durationValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderDuration
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['duration_type'])) {
            $model->durationType = $map['duration_type'];
        }
        if (isset($map['duration_value'])) {
            $model->durationValue = $map['duration_value'];
        }

        return $model;
    }
}
