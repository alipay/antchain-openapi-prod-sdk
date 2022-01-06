<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class Attribute extends Model
{
    // 属性名
    /**
     * @example age
     *
     * @var string
     */
    public $attributeName;

    // 属性描述
    /**
     * @example 年龄
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'attributeName' => 'attribute_name',
        'name'          => 'name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->attributeName) {
            $res['attribute_name'] = $this->attributeName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Attribute
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['attribute_name'])) {
            $model->attributeName = $map['attribute_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
