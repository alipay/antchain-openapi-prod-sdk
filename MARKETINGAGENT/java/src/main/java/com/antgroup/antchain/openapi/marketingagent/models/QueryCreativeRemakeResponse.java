// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class QueryCreativeRemakeResponse extends TeaModel {
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

    // PROCESSING / COMPLETED / FAILED
    @NameInMap("status")
    public String status;

    // 视频产物列表，COMPLETED 时返回非空列表。
    @NameInMap("outputs")
    public VideoOutput outputs;

    // 本阶段视频费用
    @NameInMap("current_credit")
    public Long currentCredit;

    // COMPLETE / PENDING / MISSING_USAGE / INVALID_USAGE / NOT_BILLABLE
    @NameInMap("credit_status")
    public String creditStatus;

    // 终态耗时（秒）
    @NameInMap("task_duration_seconds")
    public Long taskDurationSeconds;

    // FAILED 时返回的失败原因（脱敏文案）；
    @NameInMap("error_message")
    public String errorMessage;

    public static QueryCreativeRemakeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreativeRemakeResponse self = new QueryCreativeRemakeResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreativeRemakeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreativeRemakeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreativeRemakeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreativeRemakeResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryCreativeRemakeResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryCreativeRemakeResponse setOutputs(VideoOutput outputs) {
        this.outputs = outputs;
        return this;
    }
    public VideoOutput getOutputs() {
        return this.outputs;
    }

    public QueryCreativeRemakeResponse setCurrentCredit(Long currentCredit) {
        this.currentCredit = currentCredit;
        return this;
    }
    public Long getCurrentCredit() {
        return this.currentCredit;
    }

    public QueryCreativeRemakeResponse setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
        return this;
    }
    public String getCreditStatus() {
        return this.creditStatus;
    }

    public QueryCreativeRemakeResponse setTaskDurationSeconds(Long taskDurationSeconds) {
        this.taskDurationSeconds = taskDurationSeconds;
        return this;
    }
    public Long getTaskDurationSeconds() {
        return this.taskDurationSeconds;
    }

    public QueryCreativeRemakeResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
