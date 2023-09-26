<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class MapEntry extends Model
{
    // Key
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
     * @var string
     */
    public $value;

    // 声明 value 的类型，包括 String / Double / Long / Bool / JSONObject / JSONArray
    /**
     * @example String
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'key'   => 'key',
        'value' => 'value',
        'type'  => 'type',
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
            $res['value'] = $this->value;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MapEntry
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
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
