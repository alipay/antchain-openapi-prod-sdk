// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmEventdetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作区名
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // event id
    @NameInMap("event_id")
    @Validation(required = true)
    public String eventId;

    // 告警规则 ID
    @NameInMap("alarm_rule_id")
    public Long alarmRuleId;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 按page_size做记录切分。
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryUnifiedalarmEventdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmEventdetailRequest self = new QueryUnifiedalarmEventdetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmEventdetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUnifiedalarmEventdetailRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryUnifiedalarmEventdetailRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public QueryUnifiedalarmEventdetailRequest setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public Long getAlarmRuleId() {
        return this.alarmRuleId;
    }

    public QueryUnifiedalarmEventdetailRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryUnifiedalarmEventdetailRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
