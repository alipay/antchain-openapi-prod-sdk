<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class HPABasedElasticConfigMetricTarget extends Model
{
    // 支持两种类型：AverageValue，Utilization
    /**
     * @example Utilization
     *
     * @var string
     */
    public $type;

    // value
    /**
     * @example
     *
     * @var HPABasedElasticConfigMetricTargetResourceValue
     */
    public $value;

    // 利用率
    /**
     * @example 90
     *
     * @var int
     */
    public $utilization;
    protected $_name = [
        'type'        => 'type',
        'value'       => 'value',
        'utilization' => 'utilization',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->value) {
            $res['value'] = null !== $this->value ? $this->value->toMap() : null;
        }
        if (null !== $this->utilization) {
            $res['utilization'] = $this->utilization;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HPABasedElasticConfigMetricTarget
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['value'])) {
            $model->value = HPABasedElasticConfigMetricTargetResourceValue::fromMap($map['value']);
        }
        if (isset($map['utilization'])) {
            $model->utilization = $map['utilization'];
        }

        return $model;
    }
}
