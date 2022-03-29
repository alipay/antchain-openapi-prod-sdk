<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ConnectorJobInfo extends Model
{
    // 任务名称
    /**
     * @example odps_test
     *
     * @var string
     */
    public $name;

    // 任务的调度类型
    /**
     * @example cron：0/10 * * * * * ?
     *
     * @var string
     */
    public $type;

    // 创建时间
    /**
     * @example 2019-11-22 12:00:00
     *
     * @var string
     */
    public $gmtCreate;

    // 任务描述
    /**
     * @example 这是一段任务描述
     *
     * @var string
     */
    public $remark;

    // 任务状态
    /**
     * @example RUNNING
     *
     * @var string
     */
    public $status;

    // 所属应用
    /**
     * @example Connector
     *
     * @var string
     */
    public $app;

    // 工单状态
    /**
     * @example PENDING
     *
     * @var string
     */
    public $processStatus;

    // 系统标签
    /**
     * @example app:paycore
     *
     * @var string[]
     */
    public $sysLabels;

    // 应用标签
    /**
     * @example app:paycore
     *
     * @var string[]
     */
    public $userLabels;

    // 事件订阅是否开启
    /**
     * @example true, false
     *
     * @var bool
     */
    public $eventSubEnabled;
    protected $_name = [
        'name'            => 'name',
        'type'            => 'type',
        'gmtCreate'       => 'gmt_create',
        'remark'          => 'remark',
        'status'          => 'status',
        'app'             => 'app',
        'processStatus'   => 'process_status',
        'sysLabels'       => 'sys_labels',
        'userLabels'      => 'user_labels',
        'eventSubEnabled' => 'event_sub_enabled',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('app', $this->app, true);
        Model::validateRequired('processStatus', $this->processStatus, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->processStatus) {
            $res['process_status'] = $this->processStatus;
        }
        if (null !== $this->sysLabels) {
            $res['sys_labels'] = $this->sysLabels;
        }
        if (null !== $this->userLabels) {
            $res['user_labels'] = $this->userLabels;
        }
        if (null !== $this->eventSubEnabled) {
            $res['event_sub_enabled'] = $this->eventSubEnabled;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConnectorJobInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['process_status'])) {
            $model->processStatus = $map['process_status'];
        }
        if (isset($map['sys_labels'])) {
            if (!empty($map['sys_labels'])) {
                $model->sysLabels = $map['sys_labels'];
            }
        }
        if (isset($map['user_labels'])) {
            if (!empty($map['user_labels'])) {
                $model->userLabels = $map['user_labels'];
            }
        }
        if (isset($map['event_sub_enabled'])) {
            $model->eventSubEnabled = $map['event_sub_enabled'];
        }

        return $model;
    }
}
