<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class JsonSchema extends Model
{
    // 类型
    /**
     * @example null
     *
     * @var string
     */
    public $type;

    // Map<String, Object> 类型
    /**
     * @example  Map<String, Object>
     *
     * @var string
     */
    public $properties;

    // 必填项
    /**
     * @example []
     *
     * @var string[]
     */
    public $required;

    // 是否允许额外属性
    /**
     * @example
     *
     * @var bool
     */
    public $additionalProperties;
    protected $_name = [
        'type'                 => 'type',
        'properties'           => 'properties',
        'required'             => 'required',
        'additionalProperties' => 'additional_properties',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('properties', $this->properties, true);
        Model::validateRequired('required', $this->required, true);
        Model::validateRequired('additionalProperties', $this->additionalProperties, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }
        if (null !== $this->additionalProperties) {
            $res['additional_properties'] = $this->additionalProperties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JsonSchema
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['required'])) {
            if (!empty($map['required'])) {
                $model->required = $map['required'];
            }
        }
        if (isset($map['additional_properties'])) {
            $model->additionalProperties = $map['additional_properties'];
        }

        return $model;
    }
}
