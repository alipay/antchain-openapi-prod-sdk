// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class FinishInnerMermngcontractauditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 审核id
    @NameInMap("audit_id")
    @Validation(required = true)
    public String auditId;

    public static FinishInnerMermngcontractauditRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishInnerMermngcontractauditRequest self = new FinishInnerMermngcontractauditRequest();
        return TeaModel.build(map, self);
    }

    public FinishInnerMermngcontractauditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FinishInnerMermngcontractauditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FinishInnerMermngcontractauditRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public FinishInnerMermngcontractauditRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public FinishInnerMermngcontractauditRequest setAuditId(String auditId) {
        this.auditId = auditId;
        return this;
    }
    public String getAuditId() {
        return this.auditId;
    }

}
