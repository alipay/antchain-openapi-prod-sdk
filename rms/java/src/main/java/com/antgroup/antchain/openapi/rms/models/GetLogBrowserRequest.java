// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetLogBrowserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 扫描根目录
    @NameInMap("scan_dirs")
    @Validation(required = true)
    public java.util.List<String> scanDirs;

    // preferHost
    @NameInMap("prefer_host")
    public String preferHost;

    public static GetLogBrowserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogBrowserRequest self = new GetLogBrowserRequest();
        return TeaModel.build(map, self);
    }

    public GetLogBrowserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetLogBrowserRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetLogBrowserRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLogBrowserRequest setScanDirs(java.util.List<String> scanDirs) {
        this.scanDirs = scanDirs;
        return this;
    }
    public java.util.List<String> getScanDirs() {
        return this.scanDirs;
    }

    public GetLogBrowserRequest setPreferHost(String preferHost) {
        this.preferHost = preferHost;
        return this;
    }
    public String getPreferHost() {
        return this.preferHost;
    }

}
