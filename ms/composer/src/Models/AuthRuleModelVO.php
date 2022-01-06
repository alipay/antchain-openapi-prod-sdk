<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AuthRuleModelVO extends Model
{
    // 鉴权规则组id
    /**
     * @example 100
     *
     * @var int
     */
    public $authRuleGroupId;

    // 规则开启状态。0关闭，1开启
    /**
     * @example 1
     *
     * @var int
     */
    public $enabled;

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

    // 主键
    /**
     * @example 100
     *
     * @var string
     */
    public $id;

    // 模式，观察者模式（OBSERVER），拦截模式（REJECT）
    /**
     * @example REJECT
     *
     * @var string
     */
    public $mode;

    // 名称
    /**
     * @example 新的鉴权规则
     *
     * @var string
     */
    public $name;

    // 鉴权规则配置项
    /**
     * @example [{"type": "SYSTEM"}...]
     *
     * @var AuthRuleItemModelVO[]
     */
    public $ruleItems;

    // 类型。白名单（WHITELIST），黑名单（BLACKLIST）
    /**
     * @example WHITELIST
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'authRuleGroupId' => 'auth_rule_group_id',
        'enabled'         => 'enabled',
        'gmtCreate'       => 'gmt_create',
        'gmtModified'     => 'gmt_modified',
        'id'              => 'id',
        'mode'            => 'mode',
        'name'            => 'name',
        'ruleItems'       => 'rule_items',
        'type'            => 'type',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authRuleGroupId) {
            $res['auth_rule_group_id'] = $this->authRuleGroupId;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
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
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthRuleModelVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_rule_group_id'])) {
            $model->authRuleGroupId = $map['auth_rule_group_id'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
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
                    $model->ruleItems[$n++] = null !== $item ? AuthRuleItemModelVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
