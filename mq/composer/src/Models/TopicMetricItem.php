<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class TopicMetricItem extends Model
{
    // 当前时间点 Topic 消费的消息数量
    /**
     * @example 1000
     *
     * @var int
     */
    public $recvCnt;

    // 当前时间点 Topic 消费的消息流量（byte）
    /**
     * @example 10000
     *
     * @var int
     */
    public $recvTraffic;

    // 当前时间点 Topic 发送的消息数量
    /**
     * @example 1000
     *
     * @var int
     */
    public $sendCnt;

    // 当前时间点 Topic 发送的消息流量（byte）
    /**
     * @example 1000
     *
     * @var int
     */
    public $sendTraffic;

    // 数据点的时间戳
    /**
     * @example
     *
     * @var int
     */
    public $timestamp;
    protected $_name = [
        'recvCnt'     => 'recv_cnt',
        'recvTraffic' => 'recv_traffic',
        'sendCnt'     => 'send_cnt',
        'sendTraffic' => 'send_traffic',
        'timestamp'   => 'timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('recvCnt', $this->recvCnt, true);
        Model::validateRequired('recvTraffic', $this->recvTraffic, true);
        Model::validateRequired('sendCnt', $this->sendCnt, true);
        Model::validateRequired('sendTraffic', $this->sendTraffic, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->recvCnt) {
            $res['recv_cnt'] = $this->recvCnt;
        }
        if (null !== $this->recvTraffic) {
            $res['recv_traffic'] = $this->recvTraffic;
        }
        if (null !== $this->sendCnt) {
            $res['send_cnt'] = $this->sendCnt;
        }
        if (null !== $this->sendTraffic) {
            $res['send_traffic'] = $this->sendTraffic;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TopicMetricItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['recv_cnt'])) {
            $model->recvCnt = $map['recv_cnt'];
        }
        if (isset($map['recv_traffic'])) {
            $model->recvTraffic = $map['recv_traffic'];
        }
        if (isset($map['send_cnt'])) {
            $model->sendCnt = $map['send_cnt'];
        }
        if (isset($map['send_traffic'])) {
            $model->sendTraffic = $map['send_traffic'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }

        return $model;
    }
}
