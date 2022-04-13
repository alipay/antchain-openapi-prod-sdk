<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ContainerServiceRevision extends Model
{
    // 应用信息。
    /**
     * @example {}
     *
     * @var AppInfo
     */
    public $appInfo;

    // 容器服务配置。
    /**
     * @example {}
     *
     * @var ContainerServiceConfig
     */
    public $containerServiceConfig;

    // 容器服务服务名称。
    /**
     * @example app-svc
     *
     * @var string
     */
    public $containerServiceName;

    // 容器服务发布信息
    /**
     * @example
     *
     * @var ContainerServiceReleaseInfo
     */
    public $containerServiceReleaseInfo;

    // 创建时间。
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTime;

    // 发布状态。
    /**
     * @example SUCCEED
     *
     * @var string
     */
    public $deployStatus;

    // container service description
    /**
     * @example container service description
     *
     * @var string
     */
    public $description;

    // 关联的最近一次发布单。
    /**
     * @example 201905230303580000
     *
     * @var string
     */
    public $lastPlanId;

    // 元数据状态。
    /**
     * @example CREATED
     *
     * @var string
     */
    public $metaStatus;

    // 更新时间。
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $modifiedTime;

    // 所属命名空间名称。
    /**
     * @example default
     *
     * @var string
     */
    public $namespace;

    // 版本提交人。
    /**
     * @example 张三
     *
     * @var string
     */
    public $operator;

    // 版本备注。
    /**
     * @example 更新镜像
     *
     * @var string
     */
    public $remarks;

    // 版本号。
    /**
     * @example test.tege56tyh878
     *
     * @var string
     */
    public $revision;
    protected $_name = [
        'appInfo'                     => 'app_info',
        'containerServiceConfig'      => 'container_service_config',
        'containerServiceName'        => 'container_service_name',
        'containerServiceReleaseInfo' => 'container_service_release_info',
        'createdTime'                 => 'created_time',
        'deployStatus'                => 'deploy_status',
        'description'                 => 'description',
        'lastPlanId'                  => 'last_plan_id',
        'metaStatus'                  => 'meta_status',
        'modifiedTime'                => 'modified_time',
        'namespace'                   => 'namespace',
        'operator'                    => 'operator',
        'remarks'                     => 'remarks',
        'revision'                    => 'revision',
    ];

    public function validate()
    {
        Model::validateRequired('appInfo', $this->appInfo, true);
        Model::validateRequired('containerServiceConfig', $this->containerServiceConfig, true);
        Model::validateRequired('containerServiceName', $this->containerServiceName, true);
        Model::validateRequired('createdTime', $this->createdTime, true);
        Model::validateRequired('modifiedTime', $this->modifiedTime, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('revision', $this->revision, true);
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appInfo) {
            $res['app_info'] = null !== $this->appInfo ? $this->appInfo->toMap() : null;
        }
        if (null !== $this->containerServiceConfig) {
            $res['container_service_config'] = null !== $this->containerServiceConfig ? $this->containerServiceConfig->toMap() : null;
        }
        if (null !== $this->containerServiceName) {
            $res['container_service_name'] = $this->containerServiceName;
        }
        if (null !== $this->containerServiceReleaseInfo) {
            $res['container_service_release_info'] = null !== $this->containerServiceReleaseInfo ? $this->containerServiceReleaseInfo->toMap() : null;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->deployStatus) {
            $res['deploy_status'] = $this->deployStatus;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->lastPlanId) {
            $res['last_plan_id'] = $this->lastPlanId;
        }
        if (null !== $this->metaStatus) {
            $res['meta_status'] = $this->metaStatus;
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->remarks) {
            $res['remarks'] = $this->remarks;
        }
        if (null !== $this->revision) {
            $res['revision'] = $this->revision;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerServiceRevision
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_info'])) {
            $model->appInfo = AppInfo::fromMap($map['app_info']);
        }
        if (isset($map['container_service_config'])) {
            $model->containerServiceConfig = ContainerServiceConfig::fromMap($map['container_service_config']);
        }
        if (isset($map['container_service_name'])) {
            $model->containerServiceName = $map['container_service_name'];
        }
        if (isset($map['container_service_release_info'])) {
            $model->containerServiceReleaseInfo = ContainerServiceReleaseInfo::fromMap($map['container_service_release_info']);
        }
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['deploy_status'])) {
            $model->deployStatus = $map['deploy_status'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['last_plan_id'])) {
            $model->lastPlanId = $map['last_plan_id'];
        }
        if (isset($map['meta_status'])) {
            $model->metaStatus = $map['meta_status'];
        }
        if (isset($map['modified_time'])) {
            $model->modifiedTime = $map['modified_time'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['remarks'])) {
            $model->remarks = $map['remarks'];
        }
        if (isset($map['revision'])) {
            $model->revision = $map['revision'];
        }

        return $model;
    }
}
