// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryBlockanalysisTransactionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 区块高度
    @NameInMap("block_number")
    public Long blockNumber;

    // 交易数据，hex格式
    @NameInMap("data")
    public String data;

    // 交易发起方
    @NameInMap("from")
    public String from;

    // 交易单据信息
    @NameInMap("receipt")
    public BlockReceipt receipt;

    // 交易时间戳
    @NameInMap("timestamp")
    public String timestamp;

    // 交易接收方
    @NameInMap("to")
    public String to;

    // 交易hash
    @NameInMap("tx_hash")
    public String txHash;

    // 交易类型
    @NameInMap("tx_type")
    public Long txType;

    public static QueryBlockanalysisTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockanalysisTransactionResponse self = new QueryBlockanalysisTransactionResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockanalysisTransactionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockanalysisTransactionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockanalysisTransactionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockanalysisTransactionResponse setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

    public QueryBlockanalysisTransactionResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryBlockanalysisTransactionResponse setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public QueryBlockanalysisTransactionResponse setReceipt(BlockReceipt receipt) {
        this.receipt = receipt;
        return this;
    }
    public BlockReceipt getReceipt() {
        return this.receipt;
    }

    public QueryBlockanalysisTransactionResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public QueryBlockanalysisTransactionResponse setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public QueryBlockanalysisTransactionResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public QueryBlockanalysisTransactionResponse setTxType(Long txType) {
        this.txType = txType;
        return this;
    }
    public Long getTxType() {
        return this.txType;
    }

}
