// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class SwitchOpsAlarmRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // DATA_OPS： 诊断告警
    // AGENT：agent告警
    // 
    @NameInMap("alarm_target_type")
    @Validation(required = true)
    public String alarmTargetType;

    // 1：开启告警
    // 0：暂停告警
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 应用
    @NameInMap("alarm_target_identity")
    public String alarmTargetIdentity;

    public static SwitchOpsAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchOpsAlarmRequest self = new SwitchOpsAlarmRequest();
        return TeaModel.build(map, self);
    }

    public SwitchOpsAlarmRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SwitchOpsAlarmRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public SwitchOpsAlarmRequest setAlarmTargetType(String alarmTargetType) {
        this.alarmTargetType = alarmTargetType;
        return this;
    }
    public String getAlarmTargetType() {
        return this.alarmTargetType;
    }

    public SwitchOpsAlarmRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public SwitchOpsAlarmRequest setAlarmTargetIdentity(String alarmTargetIdentity) {
        this.alarmTargetIdentity = alarmTargetIdentity;
        return this;
    }
    public String getAlarmTargetIdentity() {
        return this.alarmTargetIdentity;
    }

}
