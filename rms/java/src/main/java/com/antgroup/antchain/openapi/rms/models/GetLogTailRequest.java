// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetLogTailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间名称
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // the preferHost
    @NameInMap("prefer_host")
    public String preferHost;

    // 日志完整路径
    @NameInMap("full_path")
    public String fullPath;

    // 扫描路径
    @NameInMap("scan_dirs")
    public java.util.List<String> scanDirs;

    public static GetLogTailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogTailRequest self = new GetLogTailRequest();
        return TeaModel.build(map, self);
    }

    public GetLogTailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetLogTailRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetLogTailRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLogTailRequest setPreferHost(String preferHost) {
        this.preferHost = preferHost;
        return this;
    }
    public String getPreferHost() {
        return this.preferHost;
    }

    public GetLogTailRequest setFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }
    public String getFullPath() {
        return this.fullPath;
    }

    public GetLogTailRequest setScanDirs(java.util.List<String> scanDirs) {
        this.scanDirs = scanDirs;
        return this;
    }
    public java.util.List<String> getScanDirs() {
        return this.scanDirs;
    }

}
