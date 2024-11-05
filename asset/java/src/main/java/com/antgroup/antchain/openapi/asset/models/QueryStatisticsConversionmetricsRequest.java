// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class QueryStatisticsConversionmetricsRequest extends TeaModel {
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
    // 
    @NameInMap("request_unique_id")
    public String requestUniqueId;

    // VOUCHER_CONVERSION, USER_CONVERSION
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static QueryStatisticsConversionmetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStatisticsConversionmetricsRequest self = new QueryStatisticsConversionmetricsRequest();
        return TeaModel.build(map, self);
    }

    public QueryStatisticsConversionmetricsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryStatisticsConversionmetricsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryStatisticsConversionmetricsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryStatisticsConversionmetricsRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    public QueryStatisticsConversionmetricsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
