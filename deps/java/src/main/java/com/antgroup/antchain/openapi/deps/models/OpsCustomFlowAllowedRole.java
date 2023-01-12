// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OpsCustomFlowAllowedRole extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // 模板id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 授权用户
    @NameInMap("allowed_executor")
    public String allowedExecutor;

    // 授权角色
    @NameInMap("allowed_role")
    public String allowedRole;

    public static OpsCustomFlowAllowedRole build(java.util.Map<String, ?> map) throws Exception {
        OpsCustomFlowAllowedRole self = new OpsCustomFlowAllowedRole();
        return TeaModel.build(map, self);
    }

    public OpsCustomFlowAllowedRole setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OpsCustomFlowAllowedRole setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpsCustomFlowAllowedRole setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public OpsCustomFlowAllowedRole setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public OpsCustomFlowAllowedRole setAllowedExecutor(String allowedExecutor) {
        this.allowedExecutor = allowedExecutor;
        return this;
    }
    public String getAllowedExecutor() {
        return this.allowedExecutor;
    }

    public OpsCustomFlowAllowedRole setAllowedRole(String allowedRole) {
        this.allowedRole = allowedRole;
        return this;
    }
    public String getAllowedRole() {
        return this.allowedRole;
    }

}
