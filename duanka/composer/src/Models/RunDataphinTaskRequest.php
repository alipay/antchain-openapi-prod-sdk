<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class RunDataphinTaskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // name
    /**
     * @var string
     */
    public $name;

    // tenantId
    /**
     * @var string
     */
    public $tenantId;

    // operator
    /**
     * @var string
     */
    public $operator;

    // projectId
    /**
     * @var string
     */
    public $projectId;

    // params,json map
    /**
     * @var string
     */
    public $params;

    // taskId
    /**
     * @var string
     */
    public $taskId;
    protected $_name = [
        'authToken' => 'auth_token',
        'name'      => 'name',
        'tenantId'  => 'tenant_id',
        'operator'  => 'operator',
        'projectId' => 'project_id',
        'params'    => 'params',
        'taskId'    => 'task_id',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('params', $this->params, true);
        Model::validateRequired('taskId', $this->taskId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RunDataphinTaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }

        return $model;
    }
}
