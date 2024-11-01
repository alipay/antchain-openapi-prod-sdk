// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class QuerySupplierFundamtRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求唯一id	
    // 
    @NameInMap("request_unique_id")
    @Validation(required = true, maxLength = 36)
    public String requestUniqueId;

    // 云站供应商 租户 id
    @NameInMap("cloud_tenant_id")
    @Validation(required = true)
    public String cloudTenantId;

    public static QuerySupplierFundamtRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySupplierFundamtRequest self = new QuerySupplierFundamtRequest();
        return TeaModel.build(map, self);
    }

    public QuerySupplierFundamtRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySupplierFundamtRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySupplierFundamtRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    public QuerySupplierFundamtRequest setCloudTenantId(String cloudTenantId) {
        this.cloudTenantId = cloudTenantId;
        return this;
    }
    public String getCloudTenantId() {
        return this.cloudTenantId;
    }

}
