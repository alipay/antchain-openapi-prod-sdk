// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoInnerSppdashboarddistributionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 数据日期 yyyyMMdd
    @NameInMap("date")
    public String date;

    // 进件日志增量游标（毫秒）；<=0 返回当日最新 logLimit 条
    @NameInMap("since_time")
    public Long sinceTime;

    // 日志返回条数（最新 logLimit 条，按时间倒序），上限 50
    @NameInMap("log_limit")
    public Long logLimit;

    public static QueryAntchainAtoInnerSppdashboarddistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoInnerSppdashboarddistributionRequest self = new QueryAntchainAtoInnerSppdashboarddistributionRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoInnerSppdashboarddistributionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoInnerSppdashboarddistributionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoInnerSppdashboarddistributionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntchainAtoInnerSppdashboarddistributionRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryAntchainAtoInnerSppdashboarddistributionRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public QueryAntchainAtoInnerSppdashboarddistributionRequest setSinceTime(Long sinceTime) {
        this.sinceTime = sinceTime;
        return this;
    }
    public Long getSinceTime() {
        return this.sinceTime;
    }

    public QueryAntchainAtoInnerSppdashboarddistributionRequest setLogLimit(Long logLimit) {
        this.logLimit = logLimit;
        return this;
    }
    public Long getLogLimit() {
        return this.logLimit;
    }

}
