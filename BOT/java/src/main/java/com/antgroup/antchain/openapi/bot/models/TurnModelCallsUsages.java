// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TurnModelCallsUsages extends TeaModel {
    // 模型名称
    /**
     * <strong>example:</strong>
     * <p>deepseek-v4.1-flash</p>
     */
    @NameInMap("model")
    @Validation(required = true)
    public String model;

    // 调用状态：COMPLETED / FAILED / CANCELLED / UNKNOWN
    /**
     * <strong>example:</strong>
     * <p>COMPLETED</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 输入 token
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("input_tokens")
    @Validation(required = true)
    public Long inputTokens;

    // 输出 token
    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("output_tokens")
    @Validation(required = true)
    public Long outputTokens;

    // 总 token
    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("total_tokens")
    @Validation(required = true)
    public Long totalTokens;

    // 推理 token（可选，有才返回）
    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("reasoning_tokens")
    public Long reasoningTokens;

    // 缓存读取 token（可选）
    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("cached_read_tokens")
    public Long cachedReadTokens;

    // 缓存写入 token（可选）
    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("cached_write_tokens")
    public Long cachedWriteTokens;

    // 当前模型调用耗时
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("model_duration_ms")
    @Validation(required = true)
    public Long modelDurationMs;

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

}
