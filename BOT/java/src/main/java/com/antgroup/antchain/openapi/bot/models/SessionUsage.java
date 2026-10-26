// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SessionUsage extends TeaModel {
    // 输入Token
    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("input_tokens")
    @Validation(required = true)
    public Long inputTokens;

    // 输出token
    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("output_tokens")
    @Validation(required = true)
    public Long outputTokens;

    // 总Token
    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("total_tokens")
    @Validation(required = true)
    public Long totalTokens;

    // 模型调用次数
    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("model_call_count")
    @Validation(required = true)
    public Long modelCallCount;

    // 是否完成
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("complete")
    @Validation(required = true)
    public Boolean complete;

    public static SessionUsage build(java.util.Map<String, ?> map) throws Exception {
        SessionUsage self = new SessionUsage();
        return TeaModel.build(map, self);
    }

    public SessionUsage setInputTokens(Long inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }
    public Long getInputTokens() {
        return this.inputTokens;
    }

    public SessionUsage setOutputTokens(Long outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }
    public Long getOutputTokens() {
        return this.outputTokens;
    }

    public SessionUsage setTotalTokens(Long totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    public Long getTotalTokens() {
        return this.totalTokens;
    }

    public SessionUsage setModelCallCount(Long modelCallCount) {
        this.modelCallCount = modelCallCount;
        return this;
    }
    public Long getModelCallCount() {
        return this.modelCallCount;
    }

    public SessionUsage setComplete(Boolean complete) {
        this.complete = complete;
        return this;
    }
    public Boolean getComplete() {
        return this.complete;
    }

}
