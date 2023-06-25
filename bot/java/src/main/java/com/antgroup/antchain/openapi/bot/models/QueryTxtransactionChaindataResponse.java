// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryTxtransactionChaindataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求结果
    @NameInMap("success")
    public Boolean success;

    // 区块hash
    @NameInMap("block_hash")
    public String blockHash;

    // 父区块hash
    @NameInMap("parent_block_hash")
    public String parentBlockHash;

    // 交易时间戳
    @NameInMap("timestamp")
    public String timestamp;

    // 该交易所能消耗的最大gas
    @NameInMap("gas")
    public Long gas;

    // 交易发起方账户
    @NameInMap("from")
    public String from;

    // 交易接收方账户
    @NameInMap("to")
    public String to;

    // 交易类型
    @NameInMap("tx_type")
    public String txType;

    // 交易返回的数据
    @NameInMap("data")
    public QueryChainDataTransactionResultData data;

    public static QueryTxtransactionChaindataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTxtransactionChaindataResponse self = new QueryTxtransactionChaindataResponse();
        return TeaModel.build(map, self);
    }

    public QueryTxtransactionChaindataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTxtransactionChaindataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTxtransactionChaindataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTxtransactionChaindataResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryTxtransactionChaindataResponse setBlockHash(String blockHash) {
        this.blockHash = blockHash;
        return this;
    }
    public String getBlockHash() {
        return this.blockHash;
    }

    public QueryTxtransactionChaindataResponse setParentBlockHash(String parentBlockHash) {
        this.parentBlockHash = parentBlockHash;
        return this;
    }
    public String getParentBlockHash() {
        return this.parentBlockHash;
    }

    public QueryTxtransactionChaindataResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public QueryTxtransactionChaindataResponse setGas(Long gas) {
        this.gas = gas;
        return this;
    }
    public Long getGas() {
        return this.gas;
    }

    public QueryTxtransactionChaindataResponse setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public QueryTxtransactionChaindataResponse setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public QueryTxtransactionChaindataResponse setTxType(String txType) {
        this.txType = txType;
        return this;
    }
    public String getTxType() {
        return this.txType;
    }

    public QueryTxtransactionChaindataResponse setData(QueryChainDataTransactionResultData data) {
        this.data = data;
        return this;
    }
    public QueryChainDataTransactionResultData getData() {
        return this.data;
    }

}
