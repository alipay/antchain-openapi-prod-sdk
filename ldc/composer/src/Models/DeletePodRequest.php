<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class DeletePodRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 所属环境名称。
    /**
     * @var string
     */
    public $workspaceGroup;

    // 命名空间名称。
    /**
     * @var string
     */
    public $namespace;

    // 容器应用服务名称。
    /**
     * @var string
     */
    public $containerService;

    // 集群名称。
    /**
     * @var string
     */
    public $cluster;

    // pod名称。
    /**
     * @var string
     */
    public $name;
    protected $_name = [
        'authToken'        => 'auth_token',
        'workspaceGroup'   => 'workspace_group',
        'namespace'        => 'namespace',
        'containerService' => 'container_service',
        'cluster'          => 'cluster',
        'name'             => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('cluster', $this->cluster, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->containerService) {
            $res['container_service'] = $this->containerService;
        }
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeletePodRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['container_service'])) {
            $model->containerService = $map['container_service'];
        }
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
