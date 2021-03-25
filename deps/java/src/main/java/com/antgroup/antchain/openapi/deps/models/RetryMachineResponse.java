// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RetryMachineResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 发布机器信息
    @NameInMap("machine")
    public String machine;

    public static RetryMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryMachineResponse self = new RetryMachineResponse();
        return TeaModel.build(map, self);
    }

    public RetryMachineResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RetryMachineResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RetryMachineResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RetryMachineResponse setMachine(String machine) {
        this.machine = machine;
        return this;
    }
    public String getMachine() {
        return this.machine;
    }

}
