<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class ImportDataphinTaskRequest extends Model
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

    // 描述
    /**
     * @var string
     */
    public $desc;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 项目ID
    /**
     * @var string
     */
    public $projectId;

    // projectTaskPath项目任务地址
    /**
     * @var string
     */
    public $projectTaskPath;

    // tenantId租户id
    /**
     * @var string
     */
    public $tenantId;

    // dt=20240226
    /**
     * @var string
     */
    public $params;

    // sql
    /**
     * @var string
     */
    public $sql;
    protected $_name = [
        'authToken'       => 'auth_token',
        'name'            => 'name',
        'desc'            => 'desc',
        'operator'        => 'operator',
        'projectId'       => 'project_id',
        'projectTaskPath' => 'project_task_path',
        'tenantId'        => 'tenant_id',
        'params'          => 'params',
        'sql'             => 'sql',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('desc', $this->desc, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('projectTaskPath', $this->projectTaskPath, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('params', $this->params, true);
        Model::validateRequired('sql', $this->sql, true);
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
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->projectTaskPath) {
            $res['project_task_path'] = $this->projectTaskPath;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }
        if (null !== $this->sql) {
            $res['sql'] = $this->sql;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportDataphinTaskRequest
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
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['project_task_path'])) {
            $model->projectTaskPath = $map['project_task_path'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }
        if (isset($map['sql'])) {
            $model->sql = $map['sql'];
        }

        return $model;
    }
}
