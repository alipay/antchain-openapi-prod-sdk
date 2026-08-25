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

    // 工具调用参数
    /**
     * <strong>example:</strong>
     * <p>[{&quot;type&quot;:&quot;function&quot;,&quot;function&quot;:{&quot;name&quot;:&quot;get_current_weather&quot;,&quot;description&quot;:&quot;获取指定城市的当前天气情况&quot;,&quot;parameters&quot;:{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;location&quot;:{&quot;type&quot;:&quot;string&quot;,&quot;description&quot;:&quot;城市名称，例如：北京、上海、杭州&quot;}},&quot;required&quot;:[&quot;location&quot;]}}}]</p>
     */
    @NameInMap("tools")
    public String tools;

    // 格式化响应
    /**
     * <strong>example:</strong>
     * <p>{             &quot;type&quot;: &quot;json_object&quot;         }</p>
     */
    @NameInMap("response_format")
    public String responseFormat;

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

    public ParameterData setTools(String tools) {
        this.tools = tools;
        return this;
    }
    public String getTools() {
        return this.tools;
    }

    public ParameterData setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }
    public String getResponseFormat() {
        return this.responseFormat;
    }

}
