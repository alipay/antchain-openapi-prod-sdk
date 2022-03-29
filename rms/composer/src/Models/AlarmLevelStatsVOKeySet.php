<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmLevelStatsVOKeySet extends Model
{
    // key
    /**
     * @example key
     *
     * @var string
     */
    public $key;

    // value
    /**
     * @example value
     *
     * @var AlarmLevelStatsVO
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
     * @return AlarmLevelStatsVOKeySet
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['value'])) {
            $model->value = AlarmLevelStatsVO::fromMap($map['value']);
        }

        return $model;
    }
}
