<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class DetailInTopicDTO extends Model
{
    // 延迟时间
    /**
     * @example 0
     *
     * @var int
     */
    public $delayTime;

    // 最后更新时间
    /**
     * @example 1570701259403
     *
     * @var int
     */
    public $lastTimestamp;

    // Topic 名称
    /**
     * @example test-mq_topic
     *
     * @var string
     */
    public $topic;

    // 该 Topic 消费总堆积数
    /**
     * @example 0
     *
     * @var int
     */
    public $totalDiff;
    protected $_name = [
        'delayTime'     => 'delay_time',
        'lastTimestamp' => 'last_timestamp',
        'topic'         => 'topic',
        'totalDiff'     => 'total_diff',
    ];

    public function validate()
    {
        Model::validateRequired('delayTime', $this->delayTime, true);
        Model::validateRequired('lastTimestamp', $this->lastTimestamp, true);
        Model::validateRequired('topic', $this->topic, true);
        Model::validateRequired('totalDiff', $this->totalDiff, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->delayTime) {
            $res['delay_time'] = $this->delayTime;
        }
        if (null !== $this->lastTimestamp) {
            $res['last_timestamp'] = $this->lastTimestamp;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->totalDiff) {
            $res['total_diff'] = $this->totalDiff;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailInTopicDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['delay_time'])) {
            $model->delayTime = $map['delay_time'];
        }
        if (isset($map['last_timestamp'])) {
            $model->lastTimestamp = $map['last_timestamp'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['total_diff'])) {
            $model->totalDiff = $map['total_diff'];
        }

        return $model;
    }
}
