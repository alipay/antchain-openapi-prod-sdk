<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class JtExtraData extends Model
{
    // 查询的时间范围内的行驶总里程
    /**
     * @example 312
     *
     * @var int
     */
    public $deltaMileage;

    // 最大车速
    /**
     * @example 60
     *
     * @var int
     */
    public $maxSpeed;

    // 平均车速
    /**
     * @example 60
     *
     * @var int
     */
    public $avgSpeed;
    protected $_name = [
        'deltaMileage' => 'delta_mileage',
        'maxSpeed'     => 'max_speed',
        'avgSpeed'     => 'avg_speed',
    ];

    public function validate()
    {
        Model::validateRequired('deltaMileage', $this->deltaMileage, true);
        Model::validateRequired('maxSpeed', $this->maxSpeed, true);
        Model::validateRequired('avgSpeed', $this->avgSpeed, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deltaMileage) {
            $res['delta_mileage'] = $this->deltaMileage;
        }
        if (null !== $this->maxSpeed) {
            $res['max_speed'] = $this->maxSpeed;
        }
        if (null !== $this->avgSpeed) {
            $res['avg_speed'] = $this->avgSpeed;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JtExtraData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['delta_mileage'])) {
            $model->deltaMileage = $map['delta_mileage'];
        }
        if (isset($map['max_speed'])) {
            $model->maxSpeed = $map['max_speed'];
        }
        if (isset($map['avg_speed'])) {
            $model->avgSpeed = $map['avg_speed'];
        }

        return $model;
    }
}
