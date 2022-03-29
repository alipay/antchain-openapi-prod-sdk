<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmHistoryStatsDTOsKeySet extends Model
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
     * @example
     *
     * @var AlarmHistoryStatsDTO[]
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
            $res['value'] = [];
            if (null !== $this->value && \is_array($this->value)) {
                $n = 0;
                foreach ($this->value as $item) {
                    $res['value'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlarmHistoryStatsDTOsKeySet
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['value'])) {
            if (!empty($map['value'])) {
                $model->value = [];
                $n            = 0;
                foreach ($map['value'] as $item) {
                    $model->value[$n++] = null !== $item ? AlarmHistoryStatsDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
