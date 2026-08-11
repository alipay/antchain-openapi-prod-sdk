<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVERENDER\Models\AssistantExtra;

class QueryAntcloudMarketingagentCreativeResultResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'sessionId' => 'session_id',
        'messageId' => 'message_id',
        'status' => 'status',
        'content' => 'content',
        'assistantExtra' => 'assistant_extra',
    ];
    public function validate() {}
    public function toMap() {
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
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->assistantExtra) {
            $res['assistant_extra'] = null !== $this->assistantExtra ? $this->assistantExtra->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudMarketingagentCreativeResultResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        if(isset($map['message_id'])){
            $model->messageId = $map['message_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        if(isset($map['assistant_extra'])){
            $model->assistantExtra = AssistantExtra::fromMap($map['assistant_extra']);
        }
        return $model;
    }
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

    // 会话ID
    /**
     * @var string
     */
    public $sessionId;

    // 消息ID
    /**
     * @var string
     */
    public $messageId;

    // 消息状态
    /**
     * @var string
     */
    public $status;

    // 消息内容
    /**
     * @var string
     */
    public $content;

    // agent消息扩展信息
    /**
     * @var AssistantExtra
     */
    public $assistantExtra;

}
