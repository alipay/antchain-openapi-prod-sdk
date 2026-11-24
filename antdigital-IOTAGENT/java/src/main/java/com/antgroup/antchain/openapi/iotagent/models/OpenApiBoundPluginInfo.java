// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class OpenApiBoundPluginInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>id_example</p>
     */
    @NameInMap("plugin_id")
    @Validation(required = true)
    public String pluginId;

    // 枚举:DEVICE,CLOUD,KNOWLEDGE_BASE,MCP,SKILL
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 枚举:OFFICIAL,CUSTOM
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("provider")
    @Validation(required = true)
    public String provider;

    /**
     * <strong>example:</strong>
     * <p>测试产品</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    /**
     * <strong>example:</strong>
     * <p>示例说明</p>
     */
    @NameInMap("purpose")
    @Validation(required = true)
    public String purpose;

    // 插件公开参数JSON Schema，不含Header值；JSON对象字符串
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("parameter_definitions")
    public String parameterDefinitions;

    // 枚举:BOUND,PENDING
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("state")
    public String state;

    // 枚举:NEXT_INTERACTION
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("effective_for")
    public String effectiveFor;

    public static OpenApiBoundPluginInfo build(java.util.Map<String, ?> map) throws Exception {
        OpenApiBoundPluginInfo self = new OpenApiBoundPluginInfo();
        return TeaModel.build(map, self);
    }

    public OpenApiBoundPluginInfo setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public OpenApiBoundPluginInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public OpenApiBoundPluginInfo setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public OpenApiBoundPluginInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpenApiBoundPluginInfo setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

    public OpenApiBoundPluginInfo setParameterDefinitions(String parameterDefinitions) {
        this.parameterDefinitions = parameterDefinitions;
        return this;
    }
    public String getParameterDefinitions() {
        return this.parameterDefinitions;
    }

    public OpenApiBoundPluginInfo setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public OpenApiBoundPluginInfo setEffectiveFor(String effectiveFor) {
        this.effectiveFor = effectiveFor;
        return this;
    }
    public String getEffectiveFor() {
        return this.effectiveFor;
    }

}
