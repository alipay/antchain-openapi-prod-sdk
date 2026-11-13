// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoInnerSppdashboardsummaryRequest extends TeaModel {
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

    // 目标领域：SCREENING 前筛 / PURCHASE 采买 / DISTRIBUTION 分发 / SENTINEL 预警
    @NameInMap("module")
    @Validation(required = true)
    public String module;

    // 待总结的输入内容（该领域的指标/观察文本）
    @NameInMap("input")
    @Validation(required = true)
    public String input;

    // 原始数据（补充上下文，可选）
    @NameInMap("raw_data")
    public String rawData;

    // 数据日期 yyyyMMdd，仅作上下文/记录
    @NameInMap("date")
    public String date;

    public static QueryAntchainAtoInnerSppdashboardsummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoInnerSppdashboardsummaryRequest self = new QueryAntchainAtoInnerSppdashboardsummaryRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoInnerSppdashboardsummaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoInnerSppdashboardsummaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoInnerSppdashboardsummaryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntchainAtoInnerSppdashboardsummaryRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryAntchainAtoInnerSppdashboardsummaryRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public QueryAntchainAtoInnerSppdashboardsummaryRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public QueryAntchainAtoInnerSppdashboardsummaryRequest setRawData(String rawData) {
        this.rawData = rawData;
        return this;
    }
    public String getRawData() {
        return this.rawData;
    }

    public QueryAntchainAtoInnerSppdashboardsummaryRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
