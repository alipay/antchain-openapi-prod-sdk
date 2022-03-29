<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class MsgdumpTaskDTO extends Model
{
    // 描述
    /**
     * @example 描述
     *
     * @var string
     */
    public $remark;

    // 源 eventcode
    /**
     * @example EC_TEST
     *
     * @var string
     */
    public $sourceEventCode;

    // 源实例 id
    /**
     * @example INST_SOURCE
     *
     * @var string
     */
    public $sourceInstanceId;

    // 源 topic
    /**
     * @example TP_TEST
     *
     * @var string
     */
    public $sourceTopic;

    // 任务状态
    // 0: 初始化中；1: 运行中；2: 停止中；3: 已停止
    /**
     * @example 1/2/3/4
     *
     * @var int
     */
    public $status;

    // 目标实例 id
    /**
     * @example INST_TARGET
     *
     * @var string
     */
    public $targetInstanceId;

    // 目标 tag
    /**
     * @example TAG_A
     *
     * @var string
     */
    public $targetTag;

    // 目标 topic
    /**
     * @example TP_TARGET
     *
     * @var string
     */
    public $targetTopic;

    // 任务 id
    /**
     * @example 12212
     *
     * @var int
     */
    public $taskId;

    // 消息同步目标 cell
    /**
     * @example GZ00B
     *
     * @var string
     */
    public $cell;
    protected $_name = [
        'remark'           => 'remark',
        'sourceEventCode'  => 'source_event_code',
        'sourceInstanceId' => 'source_instance_id',
        'sourceTopic'      => 'source_topic',
        'status'           => 'status',
        'targetInstanceId' => 'target_instance_id',
        'targetTag'        => 'target_tag',
        'targetTopic'      => 'target_topic',
        'taskId'           => 'task_id',
        'cell'             => 'cell',
    ];

    public function validate()
    {
        Model::validateRequired('remark', $this->remark, true);
        Model::validateRequired('sourceEventCode', $this->sourceEventCode, true);
        Model::validateRequired('sourceInstanceId', $this->sourceInstanceId, true);
        Model::validateRequired('sourceTopic', $this->sourceTopic, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('targetInstanceId', $this->targetInstanceId, true);
        Model::validateRequired('targetTag', $this->targetTag, true);
        Model::validateRequired('targetTopic', $this->targetTopic, true);
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('cell', $this->cell, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->sourceEventCode) {
            $res['source_event_code'] = $this->sourceEventCode;
        }
        if (null !== $this->sourceInstanceId) {
            $res['source_instance_id'] = $this->sourceInstanceId;
        }
        if (null !== $this->sourceTopic) {
            $res['source_topic'] = $this->sourceTopic;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->targetInstanceId) {
            $res['target_instance_id'] = $this->targetInstanceId;
        }
        if (null !== $this->targetTag) {
            $res['target_tag'] = $this->targetTag;
        }
        if (null !== $this->targetTopic) {
            $res['target_topic'] = $this->targetTopic;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MsgdumpTaskDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['source_event_code'])) {
            $model->sourceEventCode = $map['source_event_code'];
        }
        if (isset($map['source_instance_id'])) {
            $model->sourceInstanceId = $map['source_instance_id'];
        }
        if (isset($map['source_topic'])) {
            $model->sourceTopic = $map['source_topic'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['target_instance_id'])) {
            $model->targetInstanceId = $map['target_instance_id'];
        }
        if (isset($map['target_tag'])) {
            $model->targetTag = $map['target_tag'];
        }
        if (isset($map['target_topic'])) {
            $model->targetTopic = $map['target_topic'];
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }

        return $model;
    }
}
