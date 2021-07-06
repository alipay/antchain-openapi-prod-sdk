// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class CreateBaicorpInternalevaluationasyncResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 内容质量分
    @NameInMap("content_score")
    public String contentScore;

    // 质量分描述
    @NameInMap("content_score_desc")
    public String contentScoreDesc;

    // 业务自定义id
    @NameInMap("custom_id")
    public String customId;

    // 导致重复的原因
    @NameInMap("repeat_reason")
    public String repeatReason;

    // 是否重复
    @NameInMap("repeat_result")
    public Boolean repeatResult;

    // 风险识别结果
    @NameInMap("risk_result")
    public String riskResult;

    // 风险识别结果描述
    @NameInMap("risk_result_desc")
    public String riskResultDesc;

    // 监测任务ID
    @NameInMap("task_id")
    public String taskId;

    public static CreateBaicorpInternalevaluationasyncResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBaicorpInternalevaluationasyncResponse self = new CreateBaicorpInternalevaluationasyncResponse();
        return TeaModel.build(map, self);
    }

    public CreateBaicorpInternalevaluationasyncResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBaicorpInternalevaluationasyncResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBaicorpInternalevaluationasyncResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBaicorpInternalevaluationasyncResponse setContentScore(String contentScore) {
        this.contentScore = contentScore;
        return this;
    }
    public String getContentScore() {
        return this.contentScore;
    }

    public CreateBaicorpInternalevaluationasyncResponse setContentScoreDesc(String contentScoreDesc) {
        this.contentScoreDesc = contentScoreDesc;
        return this;
    }
    public String getContentScoreDesc() {
        return this.contentScoreDesc;
    }

    public CreateBaicorpInternalevaluationasyncResponse setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public CreateBaicorpInternalevaluationasyncResponse setRepeatReason(String repeatReason) {
        this.repeatReason = repeatReason;
        return this;
    }
    public String getRepeatReason() {
        return this.repeatReason;
    }

    public CreateBaicorpInternalevaluationasyncResponse setRepeatResult(Boolean repeatResult) {
        this.repeatResult = repeatResult;
        return this;
    }
    public Boolean getRepeatResult() {
        return this.repeatResult;
    }

    public CreateBaicorpInternalevaluationasyncResponse setRiskResult(String riskResult) {
        this.riskResult = riskResult;
        return this;
    }
    public String getRiskResult() {
        return this.riskResult;
    }

    public CreateBaicorpInternalevaluationasyncResponse setRiskResultDesc(String riskResultDesc) {
        this.riskResultDesc = riskResultDesc;
        return this;
    }
    public String getRiskResultDesc() {
        return this.riskResultDesc;
    }

    public CreateBaicorpInternalevaluationasyncResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
