// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryApiDwhbTransactionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // transaction
    @NameInMap("transaction_list")
    public java.util.List<TransactionInfo> transactionList;

    public static QueryApiDwhbTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApiDwhbTransactionResponse self = new QueryApiDwhbTransactionResponse();
        return TeaModel.build(map, self);
    }

    public QueryApiDwhbTransactionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApiDwhbTransactionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApiDwhbTransactionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApiDwhbTransactionResponse setTransactionList(java.util.List<TransactionInfo> transactionList) {
        this.transactionList = transactionList;
        return this;
    }
    public java.util.List<TransactionInfo> getTransactionList() {
        return this.transactionList;
    }

}
