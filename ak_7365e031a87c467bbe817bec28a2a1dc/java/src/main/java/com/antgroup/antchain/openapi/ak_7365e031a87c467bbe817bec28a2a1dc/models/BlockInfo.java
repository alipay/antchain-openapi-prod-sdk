// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_7365e031a87c467bbe817bec28a2a1dc.models;

import com.aliyun.tea.*;

public class BlockInfo extends TeaModel {
    // 业务数据
    @NameInMap("biz_data")
    @Validation(required = true)
    public String bizData;

    // 区块链唯一性标识
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 区块哈希
    @NameInMap("block_hash")
    @Validation(required = true)
    public String blockHash;

    // 块高
    @NameInMap("height")
    @Validation(required = true)
    public Long height;

    // 上一个区块的hash
    @NameInMap("parent_hash")
    @Validation(required = true)
    public String parentHash;

    // size
    @NameInMap("size")
    @Validation(required = true)
    public Long size;

    // 出块时间
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // 包含交易数
    @NameInMap("transaction_size")
    @Validation(required = true)
    public Long transactionSize;

    // 版本
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    public static BlockInfo build(java.util.Map<String, ?> map) throws Exception {
        BlockInfo self = new BlockInfo();
        return TeaModel.build(map, self);
    }

    public BlockInfo setBizData(String bizData) {
        this.bizData = bizData;
        return this;
    }
    public String getBizData() {
        return this.bizData;
    }

    public BlockInfo setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public BlockInfo setBlockHash(String blockHash) {
        this.blockHash = blockHash;
        return this;
    }
    public String getBlockHash() {
        return this.blockHash;
    }

    public BlockInfo setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public BlockInfo setParentHash(String parentHash) {
        this.parentHash = parentHash;
        return this;
    }
    public String getParentHash() {
        return this.parentHash;
    }

    public BlockInfo setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public BlockInfo setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public BlockInfo setTransactionSize(Long transactionSize) {
        this.transactionSize = transactionSize;
        return this;
    }
    public Long getTransactionSize() {
        return this.transactionSize;
    }

    public BlockInfo setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
