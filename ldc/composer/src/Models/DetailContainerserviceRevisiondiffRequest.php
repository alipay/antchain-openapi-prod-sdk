<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class DetailContainerserviceRevisiondiffRequest extends Model
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

    // 租户名
    /**
     * @var string
     */
    public $tenantName;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // 应用服务名称
    /**
     * @var string
     */
    public $containerServiceName;

    // 源版本号，不传取应用服务当前发布成功的版本
    /**
     * @var string
     */
    public $sourceRevision;

    // 目标版本号，当前需要对比的版本号
    /**
     * @var string
     */
    public $targetRevision;

    // 是否只显示摘要信息
    /**
     * @var bool
     */
    public $onlySummary;
    protected $_name = [
        'authToken'            => 'auth_token',
        'namespace'            => 'namespace',
        'tenantName'           => 'tenant_name',
        'workspaceGroup'       => 'workspace_group',
        'containerServiceName' => 'container_service_name',
        'sourceRevision'       => 'source_revision',
        'targetRevision'       => 'target_revision',
        'onlySummary'          => 'only_summary',
    ];

    public function validate()
    {
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('containerServiceName', $this->containerServiceName, true);
        Model::validateRequired('targetRevision', $this->targetRevision, true);
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
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->containerServiceName) {
            $res['container_service_name'] = $this->containerServiceName;
        }
        if (null !== $this->sourceRevision) {
            $res['source_revision'] = $this->sourceRevision;
        }
        if (null !== $this->targetRevision) {
            $res['target_revision'] = $this->targetRevision;
        }
        if (null !== $this->onlySummary) {
            $res['only_summary'] = $this->onlySummary;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailContainerserviceRevisiondiffRequest
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
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['container_service_name'])) {
            $model->containerServiceName = $map['container_service_name'];
        }
        if (isset($map['source_revision'])) {
            $model->sourceRevision = $map['source_revision'];
        }
        if (isset($map['target_revision'])) {
            $model->targetRevision = $map['target_revision'];
        }
        if (isset($map['only_summary'])) {
            $model->onlySummary = $map['only_summary'];
        }

        return $model;
    }
}
