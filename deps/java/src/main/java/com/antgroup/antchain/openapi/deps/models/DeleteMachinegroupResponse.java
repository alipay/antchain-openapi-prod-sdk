// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteMachinegroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 机器分组
    @NameInMap("machine_group")
    public String machineGroup;

    public static DeleteMachinegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMachinegroupResponse self = new DeleteMachinegroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMachinegroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DeleteMachinegroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteMachinegroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DeleteMachinegroupResponse setMachineGroup(String machineGroup) {
        this.machineGroup = machineGroup;
        return this;
    }
    public String getMachineGroup() {
        return this.machineGroup;
    }

}
