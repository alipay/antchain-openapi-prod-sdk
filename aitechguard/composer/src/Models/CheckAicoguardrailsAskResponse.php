<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECHGUARD\Models;

use AlibabaCloud\Tea\Model;

class CheckAicoguardrailsAskResponse extends Model
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

    // 是否安全无风险. true：安全无风险. false：有风险
    /**
     * @var bool
     */
    public $safe;

    // 安全动作
    // 提问场景
    // BLOCK：拦截
    // SECURITY_ANSWER：安全代答
    // SECURITY_PROMPT：安全提示增强
    /**
     * @var string
     */
    public $actionCode;

    // 安全代答的回答
    /**
     * @var string
     */
    public $securityAnswer;

    // 有安全风险时的提问改写
    /**
     * @var string
     */
    public $securityPrompt;

    // 有风险时的风险标签
    /**
     * @var string
     */
    public $riskLabel;

    // 会话动作
    // END_SESSION：终止会话
    // RECALL_QUERY：撤回提问
    /**
     * @var string
     */
    public $sessionAction;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'sessionId'      => 'session_id',
        'requestId'      => 'request_id',
        'safe'           => 'safe',
        'actionCode'     => 'action_code',
        'securityAnswer' => 'security_answer',
        'securityPrompt' => 'security_prompt',
        'riskLabel'      => 'risk_label',
        'sessionAction'  => 'session_action',
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
        if (null !== $this->securityAnswer) {
            $res['security_answer'] = $this->securityAnswer;
        }
        if (null !== $this->securityPrompt) {
            $res['security_prompt'] = $this->securityPrompt;
        }
        if (null !== $this->riskLabel) {
            $res['risk_label'] = $this->riskLabel;
        }
        if (null !== $this->sessionAction) {
            $res['session_action'] = $this->sessionAction;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckAicoguardrailsAskResponse
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
        if (isset($map['security_answer'])) {
            $model->securityAnswer = $map['security_answer'];
        }
        if (isset($map['security_prompt'])) {
            $model->securityPrompt = $map['security_prompt'];
        }
        if (isset($map['risk_label'])) {
            $model->riskLabel = $map['risk_label'];
        }
        if (isset($map['session_action'])) {
            $model->sessionAction = $map['session_action'];
        }

        return $model;
    }
}
