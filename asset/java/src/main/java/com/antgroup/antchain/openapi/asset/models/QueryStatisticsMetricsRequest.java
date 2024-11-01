// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class QueryStatisticsMetricsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 请求唯一id
    @NameInMap("request_unique_id")
    @Validation(required = true, maxLength = 36)
    public String requestUniqueId;

    // 租户指标: OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 查询开始时间: DAY:20240911; MONTH:202409
    @NameInMap("start_date")
    @Validation(required = true)
    public String startDate;

    // 查询结束日期
    @NameInMap("end_date")
    @Validation(required = true)
    public String endDate;

    // 日期单位: DAY,MONTH
    @NameInMap("date_unit")
    @Validation(required = true)
    public String dateUnit;

    public static QueryStatisticsMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStatisticsMetricsRequest self = new QueryStatisticsMetricsRequest();
        return TeaModel.build(map, self);
    }

    public QueryStatisticsMetricsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryStatisticsMetricsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryStatisticsMetricsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryStatisticsMetricsRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    public QueryStatisticsMetricsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryStatisticsMetricsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryStatisticsMetricsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryStatisticsMetricsRequest setDateUnit(String dateUnit) {
        this.dateUnit = dateUnit;
        return this;
    }
    public String getDateUnit() {
        return this.dateUnit;
    }

}
