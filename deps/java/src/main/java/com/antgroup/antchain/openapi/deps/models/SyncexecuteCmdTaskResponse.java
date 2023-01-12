// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SyncexecuteCmdTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 指令执行结果详情
    @NameInMap("result")
    @Validation(required = true)
    public CmdExecResult result;

    public static SyncexecuteCmdTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncexecuteCmdTaskResponse self = new SyncexecuteCmdTaskResponse();
        return TeaModel.build(map, self);
    }

    public SyncexecuteCmdTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SyncexecuteCmdTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncexecuteCmdTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SyncexecuteCmdTaskResponse setResult(CmdExecResult result) {
        this.result = result;
        return this;
    }
    public CmdExecResult getResult() {
        return this.result;
    }

}
