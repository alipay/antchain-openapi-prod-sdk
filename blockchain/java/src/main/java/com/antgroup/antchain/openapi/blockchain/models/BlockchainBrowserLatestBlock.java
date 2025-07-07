// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BlockchainBrowserLatestBlock extends TeaModel {
    // bizid
    /**
     * <strong>example:</strong>
     * <p>bizid</p>
     */
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // block_hash
    /**
     * <strong>example:</strong>
     * <p>block_hash</p>
     */
    @NameInMap("block_hash")
    @Validation(required = true)
    public String blockHash;

    // create_time
    /**
     * <strong>example:</strong>
     * <p>1604564398000</p>
     */
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // height
    /**
     * <strong>example:</strong>
     * <p>6812497</p>
     */
    @NameInMap("height")
    @Validation(required = true)
    public Long height;

    // previous_hash
    /**
     * <strong>example:</strong>
     * <p>f6d51d362abc1b31e42dbd88d5ce0660cb96b8d0c0a4293cd29ffa042f61c784</p>
     */
    @NameInMap("previous_hash")
    @Validation(required = true)
    public String previousHash;

    // root_tx_hash
    /**
     * <strong>example:</strong>
     * <p>da9a42027ab141c8396b7fc78d74c94264da71f6361ac468385bed3fbc5408b4</p>
     */
    @NameInMap("root_tx_hash")
    @Validation(required = true)
    public String rootTxHash;

    // size
    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("size")
    @Validation(required = true)
    public Long size;

    // transaction_size
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("transaction_size")
    @Validation(required = true)
    public Long transactionSize;

    // version
    /**
     * <strong>example:</strong>
     * <p>258</p>
     */
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
