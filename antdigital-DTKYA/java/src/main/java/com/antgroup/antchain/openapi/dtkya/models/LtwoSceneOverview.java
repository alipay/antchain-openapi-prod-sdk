// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class LtwoSceneOverview extends TeaModel {
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

    // 该场景的 Session 数量
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("session_count")
    @Validation(required = true)
    public Long sessionCount;

    // 正常 Session 数量
    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("normal_count")
    @Validation(required = true)
    public Long normalCount;

    // 观察中 Session 数量
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("observing_count")
    @Validation(required = true)
    public Long observingCount;

    // 待控制者确认的 Session 数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pending_review_count")
    @Validation(required = true)
    public Long pendingReviewCount;

    // 已确认异常 Session 数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("abnormal_count")
    @Validation(required = true)
    public Long abnormalCount;

    // 该场景最近观测时间
    /**
     * <strong>example:</strong>
     * <p>2026-11-16T06:35:00Z</p>
     */
    @NameInMap("last_observed_at")
    public String lastObservedAt;

    public static LtwoSceneOverview build(java.util.Map<String, ?> map) throws Exception {
        LtwoSceneOverview self = new LtwoSceneOverview();
        return TeaModel.build(map, self);
    }

    public LtwoSceneOverview setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public LtwoSceneOverview setSceneLabel(String sceneLabel) {
        this.sceneLabel = sceneLabel;
        return this;
    }
    public String getSceneLabel() {
        return this.sceneLabel;
    }

    public LtwoSceneOverview setSessionCount(Long sessionCount) {
        this.sessionCount = sessionCount;
        return this;
    }
    public Long getSessionCount() {
        return this.sessionCount;
    }

    public LtwoSceneOverview setNormalCount(Long normalCount) {
        this.normalCount = normalCount;
        return this;
    }
    public Long getNormalCount() {
        return this.normalCount;
    }

    public LtwoSceneOverview setObservingCount(Long observingCount) {
        this.observingCount = observingCount;
        return this;
    }
    public Long getObservingCount() {
        return this.observingCount;
    }

    public LtwoSceneOverview setPendingReviewCount(Long pendingReviewCount) {
        this.pendingReviewCount = pendingReviewCount;
        return this;
    }
    public Long getPendingReviewCount() {
        return this.pendingReviewCount;
    }

    public LtwoSceneOverview setAbnormalCount(Long abnormalCount) {
        this.abnormalCount = abnormalCount;
        return this;
    }
    public Long getAbnormalCount() {
        return this.abnormalCount;
    }

    public LtwoSceneOverview setLastObservedAt(String lastObservedAt) {
        this.lastObservedAt = lastObservedAt;
        return this;
    }
    public String getLastObservedAt() {
        return this.lastObservedAt;
    }

}
