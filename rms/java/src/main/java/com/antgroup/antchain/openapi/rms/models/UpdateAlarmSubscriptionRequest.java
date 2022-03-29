// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateAlarmSubscriptionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 告警订阅主键 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 告警级别
    @NameInMap("alarm_level")
    @Validation(required = true)
    public Long alarmLevel;

    // 降频通知开关
    @NameInMap("notify_reduce_switch")
    @Validation(required = true)
    public Long notifyReduceSwitch;

    public static UpdateAlarmSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlarmSubscriptionRequest self = new UpdateAlarmSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlarmSubscriptionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAlarmSubscriptionRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public UpdateAlarmSubscriptionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateAlarmSubscriptionRequest setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public Long getAlarmLevel() {
        return this.alarmLevel;
    }

    public UpdateAlarmSubscriptionRequest setNotifyReduceSwitch(Long notifyReduceSwitch) {
        this.notifyReduceSwitch = notifyReduceSwitch;
        return this;
    }
    public Long getNotifyReduceSwitch() {
        return this.notifyReduceSwitch;
    }

}
