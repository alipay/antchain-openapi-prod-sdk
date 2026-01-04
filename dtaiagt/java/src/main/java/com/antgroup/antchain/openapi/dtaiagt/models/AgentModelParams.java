// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class AgentModelParams extends TeaModel {
    // 模型类型 AgentModelTypeEnum - DECISION: 决策模型 - GENERATE: 生成模型 - E2E: 端到端模型 - RAG: 检索生成模型
    // 
    /**
     * <strong>example:</strong>
     * <p>GENERATE</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 模型版本 {model}/{version}#{adapter}
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;gpt-3.5-turbo&quot; </p>
     */
    @NameInMap("model")
    @Validation(required = true)
    public String model;

    // 生成策略预设配置 AgentModelPresetEnum - FLEXIBLE: 灵活 - NORMAL: 正常 - STRICT: 严格
    // 
    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("preset_index")
    @Validation(required = true)
    public String presetIndex;

    // temperature 浮点类型
    // 
    /**
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("temperature")
    @Validation(required = true)
    public String temperature;

    // top_k
    @NameInMap("top_k")
    @Validation(required = true)
    public Long topK;

    // top_p 浮点类型
    /**
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("top_p")
    @Validation(required = true)
    public String topP;

    // doSample
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("do_sample")
    @Validation(required = true)
    public Boolean doSample;

    // beam_width
    @NameInMap("beam_width")
    @Validation(required = true)
    public Long beamWidth;

    // 最大输出长度
    // 
    /**
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("max_out_token")
    @Validation(required = true)
    public Long maxOutToken;

    // 是否为支持 function call 的模型
    // 
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("function_call")
    @Validation(required = true)
    public Boolean functionCall;

    // 自定义推理服务url
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;http://...&quot; </p>
     */
    @NameInMap("custom_url")
    @Validation(required = true)
    public String customUrl;

    // 是否平台官方模型
    // 
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("bailing_official")
    @Validation(required = true)
    public Boolean bailingOfficial;

    public static AgentModelParams build(java.util.Map<String, ?> map) throws Exception {
        AgentModelParams self = new AgentModelParams();
        return TeaModel.build(map, self);
    }

    public AgentModelParams setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AgentModelParams setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public AgentModelParams setPresetIndex(String presetIndex) {
        this.presetIndex = presetIndex;
        return this;
    }
    public String getPresetIndex() {
        return this.presetIndex;
    }

    public AgentModelParams setTemperature(String temperature) {
        this.temperature = temperature;
        return this;
    }
    public String getTemperature() {
        return this.temperature;
    }

    public AgentModelParams setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

    public AgentModelParams setTopP(String topP) {
        this.topP = topP;
        return this;
    }
    public String getTopP() {
        return this.topP;
    }

    public AgentModelParams setDoSample(Boolean doSample) {
        this.doSample = doSample;
        return this;
    }
    public Boolean getDoSample() {
        return this.doSample;
    }

    public AgentModelParams setBeamWidth(Long beamWidth) {
        this.beamWidth = beamWidth;
        return this;
    }
    public Long getBeamWidth() {
        return this.beamWidth;
    }

    public AgentModelParams setMaxOutToken(Long maxOutToken) {
        this.maxOutToken = maxOutToken;
        return this;
    }
    public Long getMaxOutToken() {
        return this.maxOutToken;
    }

    public AgentModelParams setFunctionCall(Boolean functionCall) {
        this.functionCall = functionCall;
        return this;
    }
    public Boolean getFunctionCall() {
        return this.functionCall;
    }

    public AgentModelParams setCustomUrl(String customUrl) {
        this.customUrl = customUrl;
        return this;
    }
    public String getCustomUrl() {
        return this.customUrl;
    }

    public AgentModelParams setBailingOfficial(Boolean bailingOfficial) {
        this.bailingOfficial = bailingOfficial;
        return this;
    }
    public Boolean getBailingOfficial() {
        return this.bailingOfficial;
    }

}
