// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class AapAuthorizationField extends TeaModel {
    // 字段名
    /**
     * <strong>example:</strong>
     * <p>city</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 字段类型
    /**
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 字段说明
    /**
     * <strong>example:</strong>
     * <p>允许查询的城市</p>
     */
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 提交协议时是否必填
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("required")
    @Validation(required = true)
    public Boolean required;

    public static AapAuthorizationField build(java.util.Map<String, ?> map) throws Exception {
        AapAuthorizationField self = new AapAuthorizationField();
        return TeaModel.build(map, self);
    }

    public AapAuthorizationField setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AapAuthorizationField setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AapAuthorizationField setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AapAuthorizationField setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

}
