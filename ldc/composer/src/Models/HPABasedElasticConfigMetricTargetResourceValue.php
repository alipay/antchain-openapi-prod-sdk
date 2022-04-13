<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class HPABasedElasticConfigMetricTargetResourceValue extends Model
{
    // 数值
    /**
     * @example 1
     *
     * @var int
     */
    public $value;

    // 数值单位:
    // Byte, Ki, Mi, Gi, Ti, Pi
    // m, C
    /**
     * @example Gi
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
     * @return HPABasedElasticConfigMetricTargetResourceValue
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
