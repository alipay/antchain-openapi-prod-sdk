<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class Trigger extends Model
{
    // 导出任务唯一ID
    /**
     * @example 9BpaEJNt
     *
     * @var string
     */
    public $name;

    // 导出目标
    /**
     * @example ManagedAliRocketMQTrigger
     *
     * @var string
     */
    public $type;

    // 导出的事件类型
    /**
     * @example Contract
     *
     * @var string
     */
    public $source;

    // 创建时间戳
    /**
     * @example 1650965665000
     *
     * @var int
     */
    public $createTime;

    // 最近的错误描述信息
    /**
     * @example send timeout
     *
     * @var string
     */
    public $errorMessage;

    // 任务的状态
    /**
     * @example Disabled
     *
     * @var string
     */
    public $status;

    // 导出任务的待处理错误日志数量
    /**
     * @example 0
     *
     * @var int
     */
    public $pendingErrorLogs;

    // 检查点信息
    /**
     * @example
     *
     * @var TriggerCheckpoint
     */
    public $checkpoint;

    // 导出任务配置
    /**
     * @example
     *
     * @var MapEntry[]
     */
    public $options;
    protected $_name = [
        'name'             => 'name',
        'type'             => 'type',
        'source'           => 'source',
        'createTime'       => 'create_time',
        'errorMessage'     => 'error_message',
        'status'           => 'status',
        'pendingErrorLogs' => 'pending_error_logs',
        'checkpoint'       => 'checkpoint',
        'options'          => 'options',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('options', $this->options, true);
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
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->pendingErrorLogs) {
            $res['pending_error_logs'] = $this->pendingErrorLogs;
        }
        if (null !== $this->checkpoint) {
            $res['checkpoint'] = null !== $this->checkpoint ? $this->checkpoint->toMap() : null;
        }
        if (null !== $this->options) {
            $res['options'] = [];
            if (null !== $this->options && \is_array($this->options)) {
                $n = 0;
                foreach ($this->options as $item) {
                    $res['options'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Trigger
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
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['pending_error_logs'])) {
            $model->pendingErrorLogs = $map['pending_error_logs'];
        }
        if (isset($map['checkpoint'])) {
            $model->checkpoint = TriggerCheckpoint::fromMap($map['checkpoint']);
        }
        if (isset($map['options'])) {
            if (!empty($map['options'])) {
                $model->options = [];
                $n              = 0;
                foreach ($map['options'] as $item) {
                    $model->options[$n++] = null !== $item ? MapEntry::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
