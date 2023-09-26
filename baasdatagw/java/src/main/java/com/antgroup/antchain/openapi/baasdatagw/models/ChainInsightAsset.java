// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightAsset extends TeaModel {
    // 链ID
    @NameInMap("biz_id")
    public String bizId;

    // 链名称
    @NameInMap("biz_id_name")
    public String bizIdName;

    // 资产合约地址
    @NameInMap("contract_addr")
    @Validation(required = true)
    public String contractAddr;

    // 资产ID
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 数字权证链上的1155资产分片ID
    @NameInMap("shard_id")
    public String shardId;

    // 资产类型：ERC721 / ERC1155
    @NameInMap("erc_type")
    @Validation(required = true)
    public String ercType;

    // 创建时间，取值为创建时交易所在区块创建的时间，单位：毫秒
    @NameInMap("create_time")
    public Long createTime;

    // 持有者数量
    @NameInMap("owner_count")
    public Long ownerCount;

    // 资产元信息
    @NameInMap("meta_data")
    public String metaData;

    // 资产元信息链接
    @NameInMap("uri")
    public String uri;

    // 账户名下该资产的余额 / 合约下该资产的总供应量
    @NameInMap("balance")
    public Long balance;

    // 该资产最近一笔交易的哈希
    @NameInMap("latest_tx_hash")
    @Validation(required = true)
    public String latestTxHash;

    // 该资产最近一笔交易所在区块的创建时间
    @NameInMap("latest_tx_time")
    @Validation(required = true)
    public Long latestTxTime;

    public static ChainInsightAsset build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightAsset self = new ChainInsightAsset();
        return TeaModel.build(map, self);
    }

    public ChainInsightAsset setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ChainInsightAsset setBizIdName(String bizIdName) {
        this.bizIdName = bizIdName;
        return this;
    }
    public String getBizIdName() {
        return this.bizIdName;
    }

    public ChainInsightAsset setContractAddr(String contractAddr) {
        this.contractAddr = contractAddr;
        return this;
    }
    public String getContractAddr() {
        return this.contractAddr;
    }

    public ChainInsightAsset setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public ChainInsightAsset setShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }
    public String getShardId() {
        return this.shardId;
    }

    public ChainInsightAsset setErcType(String ercType) {
        this.ercType = ercType;
        return this;
    }
    public String getErcType() {
        return this.ercType;
    }

    public ChainInsightAsset setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ChainInsightAsset setOwnerCount(Long ownerCount) {
        this.ownerCount = ownerCount;
        return this;
    }
    public Long getOwnerCount() {
        return this.ownerCount;
    }

    public ChainInsightAsset setMetaData(String metaData) {
        this.metaData = metaData;
        return this;
    }
    public String getMetaData() {
        return this.metaData;
    }

    public ChainInsightAsset setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public ChainInsightAsset setBalance(Long balance) {
        this.balance = balance;
        return this;
    }
    public Long getBalance() {
        return this.balance;
    }

    public ChainInsightAsset setLatestTxHash(String latestTxHash) {
        this.latestTxHash = latestTxHash;
        return this;
    }
    public String getLatestTxHash() {
        return this.latestTxHash;
    }

    public ChainInsightAsset setLatestTxTime(Long latestTxTime) {
        this.latestTxTime = latestTxTime;
        return this;
    }
    public Long getLatestTxTime() {
        return this.latestTxTime;
    }

}
