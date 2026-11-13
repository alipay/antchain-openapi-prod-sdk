// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoInnerSppdashboardreasoningRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // traceid
    @NameInMap("trace_id")
    public String traceId;

    // 数据日期 yyyyMMdd
    @NameInMap("date")
    public String date;

    // 目标领域：SCREENING 前筛 / PURCHASE 采买 / DISTRIBUTION 分发 / SENTINEL 预警
    @NameInMap("module")
    @Validation(required = true)
    public String module;

    // 增量游标(毫秒)；<=0 返回最近 6 条
    @NameInMap("since_time")
    public String sinceTime;

    public static QueryAntchainAtoInnerSppdashboardreasoningRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoInnerSppdashboardreasoningRequest self = new QueryAntchainAtoInnerSppdashboardreasoningRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoInnerSppdashboardreasoningRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoInnerSppdashboardreasoningRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoInnerSppdashboardreasoningRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntchainAtoInnerSppdashboardreasoningRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryAntchainAtoInnerSppdashboardreasoningRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public QueryAntchainAtoInnerSppdashboardreasoningRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public QueryAntchainAtoInnerSppdashboardreasoningRequest setSinceTime(String sinceTime) {
        this.sinceTime = sinceTime;
        return this;
    }
    public String getSinceTime() {
        return this.sinceTime;
    }

}
