// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AuditInfo extends TeaModel {
    // 审核步骤
    /**
     * <strong>example:</strong>
     * <p>商户提交</p>
     */
    @NameInMap("stage")
    @Validation(required = true)
    public String stage;

    // 审核主体
    /**
     * <strong>example:</strong>
     * <p>平台审核</p>
     */
    @NameInMap("audit_subject")
    @Validation(required = true)
    public String auditSubject;

    // 审核状态
    /**
     * <strong>example:</strong>
     * <p>AUDIT_PASSED</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 审核时间
    /**
     * <strong>example:</strong>
     * <p>2023-04-05 12:12:23</p>
     */
    @NameInMap("apply_date_str")
    @Validation(required = true)
    public String applyDateStr;

    // 审核失败描述
    /**
     * <strong>example:</strong>
     * <p>xx值校验失败</p>
     */
    @NameInMap("fail_reason")
    @Validation(required = true)
    public String failReason;

    public static AuditInfo build(java.util.Map<String, ?> map) throws Exception {
        AuditInfo self = new AuditInfo();
        return TeaModel.build(map, self);
    }

    public AuditInfo setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public AuditInfo setAuditSubject(String auditSubject) {
        this.auditSubject = auditSubject;
        return this;
    }
    public String getAuditSubject() {
        return this.auditSubject;
    }

    public AuditInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AuditInfo setApplyDateStr(String applyDateStr) {
        this.applyDateStr = applyDateStr;
        return this;
    }
    public String getApplyDateStr() {
        return this.applyDateStr;
    }

    public AuditInfo setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

}
