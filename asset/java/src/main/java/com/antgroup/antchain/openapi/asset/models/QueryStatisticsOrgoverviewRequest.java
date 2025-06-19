// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class QueryStatisticsOrgoverviewRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 开始时间
    @NameInMap("start_date")
    @Validation(required = true)
    public String startDate;

    // 结束日期
    @NameInMap("end_date")
    @Validation(required = true)
    public String endDate;

    // 租户
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 请求唯一id
    @NameInMap("request_unique_id")
    @Validation(required = true)
    public String requestUniqueId;

    public static QueryStatisticsOrgoverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStatisticsOrgoverviewRequest self = new QueryStatisticsOrgoverviewRequest();
        return TeaModel.build(map, self);
    }

    public QueryStatisticsOrgoverviewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryStatisticsOrgoverviewRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryStatisticsOrgoverviewRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryStatisticsOrgoverviewRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryStatisticsOrgoverviewRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryStatisticsOrgoverviewRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

}
