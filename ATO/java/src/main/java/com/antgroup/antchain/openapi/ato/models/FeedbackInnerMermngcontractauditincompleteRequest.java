// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class FeedbackInnerMermngcontractauditincompleteRequest extends TeaModel {
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

    // 漏审信息
    @NameInMap("feedbacks")
    @Validation(required = true)
    public String feedbacks;

    // buid
    @NameInMap("bu_id")
    @Validation(required = true)
    public String buId;

    public static FeedbackInnerMermngcontractauditincompleteRequest build(java.util.Map<String, ?> map) throws Exception {
        FeedbackInnerMermngcontractauditincompleteRequest self = new FeedbackInnerMermngcontractauditincompleteRequest();
        return TeaModel.build(map, self);
    }

    public FeedbackInnerMermngcontractauditincompleteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FeedbackInnerMermngcontractauditincompleteRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FeedbackInnerMermngcontractauditincompleteRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public FeedbackInnerMermngcontractauditincompleteRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public FeedbackInnerMermngcontractauditincompleteRequest setAuditId(String auditId) {
        this.auditId = auditId;
        return this;
    }
    public String getAuditId() {
        return this.auditId;
    }

    public FeedbackInnerMermngcontractauditincompleteRequest setFeedbacks(String feedbacks) {
        this.feedbacks = feedbacks;
        return this;
    }
    public String getFeedbacks() {
        return this.feedbacks;
    }

    public FeedbackInnerMermngcontractauditincompleteRequest setBuId(String buId) {
        this.buId = buId;
        return this;
    }
    public String getBuId() {
        return this.buId;
    }

}
