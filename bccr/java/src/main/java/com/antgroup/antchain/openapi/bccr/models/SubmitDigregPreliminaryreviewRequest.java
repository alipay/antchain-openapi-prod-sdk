// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class SubmitDigregPreliminaryreviewRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数登初审
    @NameInMap("dig_reg_id")
    @Validation(required = true)
    public String digRegId;

    // 审核状态
    @NameInMap("audit_status")
    @Validation(required = true)
    public String auditStatus;

    // 审核结果
    @NameInMap("audit_result")
    @Validation(required = true)
    public Boolean auditResult;

    // 审批意见
    @NameInMap("comments")
    public String comments;

    public static SubmitDigregPreliminaryreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDigregPreliminaryreviewRequest self = new SubmitDigregPreliminaryreviewRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDigregPreliminaryreviewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitDigregPreliminaryreviewRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitDigregPreliminaryreviewRequest setDigRegId(String digRegId) {
        this.digRegId = digRegId;
        return this;
    }
    public String getDigRegId() {
        return this.digRegId;
    }

    public SubmitDigregPreliminaryreviewRequest setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public SubmitDigregPreliminaryreviewRequest setAuditResult(Boolean auditResult) {
        this.auditResult = auditResult;
        return this;
    }
    public Boolean getAuditResult() {
        return this.auditResult;
    }

    public SubmitDigregPreliminaryreviewRequest setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

}
