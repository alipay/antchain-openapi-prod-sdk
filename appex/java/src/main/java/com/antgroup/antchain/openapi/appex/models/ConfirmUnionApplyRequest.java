// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class ConfirmUnionApplyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 审核是否通过，SUCCESS,FAILURE,FREEZE
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 联盟id
    @NameInMap("union_id")
    @Validation(required = true)
    public Long unionId;

    // 区块链ID，status为SUCCESS时需要传入
    @NameInMap("chain_id")
    public String chainId;

    // COMMON:普通链
    // TEE：TEE链
    // status为SUCCESS时需要填充
    @NameInMap("chain_type")
    public String chainType;

    // TEE场景下要部署的链上合约名称，chain_type为TEE时需要传入
    @NameInMap("contract_name")
    public String contractName;

    // 合约版本，TEE场景下需要传入
    @NameInMap("contract_version")
    public String contractVersion;

    public static ConfirmUnionApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmUnionApplyRequest self = new ConfirmUnionApplyRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmUnionApplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmUnionApplyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmUnionApplyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ConfirmUnionApplyRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public ConfirmUnionApplyRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ConfirmUnionApplyRequest setChainType(String chainType) {
        this.chainType = chainType;
        return this;
    }
    public String getChainType() {
        return this.chainType;
    }

    public ConfirmUnionApplyRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public ConfirmUnionApplyRequest setContractVersion(String contractVersion) {
        this.contractVersion = contractVersion;
        return this;
    }
    public String getContractVersion() {
        return this.contractVersion;
    }

}
