// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BlockchainBrowserBlock extends TeaModel {
    // bizid
    /**
     * <strong>example:</strong>
     * <p>27ce375122ef483691488395808e009e</p>
     */
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // blockchain_name
    /**
     * <strong>example:</strong>
     * <p>BAASQATEST</p>
     */
    @NameInMap("blockchain_name")
    @Validation(required = true)
    public String blockchainName;

    // blockchain_status
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("blockchain_status")
    @Validation(required = true)
    public Boolean blockchainStatus;

    // block_hash
    /**
     * <strong>example:</strong>
     * <p>4a6306e001a484c5c1d198668008b4876b991c5369a18a8431e9e7b37b021694</p>
     */
    @NameInMap("block_hash")
    @Validation(required = true)
    public String blockHash;

    // create_time
    /**
     * <strong>example:</strong>
     * <p>1604565300002</p>
     */
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // hash_status
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("hash_status")
    @Validation(required = true)
    public Boolean hashStatus;

    // height
    /**
     * <strong>example:</strong>
     * <p>6814087</p>
     */
    @NameInMap("height")
    @Validation(required = true)
    public Long height;

    // previous_hash
    /**
     * <strong>example:</strong>
     * <p>e70b3768125ac3543ba0c823fa56500eb4516c165cb7fd1489961fac961ee5f1</p>
     */
    @NameInMap("previous_hash")
    @Validation(required = true)
    public String previousHash;

    // root_tx_hash
    /**
     * <strong>example:</strong>
     * <p>711f000e6604bf49bc4434b8ecd57ac98c0519e817d8f75bf6eef3caea7a0d79</p>
     */
    @NameInMap("root_tx_hash")
    @Validation(required = true)
    public String rootTxHash;

    // transaction_list
    /**
     * <strong>example:</strong>
     * <p>transaction_list</p>
     */
    @NameInMap("transaction_list")
    @Validation(required = true)
    public java.util.List<BlockchainBrowserTransaction> transactionList;

    // transaction_size
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
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
