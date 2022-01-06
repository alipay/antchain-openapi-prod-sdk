// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class DowngradeRuleGroupVo extends TeaModel {
    // 主键
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // foo
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 降级全局开关(0:关闭 1:开启)
    @NameInMap("enabled")
    @Validation(required = true)
    public Long enabled;

    // 降级规则
    @NameInMap("downgrade_rules")
    @Validation(required = true)
    public java.util.List<DowngradeRuleVo> downgradeRules;

    public static DowngradeRuleGroupVo build(java.util.Map<String, ?> map) throws Exception {
        DowngradeRuleGroupVo self = new DowngradeRuleGroupVo();
        return TeaModel.build(map, self);
    }

    public DowngradeRuleGroupVo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DowngradeRuleGroupVo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DowngradeRuleGroupVo setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DowngradeRuleGroupVo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DowngradeRuleGroupVo setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public DowngradeRuleGroupVo setDowngradeRules(java.util.List<DowngradeRuleVo> downgradeRules) {
        this.downgradeRules = downgradeRules;
        return this;
    }
    public java.util.List<DowngradeRuleVo> getDowngradeRules() {
        return this.downgradeRules;
    }

}
