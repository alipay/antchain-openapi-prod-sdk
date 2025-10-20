// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class JsonSchema extends TeaModel {
    // 类型
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    //  Map<String, Object> 类型
    /**
     * <strong>example:</strong>
     * <p> Map&lt;String, Object&gt; </p>
     */
    @NameInMap("properties")
    @Validation(required = true)
    public String properties;

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

    public JsonSchema setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public JsonSchema setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
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
