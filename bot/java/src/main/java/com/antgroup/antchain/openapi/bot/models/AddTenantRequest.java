// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AddTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    // 组织名称
    @NameInMap("org_name")
    @Validation(required = true)
    public String orgName;

    // 企业执照号
    @NameInMap("owner")
    public String owner;

    // 网关私钥
    @NameInMap("gateway_private_key")
    public String gatewayPrivateKey;

    // 网关公钥
    @NameInMap("gateway_public_key")
    public String gatewayPublicKey;

    public static AddTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTenantRequest self = new AddTenantRequest();
        return TeaModel.build(map, self);
    }

    public AddTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddTenantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddTenantRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public AddTenantRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public AddTenantRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public AddTenantRequest setGatewayPrivateKey(String gatewayPrivateKey) {
        this.gatewayPrivateKey = gatewayPrivateKey;
        return this;
    }
    public String getGatewayPrivateKey() {
        return this.gatewayPrivateKey;
    }

    public AddTenantRequest setGatewayPublicKey(String gatewayPublicKey) {
        this.gatewayPublicKey = gatewayPublicKey;
        return this;
    }
    public String getGatewayPublicKey() {
        return this.gatewayPublicKey;
    }

}
