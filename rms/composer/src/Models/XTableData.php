<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XTableData extends Model
{
    /**
     * @example
     *
     * @var XStringKeyValue[]
     */
    public $tags;

    /**
     * @example
     *
     * @var XTimeMetricsValue[]
     */
    public $metricValues;
    protected $_name = [
        'tags'         => 'tags',
        'metricValues' => 'metric_values',
    ];

    public function validate()
    {
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
        if (null !== $this->metricValues) {
            $res['metric_values'] = [];
            if (null !== $this->metricValues && \is_array($this->metricValues)) {
                $n = 0;
                foreach ($this->metricValues as $item) {
                    $res['metric_values'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XTableData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tags'])) {
            if (!empty($map['tags'])) {
                $model->tags = [];
                $n           = 0;
                foreach ($map['tags'] as $item) {
                    $model->tags[$n++] = null !== $item ? XStringKeyValue::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['metric_values'])) {
            if (!empty($map['metric_values'])) {
                $model->metricValues = [];
                $n                   = 0;
                foreach ($map['metric_values'] as $item) {
                    $model->metricValues[$n++] = null !== $item ? XTimeMetricsValue::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
