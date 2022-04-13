<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ListContainerservicePodRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 容器服务名称
    /**
     * @var string
     */
    public $containerServiceName;

    // namespace
    /**
     * @var string
     */
    public $namespace;

    // 工作空间组名称。
    /**
     * @var string
     */
    public $workspaceGroupName;
    protected $_name = [
        'authToken'            => 'auth_token',
        'containerServiceName' => 'container_service_name',
        'namespace'            => 'namespace',
        'workspaceGroupName'   => 'workspace_group_name',
    ];

    public function validate()
    {
        Model::validateRequired('containerServiceName', $this->containerServiceName, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('workspaceGroupName', $this->workspaceGroupName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->containerServiceName) {
            $res['container_service_name'] = $this->containerServiceName;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->workspaceGroupName) {
            $res['workspace_group_name'] = $this->workspaceGroupName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListContainerservicePodRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['container_service_name'])) {
            $model->containerServiceName = $map['container_service_name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['workspace_group_name'])) {
            $model->workspaceGroupName = $map['workspace_group_name'];
        }

        return $model;
    }
}
