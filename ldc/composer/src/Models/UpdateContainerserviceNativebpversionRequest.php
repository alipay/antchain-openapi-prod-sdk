<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateContainerserviceNativebpversionRequest extends Model
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

    // 容器服务所在命名空间
    /**
     * @var string
     */
    public $namespace;

    // 云原生技术栈版本
    /**
     * @var string
     */
    public $nativeBuildPackVersion;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 环境名称
    /**
     * @var string
     */
    public $workspaceGroup;

    // 容器服务版本
    /**
     * @var string
     */
    public $revision;
    protected $_name = [
        'authToken'              => 'auth_token',
        'name'                   => 'name',
        'namespace'              => 'namespace',
        'nativeBuildPackVersion' => 'native_build_pack_version',
        'operator'               => 'operator',
        'workspaceGroup'         => 'workspace_group',
        'revision'               => 'revision',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('nativeBuildPackVersion', $this->nativeBuildPackVersion, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('revision', $this->revision, true);
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
        if (null !== $this->nativeBuildPackVersion) {
            $res['native_build_pack_version'] = $this->nativeBuildPackVersion;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->revision) {
            $res['revision'] = $this->revision;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateContainerserviceNativebpversionRequest
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
        if (isset($map['native_build_pack_version'])) {
            $model->nativeBuildPackVersion = $map['native_build_pack_version'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['revision'])) {
            $model->revision = $map['revision'];
        }

        return $model;
    }
}
