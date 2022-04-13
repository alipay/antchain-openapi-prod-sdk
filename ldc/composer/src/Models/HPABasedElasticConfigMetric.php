<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class HPABasedElasticConfigMetric extends Model
{
    // 指标名称：
    // CPU，Memory，QPS，RT
    /**
     * @example CPU
     *
     * @var string
     */
    public $name;

    // 目标值
    /**
     * @example
     *
     * @var HPABasedElasticConfigMetricTarget
     */
    public $target;
    protected $_name = [
        'name'   => 'name',
        'target' => 'target',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('target', $this->target, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->target) {
            $res['target'] = null !== $this->target ? $this->target->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HPABasedElasticConfigMetric
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['target'])) {
            $model->target = HPABasedElasticConfigMetricTarget::fromMap($map['target']);
        }

        return $model;
    }
}
