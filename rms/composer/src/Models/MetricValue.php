<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class MetricValue extends Model
{
    // 时间戳
    /**
     * @example
     *
     * @var int
     */
    public $timestamp;

    // double类型值
    /**
     * @example 2.0
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'timestamp' => 'timestamp',
        'value'     => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MetricValue
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
