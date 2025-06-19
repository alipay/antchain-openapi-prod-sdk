// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class QueryStatisticsOrgtraderangeRequest extends TeaModel {
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

    public static QueryStatisticsOrgtraderangeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStatisticsOrgtraderangeRequest self = new QueryStatisticsOrgtraderangeRequest();
        return TeaModel.build(map, self);
    }

    public QueryStatisticsOrgtraderangeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryStatisticsOrgtraderangeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryStatisticsOrgtraderangeRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryStatisticsOrgtraderangeRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryStatisticsOrgtraderangeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryStatisticsOrgtraderangeRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

}
