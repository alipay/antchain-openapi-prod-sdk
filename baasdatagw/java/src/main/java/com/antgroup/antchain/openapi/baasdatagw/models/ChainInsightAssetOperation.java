// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightAssetOperation extends TeaModel {
    // 合约地址
    @NameInMap("contract_addr")
    @Validation(required = true)
    public String contractAddr;

    // 流转交易哈希
    @NameInMap("tx_id")
    @Validation(required = true)
    public String txId;

    // 转让执行者地址，ERC1155资产会有
    @NameInMap("operator")
    public String operator;

    // 资产转出地址
    @NameInMap("from")
    @Validation(required = true)
    public String from;

    // 资产转入地址
    @NameInMap("to")
    @Validation(required = true)
    public String to;

    // 资产ID
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 数字权证链的1155资产的分片ID
    @NameInMap("shard_id")
    public String shardId;

    // 资产转让数量
    @NameInMap("asset_value")
    @Validation(required = true)
    public Long assetValue;

    // 资产流转交易所在区块的创建时间，单位：毫秒
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // 流转交易所在块高
    @NameInMap("block_height")
    @Validation(required = true)
    public Long blockHeight;

    public static ChainInsightAssetOperation build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightAssetOperation self = new ChainInsightAssetOperation();
        return TeaModel.build(map, self);
    }

    public ChainInsightAssetOperation setContractAddr(String contractAddr) {
        this.contractAddr = contractAddr;
        return this;
    }
    public String getContractAddr() {
        return this.contractAddr;
    }

    public ChainInsightAssetOperation setTxId(String txId) {
        this.txId = txId;
        return this;
    }
    public String getTxId() {
        return this.txId;
    }

    public ChainInsightAssetOperation setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ChainInsightAssetOperation setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public ChainInsightAssetOperation setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public ChainInsightAssetOperation setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public ChainInsightAssetOperation setShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }
    public String getShardId() {
        return this.shardId;
    }

    public ChainInsightAssetOperation setAssetValue(Long assetValue) {
        this.assetValue = assetValue;
        return this;
    }
    public Long getAssetValue() {
        return this.assetValue;
    }

    public ChainInsightAssetOperation setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public ChainInsightAssetOperation setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

}
