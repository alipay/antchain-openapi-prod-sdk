<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AuthRuleConfig extends Model
{
    // 字段信息
    /**
     * @example
     *
     * @var ConfigEntity[]
     */
    public $fields;

    // 操作符集合
    /**
     * @example
     *
     * @var ConfigEntity[]
     */
    public $operations;

    // 类型，系统内置或者是自定义
    /**
     * @example
     *
     * @var ConfigEntity[]
     */
    public $types;
    protected $_name = [
        'fields'     => 'fields',
        'operations' => 'operations',
        'types'      => 'types',
    ];

    public function validate()
    {
        Model::validateRequired('fields', $this->fields, true);
        Model::validateRequired('operations', $this->operations, true);
        Model::validateRequired('types', $this->types, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fields) {
            $res['fields'] = [];
            if (null !== $this->fields && \is_array($this->fields)) {
                $n = 0;
                foreach ($this->fields as $item) {
                    $res['fields'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->operations) {
            $res['operations'] = [];
            if (null !== $this->operations && \is_array($this->operations)) {
                $n = 0;
                foreach ($this->operations as $item) {
                    $res['operations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->types) {
            $res['types'] = [];
            if (null !== $this->types && \is_array($this->types)) {
                $n = 0;
                foreach ($this->types as $item) {
                    $res['types'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthRuleConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['fields'])) {
            if (!empty($map['fields'])) {
                $model->fields = [];
                $n             = 0;
                foreach ($map['fields'] as $item) {
                    $model->fields[$n++] = null !== $item ? ConfigEntity::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['operations'])) {
            if (!empty($map['operations'])) {
                $model->operations = [];
                $n                 = 0;
                foreach ($map['operations'] as $item) {
                    $model->operations[$n++] = null !== $item ? ConfigEntity::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['types'])) {
            if (!empty($map['types'])) {
                $model->types = [];
                $n            = 0;
                foreach ($map['types'] as $item) {
                    $model->types[$n++] = null !== $item ? ConfigEntity::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
