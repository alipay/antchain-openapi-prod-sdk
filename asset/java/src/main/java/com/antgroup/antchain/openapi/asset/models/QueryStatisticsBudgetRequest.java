// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class QueryStatisticsBudgetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    // 
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 请求唯一id
    @NameInMap("request_unique_id")
    public String requestUniqueId;

    public static QueryStatisticsBudgetRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStatisticsBudgetRequest self = new QueryStatisticsBudgetRequest();
        return TeaModel.build(map, self);
    }

    public QueryStatisticsBudgetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryStatisticsBudgetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryStatisticsBudgetRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryStatisticsBudgetRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

}
