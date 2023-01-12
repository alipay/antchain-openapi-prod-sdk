// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BatchqueryMachinegroupProgressResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
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
