// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class RouterRuleGroupVO extends TeaModel {
    // 主键
    @NameInMap("id")
    public Long id;

    // 租户实例id
    @NameInMap("instance_id")
    public String instanceId;

    // 应用名
    @NameInMap("app_name")
    public String appName;

    // 服务id
    @NameInMap("data_id")
    public String dataId;

    // 规则名称
    @NameInMap("rule_name")
    public String ruleName;

    // 版本号
    @NameInMap("version")
    public Long version;

    // 1 开启/ 0 关闭
    @NameInMap("enabled")
    public Long enabled;

    // 优先级
    @NameInMap("priority")
    public Long priority;

    // 灰度条件
    @NameInMap("gray_condition")
    public String grayCondition;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 操作人
    @NameInMap("operator")
    public String operator;

    // 路由规则
    @NameInMap("rules")
    public java.util.List<RouterRuleModel> rules;

    public static RouterRuleGroupVO build(java.util.Map<String, ?> map) throws Exception {
        RouterRuleGroupVO self = new RouterRuleGroupVO();
        return TeaModel.build(map, self);
    }

    public RouterRuleGroupVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RouterRuleGroupVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RouterRuleGroupVO setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public RouterRuleGroupVO setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public RouterRuleGroupVO setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public RouterRuleGroupVO setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public RouterRuleGroupVO setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public RouterRuleGroupVO setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public RouterRuleGroupVO setGrayCondition(String grayCondition) {
        this.grayCondition = grayCondition;
        return this;
    }
    public String getGrayCondition() {
        return this.grayCondition;
    }

    public RouterRuleGroupVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public RouterRuleGroupVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public RouterRuleGroupVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public RouterRuleGroupVO setRules(java.util.List<RouterRuleModel> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<RouterRuleModel> getRules() {
        return this.rules;
    }

}
