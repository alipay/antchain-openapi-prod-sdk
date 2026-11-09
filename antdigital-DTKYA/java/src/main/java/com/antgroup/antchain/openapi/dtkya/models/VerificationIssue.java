// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class VerificationIssue extends TeaModel {
    // issue_id
    /**
     * <strong>example:</strong>
     * <p>issue-001</p>
     */
    @NameInMap("issue_id")
    @Validation(required = true)
    public String issueId;

    // category
    /**
     * <strong>example:</strong>
     * <p>L1_PROOF</p>
     */
    @NameInMap("category")
    @Validation(required = true)
    public String category;

    // reason_code
    /**
     * <strong>example:</strong>
     * <p>PROOF_INVALID</p>
     */
    @NameInMap("reason_code")
    @Validation(required = true)
    public String reasonCode;

    // reason
    /**
     * <strong>example:</strong>
     * <p>证明无效</p>
     */
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    // review_id
    /**
     * <strong>example:</strong>
     * <p>review-001</p>
     */
    @NameInMap("review_id")
    public String reviewId;

    // status
    /**
     * <strong>example:</strong>
     * <p>NOT_REQUIRED</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // review_result
    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("review_result")
    public String reviewResult;

    // reviewer_did
    /**
     * <strong>example:</strong>
     * <p>did:kya:reviewer</p>
     */
    @NameInMap("reviewer_did")
    public String reviewerDid;

    // reviewed_at
    /**
     * <strong>example:</strong>
     * <p>2026-11-05T00:00:00Z</p>
     */
    @NameInMap("reviewed_at")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String reviewedAt;

    // review_comment
    /**
     * <strong>example:</strong>
     * <p>已复核</p>
     */
    @NameInMap("review_comment")
    public String reviewComment;

    // turn_refs
    /**
     * <strong>example:</strong>
     * <p>[{&quot;agent_did&quot;:&quot;did:kya:subject&quot;,&quot;session_id&quot;:&quot;session-001&quot;,&quot;turn_id&quot;:&quot;turn-001&quot;}]</p>
     */
    @NameInMap("turn_refs")
    public java.util.List<TurnRef> turnRefs;

    // report_id
    /**
     * <strong>example:</strong>
     * <p>report-001</p>
     */
    @NameInMap("report_id")
    public String reportId;

    // rule_id
    /**
     * <strong>example:</strong>
     * <p>rule-001</p>
     */
    @NameInMap("rule_id")
    public String ruleId;

    // field_name
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("field_name")
    public String fieldName;

    // operation
    /**
     * <strong>example:</strong>
     * <p>UPDATE</p>
     */
    @NameInMap("operation")
    public String operation;

    // scene_label
    /**
     * <strong>example:</strong>
     * <p>verification</p>
     */
    @NameInMap("scene_label")
    public String sceneLabel;

    // score
    /**
     * <strong>example:</strong>
     * <p>0.95</p>
     */
    @NameInMap("score")
    public Long score;

    // threshold
    /**
     * <strong>example:</strong>
     * <p>0.8</p>
     */
    @NameInMap("threshold")
    public Long threshold;

    public static VerificationIssue build(java.util.Map<String, ?> map) throws Exception {
        VerificationIssue self = new VerificationIssue();
        return TeaModel.build(map, self);
    }

    public VerificationIssue setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public VerificationIssue setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public VerificationIssue setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public VerificationIssue setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public VerificationIssue setReviewId(String reviewId) {
        this.reviewId = reviewId;
        return this;
    }
    public String getReviewId() {
        return this.reviewId;
    }

    public VerificationIssue setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public VerificationIssue setReviewResult(String reviewResult) {
        this.reviewResult = reviewResult;
        return this;
    }
    public String getReviewResult() {
        return this.reviewResult;
    }

    public VerificationIssue setReviewerDid(String reviewerDid) {
        this.reviewerDid = reviewerDid;
        return this;
    }
    public String getReviewerDid() {
        return this.reviewerDid;
    }

    public VerificationIssue setReviewedAt(String reviewedAt) {
        this.reviewedAt = reviewedAt;
        return this;
    }
    public String getReviewedAt() {
        return this.reviewedAt;
    }

    public VerificationIssue setReviewComment(String reviewComment) {
        this.reviewComment = reviewComment;
        return this;
    }
    public String getReviewComment() {
        return this.reviewComment;
    }

    public VerificationIssue setTurnRefs(java.util.List<TurnRef> turnRefs) {
        this.turnRefs = turnRefs;
        return this;
    }
    public java.util.List<TurnRef> getTurnRefs() {
        return this.turnRefs;
    }

    public VerificationIssue setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public VerificationIssue setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public VerificationIssue setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public VerificationIssue setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public VerificationIssue setSceneLabel(String sceneLabel) {
        this.sceneLabel = sceneLabel;
        return this;
    }
    public String getSceneLabel() {
        return this.sceneLabel;
    }

    public VerificationIssue setScore(Long score) {
        this.score = score;
        return this;
    }
    public Long getScore() {
        return this.score;
    }

    public VerificationIssue setThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }
    public Long getThreshold() {
        return this.threshold;
    }

}
