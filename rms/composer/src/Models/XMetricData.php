<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XMetricData extends Model
{
    // key value
    /**
     * @example [{"key":"value"}]
     *
     * @var XStringKeyValue[]
     */
    public $metric;

    // time value
    /**
     * @example {"timestamp": 1627985457, "value": "1.1"}
     *
     * @var XTimeStringValue
     */
    public $value;

    /**
     * @example
     *
     * @var XTimeStringValue[]
     */
    public $values;
    protected $_name = [
        'metric' => 'metric',
        'value'  => 'value',
        'values' => 'values',
    ];

    public function validate()
    {
        Model::validateRequired('metric', $this->metric, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->metric) {
            $res['metric'] = [];
            if (null !== $this->metric && \is_array($this->metric)) {
                $n = 0;
                foreach ($this->metric as $item) {
                    $res['metric'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->value) {
            $res['value'] = null !== $this->value ? $this->value->toMap() : null;
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
     * @return XMetricData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['metric'])) {
            if (!empty($map['metric'])) {
                $model->metric = [];
                $n             = 0;
                foreach ($map['metric'] as $item) {
                    $model->metric[$n++] = null !== $item ? XStringKeyValue::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['value'])) {
            $model->value = XTimeStringValue::fromMap($map['value']);
        }
        if (isset($map['values'])) {
            if (!empty($map['values'])) {
                $model->values = [];
                $n             = 0;
                foreach ($map['values'] as $item) {
                    $model->values[$n++] = null !== $item ? XTimeStringValue::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
