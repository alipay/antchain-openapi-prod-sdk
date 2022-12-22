// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class BlockChainTransactionInfo extends TeaModel {
    // 区块链上交易哈希
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 区块链标识
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 消耗gas数量
    @NameInMap("gas_used")
    @Validation(required = true)
    public String gasUsed;

    // 父区块哈希
    @NameInMap("parent_hash")
    @Validation(required = true)
    public String parentHash;

    // 收据根
    @NameInMap("receipt_root")
    @Validation(required = true)
    public String receiptRoot;

    // 状态树根
    @NameInMap("state_root")
    @Validation(required = true)
    public String stateRoot;

    // 交易根
    @NameInMap("transaction_root")
    @Validation(required = true)
    public String transactionRoot;

    // 版本
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    // 区块高度
    @NameInMap("number")
    @Validation(required = true)
    public Long number;

    // 成块时间
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    public static BlockChainTransactionInfo build(java.util.Map<String, ?> map) throws Exception {
        BlockChainTransactionInfo self = new BlockChainTransactionInfo();
        return TeaModel.build(map, self);
    }

    public BlockChainTransactionInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public BlockChainTransactionInfo setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public BlockChainTransactionInfo setGasUsed(String gasUsed) {
        this.gasUsed = gasUsed;
        return this;
    }
    public String getGasUsed() {
        return this.gasUsed;
    }

    public BlockChainTransactionInfo setParentHash(String parentHash) {
        this.parentHash = parentHash;
        return this;
    }
    public String getParentHash() {
        return this.parentHash;
    }

    public BlockChainTransactionInfo setReceiptRoot(String receiptRoot) {
        this.receiptRoot = receiptRoot;
        return this;
    }
    public String getReceiptRoot() {
        return this.receiptRoot;
    }

    public BlockChainTransactionInfo setStateRoot(String stateRoot) {
        this.stateRoot = stateRoot;
        return this;
    }
    public String getStateRoot() {
        return this.stateRoot;
    }

    public BlockChainTransactionInfo setTransactionRoot(String transactionRoot) {
        this.transactionRoot = transactionRoot;
        return this;
    }
    public String getTransactionRoot() {
        return this.transactionRoot;
    }

    public BlockChainTransactionInfo setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public BlockChainTransactionInfo setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public BlockChainTransactionInfo setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
