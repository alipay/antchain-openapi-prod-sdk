<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

use AntChain\AITECH\Models\LabelModel;
use AntChain\AITECH\Models\TokenUsageSummary;

class UploadSecurityAnswerResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'actionCode' => 'action_code',
        'labels' => 'labels',
        'customizeRiskWord' => 'customize_risk_word',
        'limitAnswer' => 'limit_answer',
        'messageId' => 'message_id',
        'flowMsgId' => 'flow_msg_id',
        'obfuscationData' => 'obfuscation_data',
        'flowProcessState' => 'flow_process_state',
        'universalPrompt' => 'universal_prompt',
        'universalOutput' => 'universal_output',
        'financePrompt' => 'finance_prompt',
        'financeOutput' => 'finance_output',
        'strategyVersion' => 'strategy_version',
        'tokenUsage' => 'token_usage',
        'debugInfo' => 'debug_info',
        'transcribedText' => 'transcribed_text',
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
        if (null !== $this->flowMsgId) {
            $res['flow_msg_id'] = $this->flowMsgId;
        }
        if (null !== $this->obfuscationData) {
            $res['obfuscation_data'] = $this->obfuscationData;
        }
        if (null !== $this->flowProcessState) {
            $res['flow_process_state'] = $this->flowProcessState;
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
        if (null !== $this->transcribedText) {
            $res['transcribed_text'] = $this->transcribedText;
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
     * @return UploadSecurityAnswerResponse
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
        if(isset($map['flow_msg_id'])){
            $model->flowMsgId = $map['flow_msg_id'];
        }
        if(isset($map['obfuscation_data'])){
            $model->obfuscationData = $map['obfuscation_data'];
        }
        if(isset($map['flow_process_state'])){
            $model->flowProcessState = $map['flow_process_state'];
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
        if(isset($map['transcribed_text'])){
            $model->transcribedText = $map['transcribed_text'];
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

    // 四种动作码
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

    // 回传
    /**
     * @var string
     */
    public $messageId;

    // 回传
    /**
     * @var string
     */
    public $flowMsgId;

    // 脱敏后内容
    /**
     * @var string
     */
    public $obfuscationData;

    // 流式处理状态（终态 done）
    /**
     * @var string
     */
    public $flowProcessState;

    // 调试字段
    /**
     * @var string
     */
    public $universalPrompt;

    // 调试字段
    /**
     * @var string
     */
    public $universalOutput;

    // 调试字段
    /**
     * @var string
     */
    public $financePrompt;

    // 调试字段
    /**
     * @var string
     */
    public $financeOutput;

    // 策略版本
    /**
     * @var string
     */
    public $strategyVersion;

    // token 用量
    /**
     * @var TokenUsageSummary
     */
    public $tokenUsage;

    // 调试信息（X-Debug-Mode: true 时返回；语音检测内含 audioAsrInfo 子结构）
    /**
     * @var string
     */
    public $debugInfo;

    // ASR 转写文本（文本链路恒 null）
    /**
     * @var string
     */
    public $transcribedText;

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

}
