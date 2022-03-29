<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class MetricData extends Model
{
    // 维度信息
    /**
     * @example
     *
     * @var KeySet[]
     */
    public $tags;

    // 时序数据
    /**
     * @example
     *
     * @var MetricValue[]
     */
    public $values;
    protected $_name = [
        'tags'   => 'tags',
        'values' => 'values',
    ];

    public function validate()
    {
        Model::validateRequired('tags', $this->tags, true);
        Model::validateRequired('values', $this->values, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tags) {
            $res['tags'] = [];
            if (null !== $this->tags && \is_array($this->tags)) {
                $n = 0;
                foreach ($this->tags as $item) {
                    $res['tags'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->values) {
            $res['values'] = [];
            if (null !== $this->values && \is_array($this->values)) {
                $n = 0;
                foreach ($this->values as $item) {
                    $res['values'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MetricData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tags'])) {
            if (!empty($map['tags'])) {
                $model->tags = [];
                $n           = 0;
                foreach ($map['tags'] as $item) {
                    $model->tags[$n++] = null !== $item ? KeySet::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['values'])) {
            if (!empty($map['values'])) {
                $model->values = [];
                $n             = 0;
                foreach ($map['values'] as $item) {
                    $model->values[$n++] = null !== $item ? MetricValue::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
