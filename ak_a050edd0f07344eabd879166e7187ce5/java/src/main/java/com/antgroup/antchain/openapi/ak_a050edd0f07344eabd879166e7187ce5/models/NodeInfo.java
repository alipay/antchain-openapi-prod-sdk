// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a050edd0f07344eabd879166e7187ce5.models;

import com.aliyun.tea.*;

public class NodeInfo extends TeaModel {
    // 业务标签
    @NameInMap("biz_tag")
    @Validation(required = true)
    public Output bizTag;

    // 节点子类型
    @NameInMap("sub_type")
    @Validation(required = true)
    public String subType;

    // 人工类型
    @NameInMap("transfer_target_type")
    @Validation(required = true)
    public String transferTargetType;

    // 路由点
    @NameInMap("transfer_data")
    @Validation(required = true)
    public String transferData;

    // 技能组
    @NameInMap("skill_group_no")
    @Validation(required = true)
    public String skillGroupNo;

    // 扩展信息
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    // 业务达成
    @NameInMap("biz_achieve")
    @Validation(required = true)
    public Boolean bizAchieve;

    // 音色
    @NameInMap("voice_type")
    @Validation(required = true)
    public String voiceType;

    // 模型类型
    @NameInMap("model_type")
    @Validation(required = true)
    public String modelType;

    // 分类模型id
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // llm意图识别列表配置
    @NameInMap("llm_labels")
    @Validation(required = true)
    public java.util.List<String> llmLabels;

    // 是否必填
    @NameInMap("required")
    @Validation(required = true)
    public Boolean required;

    // 失败后重复次数
    @NameInMap("repeat_time")
    @Validation(required = true)
    public Long repeatTime;

    // 是否允许重试话术打断
    @NameInMap("interruptable")
    @Validation(required = true)
    public Boolean interruptable;

    // sts配置
    @NameInMap("sts")
    @Validation(required = true)
    public String sts;

    // appkey
    @NameInMap("appkey")
    @Validation(required = true)
    public String appkey;

    // 交互组件后置
    @NameInMap("post_interaction_component")
    @Validation(required = true)
    public Boolean postInteractionComponent;

    // 话术选择策略
    @NameInMap("corpus_choose_strategy")
    @Validation(required = true)
    public String corpusChooseStrategy;

    // 话术选择策略模型的地址
    @NameInMap("corpus_choose_model_url")
    @Validation(required = true)
    public String corpusChooseModelUrl;

    // 话术选择策略模型类型
    @NameInMap("corpus_choose_model_type")
    @Validation(required = true)
    public String corpusChooseModelType;

    // 全局意图
    @NameInMap("global_intention")
    @Validation(required = true)
    public Boolean globalIntention;

    // 命中全局意图后需要播报的内容
    @NameInMap("global_intention_reply")
    @Validation(required = true)
    public Output globalIntentionReply;

    // 按键类型
    @NameInMap("button_type")
    @Validation(required = true)
    public String buttonType;

    // 按键位数
    @NameInMap("button_digit")
    @Validation(required = true)
    public Long buttonDigit;

    // 结束按键
    @NameInMap("button_terminator")
    @Validation(required = true)
    public String buttonTerminator;

    // 收号超时时间
    @NameInMap("button_timeout")
    @Validation(required = true)
    public Long buttonTimeout;

    // 收号校验规则
    @NameInMap("button_validator")
    @Validation(required = true)
    public String buttonValidator;

    // 静态菜单配置
    @NameInMap("static_keys")
    @Validation(required = true)
    public java.util.List<String> staticKeys;

    // 是否支持按键返回上一级
    @NameInMap("static_key_previous")
    @Validation(required = true)
    public Boolean staticKeyPrevious;

    // 是否支持按键重播
    @NameInMap("static_key_repeat")
    @Validation(required = true)
    public Boolean staticKeyRepeat;

    // 是否跳过用户输入的错误校验
    @NameInMap("static_key_skip_input_check")
    @Validation(required = true)
    public Boolean staticKeySkipInputCheck;

    // 只有客权的静态菜单开发
    @NameInMap("round")
    @Validation(required = true)
    public Boolean round;

    // 静态菜单语言
    @NameInMap("language")
    @Validation(required = true)
    public String language;

    // 实例码
    @NameInMap("ie_instance_code")
    @Validation(required = true)
    public String ieInstanceCode;

