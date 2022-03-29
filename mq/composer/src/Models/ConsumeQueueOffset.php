<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ConsumeQueueOffset extends Model
{
    // topic
    /**
     * @example TP_001
     *
     * @var string
     */
    public $topic;

    // queue所在broker的名字
    /**
     * @example 00001
     *
     * @var string
     */
    public $brokerName;

    // queue id
    /**
     * @example 1
     *
     * @var int
     */
    public $queueId;

    // 消费位点
    /**
     * @example
     *
     * @var int
     */
    public $brokerOffset;

    // 消费端offset
    /**
     * @example
     *
     * @var int
     */
    public $consumerOffset;

    // 最后时间（时间戳）
    //
    /**
     * @example
     *
     * @var int
     */
    public $lastTimestamp;

    // 消费端地址
    /**
     * @example 127.0.0.1
     *
     * @var string
     */
    public $clientAddr;

    // 消费者客户端id
    //
    /**
     * @example client_001
     *
     * @var string
     */
    public $clientId;

    // 消息堆积数
    //
    /**
     * @example
     *
     * @var int
     */
    public $accumulate;

    // queue位点和消费端位点差
    /**
     * @example
     *
     * @var int
     */
    public $difference;
    protected $_name = [
        'topic'          => 'topic',
        'brokerName'     => 'broker_name',
        'queueId'        => 'queue_id',
        'brokerOffset'   => 'broker_offset',
        'consumerOffset' => 'consumer_offset',
        'lastTimestamp'  => 'last_timestamp',
        'clientAddr'     => 'client_addr',
        'clientId'       => 'client_id',
        'accumulate'     => 'accumulate',
        'difference'     => 'difference',
    ];

    public function validate()
    {
        Model::validateRequired('topic', $this->topic, true);
        Model::validateRequired('brokerName', $this->brokerName, true);
        Model::validateRequired('queueId', $this->queueId, true);
        Model::validateRequired('brokerOffset', $this->brokerOffset, true);
        Model::validateRequired('consumerOffset', $this->consumerOffset, true);
        Model::validateRequired('lastTimestamp', $this->lastTimestamp, true);
        Model::validateRequired('clientAddr', $this->clientAddr, true);
        Model::validateRequired('clientId', $this->clientId, true);
        Model::validateRequired('accumulate', $this->accumulate, true);
        Model::validateRequired('difference', $this->difference, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->brokerName) {
            $res['broker_name'] = $this->brokerName;
        }
        if (null !== $this->queueId) {
            $res['queue_id'] = $this->queueId;
        }
        if (null !== $this->brokerOffset) {
            $res['broker_offset'] = $this->brokerOffset;
        }
        if (null !== $this->consumerOffset) {
            $res['consumer_offset'] = $this->consumerOffset;
        }
        if (null !== $this->lastTimestamp) {
            $res['last_timestamp'] = $this->lastTimestamp;
        }
        if (null !== $this->clientAddr) {
            $res['client_addr'] = $this->clientAddr;
        }
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }
        if (null !== $this->accumulate) {
            $res['accumulate'] = $this->accumulate;
        }
        if (null !== $this->difference) {
            $res['difference'] = $this->difference;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConsumeQueueOffset
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['broker_name'])) {
            $model->brokerName = $map['broker_name'];
        }
        if (isset($map['queue_id'])) {
            $model->queueId = $map['queue_id'];
        }
        if (isset($map['broker_offset'])) {
            $model->brokerOffset = $map['broker_offset'];
        }
        if (isset($map['consumer_offset'])) {
            $model->consumerOffset = $map['consumer_offset'];
        }
        if (isset($map['last_timestamp'])) {
            $model->lastTimestamp = $map['last_timestamp'];
        }
        if (isset($map['client_addr'])) {
            $model->clientAddr = $map['client_addr'];
        }
        if (isset($map['client_id'])) {
            $model->clientId = $map['client_id'];
        }
        if (isset($map['accumulate'])) {
            $model->accumulate = $map['accumulate'];
        }
        if (isset($map['difference'])) {
            $model->difference = $map['difference'];
        }

        return $model;
    }
}
