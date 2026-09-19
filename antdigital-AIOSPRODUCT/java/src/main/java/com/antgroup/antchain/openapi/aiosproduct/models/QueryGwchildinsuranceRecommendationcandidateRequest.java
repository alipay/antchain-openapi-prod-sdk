// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiosproduct.models;

import com.aliyun.tea.*;

public class QueryGwchildinsuranceRecommendationcandidateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 请求
    @NameInMap("request_data")
    @Validation(required = true)
    public String requestData;

    public static QueryGwchildinsuranceRecommendationcandidateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGwchildinsuranceRecommendationcandidateRequest self = new QueryGwchildinsuranceRecommendationcandidateRequest();
        return TeaModel.build(map, self);
    }

    public QueryGwchildinsuranceRecommendationcandidateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGwchildinsuranceRecommendationcandidateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGwchildinsuranceRecommendationcandidateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryGwchildinsuranceRecommendationcandidateRequest setRequestData(String requestData) {
        this.requestData = requestData;
        return this;
    }
    public String getRequestData() {
        return this.requestData;
    }

}
