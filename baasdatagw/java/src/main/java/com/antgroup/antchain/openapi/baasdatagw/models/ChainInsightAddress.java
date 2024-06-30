// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightAddress extends TeaModel {
    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 链名称
    @NameInMap("biz_id_name")
    public String bizIdName;

    // 账户或合约地址
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 创建者租户ID
    @NameInMap("creator_organization")
    public String creatorOrganization;

    // 创建者地址
    @NameInMap("creator")
    @Validation(required = true)
    public String creator;

    // 创建时间
    @NameInMap("craete_time")
    @Validation(required = true)
    public Long craeteTime;

    // 创建交易ID
    @NameInMap("create_tx_id")
    @Validation(required = true)
    public String createTxId;

    // 修改时间戳
    @NameInMap("modify_time")
    @Validation(required = true)
    public Long modifyTime;

    // 最近修改账户的交易ID
    @NameInMap("modify_tx_id")
    @Validation(required = true)
    public String modifyTxId;

    // 地址类型，枚举：Account，Contract
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 地址状态，枚举：NORMAL，FREEZE，RECOVERING，UNKNOWN
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 地址余额
    @NameInMap("balance")
    @Validation(required = true)
    public Long balance;

    // 认证Map
    @NameInMap("auth_map")
    @Validation(required = true)
    public java.util.List<MapEntry> authMap;

    // 地址恢复公钥
    @NameInMap("recover_key")
    @Validation(required = true)
    public String recoverKey;

    // 合约类型，仅当地址为合约时返回：WASM、SOLIDITY
    @NameInMap("contract_type")
    public String contractType;

    // 资产合约相关信息
    @NameInMap("asset_contract_info")
    public ChainInsightAssetContractInfo assetContractInfo;

    // 创建时间
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    public static ChainInsightAddress build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightAddress self = new ChainInsightAddress();
        return TeaModel.build(map, self);
    }

    public ChainInsightAddress setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ChainInsightAddress setBizIdName(String bizIdName) {
        this.bizIdName = bizIdName;
        return this;
    }
    public String getBizIdName() {
        return this.bizIdName;
    }

    public ChainInsightAddress setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ChainInsightAddress setCreatorOrganization(String creatorOrganization) {
        this.creatorOrganization = creatorOrganization;
        return this;
    }
    public String getCreatorOrganization() {
        return this.creatorOrganization;
    }

    public ChainInsightAddress setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ChainInsightAddress setCraeteTime(Long craeteTime) {
        this.craeteTime = craeteTime;
        return this;
    }
    public Long getCraeteTime() {
        return this.craeteTime;
    }

    public ChainInsightAddress setCreateTxId(String createTxId) {
        this.createTxId = createTxId;
        return this;
    }
    public String getCreateTxId() {
        return this.createTxId;
    }

    public ChainInsightAddress setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public ChainInsightAddress setModifyTxId(String modifyTxId) {
        this.modifyTxId = modifyTxId;
        return this;
    }
    public String getModifyTxId() {
        return this.modifyTxId;
    }

    public ChainInsightAddress setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ChainInsightAddress setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ChainInsightAddress setBalance(Long balance) {
        this.balance = balance;
        return this;
    }
    public Long getBalance() {
        return this.balance;
    }

    public ChainInsightAddress setAuthMap(java.util.List<MapEntry> authMap) {
        this.authMap = authMap;
        return this;
    }
    public java.util.List<MapEntry> getAuthMap() {
        return this.authMap;
    }

    public ChainInsightAddress setRecoverKey(String recoverKey) {
        this.recoverKey = recoverKey;
        return this;
    }
    public String getRecoverKey() {
        return this.recoverKey;
    }

    public ChainInsightAddress setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }
    public String getContractType() {
        return this.contractType;
    }

    public ChainInsightAddress setAssetContractInfo(ChainInsightAssetContractInfo assetContractInfo) {
        this.assetContractInfo = assetContractInfo;
        return this;
    }
    public ChainInsightAssetContractInfo getAssetContractInfo() {
        return this.assetContractInfo;
    }

    public ChainInsightAddress setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

}
