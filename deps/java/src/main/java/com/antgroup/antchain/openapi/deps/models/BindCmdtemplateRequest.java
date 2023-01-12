// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BindCmdtemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 模板id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // 角色列表
    @NameInMap("roles_request")
    @Validation(required = true)
    public java.util.List<OpsAllowedRolesRequest> rolesRequest;

    public static BindCmdtemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        BindCmdtemplateRequest self = new BindCmdtemplateRequest();
        return TeaModel.build(map, self);
    }

    public BindCmdtemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindCmdtemplateRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public BindCmdtemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public BindCmdtemplateRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public BindCmdtemplateRequest setRolesRequest(java.util.List<OpsAllowedRolesRequest> rolesRequest) {
        this.rolesRequest = rolesRequest;
        return this;
    }
    public java.util.List<OpsAllowedRolesRequest> getRolesRequest() {
        return this.rolesRequest;
    }

}
