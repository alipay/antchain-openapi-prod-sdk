// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryTxtransactionDeviceResponse extends TeaModel {
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
    public QueryDeviceTransactionResultData data;

    public static QueryTxtransactionDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTxtransactionDeviceResponse self = new QueryTxtransactionDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryTxtransactionDeviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTxtransactionDeviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTxtransactionDeviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTxtransactionDeviceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryTxtransactionDeviceResponse setBlockHash(String blockHash) {
        this.blockHash = blockHash;
        return this;
    }
    public String getBlockHash() {
        return this.blockHash;
    }

    public QueryTxtransactionDeviceResponse setParentBlockHash(String parentBlockHash) {
        this.parentBlockHash = parentBlockHash;
        return this;
    }
    public String getParentBlockHash() {
        return this.parentBlockHash;
    }

    public QueryTxtransactionDeviceResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public QueryTxtransactionDeviceResponse setGas(Long gas) {
        this.gas = gas;
        return this;
    }
    public Long getGas() {
        return this.gas;
    }

    public QueryTxtransactionDeviceResponse setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public QueryTxtransactionDeviceResponse setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public QueryTxtransactionDeviceResponse setTxType(String txType) {
        this.txType = txType;
        return this;
    }
    public String getTxType() {
        return this.txType;
    }

    public QueryTxtransactionDeviceResponse setData(QueryDeviceTransactionResultData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceTransactionResultData getData() {
        return this.data;
    }

}
