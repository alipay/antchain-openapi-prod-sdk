// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainBlock extends TeaModel {
    // ant_chain_id
    @NameInMap("ant_chain_id")
    public String antChainId;

    // block_hash
    @NameInMap("block_hash")
    public String blockHash;

    // create_time
    @NameInMap("create_time")
    public Long createTime;

    // height
    @NameInMap("height")
    public Long height;

    // previous_hash
    @NameInMap("previous_hash")
    public String previousHash;

    // root_tx_hash
    @NameInMap("root_tx_hash")
    public String rootTxHash;

    // transaction_size
    @NameInMap("transaction_size")
    public Long transactionSize;

    // trans_summary_list
    @NameInMap("trans_summary_list")
    public java.util.List<ALiYunTransactionSummary> transSummaryList;

    // Version
    @NameInMap("version")
    public Long version;

    public static ALiYunChainBlock build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainBlock self = new ALiYunChainBlock();
        return TeaModel.build(map, self);
    }

    public ALiYunChainBlock setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ALiYunChainBlock setBlockHash(String blockHash) {
        this.blockHash = blockHash;
        return this;
    }
    public String getBlockHash() {
        return this.blockHash;
    }

    public ALiYunChainBlock setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ALiYunChainBlock setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public ALiYunChainBlock setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
        return this;
    }
    public String getPreviousHash() {
        return this.previousHash;
    }

    public ALiYunChainBlock setRootTxHash(String rootTxHash) {
        this.rootTxHash = rootTxHash;
        return this;
    }
    public String getRootTxHash() {
        return this.rootTxHash;
    }

    public ALiYunChainBlock setTransactionSize(Long transactionSize) {
        this.transactionSize = transactionSize;
        return this;
    }
    public Long getTransactionSize() {
        return this.transactionSize;
    }

    public ALiYunChainBlock setTransSummaryList(java.util.List<ALiYunTransactionSummary> transSummaryList) {
        this.transSummaryList = transSummaryList;
        return this;
    }
    public java.util.List<ALiYunTransactionSummary> getTransSummaryList() {
        return this.transSummaryList;
    }

    public ALiYunChainBlock setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}
