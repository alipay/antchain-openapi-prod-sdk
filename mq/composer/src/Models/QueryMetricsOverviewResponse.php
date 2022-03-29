<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QueryMetricsOverviewResponse extends Model
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

    // 消息堆积数量
    /**
     * @var int
     */
    public $backlogNum;

    // 死信消息数量
    /**
     * @var int
     */
    public $dlqNum;

    // 当前租户消费组数量
    /**
     * @var int
     */
    public $groupNum;

    // 订阅关系数量
    /**
     * @var int
     */
    public $subscriptionNum;

    // 当前租户下的 Topic 数量
    /**
     * @var int
     */
    public $topicNum;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'backlogNum'      => 'backlog_num',
        'dlqNum'          => 'dlq_num',
        'groupNum'        => 'group_num',
        'subscriptionNum' => 'subscription_num',
        'topicNum'        => 'topic_num',
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
        if (null !== $this->backlogNum) {
            $res['backlog_num'] = $this->backlogNum;
        }
        if (null !== $this->dlqNum) {
            $res['dlq_num'] = $this->dlqNum;
        }
        if (null !== $this->groupNum) {
            $res['group_num'] = $this->groupNum;
        }
        if (null !== $this->subscriptionNum) {
            $res['subscription_num'] = $this->subscriptionNum;
        }
        if (null !== $this->topicNum) {
            $res['topic_num'] = $this->topicNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMetricsOverviewResponse
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
        if (isset($map['backlog_num'])) {
            $model->backlogNum = $map['backlog_num'];
        }
        if (isset($map['dlq_num'])) {
            $model->dlqNum = $map['dlq_num'];
        }
        if (isset($map['group_num'])) {
            $model->groupNum = $map['group_num'];
        }
        if (isset($map['subscription_num'])) {
            $model->subscriptionNum = $map['subscription_num'];
        }
        if (isset($map['topic_num'])) {
            $model->topicNum = $map['topic_num'];
        }

        return $model;
    }
}
