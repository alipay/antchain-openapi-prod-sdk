<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ConsumerAccumulateDTO extends Model
{
    // 该 Group ID 下消费者实例群组接收消息的总 TPS
    /**
     * @example 10
     *
     * @var string
     */
    public $consumeTps;

    // 该 Topic 所发消息的最大消费延迟时间
    /**
     * @example 10000
     *
     * @var int
     */
    public $delayTime;

    // 各个 Topic 具体情况
    /**
     * @example
     *
     * @var DetailInTopicDTO[]
     */
    public $detailInTopicList;

    // 该 Topic 中最近一条被消费的信息的生产时间
    /**
     * @example 1566231000000
     *
     * @var int
     */
    public $lastTimestamp;

    // 该 Group ID 下是否有消费者实例在线；只要有一个消费者实例在线，该 Group ID 状态即为在线。取值说明如下：
    //
    // true：状态为在线
    // false：状态为不在线
    /**
     * @example true
     *
     * @var bool
     */
    public $online;

    // 该 Topic 的消费堆积数量
    /**
     * @example 100
     *
     * @var int
     */
    public $totalDiff;
    protected $_name = [
        'consumeTps'        => 'consume_tps',
        'delayTime'         => 'delay_time',
        'detailInTopicList' => 'detail_in_topic_list',
        'lastTimestamp'     => 'last_timestamp',
        'online'            => 'online',
        'totalDiff'         => 'total_diff',
    ];

    public function validate()
    {
        Model::validateRequired('consumeTps', $this->consumeTps, true);
        Model::validateRequired('delayTime', $this->delayTime, true);
        Model::validateRequired('detailInTopicList', $this->detailInTopicList, true);
        Model::validateRequired('lastTimestamp', $this->lastTimestamp, true);
        Model::validateRequired('online', $this->online, true);
        Model::validateRequired('totalDiff', $this->totalDiff, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->consumeTps) {
            $res['consume_tps'] = $this->consumeTps;
        }
        if (null !== $this->delayTime) {
            $res['delay_time'] = $this->delayTime;
        }
        if (null !== $this->detailInTopicList) {
            $res['detail_in_topic_list'] = [];
            if (null !== $this->detailInTopicList && \is_array($this->detailInTopicList)) {
                $n = 0;
                foreach ($this->detailInTopicList as $item) {
                    $res['detail_in_topic_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->lastTimestamp) {
            $res['last_timestamp'] = $this->lastTimestamp;
        }
        if (null !== $this->online) {
            $res['online'] = $this->online;
        }
        if (null !== $this->totalDiff) {
            $res['total_diff'] = $this->totalDiff;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConsumerAccumulateDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['consume_tps'])) {
            $model->consumeTps = $map['consume_tps'];
        }
        if (isset($map['delay_time'])) {
            $model->delayTime = $map['delay_time'];
        }
        if (isset($map['detail_in_topic_list'])) {
            if (!empty($map['detail_in_topic_list'])) {
                $model->detailInTopicList = [];
                $n                        = 0;
                foreach ($map['detail_in_topic_list'] as $item) {
                    $model->detailInTopicList[$n++] = null !== $item ? DetailInTopicDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['last_timestamp'])) {
            $model->lastTimestamp = $map['last_timestamp'];
        }
        if (isset($map['online'])) {
            $model->online = $map['online'];
        }
        if (isset($map['total_diff'])) {
            $model->totalDiff = $map['total_diff'];
        }

        return $model;
    }
}
