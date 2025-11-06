// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class SubmitDigregReviewRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数登ID
    @NameInMap("dig_reg_id")
    @Validation(required = true)
    public String digRegId;

    // 复审结果：
    // REPLACE_DCI（复审不通过，补正需要替换DCI作品）
    // NO_NEED_REPLACE_DCI（复审不通过，补正不需要替换DCI作品）
    // PASS（复审通过）
    @NameInMap("audit_result")
    @Validation(required = true)
    public String auditResult;

    // 复审不通过原因
    @NameInMap("fail_reason")
    public String failReason;

    public static SubmitDigregReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDigregReviewRequest self = new SubmitDigregReviewRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDigregReviewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitDigregReviewRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitDigregReviewRequest setDigRegId(String digRegId) {
        this.digRegId = digRegId;
        return this;
    }
    public String getDigRegId() {
        return this.digRegId;
    }

    public SubmitDigregReviewRequest setAuditResult(String auditResult) {
        this.auditResult = auditResult;
        return this;
    }
    public String getAuditResult() {
        return this.auditResult;
    }

    public SubmitDigregReviewRequest setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

}
