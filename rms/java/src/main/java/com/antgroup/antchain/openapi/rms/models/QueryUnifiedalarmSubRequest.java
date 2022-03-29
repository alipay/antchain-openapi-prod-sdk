// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmSubRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 通知人
    @NameInMap("subscriber")
    public String subscriber;

    // 通知人的类型
    @NameInMap("subscriber_type")
    public String subscriberType;

    // 是否包含我 
    @NameInMap("only_me")
    public Boolean onlyMe;

    // 工作区名
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 规则id 
    @NameInMap("alarm_rule_id")
    public Long alarmRuleId;

    // 模板id
    @NameInMap("alarm_tpl_id")
    public Long alarmTplId;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页面尺寸
    @NameInMap("page_size")
    public Long pageSize;

    // 订阅人来源
    @NameInMap("subscriber_source")
    public String subscriberSource;

    public static QueryUnifiedalarmSubRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmSubRequest self = new QueryUnifiedalarmSubRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmSubRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUnifiedalarmSubRequest setSubscriber(String subscriber) {
        this.subscriber = subscriber;
        return this;
    }
    public String getSubscriber() {
        return this.subscriber;
    }

    public QueryUnifiedalarmSubRequest setSubscriberType(String subscriberType) {
        this.subscriberType = subscriberType;
        return this;
    }
    public String getSubscriberType() {
        return this.subscriberType;
    }

    public QueryUnifiedalarmSubRequest setOnlyMe(Boolean onlyMe) {
        this.onlyMe = onlyMe;
        return this;
    }
    public Boolean getOnlyMe() {
        return this.onlyMe;
    }

    public QueryUnifiedalarmSubRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryUnifiedalarmSubRequest setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public Long getAlarmRuleId() {
        return this.alarmRuleId;
    }

    public QueryUnifiedalarmSubRequest setAlarmTplId(Long alarmTplId) {
        this.alarmTplId = alarmTplId;
        return this;
    }
    public Long getAlarmTplId() {
        return this.alarmTplId;
    }

    public QueryUnifiedalarmSubRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryUnifiedalarmSubRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUnifiedalarmSubRequest setSubscriberSource(String subscriberSource) {
        this.subscriberSource = subscriberSource;
        return this;
    }
    public String getSubscriberSource() {
        return this.subscriberSource;
    }

}
