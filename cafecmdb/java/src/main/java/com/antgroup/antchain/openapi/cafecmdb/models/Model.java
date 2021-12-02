// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class Model extends TeaModel {
    // 唯一标识（全局唯一）
    @NameInMap("unique_id")
    @Validation(required = true)
    public String uniqueId;

    // 名称（全局唯一）
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 所属模型分组的唯一标识
    @NameInMap("category_id")
    @Validation(required = true)
    public String categoryId;

    // 描述
    @NameInMap("description")
    public String description;

    // 是否为系统内置
    @NameInMap("system")
    @Validation(required = true)
    public Boolean system;

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

    public static Model build(java.util.Map<String, ?> map) throws Exception {
        Model self = new Model();
        return TeaModel.build(map, self);
    }

    public Model setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public Model setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Model setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public Model setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Model setSystem(Boolean system) {
        this.system = system;
        return this;
    }
    public Boolean getSystem() {
        return this.system;
    }

    public Model setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public Model setDisplayProperties(java.util.List<MapStringToStringEntry> displayProperties) {
        this.displayProperties = displayProperties;
        return this;
    }
    public java.util.List<MapStringToStringEntry> getDisplayProperties() {
        return this.displayProperties;
    }

    public Model setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Model setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

}
