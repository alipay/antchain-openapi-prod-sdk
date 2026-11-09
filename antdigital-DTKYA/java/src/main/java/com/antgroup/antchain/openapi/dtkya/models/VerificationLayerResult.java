// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class VerificationLayerResult extends TeaModel {
    // 层级
    /**
     * <strong>example:</strong>
     * <p>L2</p>
     */
    @NameInMap("layer")
    @Validation(required = true)
    public String layer;

    // 层级结果
    /**
     * <strong>example:</strong>
     * <p>PASS</p>
     */
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    // 原因码
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("reason_code")
    @Validation(required = true)
    public String reasonCode;

    // 原因说明
    /**
     * <strong>example:</strong>
     * <p>通过</p>
     */
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    // 连续性评分
    /**
     * <strong>example:</strong>
     * <p>0.95</p>
     */
    @NameInMap("personal_continuity")
    public Long personalContinuity;

    // 检查时间
    /**
     * <strong>example:</strong>
     * <p>2026-11-05T00:00:00Z</p>
     */
    @NameInMap("checked_at")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String checkedAt;

    // 最晚有效时间
    /**
     * <strong>example:</strong>
     * <p>2026-11-06T00:00:00Z</p>
     */
    @NameInMap("valid_until")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String validUntil;

    // 层级结果 ID
    /**
     * <strong>example:</strong>
     * <p>lr1</p>
     */
    @NameInMap("layer_result_id")
    public String layerResultId;

    // 该层的问题与平台审核状态
    /**
     * <strong>example:</strong>
     * <p>[{&quot;issue_id&quot;:&quot;issue-001&quot;,&quot;category&quot;:&quot;L1_PROOF&quot;,&quot;reason_code&quot;:&quot;PROOF_INVALID&quot;,&quot;reason&quot;:&quot;证明无效&quot;,&quot;status&quot;:&quot;NOT_REQUIRED&quot;}]</p>
     */
    @NameInMap("issues")
    public java.util.List<VerificationIssue> issues;

    public static VerificationLayerResult build(java.util.Map<String, ?> map) throws Exception {
        VerificationLayerResult self = new VerificationLayerResult();
        return TeaModel.build(map, self);
    }

    public VerificationLayerResult setLayer(String layer) {
        this.layer = layer;
        return this;
    }
    public String getLayer() {
        return this.layer;
    }

    public VerificationLayerResult setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public VerificationLayerResult setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public VerificationLayerResult setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public VerificationLayerResult setPersonalContinuity(Long personalContinuity) {
        this.personalContinuity = personalContinuity;
        return this;
    }
    public Long getPersonalContinuity() {
        return this.personalContinuity;
    }

    public VerificationLayerResult setCheckedAt(String checkedAt) {
        this.checkedAt = checkedAt;
        return this;
    }
    public String getCheckedAt() {
        return this.checkedAt;
    }

    public VerificationLayerResult setValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    public String getValidUntil() {
        return this.validUntil;
    }

    public VerificationLayerResult setLayerResultId(String layerResultId) {
        this.layerResultId = layerResultId;
        return this;
    }
    public String getLayerResultId() {
        return this.layerResultId;
    }

    public VerificationLayerResult setIssues(java.util.List<VerificationIssue> issues) {
        this.issues = issues;
        return this;
    }
    public java.util.List<VerificationIssue> getIssues() {
        return this.issues;
    }

}
