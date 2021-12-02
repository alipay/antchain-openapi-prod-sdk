<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class Filter extends Model
{
    // join_model_id
    /**
     * @example 关联的模型名称
     *
     * @var string
     */
    public $joinModelId;

    // conditions
    /**
     * @example
     *
     * @var Condition[]
     */
    public $conditions;
    protected $_name = [
        'joinModelId' => 'join_model_id',
        'conditions'  => 'conditions',
    ];

    public function validate()
    {
        Model::validateRequired('joinModelId', $this->joinModelId, true);
        Model::validateRequired('conditions', $this->conditions, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->joinModelId) {
            $res['join_model_id'] = $this->joinModelId;
        }
        if (null !== $this->conditions) {
            $res['conditions'] = [];
            if (null !== $this->conditions && \is_array($this->conditions)) {
                $n = 0;
                foreach ($this->conditions as $item) {
                    $res['conditions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Filter
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['join_model_id'])) {
            $model->joinModelId = $map['join_model_id'];
        }
        if (isset($map['conditions'])) {
            if (!empty($map['conditions'])) {
                $model->conditions = [];
                $n                 = 0;
                foreach ($map['conditions'] as $item) {
                    $model->conditions[$n++] = null !== $item ? Condition::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
