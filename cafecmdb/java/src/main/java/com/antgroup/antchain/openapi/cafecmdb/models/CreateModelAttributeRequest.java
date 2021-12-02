// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class CreateModelAttributeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所属模型的唯一标识
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // 唯一标识（所属模型内唯一）
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

    // 类型【取值范围：INTEGER，LONG，DOUBLE，FLOAT，BOOLEAN，STRING，DATE，DATETIME，ENUM，ARRAY】
    @NameInMap("type")
    @Validation(required = true)
    public String type;

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

    // group_id
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    public static CreateModelAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelAttributeRequest self = new CreateModelAttributeRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelAttributeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateModelAttributeRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CreateModelAttributeRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public CreateModelAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateModelAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelAttributeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateModelAttributeRequest setReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }
    public Boolean getReadonly() {
        return this.readonly;
    }

    public CreateModelAttributeRequest setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public CreateModelAttributeRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public CreateModelAttributeRequest setDisplayProperties(java.util.List<MapStringToStringEntry> displayProperties) {
        this.displayProperties = displayProperties;
        return this;
    }
    public java.util.List<MapStringToStringEntry> getDisplayProperties() {
        return this.displayProperties;
    }

    public CreateModelAttributeRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
