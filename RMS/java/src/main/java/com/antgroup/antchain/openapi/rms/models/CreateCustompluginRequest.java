// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CreateCustompluginRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    public String workspaceName;

    // 监控产品类型
    @NameInMap("plugin_type")
    public String pluginType;

    // 监控配置名
    @NameInMap("name")
    public String name;

    // 父级文件夹 ID
    @NameInMap("parent_folder_id")
    public Long parentFolderId;

    // 是否生效
    @NameInMap("is_open")
    public Boolean isOpen;

    // 告警套餐
    @NameInMap("alarm_pkgs")
    public AlarmPkgDO alarmPkgs;

    public static CreateCustompluginRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustompluginRequest self = new CreateCustompluginRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustompluginRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCustompluginRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public CreateCustompluginRequest setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public CreateCustompluginRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustompluginRequest setParentFolderId(Long parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public Long getParentFolderId() {
        return this.parentFolderId;
    }

    public CreateCustompluginRequest setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
        return this;
    }
    public Boolean getIsOpen() {
        return this.isOpen;
    }

    public CreateCustompluginRequest setAlarmPkgs(AlarmPkgDO alarmPkgs) {
        this.alarmPkgs = alarmPkgs;
        return this;
    }
    public AlarmPkgDO getAlarmPkgs() {
        return this.alarmPkgs;
    }

}
