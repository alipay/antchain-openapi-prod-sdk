// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryTransactionResultInfo extends TeaModel {
    // 区块hash
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("block_hash")
    public String blockHash;

    // 父区块hash
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("parent_block_hash")
    public String parentBlockHash;

    // 交易时间戳
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("timestamp")
    public String timestamp;

    // 该交易所能消耗的最大gas
    @NameInMap("gas")
    public Long gas;

    // 交易发起方账户
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("from")
    public String from;

    // 交易接收方账户
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("to")
    public String to;

    // 交易类型
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("tx_type")
    public String txType;

    // 交易返回的数据
    @NameInMap("data")
    public QueryChainDataTransactionResultData data;

    public static QueryTransactionResultInfo build(java.util.Map<String, ?> map) throws Exception {
        QueryTransactionResultInfo self = new QueryTransactionResultInfo();
        return TeaModel.build(map, self);
    }

    public QueryTransactionResultInfo setBlockHash(String blockHash) {
        this.blockHash = blockHash;
        return this;
    }
    public String getBlockHash() {
        return this.blockHash;
    }

    public QueryTransactionResultInfo setParentBlockHash(String parentBlockHash) {
        this.parentBlockHash = parentBlockHash;
        return this;
    }
    public String getParentBlockHash() {
        return this.parentBlockHash;
    }

    public QueryTransactionResultInfo setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public QueryTransactionResultInfo setGas(Long gas) {
        this.gas = gas;
        return this;
    }
    public Long getGas() {
        return this.gas;
    }

    public QueryTransactionResultInfo setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public QueryTransactionResultInfo setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public QueryTransactionResultInfo setTxType(String txType) {
        this.txType = txType;
        return this;
    }
    public String getTxType() {
        return this.txType;
    }

    public QueryTransactionResultInfo setData(QueryChainDataTransactionResultData data) {
        this.data = data;
        return this;
    }
    public QueryChainDataTransactionResultData getData() {
        return this.data;
    }

}
