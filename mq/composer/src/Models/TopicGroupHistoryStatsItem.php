<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class TopicGroupHistoryStatsItem extends Model
{
    // 当前时间点的死信数量
    /**
     * @example 1000
     *
     * @var int
     */
    public $dlq;

    // 当前时间点的消息积压量
    /**
     * @example 1000
     *
     * @var int
     */
    public $msgBacklog;

    // 每分钟消费数据大小
    /**
     * @example 1000
     *
     * @var int
     */
    public $recvBpm;

    // 每分钟拉请求数量
    /**
     * @example 1000
     *
     * @var int
     */
    public $recvPpm;

    // 消费 TPM
    /**
     * @example 1000
     *
     * @var int
     */
    public $recvTpm;

    // 每分钟发送消息大小
    /**
     * @example 1000
     *
     * @var int
     */
    public $sendBpm;

    // 发送 TPM
    /**
     * @example 1000
     *
     * @var int
     */
    public $sendTpm;

    // Unix 时间戳
    /**
     * @example 1583592345
     *
     * @var int
     */
    public $timestamp;
    protected $_name = [
        'dlq'        => 'dlq',
        'msgBacklog' => 'msg_backlog',
        'recvBpm'    => 'recv_bpm',
        'recvPpm'    => 'recv_ppm',
        'recvTpm'    => 'recv_tpm',
        'sendBpm'    => 'send_bpm',
        'sendTpm'    => 'send_tpm',
        'timestamp'  => 'timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('dlq', $this->dlq, true);
        Model::validateRequired('msgBacklog', $this->msgBacklog, true);
        Model::validateRequired('recvBpm', $this->recvBpm, true);
        Model::validateRequired('recvPpm', $this->recvPpm, true);
        Model::validateRequired('recvTpm', $this->recvTpm, true);
        Model::validateRequired('sendBpm', $this->sendBpm, true);
        Model::validateRequired('sendTpm', $this->sendTpm, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dlq) {
            $res['dlq'] = $this->dlq;
        }
        if (null !== $this->msgBacklog) {
            $res['msg_backlog'] = $this->msgBacklog;
        }
        if (null !== $this->recvBpm) {
            $res['recv_bpm'] = $this->recvBpm;
        }
        if (null !== $this->recvPpm) {
            $res['recv_ppm'] = $this->recvPpm;
        }
        if (null !== $this->recvTpm) {
            $res['recv_tpm'] = $this->recvTpm;
        }
        if (null !== $this->sendBpm) {
            $res['send_bpm'] = $this->sendBpm;
        }
        if (null !== $this->sendTpm) {
            $res['send_tpm'] = $this->sendTpm;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TopicGroupHistoryStatsItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dlq'])) {
            $model->dlq = $map['dlq'];
        }
        if (isset($map['msg_backlog'])) {
            $model->msgBacklog = $map['msg_backlog'];
        }
        if (isset($map['recv_bpm'])) {
            $model->recvBpm = $map['recv_bpm'];
        }
        if (isset($map['recv_ppm'])) {
            $model->recvPpm = $map['recv_ppm'];
        }
        if (isset($map['recv_tpm'])) {
            $model->recvTpm = $map['recv_tpm'];
        }
        if (isset($map['send_bpm'])) {
            $model->sendBpm = $map['send_bpm'];
        }
        if (isset($map['send_tpm'])) {
            $model->sendTpm = $map['send_tpm'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }

        return $model;
    }
}
