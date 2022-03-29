<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ConsumerTimeSpanDTO extends Model
{
    // 当前 Group 消费该 Topic 的最新的时间
    /**
     * @example 1570761026400
     *
     * @var int
     */
    public $consumeTimestamp;

    // 需查询的消费端 Group ID 所对应的实例 ID
    /**
     * @example MQ_INST_111111111111_DOxxxxxx
     *
     * @var string
     */
    public $instanceId;

    // 整个 Topic 目前存储的最早的消息的时间
    /**
     * @example 1570761026804
     *
     * @var int
     */
    public $maxTimestamp;

    // 整个 Topic 目前存储的最新的消息的时间
    /**
     * @example 1570701231122
     *
     * @var int
     */
    public $minTimestamp;

    // 需查询的 Topic 名称
    /**
     * @example test-mq_topic
     *
     * @var string
     */
    public $topic;
    protected $_name = [
        'consumeTimestamp' => 'consume_timestamp',
        'instanceId'       => 'instance_id',
        'maxTimestamp'     => 'max_timestamp',
        'minTimestamp'     => 'min_timestamp',
        'topic'            => 'topic',
    ];

    public function validate()
    {
        Model::validateRequired('consumeTimestamp', $this->consumeTimestamp, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('maxTimestamp', $this->maxTimestamp, true);
        Model::validateRequired('minTimestamp', $this->minTimestamp, true);
        Model::validateRequired('topic', $this->topic, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->consumeTimestamp) {
            $res['consume_timestamp'] = $this->consumeTimestamp;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->maxTimestamp) {
            $res['max_timestamp'] = $this->maxTimestamp;
        }
        if (null !== $this->minTimestamp) {
            $res['min_timestamp'] = $this->minTimestamp;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConsumerTimeSpanDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['consume_timestamp'])) {
            $model->consumeTimestamp = $map['consume_timestamp'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['max_timestamp'])) {
            $model->maxTimestamp = $map['max_timestamp'];
        }
        if (isset($map['min_timestamp'])) {
            $model->minTimestamp = $map['min_timestamp'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }

        return $model;
    }
}
