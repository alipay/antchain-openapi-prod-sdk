<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AppSimpleInfo extends Model
{
    // 应用id
    /**
     * @example 0000000003324001
     *
     * @var string
     */
    public $appId;

    // 应用分组名字
    /**
     * @example testsvc001
     *
     * @var string
     */
    public $appInstanceGroupName;

    // 应用名字
    /**
     * @example testsvc001
     *
     * @var string
     */
    public $appName;

    // 执行者
    /**
     * @example 0000070959
     *
     * @var string
     */
    public $executor;

    // 结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $finishTime;

    // 分组个数
    /**
     * @example 3
     *
     * @var int
     */
    public $groupNum;

    // 分组策略
    /**
     * @example CELL
     *
     * @var string
     */
    public $groupStrategy;

    // id
    /**
     * @example 0000000003308001
     *
     * @var string
     */
    public $id;

    // 命名空间
    /**
     * @example dev
     *
     * @var string
     */
    public $namespace;

    // 操作类型
    /**
     * @example NORMAL,ROLLBACK
     *
     * @var string
     */
    public $operationType;

    // 发布版本号
    /**
     * @example 20191107223318149.4wng37w3
     *
     * @var string
     */
    public $revision;

    // 回滚revision
    /**
     * @example 13456
     *
     * @var string
     */
    public $rollbackRevision;

    // 是否可单独执行
    /**
     * @example true, false
     *
     * @var bool
     */
    public $standaloneExecutable;

    // 开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startTime;

    // 应用状态
    /**
     * @example DEPLOYED
     *
     * @var string
     */
    public $state;

    // Pod 数量
    /**
     * @example 1
     *
     * @var int
     */
    public $podCount;

    // 回滚原因
    /**
     * @example xxx
     *
     * @var string
     */
    public $rollbackReason;

    // 依赖的应用服务名
    /**
     * @example testappservice
     *
     * @var string[]
     */
    public $dependContainerServiceNames;

    // 错误信息
    /**
     * @example ok
     *
     * @var string
     */
    public $message;

    // 发布模板名称
    /**
     * @example TEST
     *
     * @var string
     */
    public $deploymentTemplateName;

    // 蓝绿部署单元名
    /**
     * @example GZ00A
     *
     * @var string
     */
    public $bgCellName;

    // 蓝绿发布类型
    /**
     * @example release
     *
     * @var string
     */
    public $bgGroupType;
    protected $_name = [
        'appId'                       => 'app_id',
        'appInstanceGroupName'        => 'app_instance_group_name',
        'appName'                     => 'app_name',
        'executor'                    => 'executor',
        'finishTime'                  => 'finish_time',
        'groupNum'                    => 'group_num',
        'groupStrategy'               => 'group_strategy',
        'id'                          => 'id',
        'namespace'                   => 'namespace',
        'operationType'               => 'operation_type',
        'revision'                    => 'revision',
        'rollbackRevision'            => 'rollback_revision',
        'standaloneExecutable'        => 'standalone_executable',
        'startTime'                   => 'start_time',
        'state'                       => 'state',
        'podCount'                    => 'pod_count',
        'rollbackReason'              => 'rollback_reason',
        'dependContainerServiceNames' => 'depend_container_service_names',
        'message'                     => 'message',
        'deploymentTemplateName'      => 'deployment_template_name',
        'bgCellName'                  => 'bg_cell_name',
        'bgGroupType'                 => 'bg_group_type',
    ];

    public function validate()
    {
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('appInstanceGroupName', $this->appInstanceGroupName, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('executor', $this->executor, true);
        Model::validateRequired('finishTime', $this->finishTime, true);
        Model::validateRequired('groupNum', $this->groupNum, true);
        Model::validateRequired('groupStrategy', $this->groupStrategy, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('operationType', $this->operationType, true);
        Model::validateRequired('revision', $this->revision, true);
        Model::validateRequired('standaloneExecutable', $this->standaloneExecutable, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('state', $this->state, true);
        Model::validatePattern('finishTime', $this->finishTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->appInstanceGroupName) {
            $res['app_instance_group_name'] = $this->appInstanceGroupName;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->executor) {
            $res['executor'] = $this->executor;
        }
        if (null !== $this->finishTime) {
            $res['finish_time'] = $this->finishTime;
        }
        if (null !== $this->groupNum) {
            $res['group_num'] = $this->groupNum;
        }
        if (null !== $this->groupStrategy) {
            $res['group_strategy'] = $this->groupStrategy;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }
        if (null !== $this->revision) {
            $res['revision'] = $this->revision;
        }
        if (null !== $this->rollbackRevision) {
            $res['rollback_revision'] = $this->rollbackRevision;
        }
        if (null !== $this->standaloneExecutable) {
            $res['standalone_executable'] = $this->standaloneExecutable;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->podCount) {
            $res['pod_count'] = $this->podCount;
        }
        if (null !== $this->rollbackReason) {
            $res['rollback_reason'] = $this->rollbackReason;
        }
        if (null !== $this->dependContainerServiceNames) {
            $res['depend_container_service_names'] = $this->dependContainerServiceNames;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->deploymentTemplateName) {
            $res['deployment_template_name'] = $this->deploymentTemplateName;
        }
        if (null !== $this->bgCellName) {
            $res['bg_cell_name'] = $this->bgCellName;
        }
        if (null !== $this->bgGroupType) {
            $res['bg_group_type'] = $this->bgGroupType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppSimpleInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['app_instance_group_name'])) {
            $model->appInstanceGroupName = $map['app_instance_group_name'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['executor'])) {
            $model->executor = $map['executor'];
        }
        if (isset($map['finish_time'])) {
            $model->finishTime = $map['finish_time'];
        }
        if (isset($map['group_num'])) {
            $model->groupNum = $map['group_num'];
        }
        if (isset($map['group_strategy'])) {
            $model->groupStrategy = $map['group_strategy'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['operation_type'])) {
            $model->operationType = $map['operation_type'];
        }
        if (isset($map['revision'])) {
            $model->revision = $map['revision'];
        }
        if (isset($map['rollback_revision'])) {
            $model->rollbackRevision = $map['rollback_revision'];
        }
        if (isset($map['standalone_executable'])) {
            $model->standaloneExecutable = $map['standalone_executable'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['pod_count'])) {
            $model->podCount = $map['pod_count'];
        }
        if (isset($map['rollback_reason'])) {
            $model->rollbackReason = $map['rollback_reason'];
        }
        if (isset($map['depend_container_service_names'])) {
            if (!empty($map['depend_container_service_names'])) {
                $model->dependContainerServiceNames = $map['depend_container_service_names'];
            }
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['deployment_template_name'])) {
            $model->deploymentTemplateName = $map['deployment_template_name'];
        }
        if (isset($map['bg_cell_name'])) {
            $model->bgCellName = $map['bg_cell_name'];
        }
        if (isset($map['bg_group_type'])) {
            $model->bgGroupType = $map['bg_group_type'];
        }

        return $model;
    }
}
