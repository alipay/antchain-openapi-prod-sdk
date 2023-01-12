// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateCmdtemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 模板内容
    @NameInMap("template")
    @Validation(required = true)
    public CmdTemplate template;

    // 可见范围：TENANT/WORKSPACE
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // 可见范围id列表
    @NameInMap("scope_ids")
    public java.util.List<String> scopeIds;

    // 工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static CreateCmdtemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCmdtemplateRequest self = new CreateCmdtemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCmdtemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCmdtemplateRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateCmdtemplateRequest setTemplate(CmdTemplate template) {
        this.template = template;
        return this;
    }
    public CmdTemplate getTemplate() {
        return this.template;
    }

    public CreateCmdtemplateRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateCmdtemplateRequest setScopeIds(java.util.List<String> scopeIds) {
        this.scopeIds = scopeIds;
        return this;
    }
    public java.util.List<String> getScopeIds() {
        return this.scopeIds;
    }

    public CreateCmdtemplateRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
