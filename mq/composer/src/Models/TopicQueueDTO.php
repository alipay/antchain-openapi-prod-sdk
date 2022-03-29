<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class TopicQueueDTO extends Model
{
    // Topic 名称
    /**
     * @example TP_xxx
     *
     * @var string
     */
    public $topic;

    // Broker 名称
    /**
     * @example xxx
     *
     * @var string
     */
    public $brokerName;

    // brokerip地址
    /**
     * @example 11.124.10.22:10911
     *
     * @var string
     */
    public $brokerAddrStr;

    // 最后更新时间
    /**
     * @example
     *
     * @var int
     */
    public $lastUpdateTimestamp;

    // 最大 offset 位点
    /**
     * @example
     *
     * @var int
     */
    public $maxOffset;

    // 最小位点
    /**
     * @example
     *
     * @var int
     */
    public $minOffset;

    // 队列 ID
    /**
     * @example
     *
     * @var int
     */
    public $queueId;
    protected $_name = [
        'topic'               => 'topic',
        'brokerName'          => 'broker_name',
        'brokerAddrStr'       => 'broker_addr_str',
        'lastUpdateTimestamp' => 'last_update_timestamp',
        'maxOffset'           => 'max_offset',
        'minOffset'           => 'min_offset',
        'queueId'             => 'queue_id',
    ];

    public function validate()
    {
        Model::validateRequired('topic', $this->topic, true);
        Model::validateRequired('brokerName', $this->brokerName, true);
        Model::validateRequired('brokerAddrStr', $this->brokerAddrStr, true);
        Model::validateRequired('lastUpdateTimestamp', $this->lastUpdateTimestamp, true);
        Model::validateRequired('maxOffset', $this->maxOffset, true);
        Model::validateRequired('minOffset', $this->minOffset, true);
        Model::validateRequired('queueId', $this->queueId, true);
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
        if (null !== $this->brokerAddrStr) {
            $res['broker_addr_str'] = $this->brokerAddrStr;
        }
        if (null !== $this->lastUpdateTimestamp) {
            $res['last_update_timestamp'] = $this->lastUpdateTimestamp;
        }
        if (null !== $this->maxOffset) {
            $res['max_offset'] = $this->maxOffset;
        }
        if (null !== $this->minOffset) {
            $res['min_offset'] = $this->minOffset;
        }
        if (null !== $this->queueId) {
            $res['queue_id'] = $this->queueId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TopicQueueDTO
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
        if (isset($map['broker_addr_str'])) {
            $model->brokerAddrStr = $map['broker_addr_str'];
        }
        if (isset($map['last_update_timestamp'])) {
            $model->lastUpdateTimestamp = $map['last_update_timestamp'];
        }
        if (isset($map['max_offset'])) {
            $model->maxOffset = $map['max_offset'];
        }
        if (isset($map['min_offset'])) {
            $model->minOffset = $map['min_offset'];
        }
        if (isset($map['queue_id'])) {
            $model->queueId = $map['queue_id'];
        }

        return $model;
    }
}
