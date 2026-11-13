// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoInnerSppdashboardprefilterRequest extends TeaModel {
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

    // 数据日期 yyyyMMdd，不可超过当天
    @NameInMap("date")
    public String date;

    public static QueryAntchainAtoInnerSppdashboardprefilterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoInnerSppdashboardprefilterRequest self = new QueryAntchainAtoInnerSppdashboardprefilterRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoInnerSppdashboardprefilterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoInnerSppdashboardprefilterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoInnerSppdashboardprefilterRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntchainAtoInnerSppdashboardprefilterRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryAntchainAtoInnerSppdashboardprefilterRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
