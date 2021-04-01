// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateConfigChainaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 要创建的链上ID对应的租户ID
    @NameInMap("opt_tenant_id")
    @Validation(required = true)
    public String optTenantId;

    // 创建的角色，admin是商户管理员链上ID，fundmanager是资金管理员链上ID
    @NameInMap("member")
    @Validation(required = true)
    public String member;

    public static CreateConfigChainaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigChainaccountRequest self = new CreateConfigChainaccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigChainaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateConfigChainaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateConfigChainaccountRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public CreateConfigChainaccountRequest setOptTenantId(String optTenantId) {
        this.optTenantId = optTenantId;
        return this;
    }
    public String getOptTenantId() {
        return this.optTenantId;
    }

    public CreateConfigChainaccountRequest setMember(String member) {
        this.member = member;
        return this;
    }
    public String getMember() {
        return this.member;
    }

}
