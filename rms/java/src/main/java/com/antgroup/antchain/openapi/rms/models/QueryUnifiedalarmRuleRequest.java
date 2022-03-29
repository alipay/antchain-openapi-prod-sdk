// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmRuleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 告警规则名称模糊搜索
    @NameInMap("keyword")
    public String keyword;

    // 告警等级
    @NameInMap("level")
    public Long level;

    // 告警对象
    @NameInMap("alarm_target")
    public AlarmTarget alarmTarget;

    // 启停状态
    @NameInMap("rule_status")
    public Long ruleStatus;

    // 告警状态
    @NameInMap("alarm_status")
    public Long alarmStatus;

    // 只看我
    @NameInMap("only_me")
    public Boolean onlyMe;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页面尺寸
    @NameInMap("page_size")
    public Long pageSize;

    // 工作区名
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 告警规则id
    @NameInMap("rule_id")
    public Long ruleId;

    // 告警唯一标识
    @NameInMap("rule_unique_identity")
    public String ruleUniqueIdentity;

    // 标识符 区分规则是自定义规则还是pql规则
    @NameInMap("category")
    @Validation(required = true)
    public String category;

    //  
    @NameInMap("ref_datasource_type")
    public String refDatasourceType;

    // 根据用户组过滤
    @NameInMap("filter_user_group")
    public Long filterUserGroup;

    // 根据webhook过滤
    @NameInMap("filter_webhook")
    public Long filterWebhook;

    // 钉钉机器人过滤
    @NameInMap("filter_ding_robot")
    public Long filterDingRobot;

    // 根据应栈信息对告警规则做过滤
    @NameInMap("alarm_stack_info")
    public AlarmStackInfo alarmStackInfo;

    // CUSTOM,STACK,HOST
    @NameInMap("data_source_type")
    public String dataSourceType;

    // 过滤的告警级别
    @NameInMap("levels")
    public java.util.List<Long> levels;

    // 告警事件id
    @NameInMap("alarm_event_id")
    public String alarmEventId;

    public static QueryUnifiedalarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmRuleRequest self = new QueryUnifiedalarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUnifiedalarmRuleRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryUnifiedalarmRuleRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public QueryUnifiedalarmRuleRequest setAlarmTarget(AlarmTarget alarmTarget) {
        this.alarmTarget = alarmTarget;
        return this;
    }
    public AlarmTarget getAlarmTarget() {
        return this.alarmTarget;
    }

    public QueryUnifiedalarmRuleRequest setRuleStatus(Long ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public Long getRuleStatus() {
        return this.ruleStatus;
    }

    public QueryUnifiedalarmRuleRequest setAlarmStatus(Long alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }
    public Long getAlarmStatus() {
        return this.alarmStatus;
    }

    public QueryUnifiedalarmRuleRequest setOnlyMe(Boolean onlyMe) {
        this.onlyMe = onlyMe;
        return this;
    }
    public Boolean getOnlyMe() {
        return this.onlyMe;
    }

    public QueryUnifiedalarmRuleRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryUnifiedalarmRuleRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUnifiedalarmRuleRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryUnifiedalarmRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public QueryUnifiedalarmRuleRequest setRuleUniqueIdentity(String ruleUniqueIdentity) {
        this.ruleUniqueIdentity = ruleUniqueIdentity;
        return this;
    }
    public String getRuleUniqueIdentity() {
        return this.ruleUniqueIdentity;
    }

    public QueryUnifiedalarmRuleRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public QueryUnifiedalarmRuleRequest setRefDatasourceType(String refDatasourceType) {
        this.refDatasourceType = refDatasourceType;
        return this;
    }
    public String getRefDatasourceType() {
        return this.refDatasourceType;
    }

    public QueryUnifiedalarmRuleRequest setFilterUserGroup(Long filterUserGroup) {
        this.filterUserGroup = filterUserGroup;
        return this;
    }
    public Long getFilterUserGroup() {
        return this.filterUserGroup;
    }

    public QueryUnifiedalarmRuleRequest setFilterWebhook(Long filterWebhook) {
        this.filterWebhook = filterWebhook;
        return this;
    }
    public Long getFilterWebhook() {
        return this.filterWebhook;
    }

    public QueryUnifiedalarmRuleRequest setFilterDingRobot(Long filterDingRobot) {
        this.filterDingRobot = filterDingRobot;
        return this;
    }
    public Long getFilterDingRobot() {
        return this.filterDingRobot;
    }

    public QueryUnifiedalarmRuleRequest setAlarmStackInfo(AlarmStackInfo alarmStackInfo) {
        this.alarmStackInfo = alarmStackInfo;
        return this;
    }
    public AlarmStackInfo getAlarmStackInfo() {
        return this.alarmStackInfo;
    }

    public QueryUnifiedalarmRuleRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public QueryUnifiedalarmRuleRequest setLevels(java.util.List<Long> levels) {
        this.levels = levels;
        return this;
    }
    public java.util.List<Long> getLevels() {
        return this.levels;
    }

    public QueryUnifiedalarmRuleRequest setAlarmEventId(String alarmEventId) {
        this.alarmEventId = alarmEventId;
        return this;
    }
    public String getAlarmEventId() {
        return this.alarmEventId;
    }

}
