// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AppSetting extends TeaModel {
    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public Long tenantId;

    // 工作空间ID
    @NameInMap("workspace_id")
    @Validation(required = true)
    public Long workspaceId;

    // 配置信息
    @NameInMap("setting")
    public String setting;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 应用监控是否开启采集
    @NameInMap("collect_enable")
    @Validation(required = true)
    public Boolean collectEnable;

    public static AppSetting build(java.util.Map<String, ?> map) throws Exception {
        AppSetting self = new AppSetting();
        return TeaModel.build(map, self);
    }

    public AppSetting setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public AppSetting setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public AppSetting setSetting(String setting) {
        this.setting = setting;
        return this;
    }
    public String getSetting() {
        return this.setting;
    }

    public AppSetting setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppSetting setCollectEnable(Boolean collectEnable) {
        this.collectEnable = collectEnable;
        return this;
    }
    public Boolean getCollectEnable() {
        return this.collectEnable;
    }

}
