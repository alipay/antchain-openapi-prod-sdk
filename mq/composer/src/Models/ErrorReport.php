<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ErrorReport extends Model
{
    // 组件 数组
    /**
     * @example
     *
     * @var UIComponent[]
     */
    public $components;
    protected $_name = [
        'components' => 'components',
    ];

    public function validate()
    {
        Model::validateRequired('components', $this->components, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->components) {
            $res['components'] = [];
            if (null !== $this->components && \is_array($this->components)) {
                $n = 0;
                foreach ($this->components as $item) {
                    $res['components'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ErrorReport
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['components'])) {
            if (!empty($map['components'])) {
                $model->components = [];
                $n                 = 0;
                foreach ($map['components'] as $item) {
                    $model->components[$n++] = null !== $item ? UIComponent::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
