<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ConnectorJob extends Model
{
    // cron表达式描述任务的触发详情。
    /**
     * @example * 0/1 11 * * * ？
     *
     * @var string
     */
    public $cron;

    // sql过滤
    /**
     * @example uid=_01_
     *
     * @var string
     */
    public $filter;

    // 任务名称
    /**
     * @example odps_Gplus_mq
     *
     * @var string
     */
    public $name;

    // 限流值
    /**
     * @example 1000
     *
     * @var int
     */
    public $rate;

    // 描述这个任务的具体详情
    /**
     * @example 这是一段描述
     *
     * @var string
     */
    public $remark;

    // 去向信息的配置
    /**
     * @example [{"key":"topic", "value":"TP_TEST", "display":"topic展示"}]
     *
     * @var UIKeyVauleTemplate[]
     */
    public $sinkConfigs;

    // 去向类型
    /**
     * @example SOFAMQ
     *
     * @var string
     */
    public $sinkType;

    // 数据源的配置项列表
    /**
     * @example [{"key":"table", "value":"odps_xxx_table", "display":"表名称"}]
     *
     * @var UIKeyVauleTemplate[]
     */
    public $sourceConfigs;

    // 来源类型
    /**
     * @example ODPS
     *
     * @var string
     */
    public $sourceType;

    // 当任务类型选择为once时，会有本字段，表示具体执行的时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $time;

    // 数据转化
    /**
     * @example [{"name":"uid","type":"String","alias":"userId","cast_type":"Long"}]
     *
     * @var ColumnConfig[]
     */
    public $transformation;

    // 任务的调度类型
    /**
     * @example CRON
     *
     * @var string
     */
    public $type;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 任务所有者
    /**
     * @example antconnector
     *
     * @var string
     */
    public $app;

    // stepflow平台的某个模板的编号
    /**
     * @example xxx
     *
     * @var string
     */
    public $stepflowTemplateId;

    // 单例模式
    /**
     * @example true, false
     *
     * @var bool
     */
    public $singleton;

    // 事件订阅是否开启
    /**
     * @example true, false
     *
     * @var bool
     */
    public $eventSubEnabled;

    // 事件订阅的配置集合
    /**
     * @example
     *
     * @var EventSubConfig[]
     */
    public $eventSubConfigs;

    // 可接受延迟时间
    /**
     * @example 10000
     *
     * @var int
     */
    public $acceptableExecutionInterval;

    // 状态
    /**
     * @example ENABLE、DISABLE
     *
     * @var string
     */
    public $status;

    // 工单状态
    /**
     * @example APPROVED
     *
     * @var string
     */
    public $processStatus;

    // 是否自动回收实例
    /**
     * @example true, false
     *
     * @var bool
     */
    public $autoRecycleInstance;
    protected $_name = [
        'cron'                        => 'cron',
        'filter'                      => 'filter',
        'name'                        => 'name',
        'rate'                        => 'rate',
        'remark'                      => 'remark',
        'sinkConfigs'                 => 'sink_configs',
        'sinkType'                    => 'sink_type',
        'sourceConfigs'               => 'source_configs',
        'sourceType'                  => 'source_type',
        'time'                        => 'time',
        'transformation'              => 'transformation',
        'type'                        => 'type',
        'gmtCreate'                   => 'gmt_create',
        'app'                         => 'app',
        'stepflowTemplateId'          => 'stepflow_template_id',
        'singleton'                   => 'singleton',
        'eventSubEnabled'             => 'event_sub_enabled',
        'eventSubConfigs'             => 'event_sub_configs',
        'acceptableExecutionInterval' => 'acceptable_execution_interval',
        'status'                      => 'status',
        'processStatus'               => 'process_status',
        'autoRecycleInstance'         => 'auto_recycle_instance',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('sinkConfigs', $this->sinkConfigs, true);
        Model::validateRequired('sinkType', $this->sinkType, true);
        Model::validateRequired('sourceConfigs', $this->sourceConfigs, true);
        Model::validateRequired('sourceType', $this->sourceType, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('singleton', $this->singleton, true);
        Model::validateRequired('autoRecycleInstance', $this->autoRecycleInstance, true);
        Model::validateMinimum('rate', $this->rate, 0);
        Model::validateMaxLength('remark', $this->remark, 128);
        Model::validatePattern('time', $this->time, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cron) {
            $res['cron'] = $this->cron;
        }
        if (null !== $this->filter) {
            $res['filter'] = $this->filter;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->rate) {
            $res['rate'] = $this->rate;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->sinkConfigs) {
            $res['sink_configs'] = [];
            if (null !== $this->sinkConfigs && \is_array($this->sinkConfigs)) {
                $n = 0;
                foreach ($this->sinkConfigs as $item) {
                    $res['sink_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->sinkType) {
            $res['sink_type'] = $this->sinkType;
        }
        if (null !== $this->sourceConfigs) {
            $res['source_configs'] = [];
            if (null !== $this->sourceConfigs && \is_array($this->sourceConfigs)) {
                $n = 0;
                foreach ($this->sourceConfigs as $item) {
                    $res['source_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->sourceType) {
            $res['source_type'] = $this->sourceType;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->transformation) {
            $res['transformation'] = [];
            if (null !== $this->transformation && \is_array($this->transformation)) {
                $n = 0;
                foreach ($this->transformation as $item) {
                    $res['transformation'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->stepflowTemplateId) {
            $res['stepflow_template_id'] = $this->stepflowTemplateId;
        }
        if (null !== $this->singleton) {
            $res['singleton'] = $this->singleton;
        }
        if (null !== $this->eventSubEnabled) {
            $res['event_sub_enabled'] = $this->eventSubEnabled;
        }
        if (null !== $this->eventSubConfigs) {
            $res['event_sub_configs'] = [];
            if (null !== $this->eventSubConfigs && \is_array($this->eventSubConfigs)) {
                $n = 0;
                foreach ($this->eventSubConfigs as $item) {
                    $res['event_sub_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->acceptableExecutionInterval) {
            $res['acceptable_execution_interval'] = $this->acceptableExecutionInterval;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->processStatus) {
            $res['process_status'] = $this->processStatus;
        }
        if (null !== $this->autoRecycleInstance) {
            $res['auto_recycle_instance'] = $this->autoRecycleInstance;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConnectorJob
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cron'])) {
            $model->cron = $map['cron'];
        }
        if (isset($map['filter'])) {
            $model->filter = $map['filter'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['rate'])) {
            $model->rate = $map['rate'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['sink_configs'])) {
            if (!empty($map['sink_configs'])) {
                $model->sinkConfigs = [];
                $n                  = 0;
                foreach ($map['sink_configs'] as $item) {
                    $model->sinkConfigs[$n++] = null !== $item ? UIKeyVauleTemplate::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sink_type'])) {
            $model->sinkType = $map['sink_type'];
        }
        if (isset($map['source_configs'])) {
            if (!empty($map['source_configs'])) {
                $model->sourceConfigs = [];
                $n                    = 0;
                foreach ($map['source_configs'] as $item) {
                    $model->sourceConfigs[$n++] = null !== $item ? UIKeyVauleTemplate::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['source_type'])) {
            $model->sourceType = $map['source_type'];
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['transformation'])) {
            if (!empty($map['transformation'])) {
                $model->transformation = [];
                $n                     = 0;
                foreach ($map['transformation'] as $item) {
                    $model->transformation[$n++] = null !== $item ? ColumnConfig::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['stepflow_template_id'])) {
            $model->stepflowTemplateId = $map['stepflow_template_id'];
        }
        if (isset($map['singleton'])) {
            $model->singleton = $map['singleton'];
        }
        if (isset($map['event_sub_enabled'])) {
            $model->eventSubEnabled = $map['event_sub_enabled'];
        }
        if (isset($map['event_sub_configs'])) {
            if (!empty($map['event_sub_configs'])) {
                $model->eventSubConfigs = [];
                $n                      = 0;
                foreach ($map['event_sub_configs'] as $item) {
                    $model->eventSubConfigs[$n++] = null !== $item ? EventSubConfig::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['acceptable_execution_interval'])) {
            $model->acceptableExecutionInterval = $map['acceptable_execution_interval'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['process_status'])) {
            $model->processStatus = $map['process_status'];
        }
        if (isset($map['auto_recycle_instance'])) {
            $model->autoRecycleInstance = $map['auto_recycle_instance'];
        }

        return $model;
    }
}
