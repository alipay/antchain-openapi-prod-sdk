// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BlockchainBrowserLatestTransaction extends TeaModel {
    // create_time
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // from
    @NameInMap("from")
    @Validation(required = true)
    public String from;

    // to
    @NameInMap("to")
    @Validation(required = true)
    public String to;

    // hash
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    // transactionV10Type
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
