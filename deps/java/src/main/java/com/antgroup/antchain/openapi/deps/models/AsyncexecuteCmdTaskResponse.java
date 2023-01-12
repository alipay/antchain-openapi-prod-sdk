// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AsyncexecuteCmdTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 指令执行任务ID，用于查询任务详情
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static AsyncexecuteCmdTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AsyncexecuteCmdTaskResponse self = new AsyncexecuteCmdTaskResponse();
        return TeaModel.build(map, self);
    }

    public AsyncexecuteCmdTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AsyncexecuteCmdTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AsyncexecuteCmdTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AsyncexecuteCmdTaskResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
