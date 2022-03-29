// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UserGroupRelation extends TeaModel {
    // ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 用户组 ID
    @NameInMap("user_group_id")
    @Validation(required = true)
    public Long userGroupId;

    // 钉钉机器人webhook
    @NameInMap("dingtalk_webhook")
    @Validation(required = true)
    public String dingtalkWebhook;

    // 联系人登录名
    @NameInMap("user_login_name")
    @Validation(required = true)
    public String userLoginName;

    // 用户展示名
    @NameInMap("user_display_name")
    public String userDisplayName;

    // 钉钉机器人
    @NameInMap("ding_ding_robot")
    public String dingDingRobot;

    public static UserGroupRelation build(java.util.Map<String, ?> map) throws Exception {
        UserGroupRelation self = new UserGroupRelation();
        return TeaModel.build(map, self);
    }

    public UserGroupRelation setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UserGroupRelation setUserGroupId(Long userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public Long getUserGroupId() {
        return this.userGroupId;
    }

    public UserGroupRelation setDingtalkWebhook(String dingtalkWebhook) {
        this.dingtalkWebhook = dingtalkWebhook;
        return this;
    }
    public String getDingtalkWebhook() {
        return this.dingtalkWebhook;
    }

    public UserGroupRelation setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
        return this;
    }
    public String getUserLoginName() {
        return this.userLoginName;
    }

    public UserGroupRelation setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
        return this;
    }
    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public UserGroupRelation setDingDingRobot(String dingDingRobot) {
        this.dingDingRobot = dingDingRobot;
        return this;
    }
    public String getDingDingRobot() {
        return this.dingDingRobot;
    }

}
