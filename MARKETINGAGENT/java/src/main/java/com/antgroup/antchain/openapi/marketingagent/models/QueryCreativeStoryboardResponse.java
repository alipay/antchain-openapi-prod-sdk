// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class QueryCreativeStoryboardResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务id回显
    @NameInMap("task_id")
    public String taskId;

    // PROCESSING/COMPLETED/FAILED
    @NameInMap("status")
    public String status;

    // 剧集id
    @NameInMap("episode_id")
    public String episodeId;

    // 拆解详情
    @NameInMap("analysis_detail")
    public String analysisDetail;

    // 原片分镜
    @NameInMap("original_storyboards")
    public String originalStoryboards;

    // 新分镜脚本
    @NameInMap("new_storyboard_script")
    public String newStoryboardScript;

    // 本阶段费用
    @NameInMap("current_credit")
    public Long currentCredit;

    // COMPLETE / PENDING / MISSING_USAGE / INVALID_USAGE / NOT_BILLABLE
    @NameInMap("credit_status")
    public String creditStatus;

    // 终态任务耗时（秒）
    @NameInMap("task_duration_seconds")
    public Long taskDurationSeconds;

    // FAILED 时返回的失败原因（脱敏文案）
    @NameInMap("error_message")
    public String errorMessage;

    public static QueryCreativeStoryboardResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreativeStoryboardResponse self = new QueryCreativeStoryboardResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreativeStoryboardResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreativeStoryboardResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreativeStoryboardResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreativeStoryboardResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryCreativeStoryboardResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryCreativeStoryboardResponse setEpisodeId(String episodeId) {
        this.episodeId = episodeId;
        return this;
    }
    public String getEpisodeId() {
        return this.episodeId;
    }

    public QueryCreativeStoryboardResponse setAnalysisDetail(String analysisDetail) {
        this.analysisDetail = analysisDetail;
        return this;
    }
    public String getAnalysisDetail() {
        return this.analysisDetail;
    }

    public QueryCreativeStoryboardResponse setOriginalStoryboards(String originalStoryboards) {
        this.originalStoryboards = originalStoryboards;
        return this;
    }
    public String getOriginalStoryboards() {
        return this.originalStoryboards;
    }

    public QueryCreativeStoryboardResponse setNewStoryboardScript(String newStoryboardScript) {
        this.newStoryboardScript = newStoryboardScript;
        return this;
    }
    public String getNewStoryboardScript() {
        return this.newStoryboardScript;
    }

    public QueryCreativeStoryboardResponse setCurrentCredit(Long currentCredit) {
        this.currentCredit = currentCredit;
        return this;
    }
    public Long getCurrentCredit() {
        return this.currentCredit;
    }

    public QueryCreativeStoryboardResponse setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
        return this;
    }
    public String getCreditStatus() {
        return this.creditStatus;
    }

    public QueryCreativeStoryboardResponse setTaskDurationSeconds(Long taskDurationSeconds) {
        this.taskDurationSeconds = taskDurationSeconds;
        return this;
    }
    public Long getTaskDurationSeconds() {
        return this.taskDurationSeconds;
    }

    public QueryCreativeStoryboardResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
