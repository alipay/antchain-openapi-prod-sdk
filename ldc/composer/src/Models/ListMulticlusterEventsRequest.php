<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ListMulticlusterEventsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 环境组名称
    /**
     * @var string
     */
    public $workspaceGroup;

    // 命名空间
    /**
     * @var string
     */
    public $namespace;

    // 容器服务名称
    /**
     * @var string
     */
    public $containerService;
    protected $_name = [
        'authToken'        => 'auth_token',
        'workspaceGroup'   => 'workspace_group',
        'namespace'        => 'namespace',
        'containerService' => 'container_service',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListMulticlusterEventsRequest
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

        return $model;
    }
}
