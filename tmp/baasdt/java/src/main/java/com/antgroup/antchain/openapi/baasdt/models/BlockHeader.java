// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BlockHeader extends TeaModel {
    // gas总消耗
    @NameInMap("gas_used")
    @Validation(required = true)
    public Long gasUsed;

    // 十六进制区块哈希值
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    // log bloom
    @NameInMap("log_bloom")
    @Validation(required = true)
    public String logBloom;

    // 区块高度
    @NameInMap("number")
    @Validation(required = true)
    public Long number;

    // 十六进制区块父hash
    @NameInMap("parent_hash")
    @Validation(required = true)
    public String parentHash;

    // 交易单据树根
    @NameInMap("receipt_root")
    @Validation(required = true)
    public String receiptRoot;

    // 状态树根
    @NameInMap("state_root")
    @Validation(required = true)
    public String stateRoot;

    // 区块时间戳
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // 十六进制交易merkle树根
    @NameInMap("transaction_root")
    @Validation(required = true)
    public String transactionRoot;

    // 区块版本
    @NameInMap("version")
    @Validation(required = true)
    public Long version;

    public static BlockHeader build(java.util.Map<String, ?> map) throws Exception {
        BlockHeader self = new BlockHeader();
        return TeaModel.build(map, self);
    }

    public BlockHeader setGasUsed(Long gasUsed) {
        this.gasUsed = gasUsed;
        return this;
    }
    public Long getGasUsed() {
        return this.gasUsed;
    }

    public BlockHeader setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public BlockHeader setLogBloom(String logBloom) {
        this.logBloom = logBloom;
        return this;
    }
    public String getLogBloom() {
        return this.logBloom;
    }

    public BlockHeader setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public BlockHeader setParentHash(String parentHash) {
        this.parentHash = parentHash;
        return this;
    }
    public String getParentHash() {
        return this.parentHash;
    }

    public BlockHeader setReceiptRoot(String receiptRoot) {
        this.receiptRoot = receiptRoot;
        return this;
    }
    public String getReceiptRoot() {
        return this.receiptRoot;
    }

    public BlockHeader setStateRoot(String stateRoot) {
        this.stateRoot = stateRoot;
        return this;
    }
    public String getStateRoot() {
        return this.stateRoot;
    }

    public BlockHeader setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public BlockHeader setTransactionRoot(String transactionRoot) {
        this.transactionRoot = transactionRoot;
        return this;
    }
    public String getTransactionRoot() {
        return this.transactionRoot;
    }

    public BlockHeader setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}
