// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunTransactionSummary extends TeaModel {
    // alias
    @NameInMap("alias")
    public String alias;

    // hash
    @NameInMap("hash")
    public String hash;

    // trans_type_v6
    @NameInMap("trans_type_v6")
    public String transTypeV6;

    // trans_type_v10
    @NameInMap("trans_type_v10")
    public String transTypeV10;

    // category
    @NameInMap("category")
    public Long category;

    // height
    @NameInMap("height")
    public Long height;

    // block_hash
    @NameInMap("block_hash")
    public String blockHash;

    // create_time
    @NameInMap("create_time")
    public Long createTime;

    // reference_count
    @NameInMap("reference_count")
    public Long referenceCount;

    // from
    @NameInMap("from")
    public String from;

    // to
    @NameInMap("to")
    public String to;

    // gas_used
    @NameInMap("gas_used")
    public Long gasUsed;

    public static ALiYunTransactionSummary build(java.util.Map<String, ?> map) throws Exception {
        ALiYunTransactionSummary self = new ALiYunTransactionSummary();
        return TeaModel.build(map, self);
    }

    public ALiYunTransactionSummary setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public ALiYunTransactionSummary setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public ALiYunTransactionSummary setTransTypeV6(String transTypeV6) {
        this.transTypeV6 = transTypeV6;
        return this;
    }
    public String getTransTypeV6() {
        return this.transTypeV6;
    }

    public ALiYunTransactionSummary setTransTypeV10(String transTypeV10) {
        this.transTypeV10 = transTypeV10;
        return this;
    }
    public String getTransTypeV10() {
        return this.transTypeV10;
    }

    public ALiYunTransactionSummary setCategory(Long category) {
        this.category = category;
        return this;
    }
    public Long getCategory() {
        return this.category;
    }

    public ALiYunTransactionSummary setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public ALiYunTransactionSummary setBlockHash(String blockHash) {
        this.blockHash = blockHash;
        return this;
    }
    public String getBlockHash() {
        return this.blockHash;
    }

    public ALiYunTransactionSummary setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ALiYunTransactionSummary setReferenceCount(Long referenceCount) {
        this.referenceCount = referenceCount;
        return this;
    }
    public Long getReferenceCount() {
        return this.referenceCount;
    }

    public ALiYunTransactionSummary setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public ALiYunTransactionSummary setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public ALiYunTransactionSummary setGasUsed(Long gasUsed) {
        this.gasUsed = gasUsed;
        return this;
    }
    public Long getGasUsed() {
        return this.gasUsed;
    }

}
