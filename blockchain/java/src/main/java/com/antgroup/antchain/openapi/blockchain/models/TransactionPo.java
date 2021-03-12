// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class TransactionPo extends TeaModel {
    // 交易所在块hash
    @NameInMap("block_hash")
    public String blockHash;

    // 交易来源
    @NameInMap("from")
    public String from;

    // gas消耗
    @NameInMap("gas_used")
    public Long gasUsed;

    // 交易hash
    @NameInMap("hash")
    public String hash;

    // 交易所在块 块高
    @NameInMap("height")
    public Long height;

    // 交易返回结果
    @NameInMap("result")
    public String result;

    // 交易时间
    @NameInMap("timestamp")
    public Long timestamp;

    // 交易地址
    @NameInMap("to")
    public String to;

    // 交易类型 同SDK
    @NameInMap("tx_type")
    public Long txType;

    // 转账额度
    @NameInMap("value")
    public Long value;

    public static TransactionPo build(java.util.Map<String, ?> map) throws Exception {
        TransactionPo self = new TransactionPo();
        return TeaModel.build(map, self);
    }

    public TransactionPo setBlockHash(String blockHash) {
        this.blockHash = blockHash;
        return this;
    }
    public String getBlockHash() {
        return this.blockHash;
    }

    public TransactionPo setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public TransactionPo setGasUsed(Long gasUsed) {
        this.gasUsed = gasUsed;
        return this;
    }
    public Long getGasUsed() {
        return this.gasUsed;
    }

    public TransactionPo setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public TransactionPo setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public TransactionPo setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public TransactionPo setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public TransactionPo setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public TransactionPo setTxType(Long txType) {
        this.txType = txType;
        return this;
    }
    public Long getTxType() {
        return this.txType;
    }

    public TransactionPo setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

}
