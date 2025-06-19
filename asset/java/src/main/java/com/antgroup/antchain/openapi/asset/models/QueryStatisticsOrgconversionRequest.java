// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class QueryStatisticsOrgconversionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 开始日期
    @NameInMap("start_date")
    @Validation(required = true)
    public String startDate;

    // 结束日期
    @NameInMap("end_date")
    @Validation(required = true)
    public String endDate;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 请求唯一标识
    @NameInMap("request_unique_id")
    @Validation(required = true)
    public String requestUniqueId;

    public static QueryStatisticsOrgconversionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStatisticsOrgconversionRequest self = new QueryStatisticsOrgconversionRequest();
        return TeaModel.build(map, self);
    }

    public QueryStatisticsOrgconversionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryStatisticsOrgconversionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryStatisticsOrgconversionRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryStatisticsOrgconversionRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryStatisticsOrgconversionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryStatisticsOrgconversionRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

}
