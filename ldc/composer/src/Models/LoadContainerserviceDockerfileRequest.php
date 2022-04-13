<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class LoadContainerserviceDockerfileRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 应用服务名称
    /**
     * @var string
     */
    public $name;

    // 应用包地址，可以为相对目录，或者远程可访问存储地址.
    // 用于组装Dockerfile模板中对应的应用包获取地址
    /**
     * @var string
     */
    public $packageUrl;

    // 环境名称
    /**
     * @var string
     */
    public $workspaceGroup;

    // 容器服务所在namespace
    /**
     * @var string
     */
    public $namespace;
    protected $_name = [
        'authToken'      => 'auth_token',
        'name'           => 'name',
        'packageUrl'     => 'package_url',
        'workspaceGroup' => 'workspace_group',
        'namespace'      => 'namespace',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('packageUrl', $this->packageUrl, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('namespace', $this->namespace, true);
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
        if (null !== $this->packageUrl) {
            $res['package_url'] = $this->packageUrl;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LoadContainerserviceDockerfileRequest
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
        if (isset($map['package_url'])) {
            $model->packageUrl = $map['package_url'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }

        return $model;
    }
}
