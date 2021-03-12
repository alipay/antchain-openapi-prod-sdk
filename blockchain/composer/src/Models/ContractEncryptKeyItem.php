<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ContractEncryptKeyItem extends Model
{
    // 字段对应的id
    /**
     * @example keyId
     *
     * @var string
     */
    public $key;

    // 0:encrypt_text,
    // 1:encrypt_array_text,
    // 2:encrypt_int
    // 3:encrypt_array_int
    /**
     * @example 0
     *
     * @var int
     */
    public $type;

    // 字段对应的数据
    /**
     * @example "value_1"
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'key'   => 'key',
        'type'  => 'type',
        'value' => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractEncryptKeyItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
