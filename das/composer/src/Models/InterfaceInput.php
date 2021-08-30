<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class InterfaceInput extends Model
{
    // 接口入参名称
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // 接口入参类型
    /**
     * @example String
     *
     * @var string
     */
    public $type;

    // 接口入参描述
    /**
     * @example 描述
     *
     * @var string
     */
    public $description;

    // 接口入参是否必填
    /**
     * @example true, false
     *
     * @var bool
     */
    public $required;
    protected $_name = [
        'name'        => 'name',
        'type'        => 'type',
        'description' => 'description',
        'required'    => 'required',
    ];

    public function validate()
    {
        Model::validateMaxLength('name', $this->name, 50);
        Model::validateMaxLength('type', $this->type, 50);
        Model::validateMaxLength('description', $this->description, 100);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InterfaceInput
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['required'])) {
            $model->required = $map['required'];
        }

        return $model;
    }
}
