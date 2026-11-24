// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class QueryTemplateAnalysisResponse extends TeaModel {
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

    // PENDING / PROCESSING / COMPLETED / FAILED
    @NameInMap("status")
    public String status;

    // 拆解详情
    @NameInMap("analysis_detail")
    public String analysisDetail;

    // 原片逐镜拆解
    @NameInMap("original_storyboards")
    public String originalStoryboards;

    // 新分镜脚本
    @NameInMap("new_storyboard_script")
    public String newStoryboardScript;

    // 本次费用
    @NameInMap("current_credit")
    public Long currentCredit;

    // COMPLETE / PENDING / MISSING_USAGE / INVALID_USAGE / NOT_BILLABLE
    @NameInMap("credit_status")
    public String creditStatus;

    // FAILED 时返回的脱敏失败文案
    @NameInMap("error_message")
    public String errorMessage;

    public static QueryTemplateAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTemplateAnalysisResponse self = new QueryTemplateAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public QueryTemplateAnalysisResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTemplateAnalysisResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTemplateAnalysisResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTemplateAnalysisResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryTemplateAnalysisResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryTemplateAnalysisResponse setAnalysisDetail(String analysisDetail) {
        this.analysisDetail = analysisDetail;
        return this;
    }
    public String getAnalysisDetail() {
        return this.analysisDetail;
    }

    public QueryTemplateAnalysisResponse setOriginalStoryboards(String originalStoryboards) {
        this.originalStoryboards = originalStoryboards;
        return this;
    }
    public String getOriginalStoryboards() {
        return this.originalStoryboards;
    }

    public QueryTemplateAnalysisResponse setNewStoryboardScript(String newStoryboardScript) {
        this.newStoryboardScript = newStoryboardScript;
        return this;
    }
    public String getNewStoryboardScript() {
        return this.newStoryboardScript;
    }

    public QueryTemplateAnalysisResponse setCurrentCredit(Long currentCredit) {
        this.currentCredit = currentCredit;
        return this;
    }
    public Long getCurrentCredit() {
        return this.currentCredit;
    }

    public QueryTemplateAnalysisResponse setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
        return this;
    }
    public String getCreditStatus() {
        return this.creditStatus;
    }

    public QueryTemplateAnalysisResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
