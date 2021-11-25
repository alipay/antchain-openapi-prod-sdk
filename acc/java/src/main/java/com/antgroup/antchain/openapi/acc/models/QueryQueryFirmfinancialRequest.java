// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class QueryQueryFirmfinancialRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业Id
    @NameInMap("firm_id")
    @Validation(required = true)
    public Long firmId;

    // 租户信息
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 查询类型（1：查询状态，2：财报信息）
    @NameInMap("query_options")
    @Validation(required = true)
    public String queryOptions;

    public static QueryQueryFirmfinancialRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryQueryFirmfinancialRequest self = new QueryQueryFirmfinancialRequest();
        return TeaModel.build(map, self);
    }

    public QueryQueryFirmfinancialRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryQueryFirmfinancialRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryQueryFirmfinancialRequest setFirmId(Long firmId) {
        this.firmId = firmId;
        return this;
    }
    public Long getFirmId() {
        return this.firmId;
    }

    public QueryQueryFirmfinancialRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryQueryFirmfinancialRequest setQueryOptions(String queryOptions) {
        this.queryOptions = queryOptions;
        return this;
    }
    public String getQueryOptions() {
        return this.queryOptions;
    }

}
