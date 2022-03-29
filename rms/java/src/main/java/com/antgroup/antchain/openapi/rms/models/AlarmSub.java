// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmSub extends TeaModel {
    // 主键 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 用户登录名
    @NameInMap("user_login_name")
    public String userLoginName;

    // 告警组 ID
    @NameInMap("user_group_id")
    public Long userGroupId;

    // the notifyChannel
    @NameInMap("notify_channel")
    public String notifyChannel;

    // 告警套餐 ID
    @NameInMap("alarm_pkg_id")
    public Long alarmPkgId;

    // 自定义监控 ID
    @NameInMap("custom_plugin_id")
    public Long customPluginId;

    // the stackAlarmRuleId
    @NameInMap("stack_alarm_rule_id")
    public Long stackAlarmRuleId;

    // 文件夹 ID
    @NameInMap("folder_id")
    public Long folderId;

    // the metaGroupId
    @NameInMap("meta_group_id")
    public Long metaGroupId;

    // 技术栈实体
    @NameInMap("stack_universal_table_id")
    public String stackUniversalTableId;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    public Long gmtModified;

    // 创建者
    @NameInMap("creater")
    @Validation(required = true)
    public String creater;

    // 修改人
    @NameInMap("modifier")
    public String modifier;

    // 告警级别
    @NameInMap("alarm_level")
    @Validation(required = true)
    public Long alarmLevel;

    // 降频通知开关
    @NameInMap("notify_reduce_switch")
    @Validation(required = true)
    public Long notifyReduceSwitch;

    // web hook id
    @NameInMap("alarm_http_web_hook_id")
    public Long alarmHttpWebHookId;

    public static AlarmSub build(java.util.Map<String, ?> map) throws Exception {
        AlarmSub self = new AlarmSub();
        return TeaModel.build(map, self);
    }

    public AlarmSub setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AlarmSub setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
        return this;
    }
    public String getUserLoginName() {
        return this.userLoginName;
    }

    public AlarmSub setUserGroupId(Long userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public Long getUserGroupId() {
        return this.userGroupId;
    }

    public AlarmSub setNotifyChannel(String notifyChannel) {
        this.notifyChannel = notifyChannel;
        return this;
    }
    public String getNotifyChannel() {
        return this.notifyChannel;
    }

    public AlarmSub setAlarmPkgId(Long alarmPkgId) {
        this.alarmPkgId = alarmPkgId;
        return this;
    }
    public Long getAlarmPkgId() {
        return this.alarmPkgId;
    }

    public AlarmSub setCustomPluginId(Long customPluginId) {
        this.customPluginId = customPluginId;
        return this;
    }
    public Long getCustomPluginId() {
        return this.customPluginId;
    }

    public AlarmSub setStackAlarmRuleId(Long stackAlarmRuleId) {
        this.stackAlarmRuleId = stackAlarmRuleId;
        return this;
    }
    public Long getStackAlarmRuleId() {
        return this.stackAlarmRuleId;
    }

    public AlarmSub setFolderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }
    public Long getFolderId() {
        return this.folderId;
    }

    public AlarmSub setMetaGroupId(Long metaGroupId) {
        this.metaGroupId = metaGroupId;
        return this;
    }
    public Long getMetaGroupId() {
        return this.metaGroupId;
    }

    public AlarmSub setStackUniversalTableId(String stackUniversalTableId) {
        this.stackUniversalTableId = stackUniversalTableId;
        return this;
    }
    public String getStackUniversalTableId() {
        return this.stackUniversalTableId;
    }

    public AlarmSub setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public AlarmSub setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public AlarmSub setCreater(String creater) {
        this.creater = creater;
        return this;
    }
    public String getCreater() {
        return this.creater;
    }

    public AlarmSub setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public AlarmSub setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public Long getAlarmLevel() {
        return this.alarmLevel;
    }

    public AlarmSub setNotifyReduceSwitch(Long notifyReduceSwitch) {
        this.notifyReduceSwitch = notifyReduceSwitch;
        return this;
    }
    public Long getNotifyReduceSwitch() {
        return this.notifyReduceSwitch;
    }

    public AlarmSub setAlarmHttpWebHookId(Long alarmHttpWebHookId) {
        this.alarmHttpWebHookId = alarmHttpWebHookId;
        return this;
    }
    public Long getAlarmHttpWebHookId() {
        return this.alarmHttpWebHookId;
    }

}
