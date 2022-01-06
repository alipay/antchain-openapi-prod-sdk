// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AuthRuleItemVO extends TeaModel {
    // 规则id
    @NameInMap("auth_rule_id")
    public Long authRuleId;

    // 操作类型
    @NameInMap("changed_type")
    public String changedType;

    // 规则字段
    @NameInMap("field")
    public String field;

    // 操作类型(EQUAL,NOT_EQUAL,IN,NOT_INT,REGEX)
    @NameInMap("operation")
    public String operation;

    // AuthRuleItemModel
    @NameInMap("published_auth_rule_item")
    public AuthRuleItemModel publishedAuthRuleItem;

    // 系统内置或者用户自定义 SYSTEM/CUSTOM
    @NameInMap("type")
    public String type;

    // 规则项的值
    @NameInMap("value")
    public String value;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static AuthRuleItemVO build(java.util.Map<String, ?> map) throws Exception {
        AuthRuleItemVO self = new AuthRuleItemVO();
        return TeaModel.build(map, self);
    }

    public AuthRuleItemVO setAuthRuleId(Long authRuleId) {
        this.authRuleId = authRuleId;
        return this;
    }
    public Long getAuthRuleId() {
        return this.authRuleId;
    }

    public AuthRuleItemVO setChangedType(String changedType) {
        this.changedType = changedType;
        return this;
    }
    public String getChangedType() {
        return this.changedType;
    }

    public AuthRuleItemVO setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public AuthRuleItemVO setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public AuthRuleItemVO setPublishedAuthRuleItem(AuthRuleItemModel publishedAuthRuleItem) {
        this.publishedAuthRuleItem = publishedAuthRuleItem;
        return this;
    }
    public AuthRuleItemModel getPublishedAuthRuleItem() {
        return this.publishedAuthRuleItem;
    }

    public AuthRuleItemVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AuthRuleItemVO setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public AuthRuleItemVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
