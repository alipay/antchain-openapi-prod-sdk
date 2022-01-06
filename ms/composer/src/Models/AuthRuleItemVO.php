<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AuthRuleItemVO extends Model
{
    // 规则id
    /**
     * @example 123
     *
     * @var int
     */
    public $authRuleId;

    // 操作类型
    /**
     * @example NONE
     *
     * @var string
     */
    public $changedType;

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

    // AuthRuleItemModel
    /**
     * @example AuthRuleItemModel
     *
     * @var AuthRuleItemModel
     */
    public $publishedAuthRuleItem;

    // 系统内置或者用户自定义 SYSTEM/CUSTOM
    /**
     * @example CUSTOM
     *
     * @var string
     */
    public $type;

    // 规则项的值
    /**
     * @example 1112333q11222
     *
     * @var string
     */
    public $value;

    // id
    /**
     * @example
     *
     * @var int
     */
    public $id;
    protected $_name = [
        'authRuleId'            => 'auth_rule_id',
        'changedType'           => 'changed_type',
        'field'                 => 'field',
        'operation'             => 'operation',
        'publishedAuthRuleItem' => 'published_auth_rule_item',
        'type'                  => 'type',
        'value'                 => 'value',
        'id'                    => 'id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authRuleId) {
            $res['auth_rule_id'] = $this->authRuleId;
        }
        if (null !== $this->changedType) {
            $res['changed_type'] = $this->changedType;
        }
        if (null !== $this->field) {
            $res['field'] = $this->field;
        }
        if (null !== $this->operation) {
            $res['operation'] = $this->operation;
        }
        if (null !== $this->publishedAuthRuleItem) {
            $res['published_auth_rule_item'] = null !== $this->publishedAuthRuleItem ? $this->publishedAuthRuleItem->toMap() : null;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthRuleItemVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_rule_id'])) {
            $model->authRuleId = $map['auth_rule_id'];
        }
        if (isset($map['changed_type'])) {
            $model->changedType = $map['changed_type'];
        }
        if (isset($map['field'])) {
            $model->field = $map['field'];
        }
        if (isset($map['operation'])) {
            $model->operation = $map['operation'];
        }
        if (isset($map['published_auth_rule_item'])) {
            $model->publishedAuthRuleItem = AuthRuleItemModel::fromMap($map['published_auth_rule_item']);
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
