// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class UpdateAuditMeiyouRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 审核记录ID
    @NameInMap("audit_id")
    @Validation(required = true)
    public Long auditId;

    // 审核结果
    @NameInMap("audit_result")
    public String auditResult;

    // 审核原因
    @NameInMap("audit_reason")
    public String auditReason;

    // 操作人
    @NameInMap("audit_operator")
    public String auditOperator;

    // 操作时间戳(毫秒)
    @NameInMap("audit_time")
    public Long auditTime;

    public static UpdateAuditMeiyouRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuditMeiyouRequest self = new UpdateAuditMeiyouRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuditMeiyouRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAuditMeiyouRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAuditMeiyouRequest setAuditId(Long auditId) {
        this.auditId = auditId;
        return this;
    }
    public Long getAuditId() {
        return this.auditId;
    }

    public UpdateAuditMeiyouRequest setAuditResult(String auditResult) {
        this.auditResult = auditResult;
        return this;
    }
    public String getAuditResult() {
        return this.auditResult;
    }

    public UpdateAuditMeiyouRequest setAuditReason(String auditReason) {
        this.auditReason = auditReason;
        return this;
    }
    public String getAuditReason() {
        return this.auditReason;
    }

    public UpdateAuditMeiyouRequest setAuditOperator(String auditOperator) {
        this.auditOperator = auditOperator;
        return this;
    }
    public String getAuditOperator() {
        return this.auditOperator;
    }

    public UpdateAuditMeiyouRequest setAuditTime(Long auditTime) {
        this.auditTime = auditTime;
        return this;
    }
    public Long getAuditTime() {
        return this.auditTime;
    }

}
