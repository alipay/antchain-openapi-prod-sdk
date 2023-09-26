// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class DetailChaininsightContractinterfaceRequest extends TeaModel {
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

    // 版本信息（块高）
    @NameInMap("ver")
    @Validation(required = true)
    public String ver;

    // 接口
    @NameInMap("contract_interface")
    @Validation(required = true)
    public ChainInsightContractInterface contractInterface;

    // 租户ID，留空
    @NameInMap("tenant_id")
    public String tenantId;

    public static DetailChaininsightContractinterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailChaininsightContractinterfaceRequest self = new DetailChaininsightContractinterfaceRequest();
        return TeaModel.build(map, self);
    }

    public DetailChaininsightContractinterfaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailChaininsightContractinterfaceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailChaininsightContractinterfaceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DetailChaininsightContractinterfaceRequest setHexAddress(String hexAddress) {
        this.hexAddress = hexAddress;
        return this;
    }
    public String getHexAddress() {
        return this.hexAddress;
    }

    public DetailChaininsightContractinterfaceRequest setVer(String ver) {
        this.ver = ver;
        return this;
    }
    public String getVer() {
        return this.ver;
    }

    public DetailChaininsightContractinterfaceRequest setContractInterface(ChainInsightContractInterface contractInterface) {
        this.contractInterface = contractInterface;
        return this;
    }
    public ChainInsightContractInterface getContractInterface() {
        return this.contractInterface;
    }

    public DetailChaininsightContractinterfaceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
