<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AuthRuleItemModel extends Model
{
    // 规则id
    /**
     * @example 2552
     *
     * @var int
     */
    public $authRuleId;

    // 规则字段
    /**
     * @example 规则字段
     *
     * @var string
     */
    public $field;

    // 操作类型(EQUAL,NOT_EQUAL,IN,NOT_INT,REGEX)
    /**
     * @example EQUAL
     *
     * @var string
     */
    public $operation;

    // 规则项的值
    /**
     * @example 规则项的值
     *
     * @var string
     */
    public $value;

    // 操作类型
    /**
     * @example ADDED
     *
     * @var string
     */
    public $changedType;
    protected $_name = [
        'authRuleId'  => 'auth_rule_id',
        'field'       => 'field',
        'operation'   => 'operation',
        'value'       => 'value',
        'changedType' => 'changed_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authRuleId) {
            $res['auth_rule_id'] = $this->authRuleId;
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
        if (null !== $this->changedType) {
            $res['changed_type'] = $this->changedType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthRuleItemModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_rule_id'])) {
            $model->authRuleId = $map['auth_rule_id'];
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
        if (isset($map['changed_type'])) {
            $model->changedType = $map['changed_type'];
        }

        return $model;
    }
}
