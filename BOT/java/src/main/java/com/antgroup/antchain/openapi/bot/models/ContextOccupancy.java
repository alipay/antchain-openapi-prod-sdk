// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ContextOccupancy extends TeaModel {
    // 最后一次模型调用的模型名
    /**
     * <strong>example:</strong>
     * <p>deepseek-flash</p>
     */
    @NameInMap("model")
    public String model;

    // 当前上下文占用token数
    /**
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("estimated_input_tokens")
    public Long estimatedInputTokens;

    // 模型上下文窗口上限
    /**
     * <strong>example:</strong>
     * <p>128000</p>
     */
    @NameInMap("context_window_tokens")
    public Long contextWindowTokens;

    // 上下文占用比率
    /**
     * <strong>example:</strong>
     * <p>0.039</p>
     */
    @NameInMap("input_window_ratio")
    public Long inputWindowRatio;

    // 剩余上下文预算token数
    /**
     * <strong>example:</strong>
     * <p>123000</p>
     */
    @NameInMap("remaining_input_budget_tokens")
    public Long remainingInputBudgetTokens;

    // 告警级别
    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("warning")
    public String warning;

    public static ContextOccupancy build(java.util.Map<String, ?> map) throws Exception {
        ContextOccupancy self = new ContextOccupancy();
        return TeaModel.build(map, self);
    }

    public ContextOccupancy setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ContextOccupancy setEstimatedInputTokens(Long estimatedInputTokens) {
        this.estimatedInputTokens = estimatedInputTokens;
        return this;
    }
    public Long getEstimatedInputTokens() {
        return this.estimatedInputTokens;
    }

    public ContextOccupancy setContextWindowTokens(Long contextWindowTokens) {
        this.contextWindowTokens = contextWindowTokens;
        return this;
    }
    public Long getContextWindowTokens() {
        return this.contextWindowTokens;
    }

    public ContextOccupancy setInputWindowRatio(Long inputWindowRatio) {
        this.inputWindowRatio = inputWindowRatio;
        return this;
    }
    public Long getInputWindowRatio() {
        return this.inputWindowRatio;
    }

    public ContextOccupancy setRemainingInputBudgetTokens(Long remainingInputBudgetTokens) {
        this.remainingInputBudgetTokens = remainingInputBudgetTokens;
        return this;
    }
    public Long getRemainingInputBudgetTokens() {
        return this.remainingInputBudgetTokens;
    }

    public ContextOccupancy setWarning(String warning) {
        this.warning = warning;
        return this;
    }
    public String getWarning() {
        return this.warning;
    }

}
