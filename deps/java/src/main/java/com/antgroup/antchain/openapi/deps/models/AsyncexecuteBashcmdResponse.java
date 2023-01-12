// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AsyncexecuteBashcmdResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 异步bash命令执行的任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static AsyncexecuteBashcmdResponse build(java.util.Map<String, ?> map) throws Exception {
        AsyncexecuteBashcmdResponse self = new AsyncexecuteBashcmdResponse();
        return TeaModel.build(map, self);
    }

    public AsyncexecuteBashcmdResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AsyncexecuteBashcmdResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AsyncexecuteBashcmdResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AsyncexecuteBashcmdResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
