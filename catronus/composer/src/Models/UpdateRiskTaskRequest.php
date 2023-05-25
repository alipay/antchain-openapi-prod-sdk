<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class UpdateRiskTaskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 风险共担ID
    /**
     * @var string
     */
    public $riskTaskId;

    // 风险工单状态
    /**
     * @var string
     */
    public $state;

    // 风险责任人
    /**
     * @var string
     */
    public $owner;

    // 安全责任人
    /**
     * @var string
     */
    public $secOwner;

    // 风险关注人员列表
    /**
     * @var string[]
     */
    public $followers;

    // 风险解决方案ID
    /**
     * @var string
     */
    public $riskSolutionId;
    protected $_name = [
        'authToken'      => 'auth_token',
        'riskTaskId'     => 'risk_task_id',
        'state'          => 'state',
        'owner'          => 'owner',
        'secOwner'       => 'sec_owner',
        'followers'      => 'followers',
        'riskSolutionId' => 'risk_solution_id',
    ];

    public function validate()
    {
        Model::validateRequired('riskTaskId', $this->riskTaskId, true);
        Model::validateRequired('state', $this->state, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->riskTaskId) {
            $res['risk_task_id'] = $this->riskTaskId;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->secOwner) {
            $res['sec_owner'] = $this->secOwner;
        }
        if (null !== $this->followers) {
            $res['followers'] = $this->followers;
        }
        if (null !== $this->riskSolutionId) {
            $res['risk_solution_id'] = $this->riskSolutionId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateRiskTaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['risk_task_id'])) {
            $model->riskTaskId = $map['risk_task_id'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['sec_owner'])) {
            $model->secOwner = $map['sec_owner'];
        }
        if (isset($map['followers'])) {
            if (!empty($map['followers'])) {
                $model->followers = $map['followers'];
            }
        }
        if (isset($map['risk_solution_id'])) {
            $model->riskSolutionId = $map['risk_solution_id'];
        }

        return $model;
    }
}
