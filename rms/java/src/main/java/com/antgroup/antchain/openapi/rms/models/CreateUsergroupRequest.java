// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CreateUsergroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 通知组名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 钉钉机器人token数组
    @NameInMap("dingtalk_webhooks")
    public java.util.List<String> dingtalkWebhooks;

    // 联系人登录名称数组
    @NameInMap("user_login_names")
    public java.util.List<String> userLoginNames;

    // 0、当前workspace有效；
    // 1、当前租户有效
    @NameInMap("valid_scope")
    public Long validScope;

    // 钉钉机器人
    @NameInMap("ding_ding_robots")
    public java.util.List<String> dingDingRobots;

    public static CreateUsergroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUsergroupRequest self = new CreateUsergroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateUsergroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateUsergroupRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public CreateUsergroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateUsergroupRequest setDingtalkWebhooks(java.util.List<String> dingtalkWebhooks) {
        this.dingtalkWebhooks = dingtalkWebhooks;
        return this;
    }
    public java.util.List<String> getDingtalkWebhooks() {
        return this.dingtalkWebhooks;
    }

    public CreateUsergroupRequest setUserLoginNames(java.util.List<String> userLoginNames) {
        this.userLoginNames = userLoginNames;
        return this;
    }
    public java.util.List<String> getUserLoginNames() {
        return this.userLoginNames;
    }

    public CreateUsergroupRequest setValidScope(Long validScope) {
        this.validScope = validScope;
        return this;
    }
    public Long getValidScope() {
        return this.validScope;
    }

    public CreateUsergroupRequest setDingDingRobots(java.util.List<String> dingDingRobots) {
        this.dingDingRobots = dingDingRobots;
        return this;
    }
    public java.util.List<String> getDingDingRobots() {
        return this.dingDingRobots;
    }

}
