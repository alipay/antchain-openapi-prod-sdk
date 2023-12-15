<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ANTVERSE\Models;

use AlibabaCloud\Tea\Model;

class SendLiveMessageResponse extends Model
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

    // 直播间实例id
    /**
     * @var string
     */
    public $instanceId;

    // 直播间项目id
    /**
     * @var string
     */
    public $projectId;

    // 问答导出任务id
    /**
     * @var string
     */
    public $taskId;

    // 问答完成状态
    /**
     * @var string
     */
    public $status;

    // 标记
    /**
     * @var string
     */
    public $mark;

    // 发送时间
    /**
     * @var string
     */
    public $sendTime;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'instanceId' => 'instance_id',
        'projectId'  => 'project_id',
        'taskId'     => 'task_id',
        'status'     => 'status',
        'mark'       => 'mark',
        'sendTime'   => 'send_time',
    ];

    public function validate()
    {
        Model::validatePattern('sendTime', $this->sendTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->mark) {
            $res['mark'] = $this->mark;
        }
        if (null !== $this->sendTime) {
            $res['send_time'] = $this->sendTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendLiveMessageResponse
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['mark'])) {
            $model->mark = $map['mark'];
        }
        if (isset($map['send_time'])) {
            $model->sendTime = $map['send_time'];
        }

        return $model;
    }
}
