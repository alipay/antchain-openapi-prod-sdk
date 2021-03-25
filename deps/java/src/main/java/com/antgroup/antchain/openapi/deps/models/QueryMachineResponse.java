// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryMachineResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 发布机器信息
    @NameInMap("machines")
    public java.util.List<String> machines;

    public static QueryMachineResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMachineResponse self = new QueryMachineResponse();
        return TeaModel.build(map, self);
    }

    public QueryMachineResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMachineResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMachineResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMachineResponse setMachines(java.util.List<String> machines) {
        this.machines = machines;
        return this;
    }
    public java.util.List<String> getMachines() {
        return this.machines;
    }

}
