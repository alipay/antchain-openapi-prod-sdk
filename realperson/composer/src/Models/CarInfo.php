<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class CarInfo extends Model
{
    // 是否高频使用，格式：YES/NO
    /**
     * @example YES
     *
     * @var string
     */
    public $highFrequency;

    // 车辆价值区间，格式：1，2，3...
    /**
     * @example 1
     *
     * @var string
     */
    public $value;

    // 车辆类型，格式：1，2，3
    /**
     * @example 1
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'highFrequency' => 'high_frequency',
        'value'         => 'value',
        'type'          => 'type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->highFrequency) {
            $res['high_frequency'] = $this->highFrequency;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CarInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['high_frequency'])) {
            $model->highFrequency = $map['high_frequency'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
