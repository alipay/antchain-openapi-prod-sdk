// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CreateAlarmSubscriptionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 告警等级 (-1表示全部订阅)
    @NameInMap("alarm_level")
    @Validation(required = true)
    public Long alarmLevel;

    // 是否开启通知降频 (0 - 关闭，1 - 开启)
    @NameInMap("notify_reduce_switch")
    @Validation(required = true)
    public Long notifyReduceSwitch;

    // 资源类型（取值范围：CUSTOM_PLUGIN(自定义监控)、FOLDER(文件夹)、UNIVERSAL_TABLE(用户应用)）
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 资源 ID
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // 用户登录名列表
    @NameInMap("user_login_names")
    public java.util.List<String> userLoginNames;

    // 用户组 ID列表
    @NameInMap("user_group_ids")
    public java.util.List<Long> userGroupIds;

    // http web hook id列表
    @NameInMap("alarm_web_hook_ids")
    public java.util.List<Long> alarmWebHookIds;

    public static CreateAlarmSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlarmSubscriptionRequest self = new CreateAlarmSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlarmSubscriptionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAlarmSubscriptionRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public CreateAlarmSubscriptionRequest setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public Long getAlarmLevel() {
        return this.alarmLevel;
    }

    public CreateAlarmSubscriptionRequest setNotifyReduceSwitch(Long notifyReduceSwitch) {
        this.notifyReduceSwitch = notifyReduceSwitch;
        return this;
    }
    public Long getNotifyReduceSwitch() {
        return this.notifyReduceSwitch;
    }

    public CreateAlarmSubscriptionRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateAlarmSubscriptionRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public CreateAlarmSubscriptionRequest setUserLoginNames(java.util.List<String> userLoginNames) {
        this.userLoginNames = userLoginNames;
        return this;
    }
    public java.util.List<String> getUserLoginNames() {
        return this.userLoginNames;
    }

    public CreateAlarmSubscriptionRequest setUserGroupIds(java.util.List<Long> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<Long> getUserGroupIds() {
        return this.userGroupIds;
    }

    public CreateAlarmSubscriptionRequest setAlarmWebHookIds(java.util.List<Long> alarmWebHookIds) {
        this.alarmWebHookIds = alarmWebHookIds;
        return this;
    }
    public java.util.List<Long> getAlarmWebHookIds() {
        return this.alarmWebHookIds;
    }

}
