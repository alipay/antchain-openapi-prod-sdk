// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmSubDTO extends TeaModel {
    // ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 告警展示名称
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 修改人
    @NameInMap("modifier")
    @Validation(required = true)
    public String modifier;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // 告警订阅类型(folder、customplugin)
    @NameInMap("subscription_type")
    @Validation(required = true)
    public String subscriptionType;

    // 通知组列表
    @NameInMap("user_groups")
    public java.util.List<UserGroup> userGroups;

    // 联系人登录名数组
    @NameInMap("user_login_names")
    public java.util.List<String> userLoginNames;

    public static AlarmSubDTO build(java.util.Map<String, ?> map) throws Exception {
        AlarmSubDTO self = new AlarmSubDTO();
        return TeaModel.build(map, self);
    }

    public AlarmSubDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AlarmSubDTO setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public AlarmSubDTO setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public AlarmSubDTO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public AlarmSubDTO setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public AlarmSubDTO setUserGroups(java.util.List<UserGroup> userGroups) {
        this.userGroups = userGroups;
        return this;
    }
    public java.util.List<UserGroup> getUserGroups() {
        return this.userGroups;
    }

    public AlarmSubDTO setUserLoginNames(java.util.List<String> userLoginNames) {
        this.userLoginNames = userLoginNames;
        return this;
    }
    public java.util.List<String> getUserLoginNames() {
        return this.userLoginNames;
    }

}
