<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_b08c548e3a88469c89fe27adc3d0b925\Models;

use AlibabaCloud\Tea\Model;

class NameValuePair extends Model
{
    // 字段名称
    /**
     * @example key
     *
     * @var string
     */
    public $name;

    // 字段值
    /**
     * @example value
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'name'  => 'name',
        'value' => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NameValuePair
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
