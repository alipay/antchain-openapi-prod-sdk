// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class AppInfoVO extends TeaModel {
    // 参与者数组
    @NameInMap("action_array")
    @Validation(required = true)
    public java.util.List<Participator> actionArray;

    // 10
    @NameInMap("action_count")
    @Validation(required = true)
    public Long actionCount;

    // 10
    @NameInMap("activity_count")
    @Validation(required = true)
    public Long activityCount;

    // 1 同库 2 异库
    @NameInMap("activity_mode")
    @Validation(required = true)
    public Long activityMode;

    // app
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 分库规则
    @NameInMap("db_rule_name")
    @Validation(required = true)
    public String dbRuleName;

    // 分库规则
    @NameInMap("db_rule_template")
    @Validation(required = true)
    public String dbRuleTemplate;

    // 一句话描述
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    // 唯一id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 1
    @NameInMap("recovery_array")
    @Validation(required = true)
    public java.util.List<AppRecoveryVO> recoveryArray;

    // 分表类型
    @NameInMap("table_rule_name")
    @Validation(required = true)
    public String tableRuleName;

    // 分表规则
    @NameInMap("table_rule_template")
    @Validation(required = true)
    public String tableRuleTemplate;

    // 是否被使用
    @NameInMap("used")
    @Validation(required = true)
    public Boolean used;

    // 1 单库单表 2 分库分表
    @NameInMap("splite_mode")
    @Validation(required = true)
    public Long spliteMode;

    public static AppInfoVO build(java.util.Map<String, ?> map) throws Exception {
        AppInfoVO self = new AppInfoVO();
        return TeaModel.build(map, self);
    }

    public AppInfoVO setActionArray(java.util.List<Participator> actionArray) {
        this.actionArray = actionArray;
        return this;
    }
    public java.util.List<Participator> getActionArray() {
        return this.actionArray;
    }

    public AppInfoVO setActionCount(Long actionCount) {
        this.actionCount = actionCount;
        return this;
    }
    public Long getActionCount() {
        return this.actionCount;
    }

    public AppInfoVO setActivityCount(Long activityCount) {
        this.activityCount = activityCount;
        return this;
    }
    public Long getActivityCount() {
        return this.activityCount;
    }

    public AppInfoVO setActivityMode(Long activityMode) {
        this.activityMode = activityMode;
        return this;
    }
    public Long getActivityMode() {
        return this.activityMode;
    }

    public AppInfoVO setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppInfoVO setDbRuleName(String dbRuleName) {
        this.dbRuleName = dbRuleName;
        return this;
    }
    public String getDbRuleName() {
        return this.dbRuleName;
    }

    public AppInfoVO setDbRuleTemplate(String dbRuleTemplate) {
        this.dbRuleTemplate = dbRuleTemplate;
        return this;
    }
    public String getDbRuleTemplate() {
        return this.dbRuleTemplate;
    }

    public AppInfoVO setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public AppInfoVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AppInfoVO setRecoveryArray(java.util.List<AppRecoveryVO> recoveryArray) {
        this.recoveryArray = recoveryArray;
        return this;
    }
    public java.util.List<AppRecoveryVO> getRecoveryArray() {
        return this.recoveryArray;
    }

    public AppInfoVO setTableRuleName(String tableRuleName) {
        this.tableRuleName = tableRuleName;
        return this;
    }
    public String getTableRuleName() {
        return this.tableRuleName;
    }

    public AppInfoVO setTableRuleTemplate(String tableRuleTemplate) {
        this.tableRuleTemplate = tableRuleTemplate;
        return this;
    }
    public String getTableRuleTemplate() {
        return this.tableRuleTemplate;
    }

    public AppInfoVO setUsed(Boolean used) {
        this.used = used;
        return this;
    }
    public Boolean getUsed() {
        return this.used;
    }

    public AppInfoVO setSpliteMode(Long spliteMode) {
        this.spliteMode = spliteMode;
        return this;
    }
    public Long getSpliteMode() {
        return this.spliteMode;
    }

}
