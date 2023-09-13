<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class AddServiceaccountAuthpolicyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 服务账号对应的AccessKey
    /**
     * @var string
     */
    public $iamAccessKey;

    // 系统来源
    /**
     * @var string
     */
    public $sourceSystem;

    // 能力ID（权限点或角色ID）
    /**
     * @var string
     */
    public $abilityId;

    // 授权能力类型
    /**
     * @var string
     */
    public $abilityType;

    // 授权策略的限制条件
    //
    /**
     * @var Condition[]
     */
    public $conditions;
    protected $_name = [
        'authToken'    => 'auth_token',
        'iamAccessKey' => 'iam_access_key',
        'sourceSystem' => 'source_system',
        'abilityId'    => 'ability_id',
        'abilityType'  => 'ability_type',
        'conditions'   => 'conditions',
    ];

    public function validate()
    {
        Model::validateRequired('iamAccessKey', $this->iamAccessKey, true);
        Model::validateRequired('sourceSystem', $this->sourceSystem, true);
        Model::validateRequired('abilityId', $this->abilityId, true);
        Model::validateRequired('abilityType', $this->abilityType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->iamAccessKey) {
            $res['iam_access_key'] = $this->iamAccessKey;
        }
        if (null !== $this->sourceSystem) {
            $res['source_system'] = $this->sourceSystem;
        }
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddServiceaccountAuthpolicyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['iam_access_key'])) {
            $model->iamAccessKey = $map['iam_access_key'];
        }
        if (isset($map['source_system'])) {
            $model->sourceSystem = $map['source_system'];
        }
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

        return $model;
    }
}
