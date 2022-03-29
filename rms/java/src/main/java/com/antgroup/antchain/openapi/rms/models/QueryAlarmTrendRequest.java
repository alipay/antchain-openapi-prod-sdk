// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAlarmTrendRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 开始时间
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    // 结束时间
    @NameInMap("end")
    @Validation(required = true)
    public Long end;

    // 告警类型 (固定传入自定义、应用、应用组3个告警类型)
    @NameInMap("alarm_types")
    @Validation(required = true)
    public java.util.List<String> alarmTypes;

    public static QueryAlarmTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmTrendRequest self = new QueryAlarmTrendRequest();
        return TeaModel.build(map, self);
    }

    public QueryAlarmTrendRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAlarmTrendRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryAlarmTrendRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public QueryAlarmTrendRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public QueryAlarmTrendRequest setAlarmTypes(java.util.List<String> alarmTypes) {
        this.alarmTypes = alarmTypes;
        return this;
    }
    public java.util.List<String> getAlarmTypes() {
        return this.alarmTypes;
    }

}
