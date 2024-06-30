// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class SaveChaininsightContractinterfaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 合约 / 存证账户地址
    @NameInMap("contract")
    @Validation(required = true)
    public String contract;

    // 生效块高
    @NameInMap("ver")
    public String ver;

    // 接口类型，Function / Event
    @NameInMap("interface_type")
    @Validation(required = true)
    public String interfaceType;

    // 接口列表
    @NameInMap("contract_interfaces")
    @Validation(required = true)
    public java.util.List<ChainInsightContractInterface> contractInterfaces;

    public static SaveChaininsightContractinterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveChaininsightContractinterfaceRequest self = new SaveChaininsightContractinterfaceRequest();
        return TeaModel.build(map, self);
    }

    public SaveChaininsightContractinterfaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveChaininsightContractinterfaceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveChaininsightContractinterfaceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SaveChaininsightContractinterfaceRequest setContract(String contract) {
        this.contract = contract;
        return this;
    }
    public String getContract() {
        return this.contract;
    }

    public SaveChaininsightContractinterfaceRequest setVer(String ver) {
        this.ver = ver;
        return this;
    }
    public String getVer() {
        return this.ver;
    }

    public SaveChaininsightContractinterfaceRequest setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
        return this;
    }
    public String getInterfaceType() {
        return this.interfaceType;
    }

    public SaveChaininsightContractinterfaceRequest setContractInterfaces(java.util.List<ChainInsightContractInterface> contractInterfaces) {
        this.contractInterfaces = contractInterfaces;
        return this;
    }
    public java.util.List<ChainInsightContractInterface> getContractInterfaces() {
        return this.contractInterfaces;
    }

}
