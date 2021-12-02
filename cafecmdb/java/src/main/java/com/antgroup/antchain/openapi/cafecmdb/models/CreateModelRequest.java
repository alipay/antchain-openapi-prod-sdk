// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class CreateModelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

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

    // 用于前端展示排序，数字越大优先级越高，默认为 0
    @NameInMap("priority")
    public Long priority;

    // 用于前端展示的扩展属性
    @NameInMap("display_properties")
    public java.util.List<MapStringToStringEntry> displayProperties;

    public static CreateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelRequest self = new CreateModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateModelRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public CreateModelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateModelRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public CreateModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public CreateModelRequest setDisplayProperties(java.util.List<MapStringToStringEntry> displayProperties) {
        this.displayProperties = displayProperties;
        return this;
    }
    public java.util.List<MapStringToStringEntry> getDisplayProperties() {
        return this.displayProperties;
    }

}
