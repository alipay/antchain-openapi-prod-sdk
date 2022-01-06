// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AuthRuleVO extends TeaModel {
    // 分组id
    @NameInMap("auth_rule_group_id")
    public String authRuleGroupId;

    // changedItemCnt
    @NameInMap("changed_item_cnt")
    public Long changedItemCnt;

    // changed_type
    @NameInMap("changed_type")
    public String changedType;

    // 是否生效，1 生效，0 未生效。默认未生效
    @NameInMap("enabled")
    public Long enabled;

    // 规则id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 模式
    @NameInMap("mode")
    public String mode;

    // 规则名
    @NameInMap("name")
    public String name;

    // 所有规则项
    @NameInMap("rule_items")
    public java.util.List<AuthRuleItemVO> ruleItems;

    public static AuthRuleVO build(java.util.Map<String, ?> map) throws Exception {
        AuthRuleVO self = new AuthRuleVO();
        return TeaModel.build(map, self);
    }

    public AuthRuleVO setAuthRuleGroupId(String authRuleGroupId) {
        this.authRuleGroupId = authRuleGroupId;
        return this;
    }
    public String getAuthRuleGroupId() {
        return this.authRuleGroupId;
    }

    public AuthRuleVO setChangedItemCnt(Long changedItemCnt) {
        this.changedItemCnt = changedItemCnt;
        return this;
    }
    public Long getChangedItemCnt() {
        return this.changedItemCnt;
    }

    public AuthRuleVO setChangedType(String changedType) {
        this.changedType = changedType;
        return this;
    }
    public String getChangedType() {
        return this.changedType;
    }

    public AuthRuleVO setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public AuthRuleVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AuthRuleVO setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AuthRuleVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AuthRuleVO setRuleItems(java.util.List<AuthRuleItemVO> ruleItems) {
        this.ruleItems = ruleItems;
        return this;
    }
    public java.util.List<AuthRuleItemVO> getRuleItems() {
        return this.ruleItems;
    }

}
