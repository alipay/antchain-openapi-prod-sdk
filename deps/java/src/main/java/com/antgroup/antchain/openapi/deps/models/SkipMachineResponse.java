// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SkipMachineResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 机器信息
    @NameInMap("machine")
    public String machine;

    public static SkipMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipMachineResponse self = new SkipMachineResponse();
        return TeaModel.build(map, self);
    }

    public SkipMachineResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SkipMachineResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SkipMachineResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SkipMachineResponse setMachine(String machine) {
        this.machine = machine;
        return this;
    }
    public String getMachine() {
        return this.machine;
    }

}
