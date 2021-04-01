// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConsumecardBillResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 消费卡的单条交易记录数据
    @NameInMap("block_instruction")
    public BlockInstruction blockInstruction;

    public static QueryConsumecardBillResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumecardBillResponse self = new QueryConsumecardBillResponse();
        return TeaModel.build(map, self);
    }

    public QueryConsumecardBillResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryConsumecardBillResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryConsumecardBillResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryConsumecardBillResponse setBlockInstruction(BlockInstruction blockInstruction) {
        this.blockInstruction = blockInstruction;
        return this;
    }
    public BlockInstruction getBlockInstruction() {
        return this.blockInstruction;
    }

}
