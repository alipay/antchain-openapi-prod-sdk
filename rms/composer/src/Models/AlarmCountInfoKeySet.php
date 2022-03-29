<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmCountInfoKeySet extends Model
{
    // 键值 (时间戳字符串)
    /**
     * @example 1611922920000
     *
     * @var string
     */
    public $key;

    // 某一时刻对应的告警统计信息
    /**
     * @example
     *
     * @var AlarmCountInfo
     */
    public $value;
    protected $_name = [
        'key'   => 'key',
        'value' => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->value) {
            $res['value'] = null !== $this->value ? $this->value->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlarmCountInfoKeySet
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['value'])) {
            $model->value = AlarmCountInfo::fromMap($map['value']);
        }

        return $model;
    }
}
