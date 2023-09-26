// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightAssetOwner extends TeaModel {
    // 持有者地址
    @NameInMap("owner")
    @Validation(required = true)
    public String owner;

    // 合约地址
    @NameInMap("contract_addr")
    @Validation(required = true)
    public String contractAddr;

    // 资产ID
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 数字权证链1155合约特有的分片ID
    @NameInMap("shard_id")
    public String shardId;

    // 资产类型：ERC721 / ERC1155
    @NameInMap("erc_type")
    @Validation(required = true)
    public String ercType;

    // 数字资产余额
    @NameInMap("balance")
    @Validation(required = true)
    public Long balance;

    // 该账户对该资产最近一次转让交易的哈希
    @NameInMap("update_tx_hash")
    @Validation(required = true)
    public String updateTxHash;

    // 该账户对该资产最近一次转让交易所在区块高度
    @NameInMap("update_block_height")
    @Validation(required = true)
    public Long updateBlockHeight;

    // 该账户对该资产最近一次转让交易所在区块的创建时间，单位：毫秒
    @NameInMap("update_block_time")
    @Validation(required = true)
    public Long updateBlockTime;

    public static ChainInsightAssetOwner build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightAssetOwner self = new ChainInsightAssetOwner();
        return TeaModel.build(map, self);
    }

    public ChainInsightAssetOwner setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ChainInsightAssetOwner setContractAddr(String contractAddr) {
        this.contractAddr = contractAddr;
        return this;
    }
    public String getContractAddr() {
        return this.contractAddr;
    }

    public ChainInsightAssetOwner setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public ChainInsightAssetOwner setShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }
    public String getShardId() {
        return this.shardId;
    }

    public ChainInsightAssetOwner setErcType(String ercType) {
        this.ercType = ercType;
        return this;
    }
    public String getErcType() {
        return this.ercType;
    }

    public ChainInsightAssetOwner setBalance(Long balance) {
        this.balance = balance;
        return this;
    }
    public Long getBalance() {
        return this.balance;
    }

    public ChainInsightAssetOwner setUpdateTxHash(String updateTxHash) {
        this.updateTxHash = updateTxHash;
        return this;
    }
    public String getUpdateTxHash() {
        return this.updateTxHash;
    }

    public ChainInsightAssetOwner setUpdateBlockHeight(Long updateBlockHeight) {
        this.updateBlockHeight = updateBlockHeight;
        return this;
    }
    public Long getUpdateBlockHeight() {
        return this.updateBlockHeight;
    }

    public ChainInsightAssetOwner setUpdateBlockTime(Long updateBlockTime) {
        this.updateBlockTime = updateBlockTime;
        return this;
    }
    public Long getUpdateBlockTime() {
        return this.updateBlockTime;
    }

}
