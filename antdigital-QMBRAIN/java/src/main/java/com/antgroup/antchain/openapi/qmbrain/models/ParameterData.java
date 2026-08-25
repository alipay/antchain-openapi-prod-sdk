// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qmbrain.models;

import com.aliyun.tea.*;

public class ParameterData extends TeaModel {
    // 是否开启深度思考模式
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable_thinking")
    public Boolean enableThinking;

    // 输出随机性
    /**
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("temperature")
    public Long temperature;

    // 最大token
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("max_tokens")
    public Long maxTokens;

    // 显示缓存
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("incremental_output")
    public Boolean incrementalOutput;

    public static ParameterData build(java.util.Map<String, ?> map) throws Exception {
        ParameterData self = new ParameterData();
        return TeaModel.build(map, self);
    }

    public ParameterData setEnableThinking(Boolean enableThinking) {
        this.enableThinking = enableThinking;
        return this;
    }
    public Boolean getEnableThinking() {
        return this.enableThinking;
    }

    public ParameterData setTemperature(Long temperature) {
        this.temperature = temperature;
        return this;
    }
    public Long getTemperature() {
        return this.temperature;
    }

    public ParameterData setMaxTokens(Long maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }
    public Long getMaxTokens() {
        return this.maxTokens;
    }

    public ParameterData setIncrementalOutput(Boolean incrementalOutput) {
        this.incrementalOutput = incrementalOutput;
        return this;
    }
    public Boolean getIncrementalOutput() {
        return this.incrementalOutput;
    }

}
