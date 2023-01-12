// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OpsAllowedRolesRequest extends TeaModel {
    // 角色列表
    @NameInMap("allowed_roles")
    @Validation(required = true)
    public java.util.List<String> allowedRoles;

    // 授权用户
    @NameInMap("allowed_operators")
    @Validation(required = true)
    public java.util.List<String> allowedOperators;

    // 授权工作空间列表
    @NameInMap("workspace_ids")
    @Validation(required = true)
    public java.util.List<String> workspaceIds;

    public static OpsAllowedRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        OpsAllowedRolesRequest self = new OpsAllowedRolesRequest();
        return TeaModel.build(map, self);
    }

    public OpsAllowedRolesRequest setAllowedRoles(java.util.List<String> allowedRoles) {
        this.allowedRoles = allowedRoles;
        return this;
    }
    public java.util.List<String> getAllowedRoles() {
        return this.allowedRoles;
    }

    public OpsAllowedRolesRequest setAllowedOperators(java.util.List<String> allowedOperators) {
        this.allowedOperators = allowedOperators;
        return this;
    }
    public java.util.List<String> getAllowedOperators() {
        return this.allowedOperators;
    }

    public OpsAllowedRolesRequest setWorkspaceIds(java.util.List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public java.util.List<String> getWorkspaceIds() {
        return this.workspaceIds;
    }

}
