<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class JsonSchema extends Model
{
    // 工具属性，Map<String, Object> 类型，适配网关透出，使用字符串方式存储
    /**
     * @example [{}]
     *
     * @var string
     */
    public $propertiesJson;

    // 类型
    /**
     * @example null
     *
     * @var string
     */
    public $type;

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
        'propertiesJson'       => 'properties_json',
        'type'                 => 'type',
        'required'             => 'required',
        'additionalProperties' => 'additional_properties',
    ];

    public function validate()
    {
        Model::validateRequired('propertiesJson', $this->propertiesJson, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('required', $this->required, true);
        Model::validateRequired('additionalProperties', $this->additionalProperties, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->propertiesJson) {
            $res['properties_json'] = $this->propertiesJson;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
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
        if (isset($map['properties_json'])) {
            $model->propertiesJson = $map['properties_json'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
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
