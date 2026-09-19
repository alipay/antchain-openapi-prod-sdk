// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiosproduct.models;

import com.aliyun.tea.*;

public class ResetGwchildinsuranceRecommendationcandidateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前联调租户；必须精确命中 finaigateway 发布白名单
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 输入参数
    @NameInMap("request_data")
    @Validation(required = true)
    public String requestData;

    public static ResetGwchildinsuranceRecommendationcandidateRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetGwchildinsuranceRecommendationcandidateRequest self = new ResetGwchildinsuranceRecommendationcandidateRequest();
        return TeaModel.build(map, self);
    }

    public ResetGwchildinsuranceRecommendationcandidateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResetGwchildinsuranceRecommendationcandidateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResetGwchildinsuranceRecommendationcandidateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ResetGwchildinsuranceRecommendationcandidateRequest setRequestData(String requestData) {
        this.requestData = requestData;
        return this;
    }
    public String getRequestData() {
        return this.requestData;
    }

}
