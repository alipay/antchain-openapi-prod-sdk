<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ExecOpsplanAppopstaskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 操作类型
    /**
     * @var string
     */
    public $controlType;

    // pipeline stage 名字
    /**
     * @var string
     */
    public $actionCode;

    // 任务id
    /**
     * @var string
     */
    public $id;

    // operator名字
    /**
     * @var string
     */
    public $operator;

    // [huanyu场景使用]，当cancel_plan_flag为true, control_type=CANCEL且action_code=CLOUD_NATIVE_DEPLOY时，整个运维单将被取消
    /**
     * @var bool
     */
    public $cancelPlanFlag;
    protected $_name = [
        'authToken'      => 'auth_token',
        'controlType'    => 'control_type',
        'actionCode'     => 'action_code',
        'id'             => 'id',
        'operator'       => 'operator',
        'cancelPlanFlag' => 'cancel_plan_flag',
    ];

    public function validate()
    {
        Model::validateRequired('controlType', $this->controlType, true);
        Model::validateRequired('actionCode', $this->actionCode, true);
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->controlType) {
            $res['control_type'] = $this->controlType;
        }
        if (null !== $this->actionCode) {
            $res['action_code'] = $this->actionCode;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->cancelPlanFlag) {
            $res['cancel_plan_flag'] = $this->cancelPlanFlag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecOpsplanAppopstaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['control_type'])) {
            $model->controlType = $map['control_type'];
        }
        if (isset($map['action_code'])) {
            $model->actionCode = $map['action_code'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['cancel_plan_flag'])) {
            $model->cancelPlanFlag = $map['cancel_plan_flag'];
        }

        return $model;
    }
}
