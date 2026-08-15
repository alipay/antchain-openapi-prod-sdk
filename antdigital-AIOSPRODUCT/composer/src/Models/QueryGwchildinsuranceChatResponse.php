<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AIOSPRODUCT\Models;

use AlibabaCloud\Tea\Model;

class QueryGwchildinsuranceChatResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'sessionId' => 'session_id',
        'agentCode' => 'agent_code',
        'answer' => 'answer',
        'traceId' => 'trace_id',
        'metadata' => 'metadata',
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
        if (null !== $this->agentCode) {
            $res['agent_code'] = $this->agentCode;
        }
        if (null !== $this->answer) {
            $res['answer'] = $this->answer;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->metadata) {
            $res['metadata'] = $this->metadata;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryGwchildinsuranceChatResponse
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
        if(isset($map['agent_code'])){
            $model->agentCode = $map['agent_code'];
        }
        if(isset($map['answer'])){
            $model->answer = $map['answer'];
        }
        if(isset($map['trace_id'])){
            $model->traceId = $map['trace_id'];
        }
        if(isset($map['metadata'])){
            $model->metadata = $map['metadata'];
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

    // 会话id
    /**
     * @var string
     */
    public $sessionId;

    // 业务配置标识（必传），决定模型、策略、提示词
    /**
     * @var string
     */
    public $agentCode;

    // 回答
    /**
     * @var string
     */
    public $answer;

    // 链路id
    /**
     * @var string
     */
    public $traceId;

    // 附加信息
    /**
     * @var string
     */
    public $metadata;

}
