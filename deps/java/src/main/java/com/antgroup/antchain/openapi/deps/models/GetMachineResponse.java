// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetMachineResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 发布机器信息
    @NameInMap("machine")
    public String machine;

    public static GetMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMachineResponse self = new GetMachineResponse();
        return TeaModel.build(map, self);
    }

    public GetMachineResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetMachineResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMachineResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetMachineResponse setMachine(String machine) {
        this.machine = machine;
        return this;
    }
    public String getMachine() {
        return this.machine;
    }

}
