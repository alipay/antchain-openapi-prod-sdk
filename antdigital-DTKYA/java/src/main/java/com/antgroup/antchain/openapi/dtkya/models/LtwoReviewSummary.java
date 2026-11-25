// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class LtwoReviewSummary extends TeaModel {
    // 审核事项和问题的唯一标识
    /**
     * <strong>example:</strong>
     * <p>review:l2:R501:S1</p>
     */
    @NameInMap("review_id")
    @Validation(required = true)
    public String reviewId;

    // 问题类型
    /**
     * <strong>example:</strong>
     * <p>BEHAVIOR_DEVIATION</p>
     */
    @NameInMap("review_type")
    @Validation(required = true)
    public String reviewType;

    // 风险级别：LOW、MEDIUM、HIGH
    /**
     * <strong>example:</strong>
     * <p>MEDIUM</p>
     */
    @NameInMap("severity")
    @Validation(required = true)
    public String severity;

    // 关联场景稳定标识
    /**
     * <strong>example:</strong>
     * <p>agent-code</p>
     */
    @NameInMap("scene_id")
    public String sceneId;

    // 关联场景展示名称
    /**
     * <strong>example:</strong>
     * <p>Agent 代码开发</p>
     */
    @NameInMap("scene_label")
    public String sceneLabel;

    // 关联 Session ID
    /**
     * <strong>example:</strong>
     * <p>session-001</p>
     */
    @NameInMap("session_id")
    public String sessionId;

    // 关联 Turn 引用 JSON
    /**
     * <strong>example:</strong>
     * <p>[{&quot;session_id&quot;:&quot;S1&quot;,&quot;turn_id&quot;:&quot;T1&quot;}]</p>
     */
    @NameInMap("turn_refs_json")
    @Validation(required = true)
    public String turnRefsJson;

    // 供控制者判断的脱敏证据 JSON
    /**
     * <strong>example:</strong>
     * <p>{&quot;score&quot;:0.42}</p>
     */
    @NameInMap("evidence_json")
    @Validation(required = true)
    public String evidenceJson;

    // 审核状态：WAITING_REVIEW 或 COMPLETED
    /**
     * <strong>example:</strong>
     * <p>WAITING_REVIEW</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 控制者结论：NORMAL 或 ABNORMAL
    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("decision")
    public String decision;

    public static LtwoReviewSummary build(java.util.Map<String, ?> map) throws Exception {
        LtwoReviewSummary self = new LtwoReviewSummary();
        return TeaModel.build(map, self);
    }

    public LtwoReviewSummary setReviewId(String reviewId) {
        this.reviewId = reviewId;
        return this;
    }
    public String getReviewId() {
        return this.reviewId;
    }

    public LtwoReviewSummary setReviewType(String reviewType) {
        this.reviewType = reviewType;
        return this;
    }
    public String getReviewType() {
        return this.reviewType;
    }

    public LtwoReviewSummary setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public LtwoReviewSummary setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public LtwoReviewSummary setSceneLabel(String sceneLabel) {
        this.sceneLabel = sceneLabel;
        return this;
    }
    public String getSceneLabel() {
        return this.sceneLabel;
    }

    public LtwoReviewSummary setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public LtwoReviewSummary setTurnRefsJson(String turnRefsJson) {
        this.turnRefsJson = turnRefsJson;
        return this;
    }
    public String getTurnRefsJson() {
        return this.turnRefsJson;
    }

    public LtwoReviewSummary setEvidenceJson(String evidenceJson) {
        this.evidenceJson = evidenceJson;
        return this;
    }
    public String getEvidenceJson() {
        return this.evidenceJson;
    }

    public LtwoReviewSummary setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public LtwoReviewSummary setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

}