    // 子流程ID
    @NameInMap("sub_flow_fe_id")
    @Validation(required = true)
    public String subFlowFeId;

    // 动态子流程id值
    @NameInMap("sub_flow_dynamic_id")
    @Validation(required = true)
    public String subFlowDynamicId;

    // 输入参数配置
    @NameInMap("sub_flow_input")
    @Validation(required = true)
    public java.util.List<Input> subFlowInput;

    // 开始节点参数
    @NameInMap("start_params")
    @Validation(required = true)
    public java.util.List<Input> startParams;

    // 和ouput中的interactionType保持一致
    @NameInMap("allow_interaction_types")
    @Validation(required = true)
    public java.util.List<String> allowInteractionTypes;

    // 需要共享上下文的虚拟因子列表
    @NameInMap("share_factors")
    @Validation(required = true)
    public java.util.List<Input> shareFactors;

    public static NodeInfo build(java.util.Map<String, ?> map) throws Exception {
        NodeInfo self = new NodeInfo();
        return TeaModel.build(map, self);
    }

    public NodeInfo setBizTag(Output bizTag) {
        this.bizTag = bizTag;
        return this;
    }
    public Output getBizTag() {
        return this.bizTag;
    }

    public NodeInfo setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public NodeInfo setTransferTargetType(String transferTargetType) {
        this.transferTargetType = transferTargetType;
        return this;
    }
    public String getTransferTargetType() {
        return this.transferTargetType;
    }

    public NodeInfo setTransferData(String transferData) {
        this.transferData = transferData;
        return this;
    }
    public String getTransferData() {
        return this.transferData;
    }

    public NodeInfo setSkillGroupNo(String skillGroupNo) {
        this.skillGroupNo = skillGroupNo;
        return this;
    }
    public String getSkillGroupNo() {
        return this.skillGroupNo;
    }

    public NodeInfo setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public NodeInfo setBizAchieve(Boolean bizAchieve) {
        this.bizAchieve = bizAchieve;
        return this;
    }
    public Boolean getBizAchieve() {
        return this.bizAchieve;
    }

    public NodeInfo setVoiceType(String voiceType) {
        this.voiceType = voiceType;
        return this;
    }
    public String getVoiceType() {
        return this.voiceType;
    }

    public NodeInfo setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public NodeInfo setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public NodeInfo setLlmLabels(java.util.List<String> llmLabels) {
        this.llmLabels = llmLabels;
        return this;
    }
    public java.util.List<String> getLlmLabels() {
        return this.llmLabels;
    }

    public NodeInfo setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public NodeInfo setRepeatTime(Long repeatTime) {
        this.repeatTime = repeatTime;
        return this;
    }
    public Long getRepeatTime() {
        return this.repeatTime;
    }

    public NodeInfo setInterruptable(Boolean interruptable) {
        this.interruptable = interruptable;
        return this;
    }
    public Boolean getInterruptable() {
        return this.interruptable;
    }

    public NodeInfo setSts(String sts) {
        this.sts = sts;
        return this;
    }
    public String getSts() {
        return this.sts;
    }

    public NodeInfo setAppkey(String appkey) {
        this.appkey = appkey;
        return this;
    }
    public String getAppkey() {
        return this.appkey;
    }

    public NodeInfo setPostInteractionComponent(Boolean postInteractionComponent) {
        this.postInteractionComponent = postInteractionComponent;
        return this;
    }
    public Boolean getPostInteractionComponent() {
        return this.postInteractionComponent;
    }

    public NodeInfo setCorpusChooseStrategy(String corpusChooseStrategy) {
        this.corpusChooseStrategy = corpusChooseStrategy;
        return this;
    }
    public String getCorpusChooseStrategy() {
        return this.corpusChooseStrategy;
    }

    public NodeInfo setCorpusChooseModelUrl(String corpusChooseModelUrl) {
        this.corpusChooseModelUrl = corpusChooseModelUrl;
        return this;
    }
    public String getCorpusChooseModelUrl() {
        return this.corpusChooseModelUrl;
    }

    public NodeInfo setCorpusChooseModelType(String corpusChooseModelType) {
        this.corpusChooseModelType = corpusChooseModelType;
        return this;
    }
    public String getCorpusChooseModelType() {
        return this.corpusChooseModelType;
    }

