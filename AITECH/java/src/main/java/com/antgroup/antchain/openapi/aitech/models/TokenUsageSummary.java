// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class TokenUsageSummary extends TeaModel {
    // 标识该对象是请求级汇总，便于 BI 侧过滤代理阶段日志。
    /**
     * <strong>example:</strong>
     * <p>REQUEST</p>
     */
    @NameInMap("scope")
    public String scope;

    // 提示词token
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("prompt_tokens")
    public Long promptTokens;

    // 模型生成回答时输出的 token 数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("completion_tokens")
    public Long completionTokens;

    // 总tokens
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total_tokens")
    public Long totalTokens;

    // 护栏内部模型（含 Embedding）总 token。
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("guard_total_tokens")
    public Long guardTotalTokens;

    // 代理转发的上游大模型总 token。
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("upstream_total_tokens")
    public Long upstreamTotalTokens;

    // 已实际发起的模型调用数，包括尚未返回的调用
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("model_call_count")
    public Long modelCallCount;

    // 能够确定 total_tokens 的模型调用数。
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("reported_call_count")
    public Long reportedCallCount;

    // 已结束但无法确定 total_tokens 的模型调用数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("unreported_call_count")
    public Long unreportedCallCount;

    // 当前快照时仍在执行的模型调用数。
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("in_flight_call_count")
    public Long inFlightCallCount;

    // 仅当所有已发起调用都结束且均能确定 total_tokens，并且业务未发生提前返回时为 true。
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("complete")
    public Boolean complete;

    public static TokenUsageSummary build(java.util.Map<String, ?> map) throws Exception {
        TokenUsageSummary self = new TokenUsageSummary();
        return TeaModel.build(map, self);
    }

    public TokenUsageSummary setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public TokenUsageSummary setPromptTokens(Long promptTokens) {
        this.promptTokens = promptTokens;
        return this;
    }
    public Long getPromptTokens() {
        return this.promptTokens;
    }

    public TokenUsageSummary setCompletionTokens(Long completionTokens) {
        this.completionTokens = completionTokens;
        return this;
    }
    public Long getCompletionTokens() {
        return this.completionTokens;
    }

    public TokenUsageSummary setTotalTokens(Long totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    public Long getTotalTokens() {
        return this.totalTokens;
    }

    public TokenUsageSummary setGuardTotalTokens(Long guardTotalTokens) {
        this.guardTotalTokens = guardTotalTokens;
        return this;
    }
    public Long getGuardTotalTokens() {
        return this.guardTotalTokens;
    }

    public TokenUsageSummary setUpstreamTotalTokens(Long upstreamTotalTokens) {
        this.upstreamTotalTokens = upstreamTotalTokens;
        return this;
    }
    public Long getUpstreamTotalTokens() {
        return this.upstreamTotalTokens;
    }

    public TokenUsageSummary setModelCallCount(Long modelCallCount) {
        this.modelCallCount = modelCallCount;
        return this;
    }
    public Long getModelCallCount() {
        return this.modelCallCount;
    }

    public TokenUsageSummary setReportedCallCount(Long reportedCallCount) {
        this.reportedCallCount = reportedCallCount;
        return this;
    }
    public Long getReportedCallCount() {
        return this.reportedCallCount;
    }

    public TokenUsageSummary setUnreportedCallCount(Long unreportedCallCount) {
        this.unreportedCallCount = unreportedCallCount;
        return this;
    }
    public Long getUnreportedCallCount() {
        return this.unreportedCallCount;
    }

    public TokenUsageSummary setInFlightCallCount(Long inFlightCallCount) {
        this.inFlightCallCount = inFlightCallCount;
        return this;
    }
    public Long getInFlightCallCount() {
        return this.inFlightCallCount;
    }

    public TokenUsageSummary setComplete(Boolean complete) {
        this.complete = complete;
        return this;
    }
    public Boolean getComplete() {
        return this.complete;
    }

}
