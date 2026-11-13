// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoInnerSppdashboardsentinelRequest extends TeaModel {
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

    // 预警分页页码
    @NameInMap("page")
    public Long page;

    // 预警每页条数，上限 50
    @NameInMap("size")
    public Long size;

    public static QueryAntchainAtoInnerSppdashboardsentinelRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoInnerSppdashboardsentinelRequest self = new QueryAntchainAtoInnerSppdashboardsentinelRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoInnerSppdashboardsentinelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoInnerSppdashboardsentinelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoInnerSppdashboardsentinelRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntchainAtoInnerSppdashboardsentinelRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryAntchainAtoInnerSppdashboardsentinelRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public QueryAntchainAtoInnerSppdashboardsentinelRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public QueryAntchainAtoInnerSppdashboardsentinelRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
