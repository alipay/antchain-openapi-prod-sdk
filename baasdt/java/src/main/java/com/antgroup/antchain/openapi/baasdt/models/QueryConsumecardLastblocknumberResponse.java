// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConsumecardLastblocknumberResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 区块链最高区块高度
    @NameInMap("block_number")
    public Long blockNumber;

    public static QueryConsumecardLastblocknumberResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumecardLastblocknumberResponse self = new QueryConsumecardLastblocknumberResponse();
        return TeaModel.build(map, self);
    }

    public QueryConsumecardLastblocknumberResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryConsumecardLastblocknumberResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryConsumecardLastblocknumberResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryConsumecardLastblocknumberResponse setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

}
