// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主键Id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 租户
    @NameInMap("tenant_name")
    public String tenantName;

    // 组织名称
    @NameInMap("org_name")
    public String orgName;

    // 企业执照号
    // 
    @NameInMap("owner")
    public String owner;

    // 网关私钥
    // 
    @NameInMap("gateway_private_key")
    public String gatewayPrivateKey;

    // 网关公钥
    // 
    @NameInMap("gateway_public_key")
    public String gatewayPublicKey;

    // 是否为测试租户
    @NameInMap("mock")
    public Boolean mock;

    public static UpdateTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTenantRequest self = new UpdateTenantRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateTenantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateTenantRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateTenantRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public UpdateTenantRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public UpdateTenantRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateTenantRequest setGatewayPrivateKey(String gatewayPrivateKey) {
        this.gatewayPrivateKey = gatewayPrivateKey;
        return this;
    }
    public String getGatewayPrivateKey() {
        return this.gatewayPrivateKey;
    }

    public UpdateTenantRequest setGatewayPublicKey(String gatewayPublicKey) {
        this.gatewayPublicKey = gatewayPublicKey;
        return this;
    }
    public String getGatewayPublicKey() {
        return this.gatewayPublicKey;
    }

    public UpdateTenantRequest setMock(Boolean mock) {
        this.mock = mock;
        return this;
    }
    public Boolean getMock() {
        return this.mock;
    }

}
