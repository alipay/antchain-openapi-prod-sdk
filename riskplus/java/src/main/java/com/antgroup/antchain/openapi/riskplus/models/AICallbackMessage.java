// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class AICallbackMessage extends TeaModel {
    // 批次号
    /**
     * <strong>example:</strong>
     * <p>5de2ccbf87914544afb57a77e39ec023</p>
     */
    @NameInMap("batch_id")
    public String batchId;

    // 用户标签
    /**
     * <strong>example:</strong>
     * <p>阿松大</p>
     */
    @NameInMap("tag")
    @Validation(required = true)
    public String tag;

    // 外呼id
    /**
     * <strong>example:</strong>
     * <p>CALLID</p>
     */
    @NameInMap("call_id")
    @Validation(required = true)
    public String callId;

    // 外呼的话术模板Id
    /**
     * <strong>example:</strong>
     * <p>7</p>
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
     * <p>已接听</p>
     */
    @NameInMap("status_description")
    @Validation(required = true)
    public String statusDescription;

    // 导入时间
    /**
     * <strong>example:</strong>
     * <p>2019-11-23 14:47:06</p>
     */
    @NameInMap("import_time")
    @Validation(required = true)
    public String importTime;

    // 开始通话时间
    /**
     * <strong>example:</strong>
     * <p>2019-11-23 14:47:06</p>
     */
    @NameInMap("call_begin_time")
    @Validation(required = true)
    public String callBeginTime;

    // 振铃时长, 单位毫秒
    /**
     * <strong>example:</strong>
     * <p>2000</p>
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
    @Validation(required = true)
    public String answerTime;

    // AI通话时长,单位s
    /**
     * <strong>example:</strong>
     * <p>20</p>
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
     * <p>5</p>
     */
    @NameInMap("speaking_turns")
    @Validation(required = true)
    public Long speakingTurns;

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
     * <p>a</p>
     */
    @NameInMap("individual_tag")
    @Validation(required = true)
    public String individualTag;

    // 回复关键词
    /**
     * <strong>example:</strong>
     * <p>利息</p>
     */
    @NameInMap("keywords")
    @Validation(required = true)
    public String keywords;

    // 对话录音
    /**
     * <strong>example:</strong>
     * <p>录音url</p>
     */
    @NameInMap("chat_record")
    public String chatRecord;

    // 参数值
    /**
     * <strong>example:</strong>
     * <p>{&quot;电话号码&quot;:&quot;13100000000&quot;}</p>
     */
    @NameInMap("properties")
    @Validation(required = true)
    public String properties;

    public static AICallbackMessage build(java.util.Map<String, ?> map) throws Exception {
        AICallbackMessage self = new AICallbackMessage();
        return TeaModel.build(map, self);
    }

    public AICallbackMessage setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public AICallbackMessage setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public AICallbackMessage setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public AICallbackMessage setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public AICallbackMessage setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public AICallbackMessage setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
        return this;
    }
    public String getStatusDescription() {
        return this.statusDescription;
    }

    public AICallbackMessage setImportTime(String importTime) {
        this.importTime = importTime;
        return this;
    }
    public String getImportTime() {
        return this.importTime;
    }

    public AICallbackMessage setCallBeginTime(String callBeginTime) {
        this.callBeginTime = callBeginTime;
        return this;
    }
    public String getCallBeginTime() {
        return this.callBeginTime;
    }

    public AICallbackMessage setRingTime(Long ringTime) {
        this.ringTime = ringTime;
        return this;
    }
    public Long getRingTime() {
        return this.ringTime;
    }

    public AICallbackMessage setAnswerTime(String answerTime) {
        this.answerTime = answerTime;
        return this;
    }
    public String getAnswerTime() {
        return this.answerTime;
    }

    public AICallbackMessage setSpeakingDuration(Long speakingDuration) {
        this.speakingDuration = speakingDuration;
        return this;
    }
    public Long getSpeakingDuration() {
        return this.speakingDuration;
    }

    public AICallbackMessage setHangupTime(String hangupTime) {
        this.hangupTime = hangupTime;
        return this;
    }
    public String getHangupTime() {
        return this.hangupTime;
    }

    public AICallbackMessage setSpeakingTurns(Long speakingTurns) {
        this.speakingTurns = speakingTurns;
        return this;
    }
    public Long getSpeakingTurns() {
        return this.speakingTurns;
    }

    public AICallbackMessage setIntentTag(String intentTag) {
        this.intentTag = intentTag;
        return this;
    }
    public String getIntentTag() {
        return this.intentTag;
    }

    public AICallbackMessage setIntentDescription(String intentDescription) {
        this.intentDescription = intentDescription;
        return this;
    }
    public String getIntentDescription() {
        return this.intentDescription;
    }

    public AICallbackMessage setIndividualTag(String individualTag) {
        this.individualTag = individualTag;
        return this;
    }
    public String getIndividualTag() {
        return this.individualTag;
    }

    public AICallbackMessage setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public AICallbackMessage setChatRecord(String chatRecord) {
        this.chatRecord = chatRecord;
        return this;
    }
    public String getChatRecord() {
        return this.chatRecord;
    }

    public AICallbackMessage setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
