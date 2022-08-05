// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class MatchDidAssetsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码(YYX)
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    // 支付宝uid
    @NameInMap("uid")
    @Validation(required = true)
    public String uid;

    // 分布式id ，双向check
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 链id
    @NameInMap("chain_id")
    public String chainId;

    // 链账户
    @NameInMap("chain_account")
    @Validation(required = true)
    public String chainAccount;

    // 链资产地址 HASH
    @NameInMap("contract")
    @Validation(required = true)
    public String contract;

    // 合约类型 0-WASM
    @NameInMap("contract_type")
    @Validation(required = true)
    public Long contractType;

    // 资产类型
    @NameInMap("assert_type")
    @Validation(required = true)
    public String assertType;

    // 上次资产发生变更的区块高度
    @NameInMap("block_number")
    public String blockNumber;

    // 上次资产发生变更的序号
    @NameInMap("tx_index")
    @Validation(required = true)
    public String txIndex;

    // 上次资产发生变更的交易序列号
    @NameInMap("long_index")
    @Validation(required = true)
    public String longIndex;

    // 资产名称
    @NameInMap("assert_name")
    @Validation(required = true)
    public String assertName;

    // 资产信息（资产描述信息）
    @NameInMap("assert_data")
    @Validation(required = true)
    public String assertData;

    // 资产ID
    @NameInMap("assert_id")
    @Validation(required = true)
    public String assertId;

    public static MatchDidAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        MatchDidAssetsRequest self = new MatchDidAssetsRequest();
        return TeaModel.build(map, self);
    }

    public MatchDidAssetsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public MatchDidAssetsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public MatchDidAssetsRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public MatchDidAssetsRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public MatchDidAssetsRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public MatchDidAssetsRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public MatchDidAssetsRequest setChainAccount(String chainAccount) {
        this.chainAccount = chainAccount;
        return this;
    }
    public String getChainAccount() {
        return this.chainAccount;
    }

    public MatchDidAssetsRequest setContract(String contract) {
        this.contract = contract;
        return this;
    }
    public String getContract() {
        return this.contract;
    }

    public MatchDidAssetsRequest setContractType(Long contractType) {
        this.contractType = contractType;
        return this;
    }
    public Long getContractType() {
        return this.contractType;
    }

    public MatchDidAssetsRequest setAssertType(String assertType) {
        this.assertType = assertType;
        return this;
    }
    public String getAssertType() {
        return this.assertType;
    }

    public MatchDidAssetsRequest setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public String getBlockNumber() {
        return this.blockNumber;
    }

    public MatchDidAssetsRequest setTxIndex(String txIndex) {
        this.txIndex = txIndex;
        return this;
    }
    public String getTxIndex() {
        return this.txIndex;
    }

    public MatchDidAssetsRequest setLongIndex(String longIndex) {
        this.longIndex = longIndex;
        return this;
    }
    public String getLongIndex() {
        return this.longIndex;
    }

    public MatchDidAssetsRequest setAssertName(String assertName) {
        this.assertName = assertName;
        return this;
    }
    public String getAssertName() {
        return this.assertName;
    }

    public MatchDidAssetsRequest setAssertData(String assertData) {
        this.assertData = assertData;
        return this;
    }
    public String getAssertData() {
        return this.assertData;
    }

    public MatchDidAssetsRequest setAssertId(String assertId) {
        this.assertId = assertId;
        return this;
    }
    public String getAssertId() {
        return this.assertId;
    }

}
