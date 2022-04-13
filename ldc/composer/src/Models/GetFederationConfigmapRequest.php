<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class GetFederationConfigmapRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // FedConfigmap name
    /**
     * @var string
     */
    public $name;

    // 所属命名空间名称。
    /**
     * @var string
     */
    public $namespace;

    // workspaceGroup 名称
    /**
     * @var string
     */
    public $workspaceGroupName;
    protected $_name = [
        'authToken'          => 'auth_token',
        'name'               => 'name',
        'namespace'          => 'namespace',
        'workspaceGroupName' => 'workspace_group_name',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('workspaceGroupName', $this->workspaceGroupName, true);
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
     * @return GetFederationConfigmapRequest
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
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['workspace_group_name'])) {
            $model->workspaceGroupName = $map['workspace_group_name'];
        }

        return $model;
    }
}
