// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class TurnModelCallsUsages extends TeaModel {
    // 模型名
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("model")
    public String model;

    // 调用状态
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("status")
    public String status;

    // 输入token
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("input_tokens")
    public Long inputTokens;

    // 输出token
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("output_tokens")
    public Long outputTokens;

    // 总token
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("total_tokens")
    public Long totalTokens;

    // 推理token
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("reasoning_tokens")
    public Long reasoningTokens;

    // 缓存读取token
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("cached_read_tokens")
    public Long cachedReadTokens;

    // 缓存写入token
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("cached_write_tokens")
    public Long cachedWriteTokens;

    // 单次模型调用耗时(毫秒)
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("model_duration_ms")
    public Long modelDurationMs;

    // 轮次ID
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("turn_id")
    public String turnId;

    // 该轮用量是否完整计量
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("complete")
    public Boolean complete;

    // 轮次总耗时(毫秒，含模型调用+工具执行)
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("turn_duration_ms")
    public Long turnDurationMs;

    public static TurnModelCallsUsages build(java.util.Map<String, ?> map) throws Exception {
        TurnModelCallsUsages self = new TurnModelCallsUsages();
        return TeaModel.build(map, self);
    }

    public TurnModelCallsUsages setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public TurnModelCallsUsages setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TurnModelCallsUsages setInputTokens(Long inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }
    public Long getInputTokens() {
        return this.inputTokens;
    }

    public TurnModelCallsUsages setOutputTokens(Long outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }
    public Long getOutputTokens() {
        return this.outputTokens;
    }

    public TurnModelCallsUsages setTotalTokens(Long totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    public Long getTotalTokens() {
        return this.totalTokens;
    }

    public TurnModelCallsUsages setReasoningTokens(Long reasoningTokens) {
        this.reasoningTokens = reasoningTokens;
        return this;
    }
    public Long getReasoningTokens() {
        return this.reasoningTokens;
    }

    public TurnModelCallsUsages setCachedReadTokens(Long cachedReadTokens) {
        this.cachedReadTokens = cachedReadTokens;
        return this;
    }
    public Long getCachedReadTokens() {
        return this.cachedReadTokens;
    }

    public TurnModelCallsUsages setCachedWriteTokens(Long cachedWriteTokens) {
        this.cachedWriteTokens = cachedWriteTokens;
        return this;
    }
    public Long getCachedWriteTokens() {
        return this.cachedWriteTokens;
    }

    public TurnModelCallsUsages setModelDurationMs(Long modelDurationMs) {
        this.modelDurationMs = modelDurationMs;
        return this;
    }
    public Long getModelDurationMs() {
        return this.modelDurationMs;
    }

    public TurnModelCallsUsages setTurnId(String turnId) {
        this.turnId = turnId;
        return this;
    }
    public String getTurnId() {
        return this.turnId;
    }

    public TurnModelCallsUsages setComplete(Boolean complete) {
        this.complete = complete;
        return this;
    }
    public Boolean getComplete() {
        return this.complete;
    }

    public TurnModelCallsUsages setTurnDurationMs(Long turnDurationMs) {
        this.turnDurationMs = turnDurationMs;
        return this;
    }
    public Long getTurnDurationMs() {
        return this.turnDurationMs;
    }

}
