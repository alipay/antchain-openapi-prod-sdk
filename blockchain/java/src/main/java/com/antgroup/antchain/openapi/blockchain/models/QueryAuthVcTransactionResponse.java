// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthVcTransactionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 链上交易信息
    @NameInMap("tx_info")
    public TxInfo txInfo;

    public static QueryAuthVcTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthVcTransactionResponse self = new QueryAuthVcTransactionResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthVcTransactionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAuthVcTransactionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAuthVcTransactionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAuthVcTransactionResponse setTxInfo(TxInfo txInfo) {
        this.txInfo = txInfo;
        return this;
    }
    public TxInfo getTxInfo() {
        return this.txInfo;
    }

}
