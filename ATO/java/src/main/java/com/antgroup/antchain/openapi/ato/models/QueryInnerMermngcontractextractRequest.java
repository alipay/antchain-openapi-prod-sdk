// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerMermngcontractextractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 商户租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 任务id
    @NameInMap("task_instant_id")
    @Validation(required = true)
    public String taskInstantId;

    public static QueryInnerMermngcontractextractRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerMermngcontractextractRequest self = new QueryInnerMermngcontractextractRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerMermngcontractextractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInnerMermngcontractextractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInnerMermngcontractextractRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryInnerMermngcontractextractRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryInnerMermngcontractextractRequest setTaskInstantId(String taskInstantId) {
        this.taskInstantId = taskInstantId;
        return this;
    }
    public String getTaskInstantId() {
        return this.taskInstantId;
    }

}
