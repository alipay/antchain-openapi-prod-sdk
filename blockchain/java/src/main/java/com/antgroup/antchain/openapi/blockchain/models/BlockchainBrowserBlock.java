// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BlockchainBrowserBlock extends TeaModel {
    // bizid
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // blockchain_name
    @NameInMap("blockchain_name")
    @Validation(required = true)
    public String blockchainName;

    // blockchain_status
    @NameInMap("blockchain_status")
    @Validation(required = true)
    public Boolean blockchainStatus;

    // block_hash
    @NameInMap("block_hash")
    @Validation(required = true)
    public String blockHash;

    // create_time
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // hash_status
    @NameInMap("hash_status")
    @Validation(required = true)
    public Boolean hashStatus;

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

    // transaction_list
    @NameInMap("transaction_list")
    @Validation(required = true)
    public java.util.List<BlockchainBrowserTransaction> transactionList;

    // transaction_size
    @NameInMap("transaction_size")
    @Validation(required = true)
    public Long transactionSize;

    public static BlockchainBrowserBlock build(java.util.Map<String, ?> map) throws Exception {
        BlockchainBrowserBlock self = new BlockchainBrowserBlock();
        return TeaModel.build(map, self);
    }

    public BlockchainBrowserBlock setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public BlockchainBrowserBlock setBlockchainName(String blockchainName) {
        this.blockchainName = blockchainName;
        return this;
    }
    public String getBlockchainName() {
        return this.blockchainName;
    }

    public BlockchainBrowserBlock setBlockchainStatus(Boolean blockchainStatus) {
        this.blockchainStatus = blockchainStatus;
        return this;
    }
    public Boolean getBlockchainStatus() {
        return this.blockchainStatus;
    }

    public BlockchainBrowserBlock setBlockHash(String blockHash) {
        this.blockHash = blockHash;
        return this;
    }
    public String getBlockHash() {
        return this.blockHash;
    }

    public BlockchainBrowserBlock setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public BlockchainBrowserBlock setHashStatus(Boolean hashStatus) {
        this.hashStatus = hashStatus;
        return this;
    }
    public Boolean getHashStatus() {
        return this.hashStatus;
    }

    public BlockchainBrowserBlock setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public BlockchainBrowserBlock setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
        return this;
    }
    public String getPreviousHash() {
        return this.previousHash;
    }

    public BlockchainBrowserBlock setRootTxHash(String rootTxHash) {
        this.rootTxHash = rootTxHash;
        return this;
    }
    public String getRootTxHash() {
        return this.rootTxHash;
    }

    public BlockchainBrowserBlock setTransactionList(java.util.List<BlockchainBrowserTransaction> transactionList) {
        this.transactionList = transactionList;
        return this;
    }
    public java.util.List<BlockchainBrowserTransaction> getTransactionList() {
        return this.transactionList;
    }

    public BlockchainBrowserBlock setTransactionSize(Long transactionSize) {
        this.transactionSize = transactionSize;
        return this;
    }
    public Long getTransactionSize() {
        return this.transactionSize;
    }

}
