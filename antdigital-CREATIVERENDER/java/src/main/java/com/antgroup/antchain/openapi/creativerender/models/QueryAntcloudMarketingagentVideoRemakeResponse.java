// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class QueryAntcloudMarketingagentVideoRemakeResponse extends TeaModel {
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

    // 视频产物列表，COMPLETED 时返回非空列表。
    @NameInMap("outputs")
    public VideoOutput outputs;

    // PROCESSING / COMPLETED / FAILED
    @NameInMap("status")
    public String status;

    // 本阶段视频费用
    @NameInMap("current_credit")
    public Long currentCredit;

    // FAILED 时返回的失败原因（脱敏文案）；
    @NameInMap("error_message")
    public String errorMessage;

    public static QueryAntcloudMarketingagentVideoRemakeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudMarketingagentVideoRemakeResponse self = new QueryAntcloudMarketingagentVideoRemakeResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudMarketingagentVideoRemakeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntcloudMarketingagentVideoRemakeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntcloudMarketingagentVideoRemakeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntcloudMarketingagentVideoRemakeResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryAntcloudMarketingagentVideoRemakeResponse setOutputs(VideoOutput outputs) {
        this.outputs = outputs;
        return this;
    }
    public VideoOutput getOutputs() {
        return this.outputs;
    }

    public QueryAntcloudMarketingagentVideoRemakeResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntcloudMarketingagentVideoRemakeResponse setCurrentCredit(Long currentCredit) {
        this.currentCredit = currentCredit;
        return this;
    }
    public Long getCurrentCredit() {
        return this.currentCredit;
    }

    public QueryAntcloudMarketingagentVideoRemakeResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
