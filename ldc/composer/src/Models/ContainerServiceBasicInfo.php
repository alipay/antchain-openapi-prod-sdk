<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ContainerServiceBasicInfo extends Model
{
    // 镜像构建id。
    /**
     * @example 2152208959
     *
     * @var string
     */
    public $appBuild;

    // 应用id
    /**
     * @example 00000000123
     *
     * @var string
     */
    public $appId;

    // 应用名称。
    /**
     * @example cashier
     *
     * @var string
     */
    public $appName;

    // 创建时间。
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTime;

    // 当前最新镜像。
    /**
     * @example nginx:latest
     *
     * @var string
     */
    public $currentImage;

    // 发布中的版本。
    /**
     * @example test.123gthy678uj
     *
     * @var string
     */
    public $deployingRevision;

    // 发布部署状态。
    /**
     * @example SUCCEEDED
     *
     * @var string
     */
    public $deploymentStatus;

    // container service描述
    /**
     * @example container service描述
     *
     * @var string
     */
    public $description;

    // 当前应用服务草稿对应的版本号。
    /**
     * @example test.12hyh676yh78
     *
     * @var string
     */
    public $draftedRevision;

    // 草稿更新时间。
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $draftedTime;

    // 最近一次发布的版本。
    /**
     * @example test.12hgyhu78uji8
     *
     * @var string
     */
    public $lastDeployedRevision;

    // 最近一次发布的结束时间。
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $lastDeployEndTime;

    // 最近一次关联的发布单。
    /**
     * @example 201905230303580000
     *
     * @var string
     */
    public $lastDeployPlanId;

    // 最近一次发布的开始时间。
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $lastDeployStartTime;

    // 容器服务元数据状态。
    /**
     * @example DEPLOYED
     *
     * @var string
     */
    public $metadataStatus;

    // 创建时间。
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $modifiedTime;

    // 容器应用服务名称。
    /**
     * @example app-service
     *
     * @var string
     */
    public $name;

    // 所属命名空间名称。
    /**
     * @example dev
     *
     * @var string
     */
    public $namespace;

    // 负责人。
    /**
     * @example 张三
     *
     * @var string
     */
    public $owner;

    // 容器服务的Pod列表。
    /**
     * @example [{}]
     *
     * @var PodInfo[]
     */
    public $podList;

    // 更新中pod数量
    /**
     * @example 4
     *
     * @var string
     */
    public $processingCount;

    // replicas数量
    /**
     * @example 16
     *
     * @var string
     */
    public $replicas;

    // runding pod数量
    /**
     * @example 5
     *
     * @var string
     */
    public $runningCount;

    // 运行时版本。
    /**
     * @example test.123gthy678uj
     *
     * @var string
     */
    public $runtimeRevision;

    // 所属工作空间组名称。
    /**
     * @example dev
     *
     * @var string
     */
    public $workspaceGroup;

    // 容器服务Service列表。
    /**
     * @example [{}]
     *
     * @var LoadBalancerService[]
     */
    public $serviceList;

    // message信息
    /**
     * @example {"DELETE_CONTAINER_SERVICE":"Failed to xxx"}
     *
     * @var string
     */
    public $messageDetail;
    protected $_name = [
        'appBuild'             => 'app_build',
        'appId'                => 'app_id',
        'appName'              => 'app_name',
        'createdTime'          => 'created_time',
        'currentImage'         => 'current_image',
        'deployingRevision'    => 'deploying_revision',
        'deploymentStatus'     => 'deployment_status',
        'description'          => 'description',
        'draftedRevision'      => 'drafted_revision',
        'draftedTime'          => 'drafted_time',
        'lastDeployedRevision' => 'last_deployed_revision',
        'lastDeployEndTime'    => 'last_deploy_end_time',
        'lastDeployPlanId'     => 'last_deploy_plan_id',
        'lastDeployStartTime'  => 'last_deploy_start_time',
        'metadataStatus'       => 'metadata_status',
        'modifiedTime'         => 'modified_time',
        'name'                 => 'name',
        'namespace'            => 'namespace',
        'owner'                => 'owner',
        'podList'              => 'pod_list',
        'processingCount'      => 'processing_count',
        'replicas'             => 'replicas',
        'runningCount'         => 'running_count',
        'runtimeRevision'      => 'runtime_revision',
        'workspaceGroup'       => 'workspace_group',
        'serviceList'          => 'service_list',
        'messageDetail'        => 'message_detail',
    ];

    public function validate()
    {
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('createdTime', $this->createdTime, true);
        Model::validateRequired('metadataStatus', $this->metadataStatus, true);
        Model::validateRequired('modifiedTime', $this->modifiedTime, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('owner', $this->owner, true);
        Model::validateRequired('podList', $this->podList, true);
        Model::validateRequired('replicas', $this->replicas, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('draftedTime', $this->draftedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('lastDeployEndTime', $this->lastDeployEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('lastDeployStartTime', $this->lastDeployStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appBuild) {
            $res['app_build'] = $this->appBuild;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->currentImage) {
            $res['current_image'] = $this->currentImage;
        }
        if (null !== $this->deployingRevision) {
            $res['deploying_revision'] = $this->deployingRevision;
        }
        if (null !== $this->deploymentStatus) {
            $res['deployment_status'] = $this->deploymentStatus;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->draftedRevision) {
            $res['drafted_revision'] = $this->draftedRevision;
        }
        if (null !== $this->draftedTime) {
            $res['drafted_time'] = $this->draftedTime;
        }
        if (null !== $this->lastDeployedRevision) {
            $res['last_deployed_revision'] = $this->lastDeployedRevision;
        }
        if (null !== $this->lastDeployEndTime) {
            $res['last_deploy_end_time'] = $this->lastDeployEndTime;
        }
        if (null !== $this->lastDeployPlanId) {
            $res['last_deploy_plan_id'] = $this->lastDeployPlanId;
        }
        if (null !== $this->lastDeployStartTime) {
            $res['last_deploy_start_time'] = $this->lastDeployStartTime;
        }
        if (null !== $this->metadataStatus) {
            $res['metadata_status'] = $this->metadataStatus;
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->podList) {
            $res['pod_list'] = [];
            if (null !== $this->podList && \is_array($this->podList)) {
                $n = 0;
                foreach ($this->podList as $item) {
                    $res['pod_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->processingCount) {
            $res['processing_count'] = $this->processingCount;
        }
        if (null !== $this->replicas) {
            $res['replicas'] = $this->replicas;
        }
        if (null !== $this->runningCount) {
            $res['running_count'] = $this->runningCount;
        }
        if (null !== $this->runtimeRevision) {
            $res['runtime_revision'] = $this->runtimeRevision;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->serviceList) {
            $res['service_list'] = [];
            if (null !== $this->serviceList && \is_array($this->serviceList)) {
                $n = 0;
                foreach ($this->serviceList as $item) {
                    $res['service_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->messageDetail) {
            $res['message_detail'] = $this->messageDetail;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerServiceBasicInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_build'])) {
            $model->appBuild = $map['app_build'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['current_image'])) {
            $model->currentImage = $map['current_image'];
        }
        if (isset($map['deploying_revision'])) {
            $model->deployingRevision = $map['deploying_revision'];
        }
        if (isset($map['deployment_status'])) {
            $model->deploymentStatus = $map['deployment_status'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['drafted_revision'])) {
            $model->draftedRevision = $map['drafted_revision'];
        }
        if (isset($map['drafted_time'])) {
            $model->draftedTime = $map['drafted_time'];
        }
        if (isset($map['last_deployed_revision'])) {
            $model->lastDeployedRevision = $map['last_deployed_revision'];
        }
        if (isset($map['last_deploy_end_time'])) {
            $model->lastDeployEndTime = $map['last_deploy_end_time'];
        }
        if (isset($map['last_deploy_plan_id'])) {
            $model->lastDeployPlanId = $map['last_deploy_plan_id'];
        }
        if (isset($map['last_deploy_start_time'])) {
            $model->lastDeployStartTime = $map['last_deploy_start_time'];
        }
        if (isset($map['metadata_status'])) {
            $model->metadataStatus = $map['metadata_status'];
        }
        if (isset($map['modified_time'])) {
            $model->modifiedTime = $map['modified_time'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['pod_list'])) {
            if (!empty($map['pod_list'])) {
                $model->podList = [];
                $n              = 0;
                foreach ($map['pod_list'] as $item) {
                    $model->podList[$n++] = null !== $item ? PodInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['processing_count'])) {
            $model->processingCount = $map['processing_count'];
        }
        if (isset($map['replicas'])) {
            $model->replicas = $map['replicas'];
        }
        if (isset($map['running_count'])) {
            $model->runningCount = $map['running_count'];
        }
        if (isset($map['runtime_revision'])) {
            $model->runtimeRevision = $map['runtime_revision'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['service_list'])) {
            if (!empty($map['service_list'])) {
                $model->serviceList = [];
                $n                  = 0;
                foreach ($map['service_list'] as $item) {
                    $model->serviceList[$n++] = null !== $item ? LoadBalancerService::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['message_detail'])) {
            $model->messageDetail = $map['message_detail'];
        }

        return $model;
    }
}
