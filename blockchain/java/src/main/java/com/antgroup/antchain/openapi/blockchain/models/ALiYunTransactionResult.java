// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunTransactionResult extends TeaModel {
    // block_hash
    @NameInMap("block_hash")
    public String blockHash;

    // block_height
    @NameInMap("block_height")
    public Long blockHeight;

    // block_version
    @NameInMap("block_version")
    public String blockVersion;

    // create_time
    @NameInMap("create_time")
    public Long createTime;

    // hash
    @NameInMap("hash")
    public String hash;

    // Transaction
    @NameInMap("transaction")
    public ALiYunTransaction transaction;

    public static ALiYunTransactionResult build(java.util.Map<String, ?> map) throws Exception {
        ALiYunTransactionResult self = new ALiYunTransactionResult();
        return TeaModel.build(map, self);
    }

    public ALiYunTransactionResult setBlockHash(String blockHash) {
        this.blockHash = blockHash;
        return this;
    }
    public String getBlockHash() {
        return this.blockHash;
    }

    public ALiYunTransactionResult setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public ALiYunTransactionResult setBlockVersion(String blockVersion) {
        this.blockVersion = blockVersion;
        return this;
    }
    public String getBlockVersion() {
        return this.blockVersion;
    }

    public ALiYunTransactionResult setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ALiYunTransactionResult setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public ALiYunTransactionResult setTransaction(ALiYunTransaction transaction) {
        this.transaction = transaction;
        return this;
    }
    public ALiYunTransaction getTransaction() {
        return this.transaction;
    }

}
