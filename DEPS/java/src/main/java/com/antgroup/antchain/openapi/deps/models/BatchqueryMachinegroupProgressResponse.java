// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BatchqueryMachinegroupProgressResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 机器分组列表
    @NameInMap("machine_groups")
    public java.util.List<String> machineGroups;

    public static BatchqueryMachinegroupProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryMachinegroupProgressResponse self = new BatchqueryMachinegroupProgressResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryMachinegroupProgressResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryMachinegroupProgressResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryMachinegroupProgressResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryMachinegroupProgressResponse setMachineGroups(java.util.List<String> machineGroups) {
        this.machineGroups = machineGroups;
        return this;
    }
    public java.util.List<String> getMachineGroups() {
        return this.machineGroups;
    }

}
