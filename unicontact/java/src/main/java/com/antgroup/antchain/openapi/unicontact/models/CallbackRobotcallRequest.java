// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.unicontact.models;

import com.aliyun.tea.*;

public class CallbackRobotcallRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外呼号码，支持密文
    // 
    @NameInMap("customer_key")
    @Validation(required = true)
    public String customerKey;

    // 当前呼叫次数 Integer
    // 
    @NameInMap("current_call_times")
    @Validation(required = true)
    public Long currentCallTimes;

    // 号码的模版类型
    // 
    @NameInMap("key_template")
    @Validation(required = true)
    public String keyTemplate;

    // 导入号码时返回的批次号
    // 
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    // 外呼类型 建议按照如下约定给到 2001:批量-预测外呼 ...
    // 
    @NameInMap("call_type")
    @Validation(required = true)
    public Long callType;

    // 用户自定义标签
    // 
    @NameInMap("tag")
    public String tag;

    // 外呼呼叫实例id
    // 
    @NameInMap("call_id")
    @Validation(required = true)
    public String callId;

    // 外呼任务编号
    // 
    @NameInMap("task_id")
    @Validation(required = true)
    public Long taskId;

    // 外呼任务名称
    // 
    @NameInMap("task_name")
    @Validation(required = true)
    public String taskName;

    // 外呼的话术模板ID，可以为空
    // 
    @NameInMap("template_id")
    public Long templateId;

    // 外呼状态编码
    // 
    @NameInMap("status_code")
    @Validation(required = true)
    public Long statusCode;

    // 外呼状态编码对应描述
    // 
    @NameInMap("status_description")
    @Validation(required = true)
    public String statusDescription;

    // 转人工状态编码
    // 
    @NameInMap("transfer_status_code")
    @Validation(required = true)
    public String transferStatusCode;

    // 转人工状态编码对应描述
    // 
    @NameInMap("transfer_status")
    @Validation(required = true)
    public String transferStatus;

    // 分配坐席ID,可以为空
    // 
    @NameInMap("agent_id")
    public Long agentId;

    // 建议填写坐席在贵司业务系统唯一标识，用于查询对应agent...
    // 
    @NameInMap("agent_tag")
    public String agentTag;

    // 坐席分机号，可以为空
    // 
    @NameInMap("agent_extension")
    public String agentExtension;

    // 导入时间，格式:2019-01-09 14:14:19
    // 
    @NameInMap("import_time")
    @Validation(required = true)
    public String importTime;

    // 开始通话时间，格式：2019-01-09 14:14:19
    // 
    @NameInMap("call_begin_time")
    @Validation(required = true)
    public String callBeginTime;

    // 振铃时长,单位毫秒
    // 
    @NameInMap("ring_time")
    @Validation(required = true)
    public Long ringTime;

    // 接通时间
    // 
    @NameInMap("answer_time")
    public String answerTime;

    // 通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
    // 
    @NameInMap("speaking_time")
    @Validation(required = true)
    public String speakingTime;

    // 通话时长，单位：秒
    // 
    @NameInMap("speaking_duration")
    @Validation(required = true)
    public Long speakingDuration;

    // 通话挂断时间
    // 
    @NameInMap("hangup_time")
    @Validation(required = true)
    public String hangupTime;

    // 对话轮次
    // 
    @NameInMap("speaking_turns")
    @Validation(required = true)
    public Long speakingTurns;

    // 坐席通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
    // 
    @NameInMap("agent_speaking_time")
    @Validation(required = true)
    public String agentSpeakingTime;

    // 坐席通话时长，单位：秒
    // 
    @NameInMap("agent_speaking_duration")
    @Validation(required = true)
    public Long agentSpeakingDuration;

    // 意向标签
    // 
    @NameInMap("intent_tag")
    @Validation(required = true)
    public String intentTag;

    // 意向说明
    // 
    @NameInMap("intent_description")
    @Validation(required = true)
    public String intentDescription;

    // 个性标签
    // 
    @NameInMap("individual_tag")
    public String individualTag;

    // 回复关键词
    // 
    @NameInMap("keywords")
    public String keywords;

    // 挂机方式
    // 1
    @NameInMap("hungup_type")
    @Validation(required = true)
    public Long hungupType;

    // 挂机短信，1:发送，2:不发送
    // 
    @NameInMap("sms")
    @Validation(required = true)
    public Long sms;

    // 对话录音,url
    // 
    @NameInMap("chat_record")
    public String chatRecord;

    // 对话记录
    // 
    @NameInMap("chats")
    public String chats;

    // 0:不添加，1:添加
    // 
    @NameInMap("add_wx")
    public Long addWx;

    // 加微进度可选值：已申请、加微成功
    // 
    @NameInMap("add_wx_status")
    public String addWxStatus;

    // 是否接通重呼 0正常外呼，1接通重呼
    // 
    @NameInMap("answer_recall")
    @Validation(required = true)
    public Long answerRecall;

    // 导入号码时的参数值
    @NameInMap("properties")
    public String properties;

    // 导入号码时的业务参数值
    // 
    @NameInMap("biz_properties")
    public String bizProperties;

    // 拦截原因 可选值：黑名单拦截，灰名单拦截，异常号码拦截
    // 
    @NameInMap("intercept_reason")
    public String interceptReason;

    // 回调冗余字段
    // 
    @NameInMap("ext_info")
    public String extInfo;

    public static CallbackRobotcallRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackRobotcallRequest self = new CallbackRobotcallRequest();
        return TeaModel.build(map, self);
    }

    public CallbackRobotcallRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackRobotcallRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackRobotcallRequest setCustomerKey(String customerKey) {
        this.customerKey = customerKey;
        return this;
    }
    public String getCustomerKey() {
        return this.customerKey;
    }

    public CallbackRobotcallRequest setCurrentCallTimes(Long currentCallTimes) {
        this.currentCallTimes = currentCallTimes;
        return this;
    }
    public Long getCurrentCallTimes() {
        return this.currentCallTimes;
    }

    public CallbackRobotcallRequest setKeyTemplate(String keyTemplate) {
        this.keyTemplate = keyTemplate;
        return this;
    }
    public String getKeyTemplate() {
        return this.keyTemplate;
    }

    public CallbackRobotcallRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public CallbackRobotcallRequest setCallType(Long callType) {
        this.callType = callType;
        return this;
    }
    public Long getCallType() {
        return this.callType;
    }

    public CallbackRobotcallRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public CallbackRobotcallRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public CallbackRobotcallRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public CallbackRobotcallRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CallbackRobotcallRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public CallbackRobotcallRequest setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public CallbackRobotcallRequest setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
        return this;
    }
    public String getStatusDescription() {
        return this.statusDescription;
    }

    public CallbackRobotcallRequest setTransferStatusCode(String transferStatusCode) {
        this.transferStatusCode = transferStatusCode;
        return this;
    }
    public String getTransferStatusCode() {
        return this.transferStatusCode;
    }

    public CallbackRobotcallRequest setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
        return this;
    }
    public String getTransferStatus() {
        return this.transferStatus;
    }

    public CallbackRobotcallRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public CallbackRobotcallRequest setAgentTag(String agentTag) {
        this.agentTag = agentTag;
        return this;
    }
    public String getAgentTag() {
        return this.agentTag;
    }

    public CallbackRobotcallRequest setAgentExtension(String agentExtension) {
        this.agentExtension = agentExtension;
        return this;
    }
    public String getAgentExtension() {
        return this.agentExtension;
    }

    public CallbackRobotcallRequest setImportTime(String importTime) {
        this.importTime = importTime;
        return this;
    }
    public String getImportTime() {
        return this.importTime;
    }

    public CallbackRobotcallRequest setCallBeginTime(String callBeginTime) {
        this.callBeginTime = callBeginTime;
        return this;
    }
    public String getCallBeginTime() {
        return this.callBeginTime;
    }

    public CallbackRobotcallRequest setRingTime(Long ringTime) {
        this.ringTime = ringTime;
        return this;
    }
    public Long getRingTime() {
        return this.ringTime;
    }

    public CallbackRobotcallRequest setAnswerTime(String answerTime) {
        this.answerTime = answerTime;
        return this;
    }
    public String getAnswerTime() {
        return this.answerTime;
    }

    public CallbackRobotcallRequest setSpeakingTime(String speakingTime) {
        this.speakingTime = speakingTime;
        return this;
    }
    public String getSpeakingTime() {
        return this.speakingTime;
    }

    public CallbackRobotcallRequest setSpeakingDuration(Long speakingDuration) {
        this.speakingDuration = speakingDuration;
        return this;
    }
    public Long getSpeakingDuration() {
        return this.speakingDuration;
    }

    public CallbackRobotcallRequest setHangupTime(String hangupTime) {
        this.hangupTime = hangupTime;
        return this;
    }
    public String getHangupTime() {
        return this.hangupTime;
    }

    public CallbackRobotcallRequest setSpeakingTurns(Long speakingTurns) {
        this.speakingTurns = speakingTurns;
        return this;
    }
    public Long getSpeakingTurns() {
        return this.speakingTurns;
    }

    public CallbackRobotcallRequest setAgentSpeakingTime(String agentSpeakingTime) {
        this.agentSpeakingTime = agentSpeakingTime;
        return this;
    }
    public String getAgentSpeakingTime() {
        return this.agentSpeakingTime;
    }

    public CallbackRobotcallRequest setAgentSpeakingDuration(Long agentSpeakingDuration) {
        this.agentSpeakingDuration = agentSpeakingDuration;
        return this;
    }
    public Long getAgentSpeakingDuration() {
        return this.agentSpeakingDuration;
    }

    public CallbackRobotcallRequest setIntentTag(String intentTag) {
        this.intentTag = intentTag;
        return this;
    }
    public String getIntentTag() {
        return this.intentTag;
    }

    public CallbackRobotcallRequest setIntentDescription(String intentDescription) {
        this.intentDescription = intentDescription;
        return this;
    }
    public String getIntentDescription() {
        return this.intentDescription;
    }

    public CallbackRobotcallRequest setIndividualTag(String individualTag) {
        this.individualTag = individualTag;
        return this;
    }
    public String getIndividualTag() {
        return this.individualTag;
    }

    public CallbackRobotcallRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public CallbackRobotcallRequest setHungupType(Long hungupType) {
        this.hungupType = hungupType;
        return this;
    }
    public Long getHungupType() {
        return this.hungupType;
    }

    public CallbackRobotcallRequest setSms(Long sms) {
        this.sms = sms;
        return this;
    }
    public Long getSms() {
        return this.sms;
    }

    public CallbackRobotcallRequest setChatRecord(String chatRecord) {
        this.chatRecord = chatRecord;
        return this;
    }
    public String getChatRecord() {
        return this.chatRecord;
    }

    public CallbackRobotcallRequest setChats(String chats) {
        this.chats = chats;
        return this;
    }
    public String getChats() {
        return this.chats;
    }

    public CallbackRobotcallRequest setAddWx(Long addWx) {
        this.addWx = addWx;
        return this;
    }
    public Long getAddWx() {
        return this.addWx;
    }

    public CallbackRobotcallRequest setAddWxStatus(String addWxStatus) {
        this.addWxStatus = addWxStatus;
        return this;
    }
    public String getAddWxStatus() {
        return this.addWxStatus;
    }

    public CallbackRobotcallRequest setAnswerRecall(Long answerRecall) {
        this.answerRecall = answerRecall;
        return this;
    }
    public Long getAnswerRecall() {
        return this.answerRecall;
    }

    public CallbackRobotcallRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CallbackRobotcallRequest setBizProperties(String bizProperties) {
        this.bizProperties = bizProperties;
        return this;
    }
    public String getBizProperties() {
        return this.bizProperties;
    }

    public CallbackRobotcallRequest setInterceptReason(String interceptReason) {
        this.interceptReason = interceptReason;
        return this;
    }
    public String getInterceptReason() {
        return this.interceptReason;
    }

    public CallbackRobotcallRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
