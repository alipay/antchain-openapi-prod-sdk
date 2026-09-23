// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.resolveservice.models;

import com.aliyun.tea.*;

public class CallbackProviderRobotcallRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // AI任务中的外呼编号
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 外呼号码
    @NameInMap("number")
    public String number;

    // 外呼号码MD5
    @NameInMap("number_md5")
    public String numberMd5;

    // 导入号码返回的批次号
    @NameInMap("batch_id")
    public String batchId;

    // 1001：坐席-人工外呼，
    // 1002：坐席-AI外呼-不转人工，
    // 1003：坐席-AI外呼-接通转人工，
    // 1004：坐席-AI外呼-智能转人工；
    // 2001:批量-预测外呼，
    // 2002:批量-AI外呼-不转人工，
    // 2003:批量-AI外呼-接通转人工，
    // 2004: 批量-AI外呼-智能转人工,
    // 2005:批量-语音通知,
    // 3001:视频外呼
    @NameInMap("call_type")
    @Validation(required = true)
    public Long callType;

    // 用户自定义标签
    @NameInMap("tag")
    public String tag;

    // 外呼id
    @NameInMap("call_id")
    @Validation(required = true)
    public String callId;

    // 系统中的任务编号，若外呼类型为坐席主动外呼，则此处返回坐席ID
    @NameInMap("task_id")
    @Validation(required = true)
    public Long taskId;

    // 任务的名称
    @NameInMap("task_name")
    @Validation(required = true)
    public String taskName;

    // 外呼的话术模版ID
    @NameInMap("template_id")
    public Long templateId;

    // 话术模版名称
    @NameInMap("template_name")
    public String templateName;

    // 外呼状态编码
    @NameInMap("status_code")
    @Validation(required = true)
    public Long statusCode;

    // 外呼状态，如"已接听"
    @NameInMap("status_description")
    @Validation(required = true)
    public String statusDescription;

    // 转人工状态编码
    @NameInMap("transfer_status_code")
    @Validation(required = true)
    public Long transferStatusCode;

    // 转人工状态，可以为空
    @NameInMap("transfer_status")
    public String transferStatus;

    // 分配坐席id
    @NameInMap("agent_id")
    public Long agentId;

    // 建议填写坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
    @NameInMap("agent_tag")
    public String agentTag;

    // 坐席分机号
    @NameInMap("agent_extension")
    public String agentExtension;

    // 导入时间，格式:2019-01-09 14:14:19
    @NameInMap("import_time")
    @Validation(required = true)
    public String importTime;

    // 开始拨号时间，格式：2019-01-09 14:14:19
    @NameInMap("call_begin_time")
    @Validation(required = true)
    public String callBeginTime;

    // 振铃时长，单位毫秒
    @NameInMap("ring_time")
    @Validation(required = true)
    public Long ringTime;

    // 通话接通时间，格式：2019-01-09 14:14:19
    @NameInMap("answer_time")
    public String answerTime;

    // AI通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
    @NameInMap("speaking_time")
    @Validation(required = true)
    public String speakingTime;

    // AI通话时长，单位：秒
    @NameInMap("speaking_duration")
    @Validation(required = true)
    public Long speakingDuration;

    // 通话挂断时间，格式：2019-01-09 14:14:19
    @NameInMap("hangup_time")
    @Validation(required = true)
    public String hangupTime;

    // 对话轮次
    @NameInMap("speaking_turns")
    @Validation(required = true)
    public String speakingTurns;

    // 坐席通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
    @NameInMap("agent_speaking_time")
    @Validation(required = true)
    public String agentSpeakingTime;

    // 坐席通话时长，单位：秒
    @NameInMap("agent_speaking_duration")
    @Validation(required = true)
    public Long agentSpeakingDuration;

    // 意向标签
    @NameInMap("intent_tag")
    @Validation(required = true)
    public String intentTag;

    // 意向说明
    @NameInMap("intent_description")
    @Validation(required = true)
    public String intentDescription;

    // 个性标签
    @NameInMap("individual_tag")
    public String individualTag;

    // 回复关键字
    @NameInMap("keywords")
    public String keywords;

    // AI挂机1，坐席挂机2，客户挂机3
    @NameInMap("hangup_type")
    @Validation(required = true)
    public Long hangupType;

    // 挂机短信,1:发送 2:不发送
    @NameInMap("sms")
    @Validation(required = true)
    public String sms;

    // 挂机WhatsApp
    @NameInMap("wa")
    @Validation(required = true)
    public String wa;

    // 对话录音，URL，可以为空。录音异步上传，业务高峰可能会出现请求404的情况，可以稍后再重试获取。
    @NameInMap("chat_record")
    public String chatRecord;

    // 对话记录,[{"fromNumber":"0","content": "你好，请问您是王小帅吗？","createTime": "2019-01-09 14:14:19"},{"fromNumber":"7945bd83237335e5376ff44d62e4f0ae","content":"嗯","createTime": "2019-01-09 14:14:20"}]
    @NameInMap("chats")
    public String chats;

    // 加微信，0:不添加，1:添加
    @NameInMap("add_wx")
    public Long addWx;

    // 可选值：已申请、加微成功
    @NameInMap("add_wx_status")
    public String addWxStatus;

    // 是否接通重呼,0正常外呼，1接通重呼
    @NameInMap("answer_recall")
    @Validation(required = true)
    public Long answerRecall;

    // 导入号码时的参数值
    @NameInMap("properties")
    public String properties;

    // 当状态为已拦截时，可选值：
    // 黑名单拦截
    // 灰名单拦截
    // 异常号码拦截
    @NameInMap("intercept_reason")
    public String interceptReason;

    // 企业id
    @NameInMap("company_id")
    @Validation(required = true)
    public Long companyId;

    // 线路返回的sip编码code
    @NameInMap("sip_code")
    public Long sipCode;

    // 指的是触发转人工的时间点，格式如：2019-01-09 14:14:19
    @NameInMap("transfer_time")
    public String transferTime;

    // 触发转人工时，坐席组的ID
    @NameInMap("seats_group_id")
    public Long seatsGroupId;

    // 触发转人工时，坐席组的名称
    @NameInMap("seats_group_name")
    public String seatsGroupName;

    // 线路通话时长,单位为毫秒，实际计费需向上取整转换为秒
    @NameInMap("bill")
    public Long bill;

    // 外呼回调时可透传的信息内容，可以为空
    @NameInMap("channel_tag")
    public String channelTag;

    public static CallbackProviderRobotcallRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackProviderRobotcallRequest self = new CallbackProviderRobotcallRequest();
        return TeaModel.build(map, self);
    }

    public CallbackProviderRobotcallRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackProviderRobotcallRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackProviderRobotcallRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CallbackProviderRobotcallRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public CallbackProviderRobotcallRequest setNumberMd5(String numberMd5) {
        this.numberMd5 = numberMd5;
        return this;
    }
    public String getNumberMd5() {
        return this.numberMd5;
    }

    public CallbackProviderRobotcallRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public CallbackProviderRobotcallRequest setCallType(Long callType) {
        this.callType = callType;
        return this;
    }
    public Long getCallType() {
        return this.callType;
    }

    public CallbackProviderRobotcallRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public CallbackProviderRobotcallRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public CallbackProviderRobotcallRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public CallbackProviderRobotcallRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CallbackProviderRobotcallRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public CallbackProviderRobotcallRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CallbackProviderRobotcallRequest setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public CallbackProviderRobotcallRequest setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
        return this;
    }
    public String getStatusDescription() {
        return this.statusDescription;
    }

    public CallbackProviderRobotcallRequest setTransferStatusCode(Long transferStatusCode) {
        this.transferStatusCode = transferStatusCode;
        return this;
    }
    public Long getTransferStatusCode() {
        return this.transferStatusCode;
    }

    public CallbackProviderRobotcallRequest setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
        return this;
    }
    public String getTransferStatus() {
        return this.transferStatus;
    }

    public CallbackProviderRobotcallRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public CallbackProviderRobotcallRequest setAgentTag(String agentTag) {
        this.agentTag = agentTag;
        return this;
    }
    public String getAgentTag() {
        return this.agentTag;
    }

    public CallbackProviderRobotcallRequest setAgentExtension(String agentExtension) {
        this.agentExtension = agentExtension;
        return this;
    }
    public String getAgentExtension() {
        return this.agentExtension;
    }

    public CallbackProviderRobotcallRequest setImportTime(String importTime) {
        this.importTime = importTime;
        return this;
    }
    public String getImportTime() {
        return this.importTime;
    }

    public CallbackProviderRobotcallRequest setCallBeginTime(String callBeginTime) {
        this.callBeginTime = callBeginTime;
        return this;
    }
    public String getCallBeginTime() {
        return this.callBeginTime;
    }

    public CallbackProviderRobotcallRequest setRingTime(Long ringTime) {
        this.ringTime = ringTime;
        return this;
    }
    public Long getRingTime() {
        return this.ringTime;
    }

    public CallbackProviderRobotcallRequest setAnswerTime(String answerTime) {
        this.answerTime = answerTime;
        return this;
    }
    public String getAnswerTime() {
        return this.answerTime;
    }

    public CallbackProviderRobotcallRequest setSpeakingTime(String speakingTime) {
        this.speakingTime = speakingTime;
        return this;
    }
    public String getSpeakingTime() {
        return this.speakingTime;
    }

    public CallbackProviderRobotcallRequest setSpeakingDuration(Long speakingDuration) {
        this.speakingDuration = speakingDuration;
        return this;
    }
    public Long getSpeakingDuration() {
        return this.speakingDuration;
    }

    public CallbackProviderRobotcallRequest setHangupTime(String hangupTime) {
        this.hangupTime = hangupTime;
        return this;
    }
    public String getHangupTime() {
        return this.hangupTime;
    }

    public CallbackProviderRobotcallRequest setSpeakingTurns(String speakingTurns) {
        this.speakingTurns = speakingTurns;
        return this;
    }
    public String getSpeakingTurns() {
        return this.speakingTurns;
    }

    public CallbackProviderRobotcallRequest setAgentSpeakingTime(String agentSpeakingTime) {
        this.agentSpeakingTime = agentSpeakingTime;
        return this;
    }
    public String getAgentSpeakingTime() {
        return this.agentSpeakingTime;
    }

    public CallbackProviderRobotcallRequest setAgentSpeakingDuration(Long agentSpeakingDuration) {
        this.agentSpeakingDuration = agentSpeakingDuration;
        return this;
    }
    public Long getAgentSpeakingDuration() {
        return this.agentSpeakingDuration;
    }

    public CallbackProviderRobotcallRequest setIntentTag(String intentTag) {
        this.intentTag = intentTag;
        return this;
    }
    public String getIntentTag() {
        return this.intentTag;
    }

    public CallbackProviderRobotcallRequest setIntentDescription(String intentDescription) {
        this.intentDescription = intentDescription;
        return this;
    }
    public String getIntentDescription() {
        return this.intentDescription;
    }

    public CallbackProviderRobotcallRequest setIndividualTag(String individualTag) {
        this.individualTag = individualTag;
        return this;
    }
    public String getIndividualTag() {
        return this.individualTag;
    }

    public CallbackProviderRobotcallRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public CallbackProviderRobotcallRequest setHangupType(Long hangupType) {
        this.hangupType = hangupType;
        return this;
    }
    public Long getHangupType() {
        return this.hangupType;
    }

    public CallbackProviderRobotcallRequest setSms(String sms) {
        this.sms = sms;
        return this;
    }
    public String getSms() {
        return this.sms;
    }

    public CallbackProviderRobotcallRequest setWa(String wa) {
        this.wa = wa;
        return this;
    }
    public String getWa() {
        return this.wa;
    }

    public CallbackProviderRobotcallRequest setChatRecord(String chatRecord) {
        this.chatRecord = chatRecord;
        return this;
    }
    public String getChatRecord() {
        return this.chatRecord;
    }

    public CallbackProviderRobotcallRequest setChats(String chats) {
        this.chats = chats;
        return this;
    }
    public String getChats() {
        return this.chats;
    }

    public CallbackProviderRobotcallRequest setAddWx(Long addWx) {
        this.addWx = addWx;
        return this;
    }
    public Long getAddWx() {
        return this.addWx;
    }

    public CallbackProviderRobotcallRequest setAddWxStatus(String addWxStatus) {
        this.addWxStatus = addWxStatus;
        return this;
    }
    public String getAddWxStatus() {
        return this.addWxStatus;
    }

    public CallbackProviderRobotcallRequest setAnswerRecall(Long answerRecall) {
        this.answerRecall = answerRecall;
        return this;
    }
    public Long getAnswerRecall() {
        return this.answerRecall;
    }

    public CallbackProviderRobotcallRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CallbackProviderRobotcallRequest setInterceptReason(String interceptReason) {
        this.interceptReason = interceptReason;
        return this;
    }
    public String getInterceptReason() {
        return this.interceptReason;
    }

    public CallbackProviderRobotcallRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public CallbackProviderRobotcallRequest setSipCode(Long sipCode) {
        this.sipCode = sipCode;
        return this;
    }
    public Long getSipCode() {
        return this.sipCode;
    }

    public CallbackProviderRobotcallRequest setTransferTime(String transferTime) {
        this.transferTime = transferTime;
        return this;
    }
    public String getTransferTime() {
        return this.transferTime;
    }

    public CallbackProviderRobotcallRequest setSeatsGroupId(Long seatsGroupId) {
        this.seatsGroupId = seatsGroupId;
        return this;
    }
    public Long getSeatsGroupId() {
        return this.seatsGroupId;
    }

    public CallbackProviderRobotcallRequest setSeatsGroupName(String seatsGroupName) {
        this.seatsGroupName = seatsGroupName;
        return this;
    }
    public String getSeatsGroupName() {
        return this.seatsGroupName;
    }

    public CallbackProviderRobotcallRequest setBill(Long bill) {
        this.bill = bill;
        return this;
    }
    public Long getBill() {
        return this.bill;
    }

    public CallbackProviderRobotcallRequest setChannelTag(String channelTag) {
        this.channelTag = channelTag;
        return this;
    }
    public String getChannelTag() {
        return this.channelTag;
    }

}
