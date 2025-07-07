// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BlockchainBrowserLatestTransaction extends TeaModel {
    // create_time
    /**
     * <strong>example:</strong>
     * <p>createTime</p>
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

    // to
    /**
     * <strong>example:</strong>
     * <p>e4386406265f8a0f7d3a84efec3afa3ea12d2f9a3c21e2928a7b4d6a4e70ba68</p>
     */
    @NameInMap("to")
    @Validation(required = true)
    public String to;

    // hash
    /**
     * <strong>example:</strong>
     * <p>eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612</p>
     */
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    // transactionV10Type
    /**
     * <strong>example:</strong>
     * <p>TX_DEPOSIT_DATA</p>
     */
    @NameInMap("transaction_type")
    @Validation(required = true)
    public String transactionType;

    public static BlockchainBrowserLatestTransaction build(java.util.Map<String, ?> map) throws Exception {
        BlockchainBrowserLatestTransaction self = new BlockchainBrowserLatestTransaction();
        return TeaModel.build(map, self);
    }

    public BlockchainBrowserLatestTransaction setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public BlockchainBrowserLatestTransaction setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public BlockchainBrowserLatestTransaction setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public BlockchainBrowserLatestTransaction setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public BlockchainBrowserLatestTransaction setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    public String getTransactionType() {
        return this.transactionType;
    }

}
