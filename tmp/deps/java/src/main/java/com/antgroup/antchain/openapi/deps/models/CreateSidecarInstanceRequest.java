// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateSidecarInstanceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 规则描述
    @NameInMap("description")
    public String description;

    // 实例名称
    @NameInMap("instance_name")
    @Validation(required = true)
    public String instanceName;

    // 环境参数模板
    @NameInMap("params")
    public String params;

    // 自定义规则内容
    @NameInMap("rule")
    @Validation(required = true)
    public String rule;

    // sidecar生效范围：workspace、workspace_group、region	
    // 
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // scope对应的唯一标识，例如workspace对应workspace id	
    // 
    @NameInMap("scope_identity")
    @Validation(required = true)
    public String scopeIdentity;

    // sidecar版本id	
    // 
    @NameInMap("sidecar_release_version_id")
    @Validation(required = true)
    public String sidecarReleaseVersionId;

    // sidecar环境参数配置	
    // 
    @NameInMap("params_configs")
    @Validation(required = true)
    public java.util.List<SidecarParamsConfig> paramsConfigs;

    public static CreateSidecarInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSidecarInstanceRequest self = new CreateSidecarInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSidecarInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSidecarInstanceRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateSidecarInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSidecarInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateSidecarInstanceRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public CreateSidecarInstanceRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateSidecarInstanceRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateSidecarInstanceRequest setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

    public CreateSidecarInstanceRequest setSidecarReleaseVersionId(String sidecarReleaseVersionId) {
        this.sidecarReleaseVersionId = sidecarReleaseVersionId;
        return this;
    }
    public String getSidecarReleaseVersionId() {
        return this.sidecarReleaseVersionId;
    }

    public CreateSidecarInstanceRequest setParamsConfigs(java.util.List<SidecarParamsConfig> paramsConfigs) {
        this.paramsConfigs = paramsConfigs;
        return this;
    }
    public java.util.List<SidecarParamsConfig> getParamsConfigs() {
        return this.paramsConfigs;
    }

}
