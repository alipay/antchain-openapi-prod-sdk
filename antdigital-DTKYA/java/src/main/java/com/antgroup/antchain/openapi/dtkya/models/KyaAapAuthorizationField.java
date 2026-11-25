// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class KyaAapAuthorizationField extends TeaModel {
    // 授权字段名
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
     * <p>STRING</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 字段用途说明
    /**
     * <strong>example:</strong>
     * <p>查询城市</p>
     */
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 是否必填
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("required")
    @Validation(required = true)
    public Boolean required;

    public static KyaAapAuthorizationField build(java.util.Map<String, ?> map) throws Exception {
        KyaAapAuthorizationField self = new KyaAapAuthorizationField();
        return TeaModel.build(map, self);
    }

    public KyaAapAuthorizationField setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public KyaAapAuthorizationField setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public KyaAapAuthorizationField setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public KyaAapAuthorizationField setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

}
