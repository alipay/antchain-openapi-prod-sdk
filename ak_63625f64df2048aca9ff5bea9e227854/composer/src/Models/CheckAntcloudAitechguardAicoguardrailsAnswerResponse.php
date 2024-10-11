<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_63625f64df2048aca9ff5bea9e227854\Models;

use AlibabaCloud\Tea\Model;

class CheckAntcloudAitechguardAicoguardrailsAnswerResponse extends Model
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

    // 会话ID，用于匹配多轮对话上下文
    /**
     * @var string
     */
    public $sessionId;

    // 唯一定位一个问答对
    /**
     * @var string
     */
    public $requestId;

    // 是否安全无风险
    /**
     * @var bool
     */
    public $safe;

    // 有风险时的安全动作, BLOCK: 拦截; SECURITY_ANSWER:安全代答;SECURITY_PROMPT:安全提示增强
    /**
     * @var string
     */
    public $actionCode;

    // 会话动作
    // END_SESSION：终止会话
    // RECALL_QUERY：撤回提问
    /**
     * @var string
     */
    public $sessionAction;

    // 安全动作相关文案，比如安全提示增强的文案、安全代答的回答、回答里补充的安全提示
    /**
     * @var string
     */
    public $actionMsg;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'sessionId'     => 'session_id',
        'requestId'     => 'request_id',
        'safe'          => 'safe',
        'actionCode'    => 'action_code',
        'sessionAction' => 'session_action',
        'actionMsg'     => 'action_msg',
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
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->safe) {
            $res['safe'] = $this->safe;
        }
        if (null !== $this->actionCode) {
            $res['action_code'] = $this->actionCode;
        }
        if (null !== $this->sessionAction) {
            $res['session_action'] = $this->sessionAction;
        }
        if (null !== $this->actionMsg) {
            $res['action_msg'] = $this->actionMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckAntcloudAitechguardAicoguardrailsAnswerResponse
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
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['safe'])) {
            $model->safe = $map['safe'];
        }
        if (isset($map['action_code'])) {
            $model->actionCode = $map['action_code'];
        }
        if (isset($map['session_action'])) {
            $model->sessionAction = $map['session_action'];
        }
        if (isset($map['action_msg'])) {
            $model->actionMsg = $map['action_msg'];
        }

        return $model;
    }
}
