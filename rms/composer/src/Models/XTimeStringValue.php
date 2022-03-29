<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XTimeStringValue extends Model
{
    // unix timestamp (s)
    /**
     * @example
     *
     * @var int
     */
    public $timestamp;

    // double string
    /**
     * @example "1.1"
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
     * @return XTimeStringValue
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
