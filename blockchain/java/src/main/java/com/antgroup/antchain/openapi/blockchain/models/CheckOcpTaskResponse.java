// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CheckOcpTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务是否成功
    @NameInMap("task_result")
    public Boolean taskResult;

    public static CheckOcpTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckOcpTaskResponse self = new CheckOcpTaskResponse();
        return TeaModel.build(map, self);
    }

    public CheckOcpTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckOcpTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckOcpTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckOcpTaskResponse setTaskResult(Boolean taskResult) {
        this.taskResult = taskResult;
        return this;
    }
    public Boolean getTaskResult() {
        return this.taskResult;
    }

}
