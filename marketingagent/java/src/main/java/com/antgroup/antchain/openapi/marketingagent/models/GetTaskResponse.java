// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class GetTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // Task is the core unit of action for A2A. It has a current status and when results are created for the task they are stored in the artifact.
    @NameInMap("task")
    public Task task;

    public static GetTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponse self = new GetTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTaskResponse setTask(Task task) {
        this.task = task;
        return this;
    }
    public Task getTask() {
        return this.task;
    }

}
