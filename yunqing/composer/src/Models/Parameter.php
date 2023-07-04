<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Parameter extends Model
{
    // 参数默认值
    /**
     * @example 123
     *
     * @var string
     */
    public $default;

    // 参数key
    /**
     * @example app
     *
     * @var string
     */
    public $key;

    // 参数描述
    /**
     * @example 123
     *
     * @var string
     */
    public $description;

    // 参数类型        MANUAL("manual"),
    // CONSTANT("constant"),
    // EXPRESSION("expression");
    /**
     * @example constant
     *
     * @var string
     */
    public $kind;

    // 是否必须
    /**
     * @example true, false
     *
     * @var bool
     */
    public $required;

    // 参数模版
    /**
     * @example
     *
     * @var ParameterTemplate[]
     */
    public $parameters;

    // STRING("string"),
    // SECRET("secret"),
    // INT("int"),
    // FLOAT("float"),
    // ANY("any");
    /**
     * @example 参数值类型
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'default'     => 'default',
        'key'         => 'key',
        'description' => 'description',
        'kind'        => 'kind',
        'required'    => 'required',
        'parameters'  => 'parameters',
        'type'        => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('default', $this->default, true);
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('kind', $this->kind, true);
        Model::validateRequired('required', $this->required, true);
        Model::validateRequired('parameters', $this->parameters, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->default) {
            $res['default'] = $this->default;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->kind) {
            $res['kind'] = $this->kind;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }
        if (null !== $this->parameters) {
            $res['parameters'] = [];
            if (null !== $this->parameters && \is_array($this->parameters)) {
                $n = 0;
                foreach ($this->parameters as $item) {
                    $res['parameters'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Parameter
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['default'])) {
            $model->default = $map['default'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['kind'])) {
            $model->kind = $map['kind'];
        }
        if (isset($map['required'])) {
            $model->required = $map['required'];
        }
        if (isset($map['parameters'])) {
            if (!empty($map['parameters'])) {
                $model->parameters = [];
                $n                 = 0;
                foreach ($map['parameters'] as $item) {
                    $model->parameters[$n++] = null !== $item ? ParameterTemplate::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
