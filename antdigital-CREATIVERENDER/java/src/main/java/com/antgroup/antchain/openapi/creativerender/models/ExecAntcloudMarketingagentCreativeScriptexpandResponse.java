// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class ExecAntcloudMarketingagentCreativeScriptexpandResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 脚本扩写任务标识，用于查询
    @NameInMap("task_id")
    public String taskId;

    // 脚本扩写任务状态，沿用现有任务状态体系
    @NameInMap("status")
    public String status;

    public static ExecAntcloudMarketingagentCreativeScriptexpandResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudMarketingagentCreativeScriptexpandResponse self = new ExecAntcloudMarketingagentCreativeScriptexpandResponse();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudMarketingagentCreativeScriptexpandResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecAntcloudMarketingagentCreativeScriptexpandResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecAntcloudMarketingagentCreativeScriptexpandResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecAntcloudMarketingagentCreativeScriptexpandResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ExecAntcloudMarketingagentCreativeScriptexpandResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
