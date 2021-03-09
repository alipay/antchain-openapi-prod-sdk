// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppLifeCycle extends TeaModel {
    // ID
    @NameInMap("id")
    public String id;

    // 应用ID
    @NameInMap("app_id")
    public String appId;

    // 工作空间ID
    @NameInMap("workspace_id")
    public String workspaceId;

    // 应用状态
    @NameInMap("state")
    public String state;

    // 最近运维单号
    @NameInMap("last_opsorder_id")
    public String lastOpsorderId;

    // 上次发布版本
    @NameInMap("last_deploy_version")
    @Validation(required = true)
    public String lastDeployVersion;

    // 上次发布时间
    @NameInMap("last_deploy_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String lastDeployTime;

    // 上线时间
    @NameInMap("online_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String onlineTime;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtCreate;

    // 最近修改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtModified;

    public static AppLifeCycle build(java.util.Map<String, ?> map) throws Exception {
        AppLifeCycle self = new AppLifeCycle();
        return TeaModel.build(map, self);
    }

    public AppLifeCycle setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppLifeCycle setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppLifeCycle setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public AppLifeCycle setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public AppLifeCycle setLastOpsorderId(String lastOpsorderId) {
        this.lastOpsorderId = lastOpsorderId;
        return this;
    }
    public String getLastOpsorderId() {
        return this.lastOpsorderId;
    }

    public AppLifeCycle setLastDeployVersion(String lastDeployVersion) {
        this.lastDeployVersion = lastDeployVersion;
        return this;
    }
    public String getLastDeployVersion() {
        return this.lastDeployVersion;
    }

    public AppLifeCycle setLastDeployTime(String lastDeployTime) {
        this.lastDeployTime = lastDeployTime;
        return this;
    }
    public String getLastDeployTime() {
        return this.lastDeployTime;
    }

    public AppLifeCycle setOnlineTime(String onlineTime) {
        this.onlineTime = onlineTime;
        return this;
    }
    public String getOnlineTime() {
        return this.onlineTime;
    }

    public AppLifeCycle setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AppLifeCycle setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
