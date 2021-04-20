<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class QueryEventInfoResponse extends Model
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

    // 事件唯一标识
    /**
     * @var string
     */
    public $eventId;

    // 事件状态
    /**
     * @var string
     */
    public $eventStatus;

    // token发放状态
    /**
     * @var string
     */
    public $tokenStatus;

    // token数量
    /**
     * @var int
     */
    public $tokenAmount;

    // 事件上报时间
    /**
     * @var string
     */
    public $eventTime;

    // 事件处理结果提示信息
    /**
     * @var string
     */
    public $message;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'eventId'     => 'event_id',
        'eventStatus' => 'event_status',
        'tokenStatus' => 'token_status',
        'tokenAmount' => 'token_amount',
        'eventTime'   => 'event_time',
        'message'     => 'message',
    ];

    public function validate()
    {
        Model::validatePattern('eventTime', $this->eventTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->eventId) {
            $res['event_id'] = $this->eventId;
        }
        if (null !== $this->eventStatus) {
            $res['event_status'] = $this->eventStatus;
        }
        if (null !== $this->tokenStatus) {
            $res['token_status'] = $this->tokenStatus;
        }
        if (null !== $this->tokenAmount) {
            $res['token_amount'] = $this->tokenAmount;
        }
        if (null !== $this->eventTime) {
            $res['event_time'] = $this->eventTime;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEventInfoResponse
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
        if (isset($map['event_id'])) {
            $model->eventId = $map['event_id'];
        }
        if (isset($map['event_status'])) {
            $model->eventStatus = $map['event_status'];
        }
        if (isset($map['token_status'])) {
            $model->tokenStatus = $map['token_status'];
        }
        if (isset($map['token_amount'])) {
            $model->tokenAmount = $map['token_amount'];
        }
        if (isset($map['event_time'])) {
            $model->eventTime = $map['event_time'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
