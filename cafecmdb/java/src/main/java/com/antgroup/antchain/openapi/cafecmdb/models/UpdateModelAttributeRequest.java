// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class UpdateModelAttributeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 要更新的模型字段所属模型的唯一标识
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // 要更新的模型字段的唯一标识
    @NameInMap("unique_id")
    @Validation(required = true)
    public String uniqueId;

    // 名称（所属模型内唯一）
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 描述
    @NameInMap("description")
    public String description;

    // 是否只读
    @NameInMap("readonly")
    @Validation(required = true)
    public Boolean readonly;

    // 是否必填
    @NameInMap("required")
    @Validation(required = true)
    public Boolean required;

    // 用于前端展示排序，数字越大优先级越高，默认为 0
    @NameInMap("priority")
    public Long priority;

    // 用于前端展示的扩展属性
    @NameInMap("display_properties")
    public java.util.List<MapStringToStringEntry> displayProperties;

    public static UpdateModelAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelAttributeRequest self = new UpdateModelAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelAttributeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateModelAttributeRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public UpdateModelAttributeRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public UpdateModelAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateModelAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateModelAttributeRequest setReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }
    public Boolean getReadonly() {
        return this.readonly;
    }

    public UpdateModelAttributeRequest setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public UpdateModelAttributeRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public UpdateModelAttributeRequest setDisplayProperties(java.util.List<MapStringToStringEntry> displayProperties) {
        this.displayProperties = displayProperties;
        return this;
    }
    public java.util.List<MapStringToStringEntry> getDisplayProperties() {
        return this.displayProperties;
    }

}