    public NodeInfo setGlobalIntention(Boolean globalIntention) {
        this.globalIntention = globalIntention;
        return this;
    }
    public Boolean getGlobalIntention() {
        return this.globalIntention;
    }

    public NodeInfo setGlobalIntentionReply(Output globalIntentionReply) {
        this.globalIntentionReply = globalIntentionReply;
        return this;
    }
    public Output getGlobalIntentionReply() {
        return this.globalIntentionReply;
    }

    public NodeInfo setButtonType(String buttonType) {
        this.buttonType = buttonType;
        return this;
    }
    public String getButtonType() {
        return this.buttonType;
    }

    public NodeInfo setButtonDigit(Long buttonDigit) {
        this.buttonDigit = buttonDigit;
        return this;
    }
    public Long getButtonDigit() {
        return this.buttonDigit;
    }

    public NodeInfo setButtonTerminator(String buttonTerminator) {
        this.buttonTerminator = buttonTerminator;
        return this;
    }
    public String getButtonTerminator() {
        return this.buttonTerminator;
    }

    public NodeInfo setButtonTimeout(Long buttonTimeout) {
        this.buttonTimeout = buttonTimeout;
        return this;
    }
    public Long getButtonTimeout() {
        return this.buttonTimeout;
    }

    public NodeInfo setButtonValidator(String buttonValidator) {
        this.buttonValidator = buttonValidator;
        return this;
    }
    public String getButtonValidator() {
        return this.buttonValidator;
    }

    public NodeInfo setStaticKeys(java.util.List<String> staticKeys) {
        this.staticKeys = staticKeys;
        return this;
    }
    public java.util.List<String> getStaticKeys() {
        return this.staticKeys;
    }

    public NodeInfo setStaticKeyPrevious(Boolean staticKeyPrevious) {
        this.staticKeyPrevious = staticKeyPrevious;
        return this;
    }
    public Boolean getStaticKeyPrevious() {
        return this.staticKeyPrevious;
    }

    public NodeInfo setStaticKeyRepeat(Boolean staticKeyRepeat) {
        this.staticKeyRepeat = staticKeyRepeat;
        return this;
    }
    public Boolean getStaticKeyRepeat() {
        return this.staticKeyRepeat;
    }

    public NodeInfo setStaticKeySkipInputCheck(Boolean staticKeySkipInputCheck) {
        this.staticKeySkipInputCheck = staticKeySkipInputCheck;
        return this;
    }
    public Boolean getStaticKeySkipInputCheck() {
        return this.staticKeySkipInputCheck;
    }

    public NodeInfo setRound(Boolean round) {
        this.round = round;
        return this;
    }
    public Boolean getRound() {
        return this.round;
    }

    public NodeInfo setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public NodeInfo setIeInstanceCode(String ieInstanceCode) {
        this.ieInstanceCode = ieInstanceCode;
        return this;
    }
    public String getIeInstanceCode() {
        return this.ieInstanceCode;
    }

    public NodeInfo setSubFlowFeId(String subFlowFeId) {
        this.subFlowFeId = subFlowFeId;
        return this;
    }
    public String getSubFlowFeId() {
        return this.subFlowFeId;
    }

    public NodeInfo setSubFlowDynamicId(String subFlowDynamicId) {
        this.subFlowDynamicId = subFlowDynamicId;
        return this;
    }
    public String getSubFlowDynamicId() {
        return this.subFlowDynamicId;
    }

    public NodeInfo setSubFlowInput(java.util.List<Input> subFlowInput) {
        this.subFlowInput = subFlowInput;
        return this;
    }
    public java.util.List<Input> getSubFlowInput() {
        return this.subFlowInput;
    }

    public NodeInfo setStartParams(java.util.List<Input> startParams) {
        this.startParams = startParams;
        return this;
    }
    public java.util.List<Input> getStartParams() {
        return this.startParams;
    }

    public NodeInfo setAllowInteractionTypes(java.util.List<String> allowInteractionTypes) {
        this.allowInteractionTypes = allowInteractionTypes;
        return this;
    }
    public java.util.List<String> getAllowInteractionTypes() {
        return this.allowInteractionTypes;
    }

    public NodeInfo setShareFactors(java.util.List<Input> shareFactors) {
        this.shareFactors = shareFactors;
        return this;
    }
    public java.util.List<Input> getShareFactors() {
        return this.shareFactors;
    }

}
