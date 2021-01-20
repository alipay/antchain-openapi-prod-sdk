// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateWorkspacegroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间组显示名称。
    @NameInMap("display_name")
    public String displayName;

    // 域名后缀。
    @NameInMap("domain_suffix")
    public String domainSuffix;

    // 工作空间组唯一标识。
    @NameInMap("name")
    public String name;

    // 发布部署模式。
    @NameInMap("release_mode")
    public String releaseMode;

    // 包含工作空间列表。
    @NameInMap("workspaces")
    public java.util.List<String> workspaces;

    public static CreateWorkspacegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspacegroupRequest self = new CreateWorkspacegroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspacegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateWorkspacegroupRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateWorkspacegroupRequest setDomainSuffix(String domainSuffix) {
        this.domainSuffix = domainSuffix;
        return this;
    }
    public String getDomainSuffix() {
        return this.domainSuffix;
    }

    public CreateWorkspacegroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWorkspacegroupRequest setReleaseMode(String releaseMode) {
        this.releaseMode = releaseMode;
        return this;
    }
    public String getReleaseMode() {
        return this.releaseMode;
    }

    public CreateWorkspacegroupRequest setWorkspaces(java.util.List<String> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<String> getWorkspaces() {
        return this.workspaces;
    }

}
