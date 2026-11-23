// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class ExecAntcloudMarketingagentCreativeRemakeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 生视频任务id（内部 messageId
    @NameInMap("task_id")
    public String taskId;

    // PROCESSING / FAILED
    @NameInMap("status")
    public String status;

    public static ExecAntcloudMarketingagentCreativeRemakeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudMarketingagentCreativeRemakeResponse self = new ExecAntcloudMarketingagentCreativeRemakeResponse();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudMarketingagentCreativeRemakeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecAntcloudMarketingagentCreativeRemakeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecAntcloudMarketingagentCreativeRemakeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecAntcloudMarketingagentCreativeRemakeResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ExecAntcloudMarketingagentCreativeRemakeResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
