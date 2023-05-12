// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class GetTransactionSagaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 状态机执行记录json
    @NameInMap("statemachine_inst_json")
    public String statemachineInstJson;

    public static GetTransactionSagaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTransactionSagaResponse self = new GetTransactionSagaResponse();
        return TeaModel.build(map, self);
    }

    public GetTransactionSagaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTransactionSagaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTransactionSagaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTransactionSagaResponse setStatemachineInstJson(String statemachineInstJson) {
        this.statemachineInstJson = statemachineInstJson;
        return this;
    }
    public String getStatemachineInstJson() {
        return this.statemachineInstJson;
    }

}
