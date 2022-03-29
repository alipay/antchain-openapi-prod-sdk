<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TimeSeriesMetricsField extends Model
{
    // Field key
    /**
     * @example "callCount"
     *
     * @var string
     */
    public $key;

    // Field value
    /**
     * @example 100.1012
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'key'   => 'key',
        'value' => 'value',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TimeSeriesMetricsField
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
