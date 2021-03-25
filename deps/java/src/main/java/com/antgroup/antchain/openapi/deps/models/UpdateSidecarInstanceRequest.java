// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateSidecarInstanceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 版本实例描述	
    // 
    @NameInMap("description")
    public String description;

    // 版本实例名称
    @NameInMap("instance_name")
    @Validation(required = true)
    public String instanceName;

    // 环境模板参数
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
    @NameInMap("params_configs")
    @Validation(required = true)
    public java.util.List<SidecarParamsConfig> paramsConfigs;

    public static UpdateSidecarInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSidecarInstanceRequest self = new UpdateSidecarInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSidecarInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSidecarInstanceRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UpdateSidecarInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSidecarInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateSidecarInstanceRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public UpdateSidecarInstanceRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateSidecarInstanceRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UpdateSidecarInstanceRequest setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

    public UpdateSidecarInstanceRequest setSidecarReleaseVersionId(String sidecarReleaseVersionId) {
        this.sidecarReleaseVersionId = sidecarReleaseVersionId;
        return this;
    }
    public String getSidecarReleaseVersionId() {
        return this.sidecarReleaseVersionId;
    }

    public UpdateSidecarInstanceRequest setParamsConfigs(java.util.List<SidecarParamsConfig> paramsConfigs) {
        this.paramsConfigs = paramsConfigs;
        return this;
    }
    public java.util.List<SidecarParamsConfig> getParamsConfigs() {
        return this.paramsConfigs;
    }

}
