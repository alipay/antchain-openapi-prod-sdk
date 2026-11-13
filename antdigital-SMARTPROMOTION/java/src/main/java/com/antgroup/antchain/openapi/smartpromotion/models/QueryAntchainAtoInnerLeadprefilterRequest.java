// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoInnerLeadprefilterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 咨询用户标识id
    @NameInMap("lead_id")
    @Validation(required = true)
    public String leadId;

    // 咨询用户标识id的类型例如：MOBILE_MD5/MOBILE_SHA256
    @NameInMap("lead_type")
    @Validation(required = true)
    public String leadType;

    // 策略id，对应平台上的策略id
    @NameInMap("strategy_id")
    @Validation(required = true)
    public String strategyId;

    // 用于追踪排查问题
    @NameInMap("trace_id")
    public String traceId;

    public static QueryAntchainAtoInnerLeadprefilterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoInnerLeadprefilterRequest self = new QueryAntchainAtoInnerLeadprefilterRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoInnerLeadprefilterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoInnerLeadprefilterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoInnerLeadprefilterRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntchainAtoInnerLeadprefilterRequest setLeadId(String leadId) {
        this.leadId = leadId;
        return this;
    }
    public String getLeadId() {
        return this.leadId;
    }

    public QueryAntchainAtoInnerLeadprefilterRequest setLeadType(String leadType) {
        this.leadType = leadType;
        return this;
    }
    public String getLeadType() {
        return this.leadType;
    }

    public QueryAntchainAtoInnerLeadprefilterRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public QueryAntchainAtoInnerLeadprefilterRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
