// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiosproduct.models;

import com.aliyun.tea.*;

public class QueryGwchildinsurancePlanningtargetsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户标识，当前使用 CONSOLE_DEFAULT
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // JSON 字符串形式的业务请求
    @NameInMap("request_data")
    @Validation(required = true)
    public String requestData;

    public static QueryGwchildinsurancePlanningtargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGwchildinsurancePlanningtargetsRequest self = new QueryGwchildinsurancePlanningtargetsRequest();
        return TeaModel.build(map, self);
    }

    public QueryGwchildinsurancePlanningtargetsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGwchildinsurancePlanningtargetsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGwchildinsurancePlanningtargetsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryGwchildinsurancePlanningtargetsRequest setRequestData(String requestData) {
        this.requestData = requestData;
        return this;
    }
    public String getRequestData() {
        return this.requestData;
    }

}
