// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class JsonSchema extends TeaModel {
    // 工具属性，Map<String, Object> 类型，适配网关透出，使用字符串方式存储
    /**
     * <strong>example:</strong>
     * <p>[{}]</p>
     */
    @NameInMap("properties_json")
    @Validation(required = true)
    public String propertiesJson;

    // 类型
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 必填项
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("required")
    @Validation(required = true)
    public java.util.List<String> required;

    // 是否允许额外属性
    @NameInMap("additional_properties")
    @Validation(required = true)
    public Boolean additionalProperties;

    public static JsonSchema build(java.util.Map<String, ?> map) throws Exception {
        JsonSchema self = new JsonSchema();
        return TeaModel.build(map, self);
    }

    public JsonSchema setPropertiesJson(String propertiesJson) {
        this.propertiesJson = propertiesJson;
        return this;
    }
    public String getPropertiesJson() {
        return this.propertiesJson;
    }

    public JsonSchema setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public JsonSchema setRequired(java.util.List<String> required) {
        this.required = required;
        return this;
    }
    public java.util.List<String> getRequired() {
        return this.required;
    }

    public JsonSchema setAdditionalProperties(Boolean additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }
    public Boolean getAdditionalProperties() {
        return this.additionalProperties;
    }

}
