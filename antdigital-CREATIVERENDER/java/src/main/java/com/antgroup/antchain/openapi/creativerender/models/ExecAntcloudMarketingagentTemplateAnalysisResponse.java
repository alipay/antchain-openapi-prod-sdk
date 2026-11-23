// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class ExecAntcloudMarketingagentTemplateAnalysisResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务id
    @NameInMap("task_id")
    public String taskId;

    // PROCESSING（受理成功）/ FAILED（参数被拒）
    @NameInMap("status")
    public String status;

    public static ExecAntcloudMarketingagentTemplateAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudMarketingagentTemplateAnalysisResponse self = new ExecAntcloudMarketingagentTemplateAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudMarketingagentTemplateAnalysisResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecAntcloudMarketingagentTemplateAnalysisResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecAntcloudMarketingagentTemplateAnalysisResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecAntcloudMarketingagentTemplateAnalysisResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ExecAntcloudMarketingagentTemplateAnalysisResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
