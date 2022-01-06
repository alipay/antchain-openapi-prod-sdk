// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class DowngradeRuleVo extends TeaModel {
    // 主键
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 降级规则组id
    @NameInMap("group_id")
    @Validation(required = true)
    public Long groupId;

    // 降级服务
    @NameInMap("downgrade_service")
    @Validation(required = true)
    public String downgradeService;

    // 降级方法
    @NameInMap("downgrade_method")
    @Validation(required = true)
    public String downgradeMethod;

    // 规则描述
    @NameInMap("rule_name")
    @Validation(required = true)
    public String ruleName;

    // 降级开关(0: 关闭 1: 开启) 
    @NameInMap("enabled")
    @Validation(required = true)
    public Long enabled;

    // 运行模式
    @NameInMap("mode")
    @Validation(required = true)
    public String mode;

    // 降级行为
    @NameInMap("downgrade_action")
    @Validation(required = true)
    public String downgradeAction;

    // 更新时间
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    public static DowngradeRuleVo build(java.util.Map<String, ?> map) throws Exception {
        DowngradeRuleVo self = new DowngradeRuleVo();
        return TeaModel.build(map, self);
    }

    public DowngradeRuleVo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DowngradeRuleVo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DowngradeRuleVo setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DowngradeRuleVo setDowngradeService(String downgradeService) {
        this.downgradeService = downgradeService;
        return this;
    }
    public String getDowngradeService() {
        return this.downgradeService;
    }

    public DowngradeRuleVo setDowngradeMethod(String downgradeMethod) {
        this.downgradeMethod = downgradeMethod;
        return this;
    }
    public String getDowngradeMethod() {
        return this.downgradeMethod;
    }

    public DowngradeRuleVo setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DowngradeRuleVo setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public DowngradeRuleVo setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public DowngradeRuleVo setDowngradeAction(String downgradeAction) {
        this.downgradeAction = downgradeAction;
        return this;
    }
    public String getDowngradeAction() {
        return this.downgradeAction;
    }

    public DowngradeRuleVo setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
