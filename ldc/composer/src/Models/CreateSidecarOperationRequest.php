<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CreateSidecarOperationRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 环境信息，对应workspace_group名称
    /**
     * @var string
     */
    public $env;

    // sidecar运维动作：
    // 接入 open
    // 升级 upgrade
    /**
     * @var string
     */
    public $serviceKey;

    // sidecar运维请求体
    /**
     * @var SidecarOperationTask
     */
    public $executeTaskRequest;
    protected $_name = [
        'authToken'          => 'auth_token',
        'env'                => 'env',
        'serviceKey'         => 'service_key',
        'executeTaskRequest' => 'execute_task_request',
    ];

    public function validate()
    {
        Model::validateRequired('env', $this->env, true);
        Model::validateRequired('serviceKey', $this->serviceKey, true);
        Model::validateRequired('executeTaskRequest', $this->executeTaskRequest, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->serviceKey) {
            $res['service_key'] = $this->serviceKey;
        }
        if (null !== $this->executeTaskRequest) {
            $res['execute_task_request'] = null !== $this->executeTaskRequest ? $this->executeTaskRequest->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSidecarOperationRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['service_key'])) {
            $model->serviceKey = $map['service_key'];
        }
        if (isset($map['execute_task_request'])) {
            $model->executeTaskRequest = SidecarOperationTask::fromMap($map['execute_task_request']);
        }

        return $model;
    }
}
