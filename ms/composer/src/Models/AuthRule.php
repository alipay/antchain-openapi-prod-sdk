<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AuthRule extends Model
{
    // 鉴权规则描述
    /**
     * @example 允许部分应用访问
     *
     * @var string
     */
    public $name;

    // REJECT : 表示严格模式，例如不匹配白名单则拒绝访问
    // OBSERVER：表示非严格模式，例如不匹配白名单只记录日志，不拒绝访问
    /**
     * @example REJECT
     *
     * @var string
     */
    public $mode;

    // 规则所属的名单id
    /**
     * @example 100000
     *
     * @var int
     */
    public $authRuleGroupId;

    // 是否生效，1 表示生效，0 表示不生效
    /**
     * @example 1
     *
     * @var int
     */
    public $enabled;

    // 一条规则下，所有的规则项
    /**
     * @example
     *
     * @var AuthRuleItem[]
     */
    public $ruleItems;
    protected $_name = [
        'name'            => 'name',
        'mode'            => 'mode',
        'authRuleGroupId' => 'auth_rule_group_id',
        'enabled'         => 'enabled',
        'ruleItems'       => 'rule_items',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('mode', $this->mode, true);
        Model::validateRequired('authRuleGroupId', $this->authRuleGroupId, true);
        Model::validateRequired('enabled', $this->enabled, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->mode) {
            $res['mode'] = $this->mode;
        }
        if (null !== $this->authRuleGroupId) {
            $res['auth_rule_group_id'] = $this->authRuleGroupId;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
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
     * @return AuthRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['mode'])) {
            $model->mode = $map['mode'];
        }
        if (isset($map['auth_rule_group_id'])) {
            $model->authRuleGroupId = $map['auth_rule_group_id'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['rule_items'])) {
            if (!empty($map['rule_items'])) {
                $model->ruleItems = [];
                $n                = 0;
                foreach ($map['rule_items'] as $item) {
                    $model->ruleItems[$n++] = null !== $item ? AuthRuleItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
