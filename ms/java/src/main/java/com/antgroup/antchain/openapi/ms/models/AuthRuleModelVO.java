// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AuthRuleModelVO extends TeaModel {
    // 鉴权规则组id
    @NameInMap("auth_rule_group_id")
    public Long authRuleGroupId;

    // 规则开启状态。0关闭，1开启
    @NameInMap("enabled")
    public Long enabled;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 主键
    @NameInMap("id")
    public String id;

    // 模式，观察者模式（OBSERVER），拦截模式（REJECT）
    @NameInMap("mode")
    public String mode;

    // 名称
    @NameInMap("name")
    public String name;

    // 鉴权规则配置项
    @NameInMap("rule_items")
    public java.util.List<AuthRuleItemModelVO> ruleItems;

    // 类型。白名单（WHITELIST），黑名单（BLACKLIST）
    @NameInMap("type")
    public String type;

    public static AuthRuleModelVO build(java.util.Map<String, ?> map) throws Exception {
        AuthRuleModelVO self = new AuthRuleModelVO();
        return TeaModel.build(map, self);
    }

    public AuthRuleModelVO setAuthRuleGroupId(Long authRuleGroupId) {
        this.authRuleGroupId = authRuleGroupId;
        return this;
    }
    public Long getAuthRuleGroupId() {
        return this.authRuleGroupId;
    }

    public AuthRuleModelVO setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public AuthRuleModelVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AuthRuleModelVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AuthRuleModelVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AuthRuleModelVO setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AuthRuleModelVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AuthRuleModelVO setRuleItems(java.util.List<AuthRuleItemModelVO> ruleItems) {
        this.ruleItems = ruleItems;
        return this;
    }
    public java.util.List<AuthRuleItemModelVO> getRuleItems() {
        return this.ruleItems;
    }

    public AuthRuleModelVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
