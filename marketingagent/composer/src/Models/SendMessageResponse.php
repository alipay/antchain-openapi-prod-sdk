<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETINGAGENT\Models;

use AlibabaCloud\Tea\Model;

class SendMessageResponse extends Model
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

    // Task is the core unit of action for A2A. It has a current status and when results are created for the task they are stored in the artifact.
    /**
     * @var Task
     */
    public $task;

    // Message is one unit of communication between client and server.
    /**
     * @var Message
     */
    public $msg;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'task'       => 'task',
        'msg'        => 'msg',
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
        if (null !== $this->task) {
            $res['task'] = null !== $this->task ? $this->task->toMap() : null;
        }
        if (null !== $this->msg) {
            $res['msg'] = null !== $this->msg ? $this->msg->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendMessageResponse
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
        if (isset($map['task'])) {
            $model->task = Task::fromMap($map['task']);
        }
        if (isset($map['msg'])) {
            $model->msg = Message::fromMap($map['msg']);
        }

        return $model;
    }
}
