<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class CheckAicoguardcoreAicoguardrailsQuestionResponse extends Model
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

    // 是否安全无风险 true：安全无风险 false：有风险
    /**
     * @var bool
     */
    public $safe;

    // 安全动作 BLOCK：拦截  SECURITY_ANSWER：安全代答  SECURITY_PROMPT：安全提示增强
    /**
     * @var string
     */
    public $actionCode;

    // 安全动作相关文案，比如安全提示增强的文案、安全代答的回答、回答里补充的安全提示
    /**
     * @var string
     */
    public $actionMsg;

    // 会话动作. END_SESSION：终止会话.  RECALL_QUERY：撤回提问
    /**
     * @var string
     */
    public $sessionAction;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'safe'          => 'safe',
        'actionCode'    => 'action_code',
        'actionMsg'     => 'action_msg',
        'sessionAction' => 'session_action',
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
        if (null !== $this->safe) {
            $res['safe'] = $this->safe;
        }
        if (null !== $this->actionCode) {
            $res['action_code'] = $this->actionCode;
        }
        if (null !== $this->actionMsg) {
            $res['action_msg'] = $this->actionMsg;
        }
        if (null !== $this->sessionAction) {
            $res['session_action'] = $this->sessionAction;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckAicoguardcoreAicoguardrailsQuestionResponse
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
        if (isset($map['safe'])) {
            $model->safe = $map['safe'];
        }
        if (isset($map['action_code'])) {
            $model->actionCode = $map['action_code'];
        }
        if (isset($map['action_msg'])) {
            $model->actionMsg = $map['action_msg'];
        }
        if (isset($map['session_action'])) {
            $model->sessionAction = $map['session_action'];
        }

        return $model;
    }
}
