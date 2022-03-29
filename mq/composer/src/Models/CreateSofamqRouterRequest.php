<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CreateSofamqRouterRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 消费端 Group
    /**
     * @var string
     */
    public $consumerId;

    // 消费起始位点。取值范围：0：最小位点；1：最大位点；2：时间戳。
    /**
     * @var int
     */
    public $consumeFromType;

    // 消费起始位点时间戳，时间戳的值，单位是秒
    /**
     * @var int
     */
    public $consumeFromValue;

    // 消费终止位点。取值范围：0：最小位点；1：最大位点；2：时间戳。
    /**
     * @var int
     */
    public $consumeToType;

    // 消费终止位点时间戳，时间戳的值，单位是秒
    /**
     * @var int
     */
    public $consumeToValue;

    // 描述信息
    /**
     * @var string
     */
    public $description;

    // 目标单元
    /**
     * @var string
     */
    public $destinationCell;

    // 目标实例 ID
    /**
     * @var string
     */
    public $destinationInstanceId;

    // 目标 Topic
    /**
     * @var string
     */
    public $destinationTopic;

    // 容灾标识
    /**
     * @var bool
     */
    public $disaster;

    // 容灾机房
    /**
     * @var string
     */
    public $disasterRecoveryDatacenter;

    // 实例 ID
    /**
     * @var string
     */
    public $instanceId;

    // 源单元
    /**
     * @var string
     */
    public $sourceCell;

    // 源实例 ID
    /**
     * @var string
     */
    public $sourceInstanceId;

    // 源 Topic
    /**
     * @var string
     */
    public $sourceTopic;

    // 过滤 Tag
    /**
     * @var string
     */
    public $tag;

    // 任务状态。取值说明：0：初始化；1：工作中；2：停止。
    /**
     * @var int
     */
    public $taskStatus;

    // 任务类型。取值范围： 0：LDC 复制；1：非 LDC；2：LDC 容灾。
    /**
     * @var int
     */
    public $taskType;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'consumerId'                 => 'consumer_id',
        'consumeFromType'            => 'consume_from_type',
        'consumeFromValue'           => 'consume_from_value',
        'consumeToType'              => 'consume_to_type',
        'consumeToValue'             => 'consume_to_value',
        'description'                => 'description',
        'destinationCell'            => 'destination_cell',
        'destinationInstanceId'      => 'destination_instance_id',
        'destinationTopic'           => 'destination_topic',
        'disaster'                   => 'disaster',
        'disasterRecoveryDatacenter' => 'disaster_recovery_datacenter',
        'instanceId'                 => 'instance_id',
        'sourceCell'                 => 'source_cell',
        'sourceInstanceId'           => 'source_instance_id',
        'sourceTopic'                => 'source_topic',
        'tag'                        => 'tag',
        'taskStatus'                 => 'task_status',
        'taskType'                   => 'task_type',
    ];

    public function validate()
    {
        Model::validateRequired('consumeFromType', $this->consumeFromType, true);
        Model::validateRequired('destinationCell', $this->destinationCell, true);
        Model::validateRequired('destinationInstanceId', $this->destinationInstanceId, true);
        Model::validateRequired('destinationTopic', $this->destinationTopic, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('sourceCell', $this->sourceCell, true);
        Model::validateRequired('sourceInstanceId', $this->sourceInstanceId, true);
        Model::validateRequired('sourceTopic', $this->sourceTopic, true);
        Model::validateRequired('taskType', $this->taskType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
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
     * @return CreateSofamqRouterRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
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
