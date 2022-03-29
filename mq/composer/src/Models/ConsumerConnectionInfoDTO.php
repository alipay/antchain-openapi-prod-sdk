<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ConsumerConnectionInfoDTO extends Model
{
    // 消费实例的 ID
    /**
     * @example 30.5.**.**@25560#-1999745829#-1737591554#458773089270275
     *
     * @var string
     */
    public $clientId;

    // 连接信息
    /**
     * @example **
     *
     * @var string
     */
    public $connection;

    // PUSH/PULL
    /**
     * @example PUSH
     *
     * @var string
     */
    public $consumeType;

    // Jstack 堆栈信息
    /**
     * @example
     *
     * @var ThreadTrackDTO[]
     */
    public $jstack;

    // 客户端语言
    /**
     * @example JAVA
     *
     * @var string
     */
    public $language;

    // 最后更新时间
    /**
     * @example 1570701368114
     *
     * @var int
     */
    public $lastTimestamp;

    // 消费模型，取值说明如下：CLUSTERING：集群消费模式；BROADCASTING：广播消费模式。
    /**
     * @example CLUSTERING
     *
     * @var string
     */
    public $messageModel;

    // 实时状态统计
    /**
     * @example
     *
     * @var ConsumerRunningDataDTO[]
     */
    public $runningDataList;

    // 开始时间
    /**
     * @example 1570701361528
     *
     * @var int
     */
    public $startTimestamp;

    // 订阅关系集合
    /**
     * @example
     *
     * @var SubscriptionDTO[]
     */
    public $subscriptionSet;

    // 消费线程数
    /**
     * @example 20
     *
     * @var int
     */
    public $threadCount;

    // 客户端版本号
    /**
     * @example V4_3_6
     *
     * @var string
     */
    public $version;
    protected $_name = [
        'clientId'        => 'client_id',
        'connection'      => 'connection',
        'consumeType'     => 'consume_type',
        'jstack'          => 'jstack',
        'language'        => 'language',
        'lastTimestamp'   => 'last_timestamp',
        'messageModel'    => 'message_model',
        'runningDataList' => 'running_data_list',
        'startTimestamp'  => 'start_timestamp',
        'subscriptionSet' => 'subscription_set',
        'threadCount'     => 'thread_count',
        'version'         => 'version',
    ];

    public function validate()
    {
        Model::validateRequired('clientId', $this->clientId, true);
        Model::validateRequired('connection', $this->connection, true);
        Model::validateRequired('consumeType', $this->consumeType, true);
        Model::validateRequired('jstack', $this->jstack, true);
        Model::validateRequired('language', $this->language, true);
        Model::validateRequired('lastTimestamp', $this->lastTimestamp, true);
        Model::validateRequired('messageModel', $this->messageModel, true);
        Model::validateRequired('runningDataList', $this->runningDataList, true);
        Model::validateRequired('startTimestamp', $this->startTimestamp, true);
        Model::validateRequired('subscriptionSet', $this->subscriptionSet, true);
        Model::validateRequired('threadCount', $this->threadCount, true);
        Model::validateRequired('version', $this->version, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }
        if (null !== $this->connection) {
            $res['connection'] = $this->connection;
        }
        if (null !== $this->consumeType) {
            $res['consume_type'] = $this->consumeType;
        }
        if (null !== $this->jstack) {
            $res['jstack'] = [];
            if (null !== $this->jstack && \is_array($this->jstack)) {
                $n = 0;
                foreach ($this->jstack as $item) {
                    $res['jstack'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->language) {
            $res['language'] = $this->language;
        }
        if (null !== $this->lastTimestamp) {
            $res['last_timestamp'] = $this->lastTimestamp;
        }
        if (null !== $this->messageModel) {
            $res['message_model'] = $this->messageModel;
        }
        if (null !== $this->runningDataList) {
            $res['running_data_list'] = [];
            if (null !== $this->runningDataList && \is_array($this->runningDataList)) {
                $n = 0;
                foreach ($this->runningDataList as $item) {
                    $res['running_data_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->startTimestamp) {
            $res['start_timestamp'] = $this->startTimestamp;
        }
        if (null !== $this->subscriptionSet) {
            $res['subscription_set'] = [];
            if (null !== $this->subscriptionSet && \is_array($this->subscriptionSet)) {
                $n = 0;
                foreach ($this->subscriptionSet as $item) {
                    $res['subscription_set'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->threadCount) {
            $res['thread_count'] = $this->threadCount;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConsumerConnectionInfoDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['client_id'])) {
            $model->clientId = $map['client_id'];
        }
        if (isset($map['connection'])) {
            $model->connection = $map['connection'];
        }
        if (isset($map['consume_type'])) {
            $model->consumeType = $map['consume_type'];
        }
        if (isset($map['jstack'])) {
            if (!empty($map['jstack'])) {
                $model->jstack = [];
                $n             = 0;
                foreach ($map['jstack'] as $item) {
                    $model->jstack[$n++] = null !== $item ? ThreadTrackDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['language'])) {
            $model->language = $map['language'];
        }
        if (isset($map['last_timestamp'])) {
            $model->lastTimestamp = $map['last_timestamp'];
        }
        if (isset($map['message_model'])) {
            $model->messageModel = $map['message_model'];
        }
        if (isset($map['running_data_list'])) {
            if (!empty($map['running_data_list'])) {
                $model->runningDataList = [];
                $n                      = 0;
                foreach ($map['running_data_list'] as $item) {
                    $model->runningDataList[$n++] = null !== $item ? ConsumerRunningDataDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['start_timestamp'])) {
            $model->startTimestamp = $map['start_timestamp'];
        }
        if (isset($map['subscription_set'])) {
            if (!empty($map['subscription_set'])) {
                $model->subscriptionSet = [];
                $n                      = 0;
                foreach ($map['subscription_set'] as $item) {
                    $model->subscriptionSet[$n++] = null !== $item ? SubscriptionDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['thread_count'])) {
            $model->threadCount = $map['thread_count'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
