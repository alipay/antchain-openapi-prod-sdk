// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CancelMachinegroupResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 机器分组
    @NameInMap("machine_group")
    public String machineGroup;

    public static CancelMachinegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelMachinegroupResponse self = new CancelMachinegroupResponse();
        return TeaModel.build(map, self);
    }

    public CancelMachinegroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CancelMachinegroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CancelMachinegroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CancelMachinegroupResponse setMachineGroup(String machineGroup) {
        this.machineGroup = machineGroup;
        return this;
    }
    public String getMachineGroup() {
        return this.machineGroup;
    }

}
