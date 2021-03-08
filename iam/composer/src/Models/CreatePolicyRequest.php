<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class CreatePolicyRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 角色Id
    /**
     * @var string
     */
    public $abilityId;

    // 授权能力类型（ROLE：角色)
    /**
     * @var string
     */
    public $abilityType;

    // 授权策略的限制条件
    /**
     * @var Condition[]
     */
    public $conditons;

    // 策略的描述
    /**
     * @var string
     */
    public $description;

    // 授权策略名称
    /**
     * @var string
     */
    public $name;

    // 八位租户ID
    /**
     * @var string
     */
    public $tenant;
    protected $_name = [
        'authToken'   => 'auth_token',
        'abilityId'   => 'ability_id',
        'abilityType' => 'ability_type',
        'conditons'   => 'conditons',
        'description' => 'description',
        'name'        => 'name',
        'tenant'      => 'tenant',
    ];

    public function validate()
    {
        Model::validateRequired('abilityId', $this->abilityId, true);
        Model::validateRequired('abilityType', $this->abilityType, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('tenant', $this->tenant, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->abilityId) {
            $res['ability_id'] = $this->abilityId;
        }
        if (null !== $this->abilityType) {
            $res['ability_type'] = $this->abilityType;
        }
        if (null !== $this->conditons) {
            $res['conditons'] = [];
            if (null !== $this->conditons && \is_array($this->conditons)) {
                $n = 0;
                foreach ($this->conditons as $item) {
                    $res['conditons'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreatePolicyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['ability_id'])) {
            $model->abilityId = $map['ability_id'];
        }
        if (isset($map['ability_type'])) {
            $model->abilityType = $map['ability_type'];
        }
        if (isset($map['conditons'])) {
            if (!empty($map['conditons'])) {
                $model->conditons = [];
                $n                = 0;
                foreach ($map['conditons'] as $item) {
                    $model->conditons[$n++] = null !== $item ? Condition::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }

        return $model;
    }
}
