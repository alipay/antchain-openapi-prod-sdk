<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CreateContainerserviceDeploymentRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 容器服务列表。
    /**
     * @var SontainerServicesList
     */
    public $containerServices;

    // 是否自动执行，默认false
    /**
     * @var bool
     */
    public $isAutoExecute;

    // 所属命名空间
    /**
     * @var string
     */
    public $namespace;

    // 默认CLOUD_NATIVE_GROUP_RELEASE
    /**
     * @var string
     */
    public $opsType;

    // operator调用专用字段，ReleasePlan唯一标识
    /**
     * @var string
     */
    public $releasePlanUniqueId;

    // tenant 名字，operator调用专用字段
    /**
     * @var string
     */
    public $tenantName;

    // 发布单名称。
    /**
     * @var string
     */
    public $title;

    // 所属工作空间组名称。
    /**
     * @var string
     */
    public $workspaceGroup;

    // 审批人账号id
    /**
     * @var string[]
     */
    public $assigneeIds;

    // 操作人账号，lks1.23.0才支持
    /**
     * @var string
     */
    public $operator;

    // 灰度发布的参数，仅当ops_type为GRAY_RELEASE时生效
    /**
     * @var GrayReleaseConfig
     */
    public $grayReleaseConfig;
    protected $_name = [
        'authToken'           => 'auth_token',
        'containerServices'   => 'container_services',
        'isAutoExecute'       => 'is_auto_execute',
        'namespace'           => 'namespace',
        'opsType'             => 'ops_type',
        'releasePlanUniqueId' => 'release_plan_unique_id',
        'tenantName'          => 'tenant_name',
        'title'               => 'title',
        'workspaceGroup'      => 'workspace_group',
        'assigneeIds'         => 'assignee_ids',
        'operator'            => 'operator',
        'grayReleaseConfig'   => 'gray_release_config',
    ];

    public function validate()
    {
        Model::validateRequired('containerServices', $this->containerServices, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->containerServices) {
            $res['container_services'] = null !== $this->containerServices ? $this->containerServices->toMap() : null;
        }
        if (null !== $this->isAutoExecute) {
            $res['is_auto_execute'] = $this->isAutoExecute;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->opsType) {
            $res['ops_type'] = $this->opsType;
        }
        if (null !== $this->releasePlanUniqueId) {
            $res['release_plan_unique_id'] = $this->releasePlanUniqueId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->assigneeIds) {
            $res['assignee_ids'] = $this->assigneeIds;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->grayReleaseConfig) {
            $res['gray_release_config'] = null !== $this->grayReleaseConfig ? $this->grayReleaseConfig->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContainerserviceDeploymentRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['container_services'])) {
            $model->containerServices = SontainerServicesList::fromMap($map['container_services']);
        }
        if (isset($map['is_auto_execute'])) {
            $model->isAutoExecute = $map['is_auto_execute'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['ops_type'])) {
            $model->opsType = $map['ops_type'];
        }
        if (isset($map['release_plan_unique_id'])) {
            $model->releasePlanUniqueId = $map['release_plan_unique_id'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['assignee_ids'])) {
            if (!empty($map['assignee_ids'])) {
                $model->assigneeIds = $map['assignee_ids'];
            }
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['gray_release_config'])) {
            $model->grayReleaseConfig = GrayReleaseConfig::fromMap($map['gray_release_config']);
        }

        return $model;
    }
}
