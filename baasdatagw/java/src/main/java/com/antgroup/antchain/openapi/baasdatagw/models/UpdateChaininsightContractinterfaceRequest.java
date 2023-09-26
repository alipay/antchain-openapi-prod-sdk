// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class UpdateChaininsightContractinterfaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 链上地址
    @NameInMap("hex_address")
    @Validation(required = true)
    public String hexAddress;

    // 版本信息
    @NameInMap("ver")
    @Validation(required = true)
    public String ver;

    // 接口信息
    @NameInMap("contract_interface")
    @Validation(required = true)
    public ChainInsightContractInterface contractInterface;

    // 新的接口参数信息
    @NameInMap("interface_argument")
    @Validation(required = true)
    public ChainInsightContractInterfaceArgument interfaceArgument;

    // 租户ID，留空
    @NameInMap("tenant_id")
    public String tenantId;

    public static UpdateChaininsightContractinterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChaininsightContractinterfaceRequest self = new UpdateChaininsightContractinterfaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChaininsightContractinterfaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateChaininsightContractinterfaceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateChaininsightContractinterfaceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateChaininsightContractinterfaceRequest setHexAddress(String hexAddress) {
        this.hexAddress = hexAddress;
        return this;
    }
    public String getHexAddress() {
        return this.hexAddress;
    }

    public UpdateChaininsightContractinterfaceRequest setVer(String ver) {
        this.ver = ver;
        return this;
    }
    public String getVer() {
        return this.ver;
    }

    public UpdateChaininsightContractinterfaceRequest setContractInterface(ChainInsightContractInterface contractInterface) {
        this.contractInterface = contractInterface;
        return this;
    }
    public ChainInsightContractInterface getContractInterface() {
        return this.contractInterface;
    }

    public UpdateChaininsightContractinterfaceRequest setInterfaceArgument(ChainInsightContractInterfaceArgument interfaceArgument) {
        this.interfaceArgument = interfaceArgument;
        return this;
    }
    public ChainInsightContractInterfaceArgument getInterfaceArgument() {
        return this.interfaceArgument;
    }

    public UpdateChaininsightContractinterfaceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
