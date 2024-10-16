// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class SubmitAuditAudioResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 本次调用请求的ID，是由蚂蚁数科为该请求生成的唯一标识符，可用于排查和定位问题
    @NameInMap("request_id")
    public String requestId;

    // 任务ID
    @NameInMap("task_id")
    public String taskId;

    // 检测对象对应的数据ID。
    // 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
    @NameInMap("data_id")
    public String dataId;

    public static SubmitAuditAudioResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAuditAudioResponse self = new SubmitAuditAudioResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAuditAudioResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitAuditAudioResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitAuditAudioResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitAuditAudioResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitAuditAudioResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SubmitAuditAudioResponse setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
