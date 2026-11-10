// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class ReportTurn extends TeaModel {
    // 所属 Session 标识
    /**
     * <strong>example:</strong>
     * <p>S7</p>
     */
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // Session 内的 Turn 标识
    /**
     * <strong>example:</strong>
     * <p>T110</p>
     */
    @NameInMap("turn_id")
    @Validation(required = true)
    public String turnId;

    // Session 内顺序
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("turn_index")
    @Validation(required = true)
    public Long turnIndex;

    // Turn 观测时间
    /**
     * <strong>example:</strong>
     * <p>2026-11-09T10:30:00Z</p>
     */
    @NameInMap("observed_at")
    @Validation(required = true)
    public String observedAt;

    // Turn 是否完成
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("complete")
    @Validation(required = true)
    public Boolean complete;

    // 用户输入，可为空
    /**
     * <strong>example:</strong>
     * <p>检查订单代码</p>
     */
    @NameInMap("input")
    public String input;

    // Agent 输出，可为空
    /**
     * <strong>example:</strong>
     * <p>检查完成</p>
     */
    @NameInMap("output")
    public String output;

    // Agent 本地抽取的场景候选
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("scene")
    @Validation(required = true)
    public SceneObservation scene;

    // 按发生顺序采集的原始 Trace 节点
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("spans")
    @Validation(required = true)
    public java.util.List<ReportSpan> spans;

    public static ReportTurn build(java.util.Map<String, ?> map) throws Exception {
        ReportTurn self = new ReportTurn();
        return TeaModel.build(map, self);
    }

    public ReportTurn setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ReportTurn setTurnId(String turnId) {
        this.turnId = turnId;
        return this;
    }
    public String getTurnId() {
        return this.turnId;
    }

    public ReportTurn setTurnIndex(Long turnIndex) {
        this.turnIndex = turnIndex;
        return this;
    }
    public Long getTurnIndex() {
        return this.turnIndex;
    }

    public ReportTurn setObservedAt(String observedAt) {
        this.observedAt = observedAt;
        return this;
    }
    public String getObservedAt() {
        return this.observedAt;
    }

    public ReportTurn setComplete(Boolean complete) {
        this.complete = complete;
        return this;
    }
    public Boolean getComplete() {
        return this.complete;
    }

    public ReportTurn setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public ReportTurn setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public ReportTurn setScene(SceneObservation scene) {
        this.scene = scene;
        return this;
    }
    public SceneObservation getScene() {
        return this.scene;
    }

    public ReportTurn setSpans(java.util.List<ReportSpan> spans) {
        this.spans = spans;
        return this;
    }
    public java.util.List<ReportSpan> getSpans() {
        return this.spans;
    }

}
