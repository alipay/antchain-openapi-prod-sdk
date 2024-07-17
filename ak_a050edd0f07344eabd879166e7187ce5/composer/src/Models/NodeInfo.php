<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a050edd0f07344eabd879166e7187ce5\Models;

use AlibabaCloud\Tea\Model;

class NodeInfo extends Model
{
    // 业务标签
    /**
     * @example
     *
     * @var Output
     */
    public $bizTag;

    // 节点子类型
    /**
     * @example HANGUP
     *
     * @var string
     */
    public $subType;

    // 人工类型
    /**
     * @example ss
     *
     * @var string
     */
    public $transferTargetType;

    // 路由点
    /**
     * @example xxx
     *
     * @var string
     */
    public $transferData;

    // 技能组
    /**
     * @example xxx
     *
     * @var string
     */
    public $skillGroupNo;

    // 扩展信息
    /**
     * @example {}
     *
     * @var string
     */
    public $extInfo;

    // 业务达成
    /**
     * @example true, false
     *
     * @var bool
     */
    public $bizAchieve;

    // 音色
    /**
     * @example luoli
     *
     * @var string
     */
    public $voiceType;

    // 模型类型
    /**
     * @example MODEL
     *
     * @var string
     */
    public $modelType;

    // 分类模型id
    /**
     * @example 345
     *
     * @var string
     */
    public $modelId;

    // llm意图识别列表配置
    /**
     * @example
     *
     * @var string[]
     */
    public $llmLabels;

    // 是否必填
    /**
     * @example true, false
     *
     * @var bool
     */
    public $required;

    // 失败后重复次数
    /**
     * @example
     *
     * @var int
     */
    public $repeatTime;

    // 是否允许重试话术打断
    /**
     * @example true, false
     *
     * @var bool
     */
    public $interruptable;

    // sts配置
    /**
     * @example STSPLUS
     *
     * @var string
     */
    public $sts;

    // appkey
    /**
     * @example sdfsdfss
     *
     * @var string
     */
    public $appkey;

    // 交互组件后置
    /**
     * @example true, false
     *
     * @var bool
     */
    public $postInteractionComponent;

    // 话术选择策略
    /**
     * @example ORDER
     *
     * @var string
     */
    public $corpusChooseStrategy;

    // 话术选择策略模型的地址
    /**
     * @example http
     *
     * @var string
     */
    public $corpusChooseModelUrl;

    // 话术选择策略模型类型
    /**
     * @example SYSTEM
     *
     * @var string
     */
    public $corpusChooseModelType;

    // 全局意图
    /**
     * @example true, false
     *
     * @var bool
     */
    public $globalIntention;

    // 命中全局意图后需要播报的内容
    /**
     * @example
     *
     * @var Output
     */
    public $globalIntentionReply;

    // 按键类型
    /**
     * @example ss
     *
     * @var string
     */
    public $buttonType;

    // 按键位数
    /**
     * @example
     *
     * @var int
     */
    public $buttonDigit;

    // 结束按键
    /**
     * @example ss
     *
     * @var string
     */
    public $buttonTerminator;

    // 收号超时时间
    /**
     * @example
     *
     * @var int
     */
    public $buttonTimeout;

    // 收号校验规则
    /**
     * @example ss
     *
     * @var string
     */
    public $buttonValidator;

    // 静态菜单配置
    /**
     * @example
     *
     * @var string[]
     */
    public $staticKeys;

    // 是否支持按键返回上一级
    /**
     * @example true, false
     *
     * @var bool
     */
    public $staticKeyPrevious;

    // 是否支持按键重播
    /**
     * @example true, false
     *
     * @var bool
     */
    public $staticKeyRepeat;

    // 是否跳过用户输入的错误校验
    /**
     * @example true, false
     *
     * @var bool
     */
    public $staticKeySkipInputCheck;

