// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AuthRule extends TeaModel {
    // 鉴权规则描述
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // REJECT : 表示严格模式，例如不匹配白名单则拒绝访问
    // OBSERVER：表示非严格模式，例如不匹配白名单只记录日志，不拒绝访问
    @NameInMap("mode")
    @Validation(required = true)
    public String mode;

    // 规则所属的名单id
    @NameInMap("auth_rule_group_id")
    @Validation(required = true)
    public Long authRuleGroupId;

    // 是否生效，1 表示生效，0 表示不生效
    @NameInMap("enabled")
    @Validation(required = true)
    public Long enabled;

    // 一条规则下，所有的规则项
    @NameInMap("rule_items")
    public java.util.List<AuthRuleItem> ruleItems;

    public static AuthRule build(java.util.Map<String, ?> map) throws Exception {
        AuthRule self = new AuthRule();
        return TeaModel.build(map, self);
    }

    public AuthRule setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AuthRule setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AuthRule setAuthRuleGroupId(Long authRuleGroupId) {
        this.authRuleGroupId = authRuleGroupId;
        return this;
    }
    public Long getAuthRuleGroupId() {
        return this.authRuleGroupId;
    }

    public AuthRule setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public AuthRule setRuleItems(java.util.List<AuthRuleItem> ruleItems) {
        this.ruleItems = ruleItems;
        return this;
    }
    public java.util.List<AuthRuleItem> getRuleItems() {
        return this.ruleItems;
    }

}
