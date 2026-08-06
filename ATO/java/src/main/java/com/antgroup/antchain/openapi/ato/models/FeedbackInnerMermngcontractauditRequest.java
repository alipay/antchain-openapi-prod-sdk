// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class FeedbackInnerMermngcontractauditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 审核id
    @NameInMap("audit_id")
    @Validation(required = true)
    public String auditId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 修订ID
    @NameInMap("revision_id")
    @Validation(required = true)
    public String revisionId;

    // 反馈内容
    @NameInMap("feedback_content")
    @Validation(required = true)
    public String feedbackContent;

    // buid
    @NameInMap("bu_id")
    @Validation(required = true)
    public String buId;

    public static FeedbackInnerMermngcontractauditRequest build(java.util.Map<String, ?> map) throws Exception {
        FeedbackInnerMermngcontractauditRequest self = new FeedbackInnerMermngcontractauditRequest();
        return TeaModel.build(map, self);
    }

    public FeedbackInnerMermngcontractauditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FeedbackInnerMermngcontractauditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FeedbackInnerMermngcontractauditRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public FeedbackInnerMermngcontractauditRequest setAuditId(String auditId) {
        this.auditId = auditId;
        return this;
    }
    public String getAuditId() {
        return this.auditId;
    }

    public FeedbackInnerMermngcontractauditRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public FeedbackInnerMermngcontractauditRequest setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

    public FeedbackInnerMermngcontractauditRequest setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
        return this;
    }
    public String getFeedbackContent() {
        return this.feedbackContent;
    }

    public FeedbackInnerMermngcontractauditRequest setBuId(String buId) {
        this.buId = buId;
        return this;
    }
    public String getBuId() {
        return this.buId;
    }

}
