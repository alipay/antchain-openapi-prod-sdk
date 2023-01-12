// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RetryMachinegroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 机器分组信息
    @NameInMap("machine_group")
    public String machineGroup;

    public static RetryMachinegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryMachinegroupResponse self = new RetryMachinegroupResponse();
        return TeaModel.build(map, self);
    }

    public RetryMachinegroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RetryMachinegroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RetryMachinegroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RetryMachinegroupResponse setMachineGroup(String machineGroup) {
        this.machineGroup = machineGroup;
        return this;
    }
    public String getMachineGroup() {
        return this.machineGroup;
    }

}
