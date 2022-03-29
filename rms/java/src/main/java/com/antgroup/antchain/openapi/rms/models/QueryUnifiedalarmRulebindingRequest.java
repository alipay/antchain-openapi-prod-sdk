// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmRulebindingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间名称
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 告警对象类型：APP应用，HOST主机
    @NameInMap("alarm_target_type")
    public String alarmTargetType;

    // 告警对象名称
    @NameInMap("alarm_target_identity")
    public String alarmTargetIdentity;

    // 告警规则ID
    @NameInMap("alarm_rule_id")
    public Long alarmRuleId;

    // 数据源 ID
    @NameInMap("datasource")
    public String datasource;

    // 数据源类型：CUSTOM自定义监控，STACK技术栈监控
    @NameInMap("datasource_type")
    public String datasourceType;

    // 监控指标 URL
    @NameInMap("url")
    public String url;

    public static QueryUnifiedalarmRulebindingRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmRulebindingRequest self = new QueryUnifiedalarmRulebindingRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmRulebindingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUnifiedalarmRulebindingRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryUnifiedalarmRulebindingRequest setAlarmTargetType(String alarmTargetType) {
        this.alarmTargetType = alarmTargetType;
        return this;
    }
    public String getAlarmTargetType() {
        return this.alarmTargetType;
    }

    public QueryUnifiedalarmRulebindingRequest setAlarmTargetIdentity(String alarmTargetIdentity) {
        this.alarmTargetIdentity = alarmTargetIdentity;
        return this;
    }
    public String getAlarmTargetIdentity() {
        return this.alarmTargetIdentity;
    }

    public QueryUnifiedalarmRulebindingRequest setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public Long getAlarmRuleId() {
        return this.alarmRuleId;
    }

    public QueryUnifiedalarmRulebindingRequest setDatasource(String datasource) {
        this.datasource = datasource;
        return this;
    }
    public String getDatasource() {
        return this.datasource;
    }

    public QueryUnifiedalarmRulebindingRequest setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public QueryUnifiedalarmRulebindingRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
