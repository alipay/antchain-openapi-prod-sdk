// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryExchangeInstructionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 权益兑换流水完整信息
    @NameInMap("instruction")
    public EInstruction instruction;

    public static QueryExchangeInstructionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExchangeInstructionResponse self = new QueryExchangeInstructionResponse();
        return TeaModel.build(map, self);
    }

    public QueryExchangeInstructionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryExchangeInstructionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryExchangeInstructionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryExchangeInstructionResponse setInstruction(EInstruction instruction) {
        this.instruction = instruction;
        return this;
    }
    public EInstruction getInstruction() {
        return this.instruction;
    }

}