    // 只有客权的静态菜单开发
    /**
     * @example true, false
     *
     * @var bool
     */
    public $round;

    // 静态菜单语言
    /**
     * @example ch
     *
     * @var string
     */
    public $language;

    // 实例码
    /**
     * @example xxx
     *
     * @var string
     */
    public $ieInstanceCode;

    // 子流程ID
    /**
     * @example df34sdf
     *
     * @var string
     */
    public $subFlowFeId;

    // 动态子流程id值
    /**
     * @example ss
     *
     * @var string
     */
    public $subFlowDynamicId;

    // 输入参数配置
    /**
     * @example
     *
     * @var Input[]
     */
    public $subFlowInput;

    // 开始节点参数
    /**
     * @example
     *
     * @var Input[]
     */
    public $startParams;

    // 和ouput中的interactionType保持一致
    /**
     * @example
     *
     * @var string[]
     */
    public $allowInteractionTypes;

    // 需要共享上下文的虚拟因子列表
    /**
     * @example
     *
     * @var Input[]
     */
    public $shareFactors;
    protected $_name = [
        'bizTag'                   => 'biz_tag',
        'subType'                  => 'sub_type',
        'transferTargetType'       => 'transfer_target_type',
        'transferData'             => 'transfer_data',
        'skillGroupNo'             => 'skill_group_no',
        'extInfo'                  => 'ext_info',
        'bizAchieve'               => 'biz_achieve',
        'voiceType'                => 'voice_type',
        'modelType'                => 'model_type',
        'modelId'                  => 'model_id',
        'llmLabels'                => 'llm_labels',
        'required'                 => 'required',
        'repeatTime'               => 'repeat_time',
        'interruptable'            => 'interruptable',
        'sts'                      => 'sts',
        'appkey'                   => 'appkey',
        'postInteractionComponent' => 'post_interaction_component',
        'corpusChooseStrategy'     => 'corpus_choose_strategy',
        'corpusChooseModelUrl'     => 'corpus_choose_model_url',
        'corpusChooseModelType'    => 'corpus_choose_model_type',
        'globalIntention'          => 'global_intention',
        'globalIntentionReply'     => 'global_intention_reply',
        'buttonType'               => 'button_type',
        'buttonDigit'              => 'button_digit',
        'buttonTerminator'         => 'button_terminator',
        'buttonTimeout'            => 'button_timeout',
        'buttonValidator'          => 'button_validator',
        'staticKeys'               => 'static_keys',
        'staticKeyPrevious'        => 'static_key_previous',
        'staticKeyRepeat'          => 'static_key_repeat',
        'staticKeySkipInputCheck'  => 'static_key_skip_input_check',
        'round'                    => 'round',
        'language'                 => 'language',
        'ieInstanceCode'           => 'ie_instance_code',
        'subFlowFeId'              => 'sub_flow_fe_id',
        'subFlowDynamicId'         => 'sub_flow_dynamic_id',
        'subFlowInput'             => 'sub_flow_input',
        'startParams'              => 'start_params',
        'allowInteractionTypes'    => 'allow_interaction_types',
        'shareFactors'             => 'share_factors',
    ];

