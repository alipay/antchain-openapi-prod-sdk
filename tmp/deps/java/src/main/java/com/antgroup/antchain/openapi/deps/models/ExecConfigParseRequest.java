// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ExecConfigParseRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 参数定义列表
    @NameInMap("params")
    @Validation(required = true)
    public java.util.List<TemplateParamDef> params;

    // 工作空间组 id
    @NameInMap("workspace_group_id")
    public String workspaceGroupId;

    // 工作空间 id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static ExecConfigParseRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecConfigParseRequest self = new ExecConfigParseRequest();
        return TeaModel.build(map, self);
    }

    public ExecConfigParseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecConfigParseRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public ExecConfigParseRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ExecConfigParseRequest setParams(java.util.List<TemplateParamDef> params) {
        this.params = params;
        return this;
    }
    public java.util.List<TemplateParamDef> getParams() {
        return this.params;
    }

    public ExecConfigParseRequest setWorkspaceGroupId(String workspaceGroupId) {
        this.workspaceGroupId = workspaceGroupId;
        return this;
    }
    public String getWorkspaceGroupId() {
        return this.workspaceGroupId;
    }

    public ExecConfigParseRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
