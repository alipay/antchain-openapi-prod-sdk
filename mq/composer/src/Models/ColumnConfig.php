<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ColumnConfig extends Model
{
    // 别名
    /**
     * @example userId
     *
     * @var string
     */
    public $alias;

    // 转化类型
    /**
     * @example Integer
     *
     * @var string
     */
    public $castType;

    // 名称
    /**
     * @example uid
     *
     * @var string
     */
    public $name;

    // 列类型
    /**
     * @example String
     *
     * @var string
     */
    public $type;

    // 当前字段 可转化成的类型选项
    /**
     * @example { "STRING", "LONG"}
     *
     * @var string[]
     */
    public $castTypeOptions;
    protected $_name = [
        'alias'           => 'alias',
        'castType'        => 'cast_type',
        'name'            => 'name',
        'type'            => 'type',
        'castTypeOptions' => 'cast_type_options',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }
        if (null !== $this->castType) {
            $res['cast_type'] = $this->castType;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->castTypeOptions) {
            $res['cast_type_options'] = $this->castTypeOptions;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ColumnConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['alias'])) {
            $model->alias = $map['alias'];
        }
        if (isset($map['cast_type'])) {
            $model->castType = $map['cast_type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['cast_type_options'])) {
            if (!empty($map['cast_type_options'])) {
                $model->castTypeOptions = $map['cast_type_options'];
            }
        }

        return $model;
    }
}
