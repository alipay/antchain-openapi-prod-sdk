// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainBlockInfo extends TeaModel {
    // alias
    /**
     * <strong>example:</strong>
     * <p>alias</p>
     */
    @NameInMap("alias")
    public String alias;

    // block_hash
    /**
     * <strong>example:</strong>
     * <p>block_hash</p>
     */
    @NameInMap("block_hash")
    public String blockHash;

    // root_tx_hash
    /**
     * <strong>example:</strong>
     * <p>root_tx_hash</p>
     */
    @NameInMap("root_tx_hash")
    public String rootTxHash;

    // height
    /**
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("height")
    public Long height;

    // previous_hash
    /**
     * <strong>example:</strong>
     * <p>previous_hash</p>
     */
    @NameInMap("previous_hash")
    public String previousHash;

    // create_time
    /**
     * <strong>example:</strong>
     * <p>12312312312</p>
     */
    @NameInMap("create_time")
    public Long createTime;

    // biz_data
    /**
     * <strong>example:</strong>
     * <p>biz_data</p>
     */
    @NameInMap("biz_data")
    public String bizData;

    // transaction_size
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("transaction_size")
    public Long transactionSize;

    // version
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("version")
    public Long version;

    // size
    /**
     * <strong>example:</strong>
     * <p>size</p>
     */
    @NameInMap("size")
    public Long size;

    public static ALiYunChainBlockInfo build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainBlockInfo self = new ALiYunChainBlockInfo();
        return TeaModel.build(map, self);
    }

    public ALiYunChainBlockInfo setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public ALiYunChainBlockInfo setBlockHash(String blockHash) {
        this.blockHash = blockHash;
        return this;
    }
    public String getBlockHash() {
        return this.blockHash;
    }

    public ALiYunChainBlockInfo setRootTxHash(String rootTxHash) {
        this.rootTxHash = rootTxHash;
        return this;
    }
    public String getRootTxHash() {
        return this.rootTxHash;
    }

    public ALiYunChainBlockInfo setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public ALiYunChainBlockInfo setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
        return this;
    }
    public String getPreviousHash() {
        return this.previousHash;
    }

    public ALiYunChainBlockInfo setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ALiYunChainBlockInfo setBizData(String bizData) {
        this.bizData = bizData;
        return this;
    }
    public String getBizData() {
        return this.bizData;
    }

    public ALiYunChainBlockInfo setTransactionSize(Long transactionSize) {
        this.transactionSize = transactionSize;
        return this;
    }
    public Long getTransactionSize() {
        return this.transactionSize;
    }

    public ALiYunChainBlockInfo setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public ALiYunChainBlockInfo setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
