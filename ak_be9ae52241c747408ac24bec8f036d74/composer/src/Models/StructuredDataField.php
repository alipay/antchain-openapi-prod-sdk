<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class StructuredDataField extends Model
{
    // 字段名称
    /**
     * @example id
     *
     * @var string
     */
    public $name;

    // 字段描述
    /**
     * @example id列
     *
     * @var string
     */
    public $description;

    // 字段类型。
    // 示例如下：
    // STRING,
    // INTEGER,
    // DOUBLE,
    // BOOLEAN
    /**
     * @example STRING
     *
     * @var string
     */
    public $type;

    // 字段是否可为空
    /**
     * @example true, false
     *
     * @var bool
     */
    public $nullable;
    protected $_name = [
        'name'        => 'name',
        'description' => 'description',
        'type'        => 'type',
        'nullable'    => 'nullable',
    ];

    public function validate()
    {
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
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->nullable) {
            $res['nullable'] = $this->nullable;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StructuredDataField
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
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['nullable'])) {
            $model->nullable = $map['nullable'];
        }

        return $model;
    }
}
