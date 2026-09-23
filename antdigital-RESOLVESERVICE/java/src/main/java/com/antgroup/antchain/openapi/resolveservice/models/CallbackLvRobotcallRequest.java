// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.resolveservice.models;

import com.aliyun.tea.*;

public class CallbackLvRobotcallRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 关联发起呼叫时的请求ID（唯一关联键）
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 案件唯一标识
    @NameInMap("case_id")
    @Validation(required = true)
    public String caseId;

    // 通话状态。示例： connected （已接通）、no_answer （无人接听）
    @NameInMap("call_status")
    @Validation(required = true)
    public String callStatus;

    // 外呼开始时间，ISO 8601格式
    @NameInMap("call_start_time")
    @Validation(required = true)
    public String callStartTime;

    // 外呼时长，单位：秒
    @NameInMap("call_duration")
    @Validation(required = true)
    public Long callDuration;

    // 通话总结
    @NameInMap("call_summary")
    @Validation(required = true)
    public String callSummary;

    // 通话标签。一通通话仅返回一组标签
    @NameInMap("call_tags")
    @Validation(required = true)
    public CallTags callTags;

    // 通话录音下载地址
    @NameInMap("recording_url")
    @Validation(required = true)
    public String recordingUrl;

    // 录音全文，按对话轮次组织
    @NameInMap("transcript")
    @Validation(required = true)
    public java.util.List<Transcript> transcript;

    public static CallbackLvRobotcallRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackLvRobotcallRequest self = new CallbackLvRobotcallRequest();
        return TeaModel.build(map, self);
    }

    public CallbackLvRobotcallRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackLvRobotcallRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackLvRobotcallRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CallbackLvRobotcallRequest setCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }
    public String getCaseId() {
        return this.caseId;
    }

    public CallbackLvRobotcallRequest setCallStatus(String callStatus) {
        this.callStatus = callStatus;
        return this;
    }
    public String getCallStatus() {
        return this.callStatus;
    }

    public CallbackLvRobotcallRequest setCallStartTime(String callStartTime) {
        this.callStartTime = callStartTime;
        return this;
    }
    public String getCallStartTime() {
        return this.callStartTime;
    }

    public CallbackLvRobotcallRequest setCallDuration(Long callDuration) {
        this.callDuration = callDuration;
        return this;
    }
    public Long getCallDuration() {
        return this.callDuration;
    }

    public CallbackLvRobotcallRequest setCallSummary(String callSummary) {
        this.callSummary = callSummary;
        return this;
    }
    public String getCallSummary() {
        return this.callSummary;
    }

    public CallbackLvRobotcallRequest setCallTags(CallTags callTags) {
        this.callTags = callTags;
        return this;
    }
    public CallTags getCallTags() {
        return this.callTags;
    }

    public CallbackLvRobotcallRequest setRecordingUrl(String recordingUrl) {
        this.recordingUrl = recordingUrl;
        return this;
    }
    public String getRecordingUrl() {
        return this.recordingUrl;
    }

    public CallbackLvRobotcallRequest setTranscript(java.util.List<Transcript> transcript) {
        this.transcript = transcript;
        return this;
    }
    public java.util.List<Transcript> getTranscript() {
        return this.transcript;
    }

}
