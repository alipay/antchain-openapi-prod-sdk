<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ConsumerRunningDataDTO extends Model
{
    // 堆积量
    /**
     * @example 100
     *
     * @var int
     */
    public $diff;

    // 每小时内消费失败的消息数统计
    /**
     * @example 0
     *
     * @var int
     */
    public $failedCountPerHour;

    // 消费消息失败的 TPS 统计
    /**
     * @example 0.1
     *
     * @var string
     */
    public $failedTps;

    // 订阅方的 Group ID
    /**
     * @example 000
     *
     * @var string
     */
    public $groupId;

    // 消费消息成功的 TPS 统计
    /**
     * @example 0.1
     *
     * @var string
     */
    public $okTps;

    // 消费 RT 时间，单位 ms
    /**
     * @example 0.1
     *
     * @var string
     */
    public $rt;

    // 订阅的 Topic 名称
    /**
     * @example test-mq_topic
     *
     * @var string
     */
    public $topic;
    protected $_name = [
        'diff'               => 'diff',
        'failedCountPerHour' => 'failed_count_per_hour',
        'failedTps'          => 'failed_tps',
        'groupId'            => 'group_id',
        'okTps'              => 'ok_tps',
        'rt'                 => 'rt',
        'topic'              => 'topic',
    ];

    public function validate()
    {
        Model::validateRequired('diff', $this->diff, true);
        Model::validateRequired('failedCountPerHour', $this->failedCountPerHour, true);
        Model::validateRequired('failedTps', $this->failedTps, true);
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('okTps', $this->okTps, true);
        Model::validateRequired('rt', $this->rt, true);
        Model::validateRequired('topic', $this->topic, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->diff) {
            $res['diff'] = $this->diff;
        }
        if (null !== $this->failedCountPerHour) {
            $res['failed_count_per_hour'] = $this->failedCountPerHour;
        }
        if (null !== $this->failedTps) {
            $res['failed_tps'] = $this->failedTps;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->okTps) {
            $res['ok_tps'] = $this->okTps;
        }
        if (null !== $this->rt) {
            $res['rt'] = $this->rt;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConsumerRunningDataDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['diff'])) {
            $model->diff = $map['diff'];
        }
        if (isset($map['failed_count_per_hour'])) {
            $model->failedCountPerHour = $map['failed_count_per_hour'];
        }
        if (isset($map['failed_tps'])) {
            $model->failedTps = $map['failed_tps'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['ok_tps'])) {
            $model->okTps = $map['ok_tps'];
        }
        if (isset($map['rt'])) {
            $model->rt = $map['rt'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }

        return $model;
    }
}
