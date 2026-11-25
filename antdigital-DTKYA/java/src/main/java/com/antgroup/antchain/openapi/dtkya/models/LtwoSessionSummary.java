// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class LtwoSessionSummary extends TeaModel {
    // Session ID
    /**
     * <strong>example:</strong>
     * <p>session-001</p>
     */
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 场景稳定标识
    /**
     * <strong>example:</strong>
     * <p>agent-code</p>
     */
    @NameInMap("scene_id")
    public String sceneId;

    // 场景展示名称
    /**
     * <strong>example:</strong>
     * <p>Agent 代码开发</p>
     */
    @NameInMap("scene_label")
    public String sceneLabel;

    // Session L2 状态
    /**
     * <strong>example:</strong>
     * <p>CLEAR</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // Session Turn 总数
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("turn_count")
    @Validation(required = true)
    public Long turnCount;

    // PASS Turn 数量
    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("pass_count")
    @Validation(required = true)
    public Long passCount;

    // DEFER Turn 数量
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("defer_count")
    @Validation(required = true)
    public Long deferCount;

    // FAIL Turn 数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("fail_count")
    @Validation(required = true)
    public Long failCount;

    // 等待控制者确认的 Turn 数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pending_review_count")
    @Validation(required = true)
    public Long pendingReviewCount;

    // Session 平均行为分数
    /**
     * <strong>example:</strong>
     * <p>0.91</p>
     */
    @NameInMap("avg_score")
    public String avgScore;

    // Session 最低行为分数
    /**
     * <strong>example:</strong>
     * <p>0.72</p>
     */
    @NameInMap("min_score")
    public String minScore;

    // 最近 Turn 观测时间
    /**
     * <strong>example:</strong>
     * <p>2026-11-16T06:35:00Z</p>
     */
    @NameInMap("last_observed_at")
    public String lastObservedAt;

    // 评分使用的画像版本
    /**
     * <strong>example:</strong>
     * <p>profile-v3</p>
     */
    @NameInMap("profile_version")
    public String profileVersion;

    public static LtwoSessionSummary build(java.util.Map<String, ?> map) throws Exception {
        LtwoSessionSummary self = new LtwoSessionSummary();
        return TeaModel.build(map, self);
    }

    public LtwoSessionSummary setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public LtwoSessionSummary setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public LtwoSessionSummary setSceneLabel(String sceneLabel) {
        this.sceneLabel = sceneLabel;
        return this;
    }
    public String getSceneLabel() {
        return this.sceneLabel;
    }

    public LtwoSessionSummary setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public LtwoSessionSummary setTurnCount(Long turnCount) {
        this.turnCount = turnCount;
        return this;
    }
    public Long getTurnCount() {
        return this.turnCount;
    }

    public LtwoSessionSummary setPassCount(Long passCount) {
        this.passCount = passCount;
        return this;
    }
    public Long getPassCount() {
        return this.passCount;
    }

    public LtwoSessionSummary setDeferCount(Long deferCount) {
        this.deferCount = deferCount;
        return this;
    }
    public Long getDeferCount() {
        return this.deferCount;
    }

    public LtwoSessionSummary setFailCount(Long failCount) {
        this.failCount = failCount;
        return this;
    }
    public Long getFailCount() {
        return this.failCount;
    }

    public LtwoSessionSummary setPendingReviewCount(Long pendingReviewCount) {
        this.pendingReviewCount = pendingReviewCount;
        return this;
    }
    public Long getPendingReviewCount() {
        return this.pendingReviewCount;
    }

    public LtwoSessionSummary setAvgScore(String avgScore) {
        this.avgScore = avgScore;
        return this;
    }
    public String getAvgScore() {
        return this.avgScore;
    }

    public LtwoSessionSummary setMinScore(String minScore) {
        this.minScore = minScore;
        return this;
    }
    public String getMinScore() {
        return this.minScore;
    }

    public LtwoSessionSummary setLastObservedAt(String lastObservedAt) {
        this.lastObservedAt = lastObservedAt;
        return this;
    }
    public String getLastObservedAt() {
        return this.lastObservedAt;
    }

    public LtwoSessionSummary setProfileVersion(String profileVersion) {
        this.profileVersion = profileVersion;
        return this;
    }
    public String getProfileVersion() {
        return this.profileVersion;
    }

}
