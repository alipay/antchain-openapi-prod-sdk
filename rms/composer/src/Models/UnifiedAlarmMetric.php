<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UnifiedAlarmMetric extends Model
{
    // 指标
    /**
     * @example cpu_util
     *
     * @var string
     */
    public $metric;

    // 指标数据
    /**
     * @example
     *
     * @var MetricData[]
     */
    public $data;
    protected $_name = [
        'metric' => 'metric',
        'data'   => 'data',
    ];

    public function validate()
    {
        Model::validateRequired('metric', $this->metric, true);
        Model::validateRequired('data', $this->data, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->metric) {
            $res['metric'] = $this->metric;
        }
        if (null !== $this->data) {
            $res['data'] = [];
            if (null !== $this->data && \is_array($this->data)) {
                $n = 0;
                foreach ($this->data as $item) {
                    $res['data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnifiedAlarmMetric
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['metric'])) {
            $model->metric = $map['metric'];
        }
        if (isset($map['data'])) {
            if (!empty($map['data'])) {
                $model->data = [];
                $n           = 0;
                foreach ($map['data'] as $item) {
                    $model->data[$n++] = null !== $item ? MetricData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
