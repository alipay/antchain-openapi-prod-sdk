<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class AuthPolicy extends Model
{
    // 授权能力Id
    /**
     * @example
     *
     * @var string
     */
    public $abilityId;

    // 授权能力类型（ROLE：角色，ACTION：操作）
    /**
     * @example
     *
     * @var string
     */
    public $abilityType;

    // 授权条件
    /**
     * @example xxx
     *
     * @var Condition[]
     */
    public $conditions;

    // 创建时间，ISO8601格式
    /**
     * @example
     *
     * @var string
     */
    public $createTime;

    // 权限策略描述
    /**
     * @example
     *
     * @var string
     */
    public $description;

    // 授权策略ID
    /**
     * @example
     *
     * @var string
     */
    public $id;

    // 授权策略名称
    /**
     * @example
     *
     * @var string
     */
    public $name;

    // 授权条件
    /**
     * @example
     *
     * @var ScopeEntity[]
     */
    public $scopeEntities;

    // 授权策略归属租户
    /**
     * @example
     *
     * @var string
     */
    public $tenant;

    // 授权策略类型（CUSTOM：自定义授权策略）
    /**
     * @example
     *
     * @var string
     */
    public $type;

    // 更新时间，ISO8601格式
    /**
     * @example
     *
     * @var string
     */
    public $updateTime;
    protected $_name = [
        'abilityId'     => 'ability_id',
        'abilityType'   => 'ability_type',
        'conditions'    => 'conditions',
        'createTime'    => 'create_time',
        'description'   => 'description',
        'id'            => 'id',
        'name'          => 'name',
        'scopeEntities' => 'scope_entities',
        'tenant'        => 'tenant',
        'type'          => 'type',
        'updateTime'    => 'update_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->abilityId) {
            $res['ability_id'] = $this->abilityId;
        }
        if (null !== $this->abilityType) {
            $res['ability_type'] = $this->abilityType;
        }
        if (null !== $this->conditions) {
            $res['conditions'] = [];
            if (null !== $this->conditions && \is_array($this->conditions)) {
                $n = 0;
                foreach ($this->conditions as $item) {
                    $res['conditions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->scopeEntities) {
            $res['scope_entities'] = [];
            if (null !== $this->scopeEntities && \is_array($this->scopeEntities)) {
                $n = 0;
                foreach ($this->scopeEntities as $item) {
                    $res['scope_entities'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthPolicy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ability_id'])) {
            $model->abilityId = $map['ability_id'];
        }
        if (isset($map['ability_type'])) {
            $model->abilityType = $map['ability_type'];
        }
        if (isset($map['conditions'])) {
            if (!empty($map['conditions'])) {
                $model->conditions = [];
                $n                 = 0;
                foreach ($map['conditions'] as $item) {
                    $model->conditions[$n++] = null !== $item ? Condition::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['scope_entities'])) {
            if (!empty($map['scope_entities'])) {
                $model->scopeEntities = [];
                $n                    = 0;
                foreach ($map['scope_entities'] as $item) {
                    $model->scopeEntities[$n++] = null !== $item ? ScopeEntity::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }

        return $model;
    }
}
