<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

use AntChain\AITECH\Models\LabelModel;
use AntChain\AITECH\Models\AttackLabel;
use AntChain\AITECH\Models\FieldModel;
use AntChain\AITECH\Models\TokenUsageSummary;

class QuerySecurityQuestionResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'actionCode' => 'action_code',
        'customizeRiskWord' => 'customize_risk_word',
        'labels' => 'labels',
        'sessionId' => 'session_id',
        'messageId' => 'message_id',
        'limitAnswer' => 'limit_answer',
        'securityAnswer' => 'security_answer',
        'securityPrompt' => 'security_prompt',
        'attackLabels' => 'attack_labels',
        'fieldInfo' => 'field_info',
        'matchQ' => 'match_q',
        'jailbreakLabel' => 'jailbreak_label',
        'universalPrompt' => 'universal_prompt',
        'universalOutput' => 'universal_output',
        'financePrompt' => 'finance_prompt',
        'financeOutput' => 'finance_output',
        'strategyVersion' => 'strategy_version',
        'tokenUsage' => 'token_usage',
        'debugInfo' => 'debug_info',
        'findeepdiveResult' => 'findeepdive_result',
        'finDeepDiveOverall' => 'fin_deep_dive_overall',
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
        if (null !== $this->customizeRiskWord) {
            $res['customize_risk_word'] = $this->customizeRiskWord;
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
        if (null !== $this->matchQ) {
            $res['match_q'] = $this->matchQ;
        }
        if (null !== $this->jailbreakLabel) {
            $res['jailbreak_label'] = $this->jailbreakLabel;
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
        if (null !== $this->tokenUsage) {
            $res['token_usage'] = null !== $this->tokenUsage ? $this->tokenUsage->toMap() : null;
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
        return $res;
    }
    /**
     * @param array $map
     * @return QuerySecurityQuestionResponse
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
        if(isset($map['customize_risk_word'])){
            if(!empty($map['customize_risk_word'])){
                $model->customizeRiskWord = $map['customize_risk_word'];
            }
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
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        if(isset($map['message_id'])){
            $model->messageId = $map['message_id'];
        }
        if(isset($map['limit_answer'])){
            $model->limitAnswer = $map['limit_answer'];
        }
        if(isset($map['security_answer'])){
            $model->securityAnswer = $map['security_answer'];
        }
        if(isset($map['security_prompt'])){
            $model->securityPrompt = $map['security_prompt'];
        }
        if(isset($map['attack_labels'])){
            $model->attackLabels = AttackLabel::fromMap($map['attack_labels']);
        }
        if(isset($map['field_info'])){
            $model->fieldInfo = FieldModel::fromMap($map['field_info']);
        }
        if(isset($map['match_q'])){
            $model->matchQ = $map['match_q'];
        }
        if(isset($map['jailbreak_label'])){
            $model->jailbreakLabel = $map['jailbreak_label'];
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
        if(isset($map['token_usage'])){
            $model->tokenUsage = TokenUsageSummary::fromMap($map['token_usage']);
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

    // 安全代答匹配到的Q
    /**
     * @var string
     */
    public $matchQ;

    // 越狱手法标签
    /**
     * @var string
     */
    public $jailbreakLabel;

    // universal模型请求参数
    /**
     * @var string
     */
    public $universalPrompt;

    // universal模型返回结果
    /**
     * @var string
     */
    public $universalOutput;

    // 金融V3模型请求参数
    /**
     * @var string
     */
    public $financePrompt;

    // 金融V3模型返回结果
    /**
     * @var string
     */
    public $financeOutput;

    // 策略版本号
    /**
     * @var string
     */
    public $strategyVersion;

    // 本次接口请求内所有大模型及 Embedding 调用的 token 汇总。
    /**
     * @var TokenUsageSummary
     */
    public $tokenUsage;

    // 调试信息 对应的结果为Map转化的JSON字符串
    /**
     * @var string
     */
    public $debugInfo;

    // 金融合规深度审核——命中的风险点列表（JSON 数组字符串；仅深审开时返回，非深审场景不输出）
    /**
     * @var string
     */
    public $findeepdiveResult;

    // 金融合规深度审核——整体结论
    /**
     * @var string
     */
    public $finDeepDiveOverall;

}
