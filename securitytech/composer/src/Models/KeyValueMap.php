<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class KeyValueMap extends Model
{
    // key-value中的key
    /**
     * @example key
     *
     * @var string
     */
    public $key;

    // key-value中的value
    /**
     * @example value
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
        Model::validateMaxLength('key', $this->key, 100);
        Model::validateMaxLength('value', $this->value, 1000);
        Model::validateMinLength('key', $this->key, 1);
        Model::validateMinLength('value', $this->value, 1);
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
     * @return KeyValueMap
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
