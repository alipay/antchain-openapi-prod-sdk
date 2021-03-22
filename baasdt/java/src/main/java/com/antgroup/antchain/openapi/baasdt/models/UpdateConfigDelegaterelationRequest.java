// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UpdateConfigDelegaterelationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被代理的租户ID
    @NameInMap("delegated_tenant_id")
    @Validation(required = true)
    public String delegatedTenantId;

    // 代理租户ID
    @NameInMap("opt_tenant_id")
    @Validation(required = true)
    public String optTenantId;

    // 操作类型，ADD表示添加，SUB表示撤销
    @NameInMap("opt_type")
    @Validation(required = true)
    public String optType;

    public static UpdateConfigDelegaterelationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigDelegaterelationRequest self = new UpdateConfigDelegaterelationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigDelegaterelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateConfigDelegaterelationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateConfigDelegaterelationRequest setDelegatedTenantId(String delegatedTenantId) {
        this.delegatedTenantId = delegatedTenantId;
        return this;
    }
    public String getDelegatedTenantId() {
        return this.delegatedTenantId;
    }

    public UpdateConfigDelegaterelationRequest setOptTenantId(String optTenantId) {
        this.optTenantId = optTenantId;
        return this;
    }
    public String getOptTenantId() {
        return this.optTenantId;
    }

    public UpdateConfigDelegaterelationRequest setOptType(String optType) {
        this.optType = optType;
        return this;
    }
    public String getOptType() {
        return this.optType;
    }

}
