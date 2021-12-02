// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class Attribute extends TeaModel {
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

    // 是否为系统内置
    @NameInMap("system")
    @Validation(required = true)
    public Boolean system;

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
    @Validation(required = true)
    public Long priority;

    // 用于前端展示的扩展属性
    @NameInMap("display_properties")
    public java.util.List<MapStringToStringEntry> displayProperties;

    // 创建时间
    @NameInMap("created_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // 修改时间
    @NameInMap("modified_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String modifiedTime;

    // 字段分组Id
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    public static Attribute build(java.util.Map<String, ?> map) throws Exception {
        Attribute self = new Attribute();
        return TeaModel.build(map, self);
    }

    public Attribute setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public Attribute setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public Attribute setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Attribute setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Attribute setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Attribute setSystem(Boolean system) {
        this.system = system;
        return this;
    }
    public Boolean getSystem() {
        return this.system;
    }

    public Attribute setReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }
    public Boolean getReadonly() {
        return this.readonly;
    }

    public Attribute setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public Attribute setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public Attribute setDisplayProperties(java.util.List<MapStringToStringEntry> displayProperties) {
        this.displayProperties = displayProperties;
        return this;
    }
    public java.util.List<MapStringToStringEntry> getDisplayProperties() {
        return this.displayProperties;
    }

    public Attribute setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Attribute setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public Attribute setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
