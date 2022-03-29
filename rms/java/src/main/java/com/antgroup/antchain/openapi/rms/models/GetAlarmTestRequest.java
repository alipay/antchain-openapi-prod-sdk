// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetAlarmTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间名称
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 告警规则的唯一名称
    @NameInMap("alarm_unique_name")
    @Validation(required = true)
    public String alarmUniqueName;

    // 类型
    @NameInMap("type")
    public String type;

    public static GetAlarmTestRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlarmTestRequest self = new GetAlarmTestRequest();
        return TeaModel.build(map, self);
    }

    public GetAlarmTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAlarmTestRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetAlarmTestRequest setAlarmUniqueName(String alarmUniqueName) {
        this.alarmUniqueName = alarmUniqueName;
        return this;
    }
    public String getAlarmUniqueName() {
        return this.alarmUniqueName;
    }

    public GetAlarmTestRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
