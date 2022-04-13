<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PodReadinessGate extends Model
{
    // ConditionType refers to a condition in the pod_s condition list with matching type.
    /**
     * @example ok
     *
     * @var string
     */
    public $conditionType;
    protected $_name = [
        'conditionType' => 'condition_type',
    ];

    public function validate()
    {
        Model::validateRequired('conditionType', $this->conditionType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->conditionType) {
            $res['condition_type'] = $this->conditionType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PodReadinessGate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['condition_type'])) {
            $model->conditionType = $map['condition_type'];
        }

        return $model;
    }
}
