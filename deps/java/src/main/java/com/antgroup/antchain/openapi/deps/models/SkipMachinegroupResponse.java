// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SkipMachinegroupResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 分组
    @NameInMap("machine_group")
    public String machineGroup;

    public static SkipMachinegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipMachinegroupResponse self = new SkipMachinegroupResponse();
        return TeaModel.build(map, self);
    }

    public SkipMachinegroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SkipMachinegroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SkipMachinegroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SkipMachinegroupResponse setMachineGroup(String machineGroup) {
        this.machineGroup = machineGroup;
        return this;
    }
    public String getMachineGroup() {
        return this.machineGroup;
    }

}
