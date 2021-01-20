// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetCmdTaskResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 指令执行结果详情
    @NameInMap("result")
    public CmdExecResult result;

    public static GetCmdTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCmdTaskResponse self = new GetCmdTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetCmdTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetCmdTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCmdTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetCmdTaskResponse setResult(CmdExecResult result) {
        this.result = result;
        return this;
    }
    public CmdExecResult getResult() {
        return this.result;
    }

}
