// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class TemplateParam extends TeaModel {
    // 参数唯一标识
    @NameInMap("id")
    public String id;

    // 参数key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 参数值
    @NameInMap("value")
    public String value;

    // 参数中文名称
    @NameInMap("name")
    public String name;

    // 是否必填
    @NameInMap("required")
    public Boolean required;

    public static TemplateParam build(java.util.Map<String, ?> map) throws Exception {
        TemplateParam self = new TemplateParam();
        return TeaModel.build(map, self);
    }

    public TemplateParam setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public TemplateParam setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public TemplateParam setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public TemplateParam setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TemplateParam setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

}
