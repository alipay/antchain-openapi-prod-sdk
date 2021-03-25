// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryEquityInstructionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 商品兑换流水信息
    @NameInMap("instruction")
    public EInstruction instruction;

    public static QueryEquityInstructionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEquityInstructionResponse self = new QueryEquityInstructionResponse();
        return TeaModel.build(map, self);
    }

    public QueryEquityInstructionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEquityInstructionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEquityInstructionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEquityInstructionResponse setInstruction(EInstruction instruction) {
        this.instruction = instruction;
        return this;
    }
    public EInstruction getInstruction() {
        return this.instruction;
    }

}
