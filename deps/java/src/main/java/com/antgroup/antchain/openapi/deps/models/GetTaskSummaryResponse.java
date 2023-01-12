// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetTaskSummaryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // task
    @NameInMap("task")
    public String task;

    public static GetTaskSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskSummaryResponse self = new GetTaskSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskSummaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTaskSummaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTaskSummaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTaskSummaryResponse setTask(String task) {
        this.task = task;
        return this;
    }
    public String getTask() {
        return this.task;
    }

}
