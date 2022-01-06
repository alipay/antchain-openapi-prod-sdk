// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AuthRuleItemModel extends TeaModel {
    // 规则id
    @NameInMap("auth_rule_id")
    public Long authRuleId;

    // 规则字段
    @NameInMap("field")
    public String field;

    // 操作类型(EQUAL,NOT_EQUAL,IN,NOT_INT,REGEX)
    @NameInMap("operation")
    public String operation;

    // 规则项的值
    @NameInMap("value")
    public String value;

    // 操作类型
    @NameInMap("changed_type")
    public String changedType;

    public static AuthRuleItemModel build(java.util.Map<String, ?> map) throws Exception {
        AuthRuleItemModel self = new AuthRuleItemModel();
        return TeaModel.build(map, self);
    }

    public AuthRuleItemModel setAuthRuleId(Long authRuleId) {
        this.authRuleId = authRuleId;
        return this;
    }
    public Long getAuthRuleId() {
        return this.authRuleId;
    }

    public AuthRuleItemModel setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public AuthRuleItemModel setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public AuthRuleItemModel setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public AuthRuleItemModel setChangedType(String changedType) {
        this.changedType = changedType;
        return this;
    }
    public String getChangedType() {
        return this.changedType;
    }

}
