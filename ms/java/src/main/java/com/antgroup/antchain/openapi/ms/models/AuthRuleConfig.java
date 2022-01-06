// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AuthRuleConfig extends TeaModel {
    // 字段信息
    @NameInMap("fields")
    @Validation(required = true)
    public java.util.List<ConfigEntity> fields;

    // 操作符集合
    @NameInMap("operations")
    @Validation(required = true)
    public java.util.List<ConfigEntity> operations;

    // 类型，系统内置或者是自定义
    @NameInMap("types")
    @Validation(required = true)
    public java.util.List<ConfigEntity> types;

    public static AuthRuleConfig build(java.util.Map<String, ?> map) throws Exception {
        AuthRuleConfig self = new AuthRuleConfig();
        return TeaModel.build(map, self);
    }

    public AuthRuleConfig setFields(java.util.List<ConfigEntity> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<ConfigEntity> getFields() {
        return this.fields;
    }

    public AuthRuleConfig setOperations(java.util.List<ConfigEntity> operations) {
        this.operations = operations;
        return this;
    }
    public java.util.List<ConfigEntity> getOperations() {
        return this.operations;
    }

    public AuthRuleConfig setTypes(java.util.List<ConfigEntity> types) {
        this.types = types;
        return this;
    }
    public java.util.List<ConfigEntity> getTypes() {
        return this.types;
    }

}
