<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class ExecEventReportResponse extends Model
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

    // 事件状态，REPORTED：已上报，PROCESSING：处理中，PROCESSED： 处理完毕，NEED_RETRY：需要重试，EVENT_NOT_SUPPORTED：项目暂不支持该事件
    /**
     * @var string
     */
    public $eventStatus;

    // token状态，TOKEN_SUCCESS：token发放成功，TOKEN_PROCESSING：token发放中，TOKEN_FAILED：token发放失败，NO_NEED_ALLOCATION：无需发放
    /**
     * @var string
     */
    public $tokenStatus;

    // 购买者/访问者获得token数量
    /**
     * @var int
     */
    public $tokenAmount;

    // 提示信息
    /**
     * @var string
     */
    public $message;

    // 分享人获得token数
    /**
     * @var int
     */
    public $parentTokenAmount;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'eventId'           => 'event_id',
        'eventStatus'       => 'event_status',
        'tokenStatus'       => 'token_status',
        'tokenAmount'       => 'token_amount',
        'message'           => 'message',
        'parentTokenAmount' => 'parent_token_amount',
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
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->parentTokenAmount) {
            $res['parent_token_amount'] = $this->parentTokenAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecEventReportResponse
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
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['parent_token_amount'])) {
            $model->parentTokenAmount = $map['parent_token_amount'];
        }

        return $model;
    }
}
