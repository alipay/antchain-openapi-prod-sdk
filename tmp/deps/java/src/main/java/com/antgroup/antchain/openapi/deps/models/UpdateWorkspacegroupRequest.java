// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateWorkspacegroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 域名后缀。
    @NameInMap("domain_suffix")
    public String domainSuffix;

    // workspacegroup名称，唯一标识一个环境。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // workspacegroup显示名称。
    @NameInMap("display_name")
    public String displayName;

    // 包含工作空间名称。
    @NameInMap("workspaces")
    public java.util.List<String> workspaces;

    public static UpdateWorkspacegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspacegroupRequest self = new UpdateWorkspacegroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspacegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateWorkspacegroupRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UpdateWorkspacegroupRequest setDomainSuffix(String domainSuffix) {
        this.domainSuffix = domainSuffix;
        return this;
    }
    public String getDomainSuffix() {
        return this.domainSuffix;
    }

    public UpdateWorkspacegroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWorkspacegroupRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateWorkspacegroupRequest setWorkspaces(java.util.List<String> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<String> getWorkspaces() {
        return this.workspaces;
    }

}
