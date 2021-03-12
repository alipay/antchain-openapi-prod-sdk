// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BlockchainBrowserLatestBlock extends TeaModel {
    // bizid
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // block_hash
    @NameInMap("block_hash")
    @Validation(required = true)
    public String blockHash;

    // create_time
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // height
    @NameInMap("height")
    @Validation(required = true)
    public Long height;

    // previous_hash
    @NameInMap("previous_hash")
    @Validation(required = true)
    public String previousHash;

    // root_tx_hash
    @NameInMap("root_tx_hash")
    @Validation(required = true)
    public String rootTxHash;

    // size
    @NameInMap("size")
    @Validation(required = true)
    public Long size;

    // transaction_size
    @NameInMap("transaction_size")
    @Validation(required = true)
    public Long transactionSize;

    // version
    @NameInMap("version")
    @Validation(required = true)
    public Long version;

    public static BlockchainBrowserLatestBlock build(java.util.Map<String, ?> map) throws Exception {
        BlockchainBrowserLatestBlock self = new BlockchainBrowserLatestBlock();
        return TeaModel.build(map, self);
    }

    public BlockchainBrowserLatestBlock setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public BlockchainBrowserLatestBlock setBlockHash(String blockHash) {
        this.blockHash = blockHash;
        return this;
    }
    public String getBlockHash() {
        return this.blockHash;
    }

    public BlockchainBrowserLatestBlock setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public BlockchainBrowserLatestBlock setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public BlockchainBrowserLatestBlock setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
        return this;
    }
    public String getPreviousHash() {
        return this.previousHash;
    }

    public BlockchainBrowserLatestBlock setRootTxHash(String rootTxHash) {
        this.rootTxHash = rootTxHash;
        return this;
    }
    public String getRootTxHash() {
        return this.rootTxHash;
    }

    public BlockchainBrowserLatestBlock setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public BlockchainBrowserLatestBlock setTransactionSize(Long transactionSize) {
        this.transactionSize = transactionSize;
        return this;
    }
    public Long getTransactionSize() {
        return this.transactionSize;
    }

    public BlockchainBrowserLatestBlock setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}
