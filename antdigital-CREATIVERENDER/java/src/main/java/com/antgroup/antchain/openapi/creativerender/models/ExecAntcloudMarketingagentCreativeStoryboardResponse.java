// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class ExecAntcloudMarketingagentCreativeStoryboardResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 拆解任务ID
    @NameInMap("task_id")
    public String taskId;

    // 会话ID，需要回传
    @NameInMap("session_id")
    public String sessionId;

    // PROCESSING受理成功/FAILED参数被拒
    @NameInMap("status")
    public String status;

    public static ExecAntcloudMarketingagentCreativeStoryboardResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudMarketingagentCreativeStoryboardResponse self = new ExecAntcloudMarketingagentCreativeStoryboardResponse();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudMarketingagentCreativeStoryboardResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecAntcloudMarketingagentCreativeStoryboardResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecAntcloudMarketingagentCreativeStoryboardResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecAntcloudMarketingagentCreativeStoryboardResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ExecAntcloudMarketingagentCreativeStoryboardResponse setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ExecAntcloudMarketingagentCreativeStoryboardResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
