// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAlarmhistoryAlarmtrendsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // alarm_type
    @NameInMap("alarm_type")
    @Validation(required = true)
    public String alarmType;

    // group_by
    @NameInMap("group_by")
    @Validation(required = true)
    public String groupBy;

    // from
    @NameInMap("from")
    @Validation(required = true)
    public Long from;

    // to
    @NameInMap("to")
    @Validation(required = true)
    public Long to;

    // 工作空间名称
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    public static QueryAlarmhistoryAlarmtrendsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmhistoryAlarmtrendsRequest self = new QueryAlarmhistoryAlarmtrendsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAlarmhistoryAlarmtrendsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAlarmhistoryAlarmtrendsRequest setAlarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }
    public String getAlarmType() {
        return this.alarmType;
    }

    public QueryAlarmhistoryAlarmtrendsRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public QueryAlarmhistoryAlarmtrendsRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public QueryAlarmhistoryAlarmtrendsRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

    public QueryAlarmhistoryAlarmtrendsRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
