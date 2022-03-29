<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XTimeMetricsValue extends Model
{
    /**
     * @example
     *
     * @var XStringKeyValue[]
     */
    public $values;

    /**
     * @example
     *
     * @var int
     */
    public $timestamp;
    protected $_name = [
        'values'    => 'values',
        'timestamp' => 'timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('values', $this->values, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->values) {
            $res['values'] = [];
            if (null !== $this->values && \is_array($this->values)) {
                $n = 0;
                foreach ($this->values as $item) {
                    $res['values'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XTimeMetricsValue
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['values'])) {
            if (!empty($map['values'])) {
                $model->values = [];
                $n             = 0;
                foreach ($map['values'] as $item) {
                    $model->values[$n++] = null !== $item ? XStringKeyValue::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }

        return $model;
    }
}
