<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NOTIFICATION\Models;

use AlibabaCloud\Tea\Model;

class CountTaskMessageResponse extends Model
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

    // 事件码
    /**
     * @var string
     */
    public $eventCode;

    // 任务状态
    /**
     * @var string
     */
    public $taskState;

    // 消息发送统计
    /**
     * @var TaskCount
     */
    public $messageCount;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'eventCode'    => 'event_code',
        'taskState'    => 'task_state',
        'messageCount' => 'message_count',
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
        if (null !== $this->eventCode) {
            $res['event_code'] = $this->eventCode;
        }
        if (null !== $this->taskState) {
            $res['task_state'] = $this->taskState;
        }
        if (null !== $this->messageCount) {
            $res['message_count'] = null !== $this->messageCount ? $this->messageCount->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CountTaskMessageResponse
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
        if (isset($map['event_code'])) {
            $model->eventCode = $map['event_code'];
        }
        if (isset($map['task_state'])) {
            $model->taskState = $map['task_state'];
        }
        if (isset($map['message_count'])) {
            $model->messageCount = TaskCount::fromMap($map['message_count']);
        }

        return $model;
    }
}
