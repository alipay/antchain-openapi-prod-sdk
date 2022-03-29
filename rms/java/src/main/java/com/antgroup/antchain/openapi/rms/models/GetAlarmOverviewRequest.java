// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetAlarmOverviewRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 	
    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // end_time
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // alarm_type
    @NameInMap("alarm_type")
    @Validation(required = true)
    public String alarmType;

    public static GetAlarmOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlarmOverviewRequest self = new GetAlarmOverviewRequest();
        return TeaModel.build(map, self);
    }

    public GetAlarmOverviewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAlarmOverviewRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetAlarmOverviewRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetAlarmOverviewRequest setAlarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }
    public String getAlarmType() {
        return this.alarmType;
    }

}
