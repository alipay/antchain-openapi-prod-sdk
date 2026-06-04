<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS_SECURITY\Models;

use AlibabaCloud\Tea\Model;

class KeyContentPropertyPair extends Model
{
    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $key;

    // 123
    /**
     * @example 123
     *
     * @var ContentProperty
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
     * @return KeyContentPropertyPair
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['value'])) {
            $model->value = ContentProperty::fromMap($map['value']);
        }

        return $model;
    }
}
