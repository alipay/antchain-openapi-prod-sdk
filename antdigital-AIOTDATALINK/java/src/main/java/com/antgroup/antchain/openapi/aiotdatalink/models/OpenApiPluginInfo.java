// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiotdatalink.models;

import com.aliyun.tea.*;

public class OpenApiPluginInfo extends TeaModel {
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

    public static OpenApiPluginInfo build(java.util.Map<String, ?> map) throws Exception {
        OpenApiPluginInfo self = new OpenApiPluginInfo();
        return TeaModel.build(map, self);
    }

    public OpenApiPluginInfo setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public OpenApiPluginInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public OpenApiPluginInfo setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public OpenApiPluginInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpenApiPluginInfo setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

    public OpenApiPluginInfo setParameterDefinitions(String parameterDefinitions) {
        this.parameterDefinitions = parameterDefinitions;
        return this;
    }
    public String getParameterDefinitions() {
        return this.parameterDefinitions;
    }

}
