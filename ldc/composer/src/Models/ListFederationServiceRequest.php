<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ListFederationServiceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroupName;

    // 命名空间
    /**
     * @var string
     */
    public $namespace;

    // 应用服务名称
    /**
     * @var string
     */
    public $containerServiceName;
    protected $_name = [
        'authToken'            => 'auth_token',
        'workspaceGroupName'   => 'workspace_group_name',
        'namespace'            => 'namespace',
        'containerServiceName' => 'container_service_name',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroupName', $this->workspaceGroupName, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('containerServiceName', $this->containerServiceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceGroupName) {
            $res['workspace_group_name'] = $this->workspaceGroupName;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->containerServiceName) {
            $res['container_service_name'] = $this->containerServiceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListFederationServiceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_group_name'])) {
            $model->workspaceGroupName = $map['workspace_group_name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['container_service_name'])) {
            $model->containerServiceName = $map['container_service_name'];
        }

        return $model;
    }
}
