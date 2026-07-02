// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitInnerFundmngpendingeventRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // 事件id
    @NameInMap("event_id")
    @Validation(required = true)
    public String eventId;

    // 处理动作 
    // REJECT 拒绝，
    // CONFIRM 确认
    @NameInMap("action")
    @Validation(required = true)
    public String action;

    // 页面traceId
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static SubmitInnerFundmngpendingeventRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInnerFundmngpendingeventRequest self = new SubmitInnerFundmngpendingeventRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInnerFundmngpendingeventRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitInnerFundmngpendingeventRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitInnerFundmngpendingeventRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public SubmitInnerFundmngpendingeventRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public SubmitInnerFundmngpendingeventRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SubmitInnerFundmngpendingeventRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
