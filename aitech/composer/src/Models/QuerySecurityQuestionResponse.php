<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QuerySecurityQuestionResponse extends Model
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

    // 代表风险等级和建议的处置结论，PASS：安全无风险，BLOCK：绝对风险，建议直接拦截，SECURITY_ANSWER：泛风险，回答内容存在敏感要素
    /**
     * @var string
     */
    public $actionCode;

    // 命中的自定义黑词列表
    /**
     * @var string[]
     */
    public $customizeRiskWord;

    // 风险标签
    /**
     * @var LabelModel[]
     */
    public $labels;

    // 会话Id
    /**
     * @var string
     */
    public $sessionId;

    // 表示是同一个Q&A
    /**
     * @var string
     */
    public $messageId;

    // 兜底话术
    /**
     * @var string
     */
    public $limitAnswer;

    // 有风险时的安全代答
    /**
     * @var string
     */
    public $securityAnswer;

    // 当请求参数 promptReword=Y 时返回，为安全改写后的内容
    /**
     * @var string
     */
    public $securityPrompt;

    // 提示词攻击手法标签
    /**
     * @var AttackLabel
     */
    public $attackLabels;

    // 领域标签信息
    /**
     * @var FieldModel
     */
    public $fieldInfo;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'actionCode'        => 'action_code',
        'customizeRiskWord' => 'customize_risk_word',
        'labels'            => 'labels',
        'sessionId'         => 'session_id',
        'messageId'         => 'message_id',
        'limitAnswer'       => 'limit_answer',
        'securityAnswer'    => 'security_answer',
        'securityPrompt'    => 'security_prompt',
        'attackLabels'      => 'attack_labels',
        'fieldInfo'         => 'field_info',
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
        if (null !== $this->actionCode) {
            $res['action_code'] = $this->actionCode;
        }
        if (null !== $this->customizeRiskWord) {
            $res['customize_risk_word'] = $this->customizeRiskWord;
        }
        if (null !== $this->labels) {
            $res['labels'] = [];
            if (null !== $this->labels && \is_array($this->labels)) {
                $n = 0;
                foreach ($this->labels as $item) {
                    $res['labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->limitAnswer) {
            $res['limit_answer'] = $this->limitAnswer;
        }
        if (null !== $this->securityAnswer) {
            $res['security_answer'] = $this->securityAnswer;
        }
        if (null !== $this->securityPrompt) {
            $res['security_prompt'] = $this->securityPrompt;
        }
        if (null !== $this->attackLabels) {
            $res['attack_labels'] = null !== $this->attackLabels ? $this->attackLabels->toMap() : null;
        }
        if (null !== $this->fieldInfo) {
            $res['field_info'] = null !== $this->fieldInfo ? $this->fieldInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySecurityQuestionResponse
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
        if (isset($map['action_code'])) {
            $model->actionCode = $map['action_code'];
        }
        if (isset($map['customize_risk_word'])) {
            if (!empty($map['customize_risk_word'])) {
                $model->customizeRiskWord = $map['customize_risk_word'];
            }
        }
        if (isset($map['labels'])) {
            if (!empty($map['labels'])) {
                $model->labels = [];
                $n             = 0;
                foreach ($map['labels'] as $item) {
                    $model->labels[$n++] = null !== $item ? LabelModel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['message_id'])) {
            $model->messageId = $map['message_id'];
        }
        if (isset($map['limit_answer'])) {
            $model->limitAnswer = $map['limit_answer'];
        }
        if (isset($map['security_answer'])) {
            $model->securityAnswer = $map['security_answer'];
        }
        if (isset($map['security_prompt'])) {
            $model->securityPrompt = $map['security_prompt'];
        }
        if (isset($map['attack_labels'])) {
            $model->attackLabels = AttackLabel::fromMap($map['attack_labels']);
        }
        if (isset($map['field_info'])) {
            $model->fieldInfo = FieldModel::fromMap($map['field_info']);
        }

        return $model;
    }
}
