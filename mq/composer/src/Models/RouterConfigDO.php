<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class RouterConfigDO extends Model
{
    // 消费端 Group
    /**
     * @example id
     *
     * @var string
     */
    public $consumerId;

    // 消费起始位点。取值范围：0：最小位点；1：最大位点；2：时间戳。
    /**
     * @example
     *
     * @var int
     */
    public $consumeFromType;

    // 消费起始位点时间戳，时间戳的值，单位是秒
    /**
     * @example
     *
     * @var int
     */
    public $consumeFromValue;

    // 消费终止位点。取值范围：0：最小位点；1：最大位点；2：时间戳。
    /**
     * @example
     *
     * @var int
     */
    public $consumeToType;

    // 消费终止位点时间戳，时间戳的值，单位是秒
    /**
     * @example
     *
     * @var int
     */
    public $consumeToValue;

    // 延迟时间
    /**
     * @example 10000
     *
     * @var string
     */
    public $delayTime;

    // 描述信息
    /**
     * @example desc
     *
     * @var string
     */
    public $description;

    // 目标单元
    /**
     * @example dest
     *
     * @var string
     */
    public $destinationCell;

    // 目标实例 ID
    /**
     * @example dest
     *
     * @var string
     */
    public $destinationInstanceId;

    // 目标 Topic
    /**
     * @example dest
     *
     * @var string
     */
    public $destinationTopic;

    // 容灾标识
    /**
     * @example true
     *
     * @var bool
     */
    public $disaster;

    // 容灾机房
    /**
     * @example default
     *
     * @var string
     */
    public $disasterRecoveryDatacenter;

    // 创建时间
    /**
     * @example gmt_create
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example gmt_modified
     *
     * @var string
     */
    public $gmtModified;

    // 路由任务 ID
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // 源单元
    /**
     * @example cell
     *
     * @var string
     */
    public $sourceCell;

    // 源实例 ID
    /**
     * @example src
     *
     * @var string
     */
    public $sourceInstanceId;

    // 源 Topic
    /**
     * @example src
     *
     * @var string
     */
    public $sourceTopic;

    // 过滤 Tag
    /**
     * @example tag
     *
     * @var string
     */
    public $tag;

    // 任务状态。取值说明：0：初始化；1：工作中；2：停止。
    /**
     * @example status
     *
     * @var int
     */
    public $taskStatus;

    // 任务类型。取值范围： 0：LDC 复制；1：非 LDC；2...
    /**
     * @example
     *
     * @var int
     */
    public $taskType;
    protected $_name = [
        'consumerId'                 => 'consumer_id',
        'consumeFromType'            => 'consume_from_type',
        'consumeFromValue'           => 'consume_from_value',
        'consumeToType'              => 'consume_to_type',
        'consumeToValue'             => 'consume_to_value',
        'delayTime'                  => 'delay_time',
        'description'                => 'description',
        'destinationCell'            => 'destination_cell',
        'destinationInstanceId'      => 'destination_instance_id',
        'destinationTopic'           => 'destination_topic',
        'disaster'                   => 'disaster',
        'disasterRecoveryDatacenter' => 'disaster_recovery_datacenter',
        'gmtCreate'                  => 'gmt_create',
        'gmtModified'                => 'gmt_modified',
        'id'                         => 'id',
        'sourceCell'                 => 'source_cell',
        'sourceInstanceId'           => 'source_instance_id',
        'sourceTopic'                => 'source_topic',
        'tag'                        => 'tag',
        'taskStatus'                 => 'task_status',
        'taskType'                   => 'task_type',
    ];

    public function validate()
    {
        Model::validateRequired('consumerId', $this->consumerId, true);
        Model::validateRequired('consumeFromType', $this->consumeFromType, true);
        Model::validateRequired('consumeFromValue', $this->consumeFromValue, true);
        Model::validateRequired('consumeToType', $this->consumeToType, true);
        Model::validateRequired('consumeToValue', $this->consumeToValue, true);
        Model::validateRequired('destinationCell', $this->destinationCell, true);
        Model::validateRequired('destinationInstanceId', $this->destinationInstanceId, true);
        Model::validateRequired('destinationTopic', $this->destinationTopic, true);
        Model::validateRequired('disaster', $this->disaster, true);
        Model::validateRequired('disasterRecoveryDatacenter', $this->disasterRecoveryDatacenter, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('sourceCell', $this->sourceCell, true);
        Model::validateRequired('sourceInstanceId', $this->sourceInstanceId, true);
        Model::validateRequired('sourceTopic', $this->sourceTopic, true);
        Model::validateRequired('tag', $this->tag, true);
        Model::validateRequired('taskStatus', $this->taskStatus, true);
        Model::validateRequired('taskType', $this->taskType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->consumerId) {
            $res['consumer_id'] = $this->consumerId;
        }
        if (null !== $this->consumeFromType) {
            $res['consume_from_type'] = $this->consumeFromType;
        }
        if (null !== $this->consumeFromValue) {
            $res['consume_from_value'] = $this->consumeFromValue;
        }
        if (null !== $this->consumeToType) {
            $res['consume_to_type'] = $this->consumeToType;
        }
        if (null !== $this->consumeToValue) {
            $res['consume_to_value'] = $this->consumeToValue;
        }
        if (null !== $this->delayTime) {
            $res['delay_time'] = $this->delayTime;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->destinationCell) {
            $res['destination_cell'] = $this->destinationCell;
        }
        if (null !== $this->destinationInstanceId) {
            $res['destination_instance_id'] = $this->destinationInstanceId;
        }
        if (null !== $this->destinationTopic) {
            $res['destination_topic'] = $this->destinationTopic;
        }
        if (null !== $this->disaster) {
            $res['disaster'] = $this->disaster;
        }
        if (null !== $this->disasterRecoveryDatacenter) {
            $res['disaster_recovery_datacenter'] = $this->disasterRecoveryDatacenter;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->sourceCell) {
            $res['source_cell'] = $this->sourceCell;
        }
        if (null !== $this->sourceInstanceId) {
            $res['source_instance_id'] = $this->sourceInstanceId;
        }
        if (null !== $this->sourceTopic) {
            $res['source_topic'] = $this->sourceTopic;
        }
        if (null !== $this->tag) {
            $res['tag'] = $this->tag;
        }
        if (null !== $this->taskStatus) {
            $res['task_status'] = $this->taskStatus;
        }
        if (null !== $this->taskType) {
            $res['task_type'] = $this->taskType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RouterConfigDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['consumer_id'])) {
            $model->consumerId = $map['consumer_id'];
        }
        if (isset($map['consume_from_type'])) {
            $model->consumeFromType = $map['consume_from_type'];
        }
        if (isset($map['consume_from_value'])) {
            $model->consumeFromValue = $map['consume_from_value'];
        }
        if (isset($map['consume_to_type'])) {
            $model->consumeToType = $map['consume_to_type'];
        }
        if (isset($map['consume_to_value'])) {
            $model->consumeToValue = $map['consume_to_value'];
        }
        if (isset($map['delay_time'])) {
            $model->delayTime = $map['delay_time'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['destination_cell'])) {
            $model->destinationCell = $map['destination_cell'];
        }
        if (isset($map['destination_instance_id'])) {
            $model->destinationInstanceId = $map['destination_instance_id'];
        }
        if (isset($map['destination_topic'])) {
            $model->destinationTopic = $map['destination_topic'];
        }
        if (isset($map['disaster'])) {
            $model->disaster = $map['disaster'];
        }
        if (isset($map['disaster_recovery_datacenter'])) {
            $model->disasterRecoveryDatacenter = $map['disaster_recovery_datacenter'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['source_cell'])) {
            $model->sourceCell = $map['source_cell'];
        }
        if (isset($map['source_instance_id'])) {
            $model->sourceInstanceId = $map['source_instance_id'];
        }
        if (isset($map['source_topic'])) {
            $model->sourceTopic = $map['source_topic'];
        }
        if (isset($map['tag'])) {
            $model->tag = $map['tag'];
        }
        if (isset($map['task_status'])) {
            $model->taskStatus = $map['task_status'];
        }
        if (isset($map['task_type'])) {
            $model->taskType = $map['task_type'];
        }

        return $model;
    }
}
