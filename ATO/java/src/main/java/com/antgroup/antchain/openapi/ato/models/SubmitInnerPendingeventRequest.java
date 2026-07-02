// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitInnerPendingeventRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 待办事件id
    @NameInMap("event_id")
    @Validation(required = true)
    public String eventId;

    // 商家处理动作
    // REJECT拒绝，APPROVE 同意
    @NameInMap("action")
    @Validation(required = true)
    public String action;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // traceid
    @NameInMap("trace_id")
    public String traceId;

    public static SubmitInnerPendingeventRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInnerPendingeventRequest self = new SubmitInnerPendingeventRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInnerPendingeventRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitInnerPendingeventRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitInnerPendingeventRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SubmitInnerPendingeventRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public SubmitInnerPendingeventRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SubmitInnerPendingeventRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SubmitInnerPendingeventRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
