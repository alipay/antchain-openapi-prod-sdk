<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AppDeployTask extends Model
{
    // 操作code
    /**
     * @example CLOUD_NATIVE_DEPLOY
     *
     * @var string
     */
    public $actionCode;

    // 当前任务的发布单元列表
    /**
     * @example
     *
     * @var AppDeployCell[]
     */
    public $appDeployCells;

    // 是否支持确认操作
    /**
     * @example true, false
     *
     * @var bool
     */
    public $confirmSupported;

    // 上下文数据，json字符串
    /**
     * @example {"lks_service_id":"0000000104055151","regionId":"empty_region_id","cellStagePartition":"[]","multiClusterContainerServiceRevisionId":"0000000004096001"}
     *
     * @var string
     */
    public $data;

    // id
    /**
     * @example 0000000103873151
     *
     * @var string
     */
    public $id;

    // 是否支持跳过操作
    /**
     * @example true,false
     *
     * @var bool
     */
    public $ignoreSupported;

    // 是否支持重试操作
    /**
     * @example true,false
     *
     * @var bool
     */
    public $retrySupported;

    // 当前状态
    /**
     * @example EXECUTING,SUCCESSED,FAILED等
     *
     * @var string
     */
    public $state;

    // 开始时间。
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startedTime;

    // 结束时间。
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $finishedTime;

    // message detail
    /**
     * @example {"deploymentStatus":{"test0329jf":[]}}
     *
     * @var string
     */
    public $messageDetail;

    // 任务类型
    /**
     * @example opscloud
     *
     * @var string
     */
    public $taskType;

    // 任务显示名称，自定义卡点任务才会有值
    /**
     * @example test
     *
     * @var string
     */
    public $taskDisplayName;
    protected $_name = [
        'actionCode'       => 'action_code',
        'appDeployCells'   => 'app_deploy_cells',
        'confirmSupported' => 'confirm_supported',
        'data'             => 'data',
        'id'               => 'id',
        'ignoreSupported'  => 'ignore_supported',
        'retrySupported'   => 'retry_supported',
        'state'            => 'state',
        'startedTime'      => 'started_time',
        'finishedTime'     => 'finished_time',
        'messageDetail'    => 'message_detail',
        'taskType'         => 'task_type',
        'taskDisplayName'  => 'task_display_name',
    ];

    public function validate()
    {
        Model::validateRequired('actionCode', $this->actionCode, true);
        Model::validateRequired('appDeployCells', $this->appDeployCells, true);
        Model::validateRequired('confirmSupported', $this->confirmSupported, true);
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('ignoreSupported', $this->ignoreSupported, true);
        Model::validateRequired('retrySupported', $this->retrySupported, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('startedTime', $this->startedTime, true);
        Model::validateRequired('finishedTime', $this->finishedTime, true);
        Model::validatePattern('startedTime', $this->startedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('finishedTime', $this->finishedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actionCode) {
            $res['action_code'] = $this->actionCode;
        }
        if (null !== $this->appDeployCells) {
            $res['app_deploy_cells'] = [];
            if (null !== $this->appDeployCells && \is_array($this->appDeployCells)) {
                $n = 0;
                foreach ($this->appDeployCells as $item) {
                    $res['app_deploy_cells'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->confirmSupported) {
            $res['confirm_supported'] = $this->confirmSupported;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->ignoreSupported) {
            $res['ignore_supported'] = $this->ignoreSupported;
        }
        if (null !== $this->retrySupported) {
            $res['retry_supported'] = $this->retrySupported;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->startedTime) {
            $res['started_time'] = $this->startedTime;
        }
        if (null !== $this->finishedTime) {
            $res['finished_time'] = $this->finishedTime;
        }
        if (null !== $this->messageDetail) {
            $res['message_detail'] = $this->messageDetail;
        }
        if (null !== $this->taskType) {
            $res['task_type'] = $this->taskType;
        }
        if (null !== $this->taskDisplayName) {
            $res['task_display_name'] = $this->taskDisplayName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppDeployTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action_code'])) {
            $model->actionCode = $map['action_code'];
        }
        if (isset($map['app_deploy_cells'])) {
            if (!empty($map['app_deploy_cells'])) {
                $model->appDeployCells = [];
                $n                     = 0;
                foreach ($map['app_deploy_cells'] as $item) {
                    $model->appDeployCells[$n++] = null !== $item ? AppDeployCell::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['confirm_supported'])) {
            $model->confirmSupported = $map['confirm_supported'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['ignore_supported'])) {
            $model->ignoreSupported = $map['ignore_supported'];
        }
        if (isset($map['retry_supported'])) {
            $model->retrySupported = $map['retry_supported'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['started_time'])) {
            $model->startedTime = $map['started_time'];
        }
        if (isset($map['finished_time'])) {
            $model->finishedTime = $map['finished_time'];
        }
        if (isset($map['message_detail'])) {
            $model->messageDetail = $map['message_detail'];
        }
        if (isset($map['task_type'])) {
            $model->taskType = $map['task_type'];
        }
        if (isset($map['task_display_name'])) {
            $model->taskDisplayName = $map['task_display_name'];
        }

        return $model;
    }
}
