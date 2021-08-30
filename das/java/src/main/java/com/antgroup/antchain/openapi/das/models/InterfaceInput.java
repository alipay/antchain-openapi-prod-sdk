// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class InterfaceInput extends TeaModel {
    // 接口入参名称
    @NameInMap("name")
    @Validation(maxLength = 50)
    public String name;

    // 接口入参类型
    @NameInMap("type")
    @Validation(maxLength = 50)
    public String type;

    // 接口入参描述
    @NameInMap("description")
    @Validation(maxLength = 100)
    public String description;

    // 接口入参是否必填
    @NameInMap("required")
    public Boolean required;

    public static InterfaceInput build(java.util.Map<String, ?> map) throws Exception {
        InterfaceInput self = new InterfaceInput();
        return TeaModel.build(map, self);
    }

    public InterfaceInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InterfaceInput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public InterfaceInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public InterfaceInput setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

}
