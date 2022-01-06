<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AuthRuleItemModelVO extends Model
{
    // 所属鉴权规则id
    /**
     * @example 100
     *
     * @var int
     */
    public $authRuleId;

    // 类型
    /**
     * @example SYSTEM
     *
     * @var string
     */
    public $type;

    // 字段
    /**
     * @example source.connection.ip
     *
     * @var string
     */
    public $field;

    // 操作方式
    /**
     * @example equal
     *
     * @var string
     */
    public $operation;

    // 匹配值
    /**
     * @example xxx
     *
     * @var string
     */
    public $value;

    // 主键
    /**
     * @example 100
     *
     * @var int
     */
    public $id;

    // 操作人
    /**
     * @example icanner
     *
     * @var string
     */
    public $operator;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 更新时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'authRuleId'  => 'auth_rule_id',
        'type'        => 'type',
        'field'       => 'field',
        'operation'   => 'operation',
        'value'       => 'value',
        'id'          => 'id',
        'operator'    => 'operator',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authRuleId) {
            $res['auth_rule_id'] = $this->authRuleId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->field) {
            $res['field'] = $this->field;
        }
        if (null !== $this->operation) {
            $res['operation'] = $this->operation;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthRuleItemModelVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_rule_id'])) {
            $model->authRuleId = $map['auth_rule_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['field'])) {
            $model->field = $map['field'];
        }
        if (isset($map['operation'])) {
            $model->operation = $map['operation'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
