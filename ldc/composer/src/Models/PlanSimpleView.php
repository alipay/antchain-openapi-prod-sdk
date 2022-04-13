<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PlanSimpleView extends Model
{
    // 发布单涉及的应用个数
    /**
     * @example 1
     *
     * @var int
     */
    public $appCount;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTime;

    // 执行人
    /**
     * @example 张三
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
    public $finishedTime;

    // 发布单id
    /**
     * @example 0000000103039151
     *
     * @var string
     */
    public $id;

    // 运维单类型
    /**
     * @example REBOOT,ONLINE,OFFLINE
     *
     * @var string
     */
    public $mode;

    // 发布单标题
    /**
     * @example ldcconsole-deploy
     *
     * @var string
     */
    public $name;

    // 开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startedTime;

    // 发布单状态
    /**
     * @example FAILED,SUCCEEDED
     *
     * @var string
     */
    public $state;

    // 发布单号
    /**
     * @example ldcdev_201911061102282738
     *
     * @var string
     */
    public $timeSeriesId;

    // 发布单类型
    /**
     * @example CLOUD_NATIVE_GROUP_RELEASE
     *
     * @var string
     */
    public $type;

    // 工作空间组id
    /**
     * @example 438d8f51-4347-4a04-5
     *
     * @var string
     */
    public $workspaceGroupId;

    // Pod 数量
    /**
     * @example 1
     *
     * @var int
     */
    public $podCount;
    protected $_name = [
        'appCount'         => 'app_count',
        'createdTime'      => 'created_time',
        'executor'         => 'executor',
        'finishedTime'     => 'finished_time',
        'id'               => 'id',
        'mode'             => 'mode',
        'name'             => 'name',
        'startedTime'      => 'started_time',
        'state'            => 'state',
        'timeSeriesId'     => 'time_series_id',
        'type'             => 'type',
        'workspaceGroupId' => 'workspace_group_id',
        'podCount'         => 'pod_count',
    ];

    public function validate()
    {
        Model::validateRequired('appCount', $this->appCount, true);
        Model::validateRequired('createdTime', $this->createdTime, true);
        Model::validateRequired('executor', $this->executor, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('mode', $this->mode, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('timeSeriesId', $this->timeSeriesId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('finishedTime', $this->finishedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('startedTime', $this->startedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appCount) {
            $res['app_count'] = $this->appCount;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->executor) {
            $res['executor'] = $this->executor;
        }
        if (null !== $this->finishedTime) {
            $res['finished_time'] = $this->finishedTime;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->mode) {
            $res['mode'] = $this->mode;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->startedTime) {
            $res['started_time'] = $this->startedTime;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->timeSeriesId) {
            $res['time_series_id'] = $this->timeSeriesId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->workspaceGroupId) {
            $res['workspace_group_id'] = $this->workspaceGroupId;
        }
        if (null !== $this->podCount) {
            $res['pod_count'] = $this->podCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PlanSimpleView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_count'])) {
            $model->appCount = $map['app_count'];
        }
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['executor'])) {
            $model->executor = $map['executor'];
        }
        if (isset($map['finished_time'])) {
            $model->finishedTime = $map['finished_time'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['mode'])) {
            $model->mode = $map['mode'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['started_time'])) {
            $model->startedTime = $map['started_time'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['time_series_id'])) {
            $model->timeSeriesId = $map['time_series_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['workspace_group_id'])) {
            $model->workspaceGroupId = $map['workspace_group_id'];
        }
        if (isset($map['pod_count'])) {
            $model->podCount = $map['pod_count'];
        }

        return $model;
    }
}
