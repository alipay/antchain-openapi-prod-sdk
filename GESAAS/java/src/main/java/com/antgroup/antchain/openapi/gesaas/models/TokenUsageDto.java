// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class TokenUsageDto extends TeaModel {
    // 生成视频消耗的 token 数
    /**
     * <strong>example:</strong>
     * <p>235436757</p>
     */
    @NameInMap("completion_tokens")
    @Validation(required = true)
    public Long completionTokens;

    // 消耗总 token 数
    /**
     * <strong>example:</strong>
     * <p>235436546</p>
     */
    @NameInMap("total_tokens")
    @Validation(required = true)
    public Long totalTokens;

    // 工具用量
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("tool_usage")
    public ToolUsage toolUsage;

    public static TokenUsageDto build(java.util.Map<String, ?> map) throws Exception {
        TokenUsageDto self = new TokenUsageDto();
        return TeaModel.build(map, self);
    }

    public TokenUsageDto setCompletionTokens(Long completionTokens) {
        this.completionTokens = completionTokens;
        return this;
    }
    public Long getCompletionTokens() {
        return this.completionTokens;
    }

    public TokenUsageDto setTotalTokens(Long totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    public Long getTotalTokens() {
        return this.totalTokens;
    }

    public TokenUsageDto setToolUsage(ToolUsage toolUsage) {
        this.toolUsage = toolUsage;
        return this;
    }
    public ToolUsage getToolUsage() {
        return this.toolUsage;
    }

}
