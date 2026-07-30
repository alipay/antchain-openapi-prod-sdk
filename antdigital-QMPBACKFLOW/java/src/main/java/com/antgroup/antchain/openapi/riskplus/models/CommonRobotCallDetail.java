// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CommonRobotCallDetail extends TeaModel {
    // 客户请求时的透传字段
    /**
     * <strong>example:</strong>
     * <p>请求透传字段</p>
     */
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    // 成功触达：OK；未触达：AI_ROBOT_CALL_REQUEST_NOT_EXIST
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("result_code")
    @Validation(required = true)
    public String resultCode;

    // 外呼号码
    /**
     * <strong>example:</strong>
     * <p>130XXXXXX</p>
     */
    @NameInMap("customer_key")
    @Validation(required = true)
    public String customerKey;

    // 呼叫次数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current_call_times")
    @Validation(required = true)
    public Long currentCallTimes;

    // 号码模版
    /**
     * <strong>example:</strong>
     * <p>MOBILE/MOBILE/CUSTOMER_ENCRY</p>
     */
    @NameInMap("key_template")
    @Validation(required = true)
    public String keyTemplate;

    // 导入号码时返回的批次号
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    // 2001:批量-预测外呼，2002:批量-AI外呼-不转人工，2003:批量-AI外呼-接通转人工，2004: 批量-AI外呼-智能转人工,2005:批量-语音通知
    /**
     * <strong>example:</strong>
     * <p>2001</p>
     */
    @NameInMap("call_type")
    @Validation(required = true)
    public Long callType;

    // 用户自定义标签
    /**
     * <strong>example:</strong>
     * <p>tag</p>
     */
    @NameInMap("tag")
    public String tag;

    // 外呼id
    /**
     * <strong>example:</strong>
     * <p>9b2eb6b8</p>
     */
    @NameInMap("call_id")
    @Validation(required = true)
    public String callId;

    // 外呼任务编号
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("task_id")
    @Validation(required = true)
    public Long taskId;

    // AI话术ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("template_id")
    public Long templateId;

    // 外呼状态编码
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status_code")
    @Validation(required = true)
    public Long statusCode;

    // 外呼状态描述
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status_description")
    @Validation(required = true)
    public String statusDescription;

    // 转人工状态编码
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("transfer_status_code")
    @Validation(required = true)
    public Long transferStatusCode;

    // 转人工状态
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("transfer_status")
    @Validation(required = true)
    public String transferStatus;

    // 分配坐席ID
    @NameInMap("agent_id")
    public Long agentId;

    // 坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
    /**
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("agent_tag")
    public String agentTag;

    // 坐席分机号
    /**
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("agent_extension")
    public String agentExtension;

    // 导入时间
    /**
     * <strong>example:</strong>
     * <p>2019-01-09 14:14:19</p>
     */
    @NameInMap("import_time")
    @Validation(required = true)
    public String importTime;

    // 开始通话时间
    /**
     * <strong>example:</strong>
     * <p>2019-01-09 14:14:19</p>
     */
    @NameInMap("call_begin_time")
    @Validation(required = true)
    public String callBeginTime;

    // 振铃时长，单位ms
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ring_time")
    @Validation(required = true)
    public Long ringTime;

    // 接通时间
    /**
     * <strong>example:</strong>
     * <p>2019-01-09 14:14:19</p>
     */
    @NameInMap("answer_time")
    public String answerTime;

    // 通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("speaking_time")
    @Validation(required = true)
    public String speakingTime;

    // 通话时长，单位：秒
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("speaking_duration")
    @Validation(required = true)
    public Long speakingDuration;

    // 挂断时间
    /**
     * <strong>example:</strong>
     * <p>2019-01-09 14:14:19</p>
     */
    @NameInMap("hangup_time")
    @Validation(required = true)
    public String hangupTime;

    // 对话轮次
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("speaking_turns")
    @Validation(required = true)
    public Long speakingTurns;

    // 人工通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("agent_speaking_time")
    @Validation(required = true)
    public String agentSpeakingTime;

    // 人工通话时长，单位：秒
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("agent_speaking_duration")
    @Validation(required = true)
    public Long agentSpeakingDuration;

    // 意向标签
    /**
     * <strong>example:</strong>
     * <p>C</p>
     */
    @NameInMap("intent_tag")
    @Validation(required = true)
    public String intentTag;

    // 意向说明
    /**
     * <strong>example:</strong>
     * <p>确认本人,未承诺还款</p>
     */
    @NameInMap("intent_description")
    @Validation(required = true)
    public String intentDescription;

    // 个性标签
    /**
     * <strong>example:</strong>
     * <p>投诉,非本人</p>
     */
    @NameInMap("individual_tag")
    public String individualTag;

    // 回复关键词
    /**
     * <strong>example:</strong>
     * <p>链接,利息</p>
     */
    @NameInMap("keywords")
    public String keywords;

    // 挂机方式，AI挂机1，坐席挂机2，客户挂机3
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("hungup_type")
    @Validation(required = true)
    public Long hungupType;

    // 挂机短信，可选值：1、2
    // 1:发送，2:不发送
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sms")
    @Validation(required = true)
    public String sms;

    // 对话录音，URL，可以为空
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("chat_record")
    public String chatRecord;

    // 聊天记录，可以为空
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("chats")
    public String chats;

    // 可选值：0、1
    // 0:不添加，1:添加
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("add_wx")
    public Long addWx;

    // 加微进度，可选值：已申请、加微成功
    /**
     * <strong>example:</strong>
     * <p>已申请</p>
     */
    @NameInMap("add_wx_status")
    public String addWxStatus;

    // 是否接通重呼，可选值：0、1
    // 0正常外呼，1接通重呼
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("answer_recall")
    @Validation(required = true)
    public Long answerRecall;

    // 导入号码时的参数值
    /**
     * <strong>example:</strong>
     * <p>{&quot;电话号码&quot;:&quot;13100000000&quot;}</p>
     */
    @NameInMap("properties")
    public String properties;

    // 导入号码时的业务参数值，原样返回
    /**
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("biz_properties")
    public String bizProperties;

    // 拦截原因：当状态为已拦截时，可选值：黑名单拦截，灰名单拦截，异常号码拦截
    /**
     * <strong>example:</strong>
     * <p>黑名单拦截</p>
     */
    @NameInMap("intercept_reason")
    public String interceptReason;

    public static CommonRobotCallDetail build(java.util.Map<String, ?> map) throws Exception {
        CommonRobotCallDetail self = new CommonRobotCallDetail();
        return TeaModel.build(map, self);
    }

    public CommonRobotCallDetail setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CommonRobotCallDetail setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CommonRobotCallDetail setCustomerKey(String customerKey) {
        this.customerKey = customerKey;
        return this;
    }
    public String getCustomerKey() {
        return this.customerKey;
    }

    public CommonRobotCallDetail setCurrentCallTimes(Long currentCallTimes) {
        this.currentCallTimes = currentCallTimes;
        return this;
    }
    public Long getCurrentCallTimes() {
        return this.currentCallTimes;
    }

    public CommonRobotCallDetail setKeyTemplate(String keyTemplate) {
        this.keyTemplate = keyTemplate;
        return this;
    }
    public String getKeyTemplate() {
        return this.keyTemplate;
    }

    public CommonRobotCallDetail setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public CommonRobotCallDetail setCallType(Long callType) {
        this.callType = callType;
        return this;
    }
    public Long getCallType() {
        return this.callType;
    }

    public CommonRobotCallDetail setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public CommonRobotCallDetail setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public CommonRobotCallDetail setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public CommonRobotCallDetail setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public CommonRobotCallDetail setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public CommonRobotCallDetail setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
        return this;
    }
    public String getStatusDescription() {
        return this.statusDescription;
    }

    public CommonRobotCallDetail setTransferStatusCode(Long transferStatusCode) {
        this.transferStatusCode = transferStatusCode;
        return this;
    }
    public Long getTransferStatusCode() {
        return this.transferStatusCode;
    }

    public CommonRobotCallDetail setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
        return this;
    }
    public String getTransferStatus() {
        return this.transferStatus;
    }

    public CommonRobotCallDetail setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public CommonRobotCallDetail setAgentTag(String agentTag) {
        this.agentTag = agentTag;
        return this;
    }
    public String getAgentTag() {
        return this.agentTag;
    }

    public CommonRobotCallDetail setAgentExtension(String agentExtension) {
        this.agentExtension = agentExtension;
        return this;
    }
    public String getAgentExtension() {
        return this.agentExtension;
    }

    public CommonRobotCallDetail setImportTime(String importTime) {
        this.importTime = importTime;
        return this;
    }
    public String getImportTime() {
        return this.importTime;
    }

    public CommonRobotCallDetail setCallBeginTime(String callBeginTime) {
        this.callBeginTime = callBeginTime;
        return this;
    }
    public String getCallBeginTime() {
        return this.callBeginTime;
    }

    public CommonRobotCallDetail setRingTime(Long ringTime) {
        this.ringTime = ringTime;
        return this;
    }
    public Long getRingTime() {
        return this.ringTime;
    }

    public CommonRobotCallDetail setAnswerTime(String answerTime) {
        this.answerTime = answerTime;
        return this;
    }
    public String getAnswerTime() {
        return this.answerTime;
    }

    public CommonRobotCallDetail setSpeakingTime(String speakingTime) {
        this.speakingTime = speakingTime;
        return this;
    }
    public String getSpeakingTime() {
        return this.speakingTime;
    }

    public CommonRobotCallDetail setSpeakingDuration(Long speakingDuration) {
        this.speakingDuration = speakingDuration;
        return this;
    }
    public Long getSpeakingDuration() {
        return this.speakingDuration;
    }

    public CommonRobotCallDetail setHangupTime(String hangupTime) {
        this.hangupTime = hangupTime;
        return this;
    }
    public String getHangupTime() {
        return this.hangupTime;
    }

    public CommonRobotCallDetail setSpeakingTurns(Long speakingTurns) {
        this.speakingTurns = speakingTurns;
        return this;
    }
    public Long getSpeakingTurns() {
        return this.speakingTurns;
    }

    public CommonRobotCallDetail setAgentSpeakingTime(String agentSpeakingTime) {
        this.agentSpeakingTime = agentSpeakingTime;
        return this;
    }
    public String getAgentSpeakingTime() {
        return this.agentSpeakingTime;
    }

    public CommonRobotCallDetail setAgentSpeakingDuration(Long agentSpeakingDuration) {
        this.agentSpeakingDuration = agentSpeakingDuration;
        return this;
    }
    public Long getAgentSpeakingDuration() {
        return this.agentSpeakingDuration;
    }

    public CommonRobotCallDetail setIntentTag(String intentTag) {
        this.intentTag = intentTag;
        return this;
    }
    public String getIntentTag() {
        return this.intentTag;
    }

    public CommonRobotCallDetail setIntentDescription(String intentDescription) {
        this.intentDescription = intentDescription;
        return this;
    }
    public String getIntentDescription() {
        return this.intentDescription;
    }

    public CommonRobotCallDetail setIndividualTag(String individualTag) {
        this.individualTag = individualTag;
        return this;
    }
    public String getIndividualTag() {
        return this.individualTag;
    }

    public CommonRobotCallDetail setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public CommonRobotCallDetail setHungupType(Long hungupType) {
        this.hungupType = hungupType;
        return this;
    }
    public Long getHungupType() {
        return this.hungupType;
    }

    public CommonRobotCallDetail setSms(String sms) {
        this.sms = sms;
        return this;
    }
    public String getSms() {
        return this.sms;
    }

    public CommonRobotCallDetail setChatRecord(String chatRecord) {
        this.chatRecord = chatRecord;
        return this;
    }
    public String getChatRecord() {
        return this.chatRecord;
    }

    public CommonRobotCallDetail setChats(String chats) {
        this.chats = chats;
        return this;
    }
    public String getChats() {
        return this.chats;
    }

    public CommonRobotCallDetail setAddWx(Long addWx) {
        this.addWx = addWx;
        return this;
    }
    public Long getAddWx() {
        return this.addWx;
    }

    public CommonRobotCallDetail setAddWxStatus(String addWxStatus) {
        this.addWxStatus = addWxStatus;
        return this;
    }
    public String getAddWxStatus() {
        return this.addWxStatus;
    }

    public CommonRobotCallDetail setAnswerRecall(Long answerRecall) {
        this.answerRecall = answerRecall;
        return this;
    }
    public Long getAnswerRecall() {
        return this.answerRecall;
    }

    public CommonRobotCallDetail setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CommonRobotCallDetail setBizProperties(String bizProperties) {
        this.bizProperties = bizProperties;
        return this;
    }
    public String getBizProperties() {
        return this.bizProperties;
    }

    public CommonRobotCallDetail setInterceptReason(String interceptReason) {
        this.interceptReason = interceptReason;
        return this;
    }
    public String getInterceptReason() {
        return this.interceptReason;
    }

}
