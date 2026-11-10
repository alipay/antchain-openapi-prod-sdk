// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class ReportSpan extends TeaModel {
    // 原始 Trace 标识
    /**
     * <strong>example:</strong>
     * <p>trace-1</p>
     */
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // Trace 中的 Span 标识
    /**
     * <strong>example:</strong>
     * <p>span-1</p>
     */
    @NameInMap("span_id")
    @Validation(required = true)
    public String spanId;

    // 父 Span 标识，根节点为空
    /**
     * <strong>example:</strong>
     * <p>span-0</p>
     */
    @NameInMap("parent_span_id")
    public String parentSpanId;

    // CHAT、LLM、TOOL、COMMAND、MCP、SKILL、SUBAGENT、A2A 或 OTHER
    /**
     * <strong>example:</strong>
     * <p>TOOL</p>
     */
    @NameInMap("kind")
    @Validation(required = true)
    public String kind;

    // 开始时间，UTC RFC3339；无法取得时为空
    /**
     * <strong>example:</strong>
     * <p>2026-11-09T10:00:00Z</p>
     */
    @NameInMap("started_at")
    public String startedAt;

    // 结束时间，UTC RFC3339；未结束时为空
    /**
     * <strong>example:</strong>
     * <p>2026-11-09T10:01:00Z</p>
     */
    @NameInMap("ended_at")
    public String endedAt;

    // 原始属性 JSON 对象序列化文本；接收端解析为 Map<String,Object>
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("attributes")
    @Validation(required = true)
    public String attributes;

    public static ReportSpan build(java.util.Map<String, ?> map) throws Exception {
        ReportSpan self = new ReportSpan();
        return TeaModel.build(map, self);
    }

    public ReportSpan setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ReportSpan setSpanId(String spanId) {
        this.spanId = spanId;
        return this;
    }
    public String getSpanId() {
        return this.spanId;
    }

    public ReportSpan setParentSpanId(String parentSpanId) {
        this.parentSpanId = parentSpanId;
        return this;
    }
    public String getParentSpanId() {
        return this.parentSpanId;
    }

    public ReportSpan setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public ReportSpan setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public ReportSpan setEndedAt(String endedAt) {
        this.endedAt = endedAt;
        return this;
    }
    public String getEndedAt() {
        return this.endedAt;
    }

    public ReportSpan setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

}
