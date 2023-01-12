// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryMachineResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
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