    public function validate()
    {
        Model::validateRequired('bizTag', $this->bizTag, true);
        Model::validateRequired('subType', $this->subType, true);
        Model::validateRequired('transferTargetType', $this->transferTargetType, true);
        Model::validateRequired('transferData', $this->transferData, true);
        Model::validateRequired('skillGroupNo', $this->skillGroupNo, true);
        Model::validateRequired('extInfo', $this->extInfo, true);
        Model::validateRequired('bizAchieve', $this->bizAchieve, true);
        Model::validateRequired('voiceType', $this->voiceType, true);
        Model::validateRequired('modelType', $this->modelType, true);
        Model::validateRequired('modelId', $this->modelId, true);
        Model::validateRequired('llmLabels', $this->llmLabels, true);
        Model::validateRequired('required', $this->required, true);
        Model::validateRequired('repeatTime', $this->repeatTime, true);
        Model::validateRequired('interruptable', $this->interruptable, true);
        Model::validateRequired('sts', $this->sts, true);
        Model::validateRequired('appkey', $this->appkey, true);
        Model::validateRequired('postInteractionComponent', $this->postInteractionComponent, true);
        Model::validateRequired('corpusChooseStrategy', $this->corpusChooseStrategy, true);
        Model::validateRequired('corpusChooseModelUrl', $this->corpusChooseModelUrl, true);
        Model::validateRequired('corpusChooseModelType', $this->corpusChooseModelType, true);
        Model::validateRequired('globalIntention', $this->globalIntention, true);
        Model::validateRequired('globalIntentionReply', $this->globalIntentionReply, true);
        Model::validateRequired('buttonType', $this->buttonType, true);
        Model::validateRequired('buttonDigit', $this->buttonDigit, true);
        Model::validateRequired('buttonTerminator', $this->buttonTerminator, true);
        Model::validateRequired('buttonTimeout', $this->buttonTimeout, true);
        Model::validateRequired('buttonValidator', $this->buttonValidator, true);
        Model::validateRequired('staticKeys', $this->staticKeys, true);
        Model::validateRequired('staticKeyPrevious', $this->staticKeyPrevious, true);
        Model::validateRequired('staticKeyRepeat', $this->staticKeyRepeat, true);
        Model::validateRequired('staticKeySkipInputCheck', $this->staticKeySkipInputCheck, true);
        Model::validateRequired('round', $this->round, true);
        Model::validateRequired('language', $this->language, true);
        Model::validateRequired('ieInstanceCode', $this->ieInstanceCode, true);
        Model::validateRequired('subFlowFeId', $this->subFlowFeId, true);
        Model::validateRequired('subFlowDynamicId', $this->subFlowDynamicId, true);
        Model::validateRequired('subFlowInput', $this->subFlowInput, true);
        Model::validateRequired('startParams', $this->startParams, true);
        Model::validateRequired('allowInteractionTypes', $this->allowInteractionTypes, true);
        Model::validateRequired('shareFactors', $this->shareFactors, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizTag) {
            $res['biz_tag'] = null !== $this->bizTag ? $this->bizTag->toMap() : null;
        }
        if (null !== $this->subType) {
            $res['sub_type'] = $this->subType;
        }
        if (null !== $this->transferTargetType) {
            $res['transfer_target_type'] = $this->transferTargetType;
        }
        if (null !== $this->transferData) {
            $res['transfer_data'] = $this->transferData;
        }
        if (null !== $this->skillGroupNo) {
            $res['skill_group_no'] = $this->skillGroupNo;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->bizAchieve) {
            $res['biz_achieve'] = $this->bizAchieve;
        }
        if (null !== $this->voiceType) {
            $res['voice_type'] = $this->voiceType;
        }
        if (null !== $this->modelType) {
            $res['model_type'] = $this->modelType;
        }
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->llmLabels) {
            $res['llm_labels'] = $this->llmLabels;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }
        if (null !== $this->repeatTime) {
            $res['repeat_time'] = $this->repeatTime;
        }
        if (null !== $this->interruptable) {
            $res['interruptable'] = $this->interruptable;
        }
        if (null !== $this->sts) {
            $res['sts'] = $this->sts;
        }
        if (null !== $this->appkey) {
            $res['appkey'] = $this->appkey;
        }
        if (null !== $this->postInteractionComponent) {
            $res['post_interaction_component'] = $this->postInteractionComponent;
        }
        if (null !== $this->corpusChooseStrategy) {
            $res['corpus_choose_strategy'] = $this->corpusChooseStrategy;
        }
        if (null !== $this->corpusChooseModelUrl) {
            $res['corpus_choose_model_url'] = $this->corpusChooseModelUrl;
        }
        if (null !== $this->corpusChooseModelType) {
            $res['corpus_choose_model_type'] = $this->corpusChooseModelType;
        }
        if (null !== $this->globalIntention) {
            $res['global_intention'] = $this->globalIntention;
        }
        if (null !== $this->globalIntentionReply) {
            $res['global_intention_reply'] = null !== $this->globalIntentionReply ? $this->globalIntentionReply->toMap() : null;
        }
        if (null !== $this->buttonType) {
            $res['button_type'] = $this->buttonType;
        }
        if (null !== $this->buttonDigit) {
            $res['button_digit'] = $this->buttonDigit;
        }
        if (null !== $this->buttonTerminator) {
            $res['button_terminator'] = $this->buttonTerminator;
        }
        if (null !== $this->buttonTimeout) {
            $res['button_timeout'] = $this->buttonTimeout;
        }
        if (null !== $this->buttonValidator) {
            $res['button_validator'] = $this->buttonValidator;
        }
        if (null !== $this->staticKeys) {
            $res['static_keys'] = $this->staticKeys;
        }
        if (null !== $this->staticKeyPrevious) {
            $res['static_key_previous'] = $this->staticKeyPrevious;
        }
        if (null !== $this->staticKeyRepeat) {
            $res['static_key_repeat'] = $this->staticKeyRepeat;
        }
        if (null !== $this->staticKeySkipInputCheck) {
            $res['static_key_skip_input_check'] = $this->staticKeySkipInputCheck;
        }
        if (null !== $this->round) {
            $res['round'] = $this->round;
        }
        if (null !== $this->language) {
            $res['language'] = $this->language;
        }
        if (null !== $this->ieInstanceCode) {
            $res['ie_instance_code'] = $this->ieInstanceCode;
        }
        if (null !== $this->subFlowFeId) {
            $res['sub_flow_fe_id'] = $this->subFlowFeId;
        }
        if (null !== $this->subFlowDynamicId) {
            $res['sub_flow_dynamic_id'] = $this->subFlowDynamicId;
        }
        if (null !== $this->subFlowInput) {
            $res['sub_flow_input'] = [];
            if (null !== $this->subFlowInput && \is_array($this->subFlowInput)) {
                $n = 0;
                foreach ($this->subFlowInput as $item) {
                    $res['sub_flow_input'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->startParams) {
            $res['start_params'] = [];
            if (null !== $this->startParams && \is_array($this->startParams)) {
                $n = 0;
                foreach ($this->startParams as $item) {
                    $res['start_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->allowInteractionTypes) {
            $res['allow_interaction_types'] = $this->allowInteractionTypes;
        }
        if (null !== $this->shareFactors) {
            $res['share_factors'] = [];
            if (null !== $this->shareFactors && \is_array($this->shareFactors)) {
                $n = 0;
                foreach ($this->shareFactors as $item) {
                    $res['share_factors'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NodeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_tag'])) {
            $model->bizTag = Output::fromMap($map['biz_tag']);
        }
        if (isset($map['sub_type'])) {
            $model->subType = $map['sub_type'];
        }
        if (isset($map['transfer_target_type'])) {
            $model->transferTargetType = $map['transfer_target_type'];
        }
        if (isset($map['transfer_data'])) {
            $model->transferData = $map['transfer_data'];
        }
        if (isset($map['skill_group_no'])) {
            $model->skillGroupNo = $map['skill_group_no'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['biz_achieve'])) {
            $model->bizAchieve = $map['biz_achieve'];
        }
        if (isset($map['voice_type'])) {
            $model->voiceType = $map['voice_type'];
        }
        if (isset($map['model_type'])) {
            $model->modelType = $map['model_type'];
        }
        if (isset($map['model_id'])) {
            $model->modelId = $map['model_id'];
        }
        if (isset($map['llm_labels'])) {
            if (!empty($map['llm_labels'])) {
                $model->llmLabels = $map['llm_labels'];
            }
        }
        if (isset($map['required'])) {
            $model->required = $map['required'];
        }
        if (isset($map['repeat_time'])) {
            $model->repeatTime = $map['repeat_time'];
        }
        if (isset($map['interruptable'])) {
            $model->interruptable = $map['interruptable'];
        }
        if (isset($map['sts'])) {
            $model->sts = $map['sts'];
        }
        if (isset($map['appkey'])) {
            $model->appkey = $map['appkey'];
        }
        if (isset($map['post_interaction_component'])) {
            $model->postInteractionComponent = $map['post_interaction_component'];
        }
        if (isset($map['corpus_choose_strategy'])) {
            $model->corpusChooseStrategy = $map['corpus_choose_strategy'];
        }
        if (isset($map['corpus_choose_model_url'])) {
            $model->corpusChooseModelUrl = $map['corpus_choose_model_url'];
        }
        if (isset($map['corpus_choose_model_type'])) {
            $model->corpusChooseModelType = $map['corpus_choose_model_type'];
        }
        if (isset($map['global_intention'])) {
            $model->globalIntention = $map['global_intention'];
        }
        if (isset($map['global_intention_reply'])) {
            $model->globalIntentionReply = Output::fromMap($map['global_intention_reply']);
        }
        if (isset($map['button_type'])) {
            $model->buttonType = $map['button_type'];
        }
        if (isset($map['button_digit'])) {
            $model->buttonDigit = $map['button_digit'];
        }
        if (isset($map['button_terminator'])) {
            $model->buttonTerminator = $map['button_terminator'];
        }
        if (isset($map['button_timeout'])) {
            $model->buttonTimeout = $map['button_timeout'];
        }
        if (isset($map['button_validator'])) {
            $model->buttonValidator = $map['button_validator'];
        }
        if (isset($map['static_keys'])) {
            if (!empty($map['static_keys'])) {
                $model->staticKeys = $map['static_keys'];
            }
        }
        if (isset($map['static_key_previous'])) {
            $model->staticKeyPrevious = $map['static_key_previous'];
        }
        if (isset($map['static_key_repeat'])) {
            $model->staticKeyRepeat = $map['static_key_repeat'];
        }
        if (isset($map['static_key_skip_input_check'])) {
            $model->staticKeySkipInputCheck = $map['static_key_skip_input_check'];
        }
        if (isset($map['round'])) {
            $model->round = $map['round'];
        }
        if (isset($map['language'])) {
            $model->language = $map['language'];
        }
        if (isset($map['ie_instance_code'])) {
            $model->ieInstanceCode = $map['ie_instance_code'];
        }
        if (isset($map['sub_flow_fe_id'])) {
            $model->subFlowFeId = $map['sub_flow_fe_id'];
        }
        if (isset($map['sub_flow_dynamic_id'])) {
            $model->subFlowDynamicId = $map['sub_flow_dynamic_id'];
        }
        if (isset($map['sub_flow_input'])) {
            if (!empty($map['sub_flow_input'])) {
                $model->subFlowInput = [];
                $n                   = 0;
                foreach ($map['sub_flow_input'] as $item) {
                    $model->subFlowInput[$n++] = null !== $item ? Input::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['start_params'])) {
            if (!empty($map['start_params'])) {
                $model->startParams = [];
                $n                  = 0;
                foreach ($map['start_params'] as $item) {
                    $model->startParams[$n++] = null !== $item ? Input::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['allow_interaction_types'])) {
            if (!empty($map['allow_interaction_types'])) {
                $model->allowInteractionTypes = $map['allow_interaction_types'];
            }
        }
        if (isset($map['share_factors'])) {
            if (!empty($map['share_factors'])) {
                $model->shareFactors = [];
                $n                   = 0;
                foreach ($map['share_factors'] as $item) {
                    $model->shareFactors[$n++] = null !== $item ? Input::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
