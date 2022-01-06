// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AuthRuleItem extends TeaModel {
    // 所属的鉴权规则id
    @NameInMap("auth_rule_id")
    public Long authRuleId;

    // 枚举类型
    // SYSTEM 表示系统内置字段
    // CUSTOM 表示用户自定义字段
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 匹配字段
    @NameInMap("field")
    @Validation(required = true)
    public String field;

    // 操作符，通过 FormConfig 可以获取支持所有的操作符
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // 匹配的值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static AuthRuleItem build(java.util.Map<String, ?> map) throws Exception {
        AuthRuleItem self = new AuthRuleItem();
        return TeaModel.build(map, self);
    }

    public AuthRuleItem setAuthRuleId(Long authRuleId) {
        this.authRuleId = authRuleId;
        return this;
    }
    public Long getAuthRuleId() {
        return this.authRuleId;
    }

    public AuthRuleItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AuthRuleItem setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public AuthRuleItem setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public AuthRuleItem setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
