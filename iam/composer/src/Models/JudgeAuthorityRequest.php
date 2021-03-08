<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class JudgeAuthorityRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 操作点id
    /**
     * @var string
     */
    public $actionId;

    // 鉴权条件
    /**
     * @var Condition[]
     */
    public $conditions;

    // 鉴权对象id
    /**
     * @var string
     */
    public $operatorId;
    protected $_name = [
        'authToken'  => 'auth_token',
        'actionId'   => 'action_id',
        'conditions' => 'conditions',
        'operatorId' => 'operator_id',
    ];

    public function validate()
    {
        Model::validateRequired('actionId', $this->actionId, true);
        Model::validateRequired('operatorId', $this->operatorId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->actionId) {
            $res['action_id'] = $this->actionId;
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
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JudgeAuthorityRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['action_id'])) {
            $model->actionId = $map['action_id'];
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
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }

        return $model;
    }
}
