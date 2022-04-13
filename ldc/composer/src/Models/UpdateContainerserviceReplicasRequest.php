<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateContainerserviceReplicasRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 扩缩容replica详情
    /**
     * @var FixedReplicaElasticConfig
     */
    public $fixedReplicaElasticConfig;

    // 容器应用服务名称。
    /**
     * @var string
     */
    public $name;

    // namespace
    /**
     * @var string
     */
    public $namespace;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 容器应用服务版本号。
    /**
     * @var string
     */
    public $revision;

    // 所属工作空间组名称。
    /**
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'authToken'                 => 'auth_token',
        'fixedReplicaElasticConfig' => 'fixed_replica_elastic_config',
        'name'                      => 'name',
        'namespace'                 => 'namespace',
        'operator'                  => 'operator',
        'revision'                  => 'revision',
        'workspaceGroup'            => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('fixedReplicaElasticConfig', $this->fixedReplicaElasticConfig, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('revision', $this->revision, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->fixedReplicaElasticConfig) {
            $res['fixed_replica_elastic_config'] = null !== $this->fixedReplicaElasticConfig ? $this->fixedReplicaElasticConfig->toMap() : null;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->revision) {
            $res['revision'] = $this->revision;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateContainerserviceReplicasRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['fixed_replica_elastic_config'])) {
            $model->fixedReplicaElasticConfig = FixedReplicaElasticConfig::fromMap($map['fixed_replica_elastic_config']);
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['revision'])) {
            $model->revision = $map['revision'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}
