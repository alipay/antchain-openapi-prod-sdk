// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class QueryAntcloudMarketingagentCreativeVideoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 视频任务 ID
    @NameInMap("task_id")
    public String taskId;

    // PENDING、PROCESSING、COMPLETED、FAILED
    @NameInMap("status")
    public String status;

    // 视频产物列表
    @NameInMap("outputs")
    public java.util.List<VideoOutput> outputs;

    // 扩写后的脚本，上游提供时返回
    @NameInMap("script")
    public String script;

    // 视频耗费credits
    @NameInMap("credits")
    public String credits;

    // 任务失败原因
    @NameInMap("error_message")
    public String errorMessage;

    public static QueryAntcloudMarketingagentCreativeVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudMarketingagentCreativeVideoResponse self = new QueryAntcloudMarketingagentCreativeVideoResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudMarketingagentCreativeVideoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntcloudMarketingagentCreativeVideoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntcloudMarketingagentCreativeVideoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntcloudMarketingagentCreativeVideoResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryAntcloudMarketingagentCreativeVideoResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntcloudMarketingagentCreativeVideoResponse setOutputs(java.util.List<VideoOutput> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<VideoOutput> getOutputs() {
        return this.outputs;
    }

    public QueryAntcloudMarketingagentCreativeVideoResponse setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public QueryAntcloudMarketingagentCreativeVideoResponse setCredits(String credits) {
        this.credits = credits;
        return this;
    }
    public String getCredits() {
        return this.credits;
    }

    public QueryAntcloudMarketingagentCreativeVideoResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
