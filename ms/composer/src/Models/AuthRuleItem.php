<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AuthRuleItem extends Model
{
    // 所属的鉴权规则id
    /**
     * @example 10000
     *
     * @var int
     */
    public $authRuleId;

    // 枚举类型
    // SYSTEM 表示系统内置字段
    // CUSTOM 表示用户自定义字段
    /**
     * @example SYSTEM
     *
     * @var string
     */
    public $type;

    // 匹配字段
    /**
     * @example source_application_id
     *
     * @var string
     */
    public $field;

    // 操作符，通过 FormConfig 可以获取支持所有的操作符
    /**
     * @example EQUAL
     *
     * @var string
     */
    public $operation;

    // 匹配的值
    /**
     * @example app1
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'authRuleId' => 'auth_rule_id',
        'type'       => 'type',
        'field'      => 'field',
        'operation'  => 'operation',
        'value'      => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('field', $this->field, true);
        Model::validateRequired('operation', $this->operation, true);
        Model::validateRequired('value', $this->value, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthRuleItem
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

        return $model;
    }
}
