// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CancelMachineResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 机器信息
    @NameInMap("machine")
    public String machine;

    public static CancelMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelMachineResponse self = new CancelMachineResponse();
        return TeaModel.build(map, self);
    }

    public CancelMachineResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CancelMachineResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CancelMachineResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CancelMachineResponse setMachine(String machine) {
        this.machine = machine;
        return this;
    }
    public String getMachine() {
        return this.machine;
    }

}
