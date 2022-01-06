<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AuthRuleVO extends Model
{
    // 分组id
    /**
     * @example 214
     *
     * @var string
     */
    public $authRuleGroupId;

    // changedItemCnt
    /**
     * @example 1
     *
     * @var int
     */
    public $changedItemCnt;

    // changed_type
    /**
     * @example changed_type
     *
     * @var string
     */
    public $changedType;

    // 是否生效，1 生效，0 未生效。默认未生效
    /**
     * @example 1
     *
     * @var int
     */
    public $enabled;

    // 规则id
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // 模式
    /**
     * @example REJECT
     *
     * @var string
     */
    public $mode;

    // 规则名
    /**
     * @example gs245
     *
     * @var string
     */
    public $name;

    // 所有规则项
    /**
     * @example ruleItems
     *
     * @var AuthRuleItemVO[]
     */
    public $ruleItems;
    protected $_name = [
        'authRuleGroupId' => 'auth_rule_group_id',
        'changedItemCnt'  => 'changed_item_cnt',
        'changedType'     => 'changed_type',
        'enabled'         => 'enabled',
        'id'              => 'id',
        'mode'            => 'mode',
        'name'            => 'name',
        'ruleItems'       => 'rule_items',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authRuleGroupId) {
            $res['auth_rule_group_id'] = $this->authRuleGroupId;
        }
        if (null !== $this->changedItemCnt) {
            $res['changed_item_cnt'] = $this->changedItemCnt;
        }
        if (null !== $this->changedType) {
            $res['changed_type'] = $this->changedType;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->mode) {
            $res['mode'] = $this->mode;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->ruleItems) {
            $res['rule_items'] = [];
            if (null !== $this->ruleItems && \is_array($this->ruleItems)) {
                $n = 0;
                foreach ($this->ruleItems as $item) {
                    $res['rule_items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthRuleVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_rule_group_id'])) {
            $model->authRuleGroupId = $map['auth_rule_group_id'];
        }
        if (isset($map['changed_item_cnt'])) {
            $model->changedItemCnt = $map['changed_item_cnt'];
        }
        if (isset($map['changed_type'])) {
            $model->changedType = $map['changed_type'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['mode'])) {
            $model->mode = $map['mode'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['rule_items'])) {
            if (!empty($map['rule_items'])) {
                $model->ruleItems = [];
                $n                = 0;
                foreach ($map['rule_items'] as $item) {
                    $model->ruleItems[$n++] = null !== $item ? AuthRuleItemVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
