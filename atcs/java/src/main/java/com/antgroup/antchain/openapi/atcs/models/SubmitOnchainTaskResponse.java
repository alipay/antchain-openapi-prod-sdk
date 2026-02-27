// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.atcs.models;

import com.aliyun.tea.*;

public class SubmitOnchainTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 上链任务唯一标识
    @NameInMap("task_id")
    public String taskId;

    public static SubmitOnchainTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitOnchainTaskResponse self = new SubmitOnchainTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitOnchainTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitOnchainTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitOnchainTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitOnchainTaskResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
