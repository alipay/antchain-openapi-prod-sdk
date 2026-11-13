// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoInnerSppdemandplanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 计划编号
    @NameInMap("plan_id")
    @Validation(required = true)
    public String planId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static QueryAntchainAtoInnerSppdemandplanRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoInnerSppdemandplanRequest self = new QueryAntchainAtoInnerSppdemandplanRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoInnerSppdemandplanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoInnerSppdemandplanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoInnerSppdemandplanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public QueryAntchainAtoInnerSppdemandplanRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntchainAtoInnerSppdemandplanRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
