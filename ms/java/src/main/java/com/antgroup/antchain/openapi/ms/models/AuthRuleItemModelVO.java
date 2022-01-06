// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AuthRuleItemModelVO extends TeaModel {
    // 所属鉴权规则id
    @NameInMap("auth_rule_id")
    public Long authRuleId;

    // 类型
    @NameInMap("type")
    public String type;

    // 字段
    @NameInMap("field")
    public String field;

    // 操作方式
    @NameInMap("operation")
    public String operation;

    // 匹配值
    @NameInMap("value")
    public String value;

    // 主键
    @NameInMap("id")
    public Long id;

    // 操作人
    @NameInMap("operator")
    public String operator;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    public static AuthRuleItemModelVO build(java.util.Map<String, ?> map) throws Exception {
        AuthRuleItemModelVO self = new AuthRuleItemModelVO();
        return TeaModel.build(map, self);
    }

    public AuthRuleItemModelVO setAuthRuleId(Long authRuleId) {
        this.authRuleId = authRuleId;
        return this;
    }
    public Long getAuthRuleId() {
        return this.authRuleId;
    }

    public AuthRuleItemModelVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AuthRuleItemModelVO setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public AuthRuleItemModelVO setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public AuthRuleItemModelVO setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public AuthRuleItemModelVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AuthRuleItemModelVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public AuthRuleItemModelVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AuthRuleItemModelVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
