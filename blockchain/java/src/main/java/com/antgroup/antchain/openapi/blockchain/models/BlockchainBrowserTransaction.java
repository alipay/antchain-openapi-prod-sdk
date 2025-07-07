// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BlockchainBrowserTransaction extends TeaModel {
    // bizid
    /**
     * <strong>example:</strong>
     * <p>27ce375122ef483691488395808e009e</p>
     */
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // block_hash
    /**
     * <strong>example:</strong>
     * <p>4a6306e001a484c5c1d198668008b4876b991c5369a18a8431e9e7b37b021694</p>
     */
    @NameInMap("block_hash")
    @Validation(required = true)
    public String blockHash;

    // category
    /**
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("category")
    @Validation(required = true)
    public Long category;

    // create_time
    /**
     * <strong>example:</strong>
     * <p>1604565299516</p>
     */
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // from
    /**
     * <strong>example:</strong>
     * <p>eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612</p>
     */
    @NameInMap("from")
    @Validation(required = true)
    public String from;

    // gas_used
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("gas_used")
    @Validation(required = true)
    public Long gasUsed;

    // hash
    /**
     * <strong>example:</strong>
     * <p>65a0a7aa9b6f739faddd8e993eadecf85340cdeda6e20417e013e052f30afd3c</p>
     */
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    // height
    /**
     * <strong>example:</strong>
     * <p>6814087</p>
     */
    @NameInMap("height")
    @Validation(required = true)
    public Long height;

    // reference_count
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("reference_count")
    @Validation(required = true)
    public Long referenceCount;

    // to
    /**
     * <strong>example:</strong>
     * <p>eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612</p>
     */
    @NameInMap("to")
    @Validation(required = true)
    public String to;

    // transaction_type
    /**
     * <strong>example:</strong>
     * <p>TX_DEPOSIT_DATA</p>
     */
    @NameInMap("transaction_type")
    @Validation(required = true)
    public String transactionType;

    // block_version
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("block_version")
    @Validation(required = true)
    public Long blockVersion;

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
     * <p>true, false</p>
     */
    @NameInMap("blockchain_status")
    @Validation(required = true)
    public Boolean blockchainStatus;

    // content
    /**
     * <strong>example:</strong>
     * <p>eyJ0cmFuc2FjdGlvbl9pZCI6ImRjM2YyZTYz</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // hash_status
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("hash_status")
    @Validation(required = true)
    public Boolean hashStatus;

    // type
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // transaction_contract
    /**
     * <strong>example:</strong>
     * <p>transaction_contract</p>
     */
    @NameInMap("transaction_contract")
    @Validation(required = true)
    public BlockchainBrowserTransactionContract transactionContract;

    public static BlockchainBrowserTransaction build(java.util.Map<String, ?> map) throws Exception {
        BlockchainBrowserTransaction self = new BlockchainBrowserTransaction();
        return TeaModel.build(map, self);
    }

    public BlockchainBrowserTransaction setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public BlockchainBrowserTransaction setBlockHash(String blockHash) {
        this.blockHash = blockHash;
        return this;
    }
    public String getBlockHash() {
        return this.blockHash;
    }

    public BlockchainBrowserTransaction setCategory(Long category) {
        this.category = category;
        return this;
    }
    public Long getCategory() {
        return this.category;
    }

    public BlockchainBrowserTransaction setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public BlockchainBrowserTransaction setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public BlockchainBrowserTransaction setGasUsed(Long gasUsed) {
        this.gasUsed = gasUsed;
        return this;
    }
    public Long getGasUsed() {
        return this.gasUsed;
    }

    public BlockchainBrowserTransaction setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public BlockchainBrowserTransaction setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public BlockchainBrowserTransaction setReferenceCount(Long referenceCount) {
        this.referenceCount = referenceCount;
        return this;
    }
    public Long getReferenceCount() {
        return this.referenceCount;
    }

    public BlockchainBrowserTransaction setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public BlockchainBrowserTransaction setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    public String getTransactionType() {
        return this.transactionType;
    }

    public BlockchainBrowserTransaction setBlockVersion(Long blockVersion) {
        this.blockVersion = blockVersion;
        return this;
    }
    public Long getBlockVersion() {
        return this.blockVersion;
    }

    public BlockchainBrowserTransaction setBlockchainName(String blockchainName) {
        this.blockchainName = blockchainName;
        return this;
    }
    public String getBlockchainName() {
        return this.blockchainName;
    }

    public BlockchainBrowserTransaction setBlockchainStatus(Boolean blockchainStatus) {
        this.blockchainStatus = blockchainStatus;
        return this;
    }
    public Boolean getBlockchainStatus() {
        return this.blockchainStatus;
    }

    public BlockchainBrowserTransaction setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public BlockchainBrowserTransaction setHashStatus(Boolean hashStatus) {
        this.hashStatus = hashStatus;
        return this;
    }
    public Boolean getHashStatus() {
        return this.hashStatus;
    }

    public BlockchainBrowserTransaction setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public BlockchainBrowserTransaction setTransactionContract(BlockchainBrowserTransactionContract transactionContract) {
        this.transactionContract = transactionContract;
        return this;
    }
    public BlockchainBrowserTransactionContract getTransactionContract() {
        return this.transactionContract;
    }

}
