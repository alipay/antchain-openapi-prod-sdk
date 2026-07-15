// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class OutcallBackResult extends TeaModel {
    // 手机号
    /**
     * <strong>example:</strong>
     * <p>13000000000</p>
     */
    @NameInMap("phone_no")
    @Validation(required = true)
    public String phoneNo;

    // 外呼类型
    /**
     * <strong>example:</strong>
     * <p>2002</p>
     */
    @NameInMap("call_type")
    @Validation(required = true)
    public String callType;

    // 外呼结果状态码
    /**
     * <strong>example:</strong>
     * <p>200005</p>
     */
    @NameInMap("status_code")
    @Validation(required = true)
    public String statusCode;

    // 外呼结果状态码
    /**
     * <strong>example:</strong>
     * <p>未接听</p>
     */
    @NameInMap("status_description")
    @Validation(required = true)
    public String statusDescription;

    // 通话时长，单位秒
    /**
     * <strong>example:</strong>
     * <p>85</p>
     */
    @NameInMap("speaking_duration")
    public String speakingDuration;

    // 接通时间
    /**
     * <strong>example:</strong>
     * <p>2026-05-25 14:05:03</p>
     */
    @NameInMap("answer_time")
    public String answerTime;

    // 对话记录
    /**
     * <strong>example:</strong>
     * <p>[{&quot;role&quot;:&quot;ROBOT&quot;,&quot;content&quot;:&quot;您好，请问是张先生吗？&quot;},{&quot;role&quot;:&quot;CUSTOMER&quot;,&quot;content&quot;:&quot;是的，你好&quot;}]</p>
     */
    @NameInMap("chats")
    public String chats;

    public static OutcallBackResult build(java.util.Map<String, ?> map) throws Exception {
        OutcallBackResult self = new OutcallBackResult();
        return TeaModel.build(map, self);
    }

    public OutcallBackResult setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public OutcallBackResult setCallType(String callType) {
        this.callType = callType;
        return this;
    }
    public String getCallType() {
        return this.callType;
    }

    public OutcallBackResult setStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public String getStatusCode() {
        return this.statusCode;
    }

    public OutcallBackResult setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
        return this;
    }
    public String getStatusDescription() {
        return this.statusDescription;
    }

    public OutcallBackResult setSpeakingDuration(String speakingDuration) {
        this.speakingDuration = speakingDuration;
        return this;
    }
    public String getSpeakingDuration() {
        return this.speakingDuration;
    }

    public OutcallBackResult setAnswerTime(String answerTime) {
        this.answerTime = answerTime;
        return this;
    }
    public String getAnswerTime() {
        return this.answerTime;
    }

    public OutcallBackResult setChats(String chats) {
        this.chats = chats;
        return this;
    }
    public String getChats() {
        return this.chats;
    }

}
