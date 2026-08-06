// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerMermngcontractfeedbackRequest extends TeaModel {
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

    // INCOMPLETE:少审漏审
    // INCORRECT:误审
    @NameInMap("type")
    public String type;

    public static QueryInnerMermngcontractfeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerMermngcontractfeedbackRequest self = new QueryInnerMermngcontractfeedbackRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerMermngcontractfeedbackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInnerMermngcontractfeedbackRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInnerMermngcontractfeedbackRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryInnerMermngcontractfeedbackRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryInnerMermngcontractfeedbackRequest setAuditId(String auditId) {
        this.auditId = auditId;
        return this;
    }
    public String getAuditId() {
        return this.auditId;
    }

    public QueryInnerMermngcontractfeedbackRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
