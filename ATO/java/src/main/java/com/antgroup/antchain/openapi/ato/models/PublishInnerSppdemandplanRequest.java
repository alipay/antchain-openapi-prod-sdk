// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PublishInnerSppdemandplanRequest extends TeaModel {
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

    // 计划id
    @NameInMap("plan_id")
    @Validation(required = true)
    public String planId;

    // 操作类型，DELETE=删除草稿；OFFLINE=下线投放中的计划
    @NameInMap("operation_type")
    @Validation(required = true)
    public String operationType;

    public static PublishInnerSppdemandplanRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishInnerSppdemandplanRequest self = new PublishInnerSppdemandplanRequest();
        return TeaModel.build(map, self);
    }

    public PublishInnerSppdemandplanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PublishInnerSppdemandplanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PublishInnerSppdemandplanRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PublishInnerSppdemandplanRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public PublishInnerSppdemandplanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public PublishInnerSppdemandplanRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

}
