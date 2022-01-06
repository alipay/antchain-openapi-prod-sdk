<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class RouterDestinationModel extends Model
{
    // 路由目标集合
    /**
     * @example
     *
     * @var BaseConditionModel[]
     */
    public $destination;

    // 权重
    /**
     * @example 80
     *
     * @var int
     */
    public $weight;
    protected $_name = [
        'destination' => 'destination',
        'weight'      => 'weight',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->destination) {
            $res['destination'] = [];
            if (null !== $this->destination && \is_array($this->destination)) {
                $n = 0;
                foreach ($this->destination as $item) {
                    $res['destination'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RouterDestinationModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['destination'])) {
            if (!empty($map['destination'])) {
                $model->destination = [];
                $n                  = 0;
                foreach ($map['destination'] as $item) {
                    $model->destination[$n++] = null !== $item ? BaseConditionModel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }

        return $model;
    }
}
