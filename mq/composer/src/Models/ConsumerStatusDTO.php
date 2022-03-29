<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ConsumerStatusDTO extends Model
{
    // 该集群当前在线客户端信息
    /**
     * @example
     *
     * @var ConnectionDTO[]
     */
    public $connectionSet;

    // 该集群在线客户端详细信息，包含 Jstack、消费 RT 时间等信息
    /**
     * @example
     *
     * @var ConsumerConnectionInfoDTO[]
     */
    public $consumerConnectionInfoList;

    // 消费模型。取值说明如下：CLUSTERING：集群消费模式；BROADCASTING：广播消费模式。
    /**
     * @example CLUSTERING
     *
     * @var string
     */
    public $consumeModel;

    // 总消费 TPS
    /**
     * @example 0
     *
     * @var string
     */
    public $consumeTps;

    // 延迟时间
    /**
     * @example 100857
     *
     * @var int
     */
    public $delayTime;

    // 各个 Topic 的消费情况
    /**
     * @example
     *
     * @var DetailInTopicDTO[]
     */
    public $detailInTopicList;

    // 实例 ID
    /**
     * @example MQ_INST_111111111111_DOxxxxxx
     *
     * @var string
     */
    public $instanceId;

    // 最后更新时间
    /**
     * @example 1566883844954
     *
     * @var int
     */
    public $lastTimestamp;

    // 是否在线
    /**
     * @example true
     *
     * @var bool
     */
    public $online;

    // 客户端 Rebalance 是否正常。取值说明如下：true：正常；false：不正常。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $rebalanceOk;

    // 订阅关系是否一致
    /**
     * @example true, false
     *
     * @var bool
     */
    public $subscriptionSame;

    // 集群总的消费堆积
    /**
     * @example 197
     *
     * @var int
     */
    public $totalDiff;
    protected $_name = [
        'connectionSet'              => 'connection_set',
        'consumerConnectionInfoList' => 'consumer_connection_info_list',
        'consumeModel'               => 'consume_model',
        'consumeTps'                 => 'consume_tps',
        'delayTime'                  => 'delay_time',
        'detailInTopicList'          => 'detail_in_topic_list',
        'instanceId'                 => 'instance_id',
        'lastTimestamp'              => 'last_timestamp',
        'online'                     => 'online',
        'rebalanceOk'                => 'rebalance_ok',
        'subscriptionSame'           => 'subscription_same',
        'totalDiff'                  => 'total_diff',
    ];

    public function validate()
    {
        Model::validateRequired('connectionSet', $this->connectionSet, true);
        Model::validateRequired('consumerConnectionInfoList', $this->consumerConnectionInfoList, true);
        Model::validateRequired('consumeModel', $this->consumeModel, true);
        Model::validateRequired('consumeTps', $this->consumeTps, true);
        Model::validateRequired('delayTime', $this->delayTime, true);
        Model::validateRequired('detailInTopicList', $this->detailInTopicList, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('lastTimestamp', $this->lastTimestamp, true);
        Model::validateRequired('online', $this->online, true);
        Model::validateRequired('rebalanceOk', $this->rebalanceOk, true);
        Model::validateRequired('subscriptionSame', $this->subscriptionSame, true);
        Model::validateRequired('totalDiff', $this->totalDiff, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->connectionSet) {
            $res['connection_set'] = [];
            if (null !== $this->connectionSet && \is_array($this->connectionSet)) {
                $n = 0;
                foreach ($this->connectionSet as $item) {
                    $res['connection_set'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->consumerConnectionInfoList) {
            $res['consumer_connection_info_list'] = [];
            if (null !== $this->consumerConnectionInfoList && \is_array($this->consumerConnectionInfoList)) {
                $n = 0;
                foreach ($this->consumerConnectionInfoList as $item) {
                    $res['consumer_connection_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->consumeModel) {
            $res['consume_model'] = $this->consumeModel;
        }
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->lastTimestamp) {
            $res['last_timestamp'] = $this->lastTimestamp;
        }
        if (null !== $this->online) {
            $res['online'] = $this->online;
        }
        if (null !== $this->rebalanceOk) {
            $res['rebalance_ok'] = $this->rebalanceOk;
        }
        if (null !== $this->subscriptionSame) {
            $res['subscription_same'] = $this->subscriptionSame;
        }
        if (null !== $this->totalDiff) {
            $res['total_diff'] = $this->totalDiff;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConsumerStatusDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['connection_set'])) {
            if (!empty($map['connection_set'])) {
                $model->connectionSet = [];
                $n                    = 0;
                foreach ($map['connection_set'] as $item) {
                    $model->connectionSet[$n++] = null !== $item ? ConnectionDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['consumer_connection_info_list'])) {
            if (!empty($map['consumer_connection_info_list'])) {
                $model->consumerConnectionInfoList = [];
                $n                                 = 0;
                foreach ($map['consumer_connection_info_list'] as $item) {
                    $model->consumerConnectionInfoList[$n++] = null !== $item ? ConsumerConnectionInfoDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['consume_model'])) {
            $model->consumeModel = $map['consume_model'];
        }
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['last_timestamp'])) {
            $model->lastTimestamp = $map['last_timestamp'];
        }
        if (isset($map['online'])) {
            $model->online = $map['online'];
        }
        if (isset($map['rebalance_ok'])) {
            $model->rebalanceOk = $map['rebalance_ok'];
        }
        if (isset($map['subscription_same'])) {
            $model->subscriptionSame = $map['subscription_same'];
        }
        if (isset($map['total_diff'])) {
            $model->totalDiff = $map['total_diff'];
        }

        return $model;
    }
}
