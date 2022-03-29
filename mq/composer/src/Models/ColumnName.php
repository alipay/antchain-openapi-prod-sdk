<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ColumnName extends Model
{
    // 名称
    /**
     * @example 名称
     *
     * @var string
     */
    public $name;

    // 唯一ID
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // 值类型
    /**
     * @example TIMESTAMP
     *
     * @var string
     */
    public $valueType;
    protected $_name = [
        'name'      => 'name',
        'id'        => 'id',
        'valueType' => 'value_type',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('valueType', $this->valueType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->valueType) {
            $res['value_type'] = $this->valueType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ColumnName
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['value_type'])) {
            $model->valueType = $map['value_type'];
        }

        return $model;
    }
}
