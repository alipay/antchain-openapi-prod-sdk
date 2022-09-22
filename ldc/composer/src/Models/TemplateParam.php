<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class TemplateParam extends Model
{
    // 参数唯一标识
    /**
     * @example 111
     *
     * @var string
     */
    public $id;

    // 参数key
    /**
     * @example aaa
     *
     * @var string
     */
    public $key;

    // 参数值
    /**
     * @example 111
     *
     * @var string
     */
    public $value;

    // 参数中文名称
    /**
     * @example 测试
     *
     * @var string
     */
    public $name;

    // 是否必填
    /**
     * @example true, false
     *
     * @var bool
     */
    public $required;
    protected $_name = [
        'id'       => 'id',
        'key'      => 'key',
        'value'    => 'value',
        'name'     => 'name',
        'required' => 'required',
    ];

    public function validate()
    {
        Model::validateRequired('key', $this->key, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TemplateParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['required'])) {
            $model->required = $map['required'];
        }

        return $model;
    }
}
