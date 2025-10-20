<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class ToolInfoVO extends Model
{
    // 工具名称
    /**
     * @example 工具名称
     *
     * @var string
     */
    public $name;

    // 工具描述
    /**
     * @example 工具描述
     *
     * @var string
     */
    public $description;

    // 工具入参的json schema
    /**
     * @example
     *
     * @var JsonSchema
     */
    public $inputSchema;
    protected $_name = [
        'name'        => 'name',
        'description' => 'description',
        'inputSchema' => 'input_schema',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('inputSchema', $this->inputSchema, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->inputSchema) {
            $res['input_schema'] = null !== $this->inputSchema ? $this->inputSchema->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ToolInfoVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['input_schema'])) {
            $model->inputSchema = JsonSchema::fromMap($map['input_schema']);
        }

        return $model;
    }
}
