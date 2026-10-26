<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

use AntChain\AITECH\Models\LabelModel;
use AntChain\AITECH\Models\AttackLabelModel;
use AntChain\AITECH\Models\FieldModel;
use AntChain\AITECH\Models\TokenUsageSummary;

class UploadSecurityQuestionResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'actionCode' => 'action_code',
        'labels' => 'labels',
        'customizeRiskWord' => 'customize_risk_word',
        'limitAnswer' => 'limit_answer',
        'messageId' => 'message_id',
        'matchQ' => 'match_q',
        'securityAnswer' => 'security_answer',
        'securityPrompt' => 'security_prompt',
        'jailbreakLabel' => 'jailbreak_label',
        'attackLabels' => 'attack_labels',
        'fieldInfo' => 'field_info',
        'sessionId' => 'session_id',
        'tokenUsage' => 'token_usage',
        'transcribedText' => 'transcribed_text',
        'debugInfo' => 'debug_info',
        'findeepdiveResult' => 'findeepdive_result',
        'finDeepDiveOverall' => 'fin_deep_dive_overall',
        'universalPrompt' => 'universal_prompt',
        'universalOutput' => 'universal_output',
        'financePrompt' => 'finance_prompt',
        'financeOutput' => 'finance_output',
        'strategyVersion' => 'strategy_version',
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
        if (null !== $this->actionCode) {
            $res['action_code'] = $this->actionCode;
        }
        if (null !== $this->labels) {
            $res['labels'] = [];
            if(null !== $this->labels && is_array($this->labels)){
                $n = 0;
                foreach($this->labels as $item){
                    $res['labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->customizeRiskWord) {
            $res['customize_risk_word'] = $this->customizeRiskWord;
        }
        if (null !== $this->limitAnswer) {
            $res['limit_answer'] = $this->limitAnswer;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->matchQ) {
            $res['match_q'] = $this->matchQ;
        }
        if (null !== $this->securityAnswer) {
            $res['security_answer'] = $this->securityAnswer;
        }
        if (null !== $this->securityPrompt) {
            $res['security_prompt'] = $this->securityPrompt;
        }
        if (null !== $this->jailbreakLabel) {
            $res['jailbreak_label'] = $this->jailbreakLabel;
        }
        if (null !== $this->attackLabels) {
            $res['attack_labels'] = [];
            if(null !== $this->attackLabels && is_array($this->attackLabels)){
                $n = 0;
                foreach($this->attackLabels as $item){
                    $res['attack_labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->fieldInfo) {
            $res['field_info'] = null !== $this->fieldInfo ? $this->fieldInfo->toMap() : null;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->tokenUsage) {
            $res['token_usage'] = null !== $this->tokenUsage ? $this->tokenUsage->toMap() : null;
        }
        if (null !== $this->transcribedText) {
            $res['transcribed_text'] = $this->transcribedText;
        }
        if (null !== $this->debugInfo) {
            $res['debug_info'] = $this->debugInfo;
        }
        if (null !== $this->findeepdiveResult) {
            $res['findeepdive_result'] = $this->findeepdiveResult;
        }
        if (null !== $this->finDeepDiveOverall) {
            $res['fin_deep_dive_overall'] = $this->finDeepDiveOverall;
        }
        if (null !== $this->universalPrompt) {
            $res['universal_prompt'] = $this->universalPrompt;
        }
        if (null !== $this->universalOutput) {
            $res['universal_output'] = $this->universalOutput;
        }
        if (null !== $this->financePrompt) {
            $res['finance_prompt'] = $this->financePrompt;
        }
        if (null !== $this->financeOutput) {
            $res['finance_output'] = $this->financeOutput;
        }
        if (null !== $this->strategyVersion) {
            $res['strategy_version'] = $this->strategyVersion;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadSecurityQuestionResponse
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
        if(isset($map['action_code'])){
            $model->actionCode = $map['action_code'];
        }
        if(isset($map['labels'])){
            if(!empty($map['labels'])){
                $model->labels = [];
                $n = 0;
                foreach($map['labels'] as $item) {
                    $model->labels[$n++] = null !== $item ? LabelModel::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['customize_risk_word'])){
            if(!empty($map['customize_risk_word'])){
                $model->customizeRiskWord = $map['customize_risk_word'];
            }
        }
        if(isset($map['limit_answer'])){
            $model->limitAnswer = $map['limit_answer'];
        }
        if(isset($map['message_id'])){
            $model->messageId = $map['message_id'];
        }
        if(isset($map['match_q'])){
            $model->matchQ = $map['match_q'];
        }
        if(isset($map['security_answer'])){
            $model->securityAnswer = $map['security_answer'];
        }
        if(isset($map['security_prompt'])){
            $model->securityPrompt = $map['security_prompt'];
        }
        if(isset($map['jailbreak_label'])){
            $model->jailbreakLabel = $map['jailbreak_label'];
        }
        if(isset($map['attack_labels'])){
            if(!empty($map['attack_labels'])){
                $model->attackLabels = [];
                $n = 0;
                foreach($map['attack_labels'] as $item) {
                    $model->attackLabels[$n++] = null !== $item ? AttackLabelModel::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['field_info'])){
            $model->fieldInfo = FieldModel::fromMap($map['field_info']);
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        if(isset($map['token_usage'])){
            $model->tokenUsage = TokenUsageSummary::fromMap($map['token_usage']);
        }
        if(isset($map['transcribed_text'])){
            $model->transcribedText = $map['transcribed_text'];
        }
        if(isset($map['debug_info'])){
            $model->debugInfo = $map['debug_info'];
        }
        if(isset($map['findeepdive_result'])){
            $model->findeepdiveResult = $map['findeepdive_result'];
        }
        if(isset($map['fin_deep_dive_overall'])){
            $model->finDeepDiveOverall = $map['fin_deep_dive_overall'];
        }
        if(isset($map['universal_prompt'])){
            $model->universalPrompt = $map['universal_prompt'];
        }
        if(isset($map['universal_output'])){
            $model->universalOutput = $map['universal_output'];
        }
        if(isset($map['finance_prompt'])){
            $model->financePrompt = $map['finance_prompt'];
        }
        if(isset($map['finance_output'])){
            $model->financeOutput = $map['finance_output'];
        }
        if(isset($map['strategy_version'])){
            $model->strategyVersion = $map['strategy_version'];
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

    // PASS
    /**
     * @var string
     */
    public $actionCode;

    // 风险标签
    /**
     * @var LabelModel[]
     */
    public $labels;

    // 命中自定义风险词
    /**
     * @var string[]
     */
    public $customizeRiskWord;

    // 拒答话术
    /**
     * @var string
     */
    public $limitAnswer;

    // 回传消息 ID
    /**
     * @var string
     */
    public $messageId;

    // 知识库匹配提问
    /**
     * @var string
     */
    public $matchQ;

    // 安全代答内容
    /**
     * @var string
     */
    public $securityAnswer;

    // 安全提示
    /**
     * @var string
     */
    public $securityPrompt;

    // 越狱标签（旧字段）
    /**
     * @var string
     */
    public $jailbreakLabel;

    // 攻击标签
    /**
     * @var AttackLabelModel[]
     */
    public $attackLabels;

    // 领域识别
    /**
     * @var FieldModel
     */
    public $fieldInfo;

    // 回传会话 ID
    /**
     * @var string
     */
    public $sessionId;

    // 本次接口请求内所有大模型及 Embedding 调用的 token 汇总。
    /**
     * @var TokenUsageSummary
     */
    public $tokenUsage;

    // ASR 转写文本
    /**
     * @var string
     */
    public $transcribedText;

    // 调试信息
    /**
     * @var string
     */
    public $debugInfo;

    // 金融深挖结果
    /**
     * @var string
     */
    public $findeepdiveResult;

    // 金融深挖总览
    /**
     * @var string
     */
    public $finDeepDiveOverall;

    // Universal 调试-提示词
    /**
     * @var string
     */
    public $universalPrompt;

    // Universal 调试-输出
    /**
     * @var string
     */
    public $universalOutput;

    // 金融调试-提示词
    /**
     * @var string
     */
    public $financePrompt;

    // 金融调试-输出
    /**
     * @var string
     */
    public $financeOutput;

    // 策略版本
    /**
     * @var string
     */
    public $strategyVersion;

}
