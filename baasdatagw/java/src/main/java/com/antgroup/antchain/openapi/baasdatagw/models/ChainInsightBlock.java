// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightBlock extends TeaModel {
    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 链名称
    @NameInMap("biz_id_name")
    public String bizIdName;

    // 链ID
    @NameInMap("chain")
    @Validation(required = true)
    public String chain;

    // 所在子网
    @NameInMap("network")
    @Validation(required = true)
    public String network;

    // 区块高度
    @NameInMap("number")
    @Validation(required = true)
    public Long number;

    // 区块Hash
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    // 区块创建时间戳
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // 上一个区块Hash
    @NameInMap("previous_hash")
    @Validation(required = true)
    public String previousHash;

    // 区块内交易列表
    @NameInMap("transactions")
    @Validation(required = true)
    public java.util.List<ChainInsightTransaction> transactions;

    // 区块的json序列化string
    @NameInMap("data")
    public String data;

    public static ChainInsightBlock build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightBlock self = new ChainInsightBlock();
        return TeaModel.build(map, self);
    }

    public ChainInsightBlock setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ChainInsightBlock setBizIdName(String bizIdName) {
        this.bizIdName = bizIdName;
        return this;
    }
    public String getBizIdName() {
        return this.bizIdName;
    }

    public ChainInsightBlock setChain(String chain) {
        this.chain = chain;
        return this;
    }
    public String getChain() {
        return this.chain;
    }

    public ChainInsightBlock setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public ChainInsightBlock setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public ChainInsightBlock setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public ChainInsightBlock setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ChainInsightBlock setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
        return this;
    }
    public String getPreviousHash() {
        return this.previousHash;
    }

    public ChainInsightBlock setTransactions(java.util.List<ChainInsightTransaction> transactions) {
        this.transactions = transactions;
        return this;
    }
    public java.util.List<ChainInsightTransaction> getTransactions() {
        return this.transactions;
    }

    public ChainInsightBlock setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
