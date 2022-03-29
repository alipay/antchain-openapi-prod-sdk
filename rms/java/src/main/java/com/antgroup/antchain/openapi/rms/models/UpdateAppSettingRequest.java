// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateAppSettingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 是否开启应用监控采集
    @NameInMap("collect_enable")
    @Validation(required = true)
    public Boolean collectEnable;

    // 工作空间名称
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 配置信息
    @NameInMap("setting")
    public String setting;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    public static UpdateAppSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppSettingRequest self = new UpdateAppSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppSettingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAppSettingRequest setCollectEnable(Boolean collectEnable) {
        this.collectEnable = collectEnable;
        return this;
    }
    public Boolean getCollectEnable() {
        return this.collectEnable;
    }

    public UpdateAppSettingRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public UpdateAppSettingRequest setSetting(String setting) {
        this.setting = setting;
        return this;
    }
    public String getSetting() {
        return this.setting;
    }

    public UpdateAppSettingRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
