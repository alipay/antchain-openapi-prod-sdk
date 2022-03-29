<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QueryMetricsTginstantResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 当前 Group 死信
    /**
     * @var int
     */
    public $dlq;

    // 当前消息积压
    /**
     * @var int
     */
    public $msgBacklog;

    // 每分钟消费数据大小
    /**
     * @var int
     */
    public $recvBpm;

    // 每分钟拉请求数量
    /**
     * @var int
     */
    public $recvPpm;

    // 消费 TPM
    /**
     * @var int
     */
    public $recvTpm;

    // 每分钟发送消息大小
    /**
     * @var int
     */
    public $sendBpm;

    // 发送 TPM
    /**
     * @var int
     */
    public $sendTpm;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'dlq'        => 'dlq',
        'msgBacklog' => 'msg_backlog',
        'recvBpm'    => 'recv_bpm',
        'recvPpm'    => 'recv_ppm',
        'recvTpm'    => 'recv_tpm',
        'sendBpm'    => 'send_bpm',
        'sendTpm'    => 'send_tpm',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMetricsTginstantResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
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

        return $model;
    }
}
