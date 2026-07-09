<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class TripDuration extends Model
{
    // 时间
    /**
     * @example "1.2"
     *
     * @var string
     */
    public $value;

    // 时间单位
    /**
     * @example "h"
     *
     * @var string
     */
    public $unit;
    protected $_name = [
        'value' => 'value',
        'unit'  => 'unit',
    ];

    public function validate()
    {
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('unit', $this->unit, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TripDuration
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['unit'])) {
            $model->unit = $map['unit'];
        }

        return $model;
    }
}
