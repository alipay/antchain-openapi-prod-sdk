// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class StructuredDataField extends TeaModel {
    // 字段名称
    @NameInMap("name")
    public String name;

    // 字段描述
    @NameInMap("description")
    public String description;

    // 字段类型。
    // 示例如下：
    // STRING,
    // INTEGER,
    // DOUBLE,
    // BOOLEAN
    @NameInMap("type")
    public String type;

    // 字段是否可为空
    @NameInMap("nullable")
    public Boolean nullable;

    public static StructuredDataField build(java.util.Map<String, ?> map) throws Exception {
        StructuredDataField self = new StructuredDataField();
        return TeaModel.build(map, self);
    }

    public StructuredDataField setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StructuredDataField setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StructuredDataField setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public StructuredDataField setNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }
    public Boolean getNullable() {
        return this.nullable;
    }

}
