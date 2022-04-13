<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AddContainerserviceMiddlewareconfigRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 命名空间
    /**
     * @var string
     */
    public $namespace;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // 应用服务名
    /**
     * @var string
     */
    public $containerServiceName;

    // 应用服务版本
    /**
     * @var string
     */
    public $containerServiceRevision;

    // 操作人账号
    /**
     * @var string
     */
    public $operator;

    // 中间件配置
    /**
     * @var string[]
     */
    public $middlewareConfigs;
    protected $_name = [
        'authToken'                => 'auth_token',
        'namespace'                => 'namespace',
        'workspaceGroup'           => 'workspace_group',
        'containerServiceName'     => 'container_service_name',
        'containerServiceRevision' => 'container_service_revision',
        'operator'                 => 'operator',
        'middlewareConfigs'        => 'middleware_configs',
    ];

    public function validate()
    {
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('containerServiceName', $this->containerServiceName, true);
        Model::validateRequired('containerServiceRevision', $this->containerServiceRevision, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('middlewareConfigs', $this->middlewareConfigs, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->containerServiceName) {
            $res['container_service_name'] = $this->containerServiceName;
        }
        if (null !== $this->containerServiceRevision) {
            $res['container_service_revision'] = $this->containerServiceRevision;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->middlewareConfigs) {
            $res['middleware_configs'] = $this->middlewareConfigs;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddContainerserviceMiddlewareconfigRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['container_service_name'])) {
            $model->containerServiceName = $map['container_service_name'];
        }
        if (isset($map['container_service_revision'])) {
            $model->containerServiceRevision = $map['container_service_revision'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['middleware_configs'])) {
            if (!empty($map['middleware_configs'])) {
                $model->middlewareConfigs = $map['middleware_configs'];
            }
        }

        return $model;
    }
}
