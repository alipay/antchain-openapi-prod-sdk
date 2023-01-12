// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateCustomflowtemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 模板名称
    // 
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 模板描述
    @NameInMap("description")
    public String description;

    // 模板id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 模板类型
    @NameInMap("template_type")
    @Validation(required = true)
    public String templateType;

    // 模板二级类型
    @NameInMap("sub_template_type")
    public String subTemplateType;

    // 模板版本
    @NameInMap("template_version")
    @Validation(required = true)
    public Long templateVersion;

    // 工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // 自定义流程列表
    // 
    @NameInMap("action_list")
    @Validation(required = true)
    public java.util.List<OpsActionWithCommand> actionList;

    // 自定义流程策略配置
    // 
    @NameInMap("action_policies")
    public java.util.List<OpsActionPolicy> actionPolicies;

    // 可见范围
    // 
    @NameInMap("scope")
    public String scope;

    // 可见范围id
    // 
    @NameInMap("scope_ids")
    public java.util.List<String> scopeIds;

    public static UpdateCustomflowtemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomflowtemplateRequest self = new UpdateCustomflowtemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomflowtemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateCustomflowtemplateRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UpdateCustomflowtemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateCustomflowtemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCustomflowtemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCustomflowtemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateCustomflowtemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public UpdateCustomflowtemplateRequest setSubTemplateType(String subTemplateType) {
        this.subTemplateType = subTemplateType;
        return this;
    }
    public String getSubTemplateType() {
        return this.subTemplateType;
    }

    public UpdateCustomflowtemplateRequest setTemplateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public Long getTemplateVersion() {
        return this.templateVersion;
    }

    public UpdateCustomflowtemplateRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public UpdateCustomflowtemplateRequest setActionList(java.util.List<OpsActionWithCommand> actionList) {
        this.actionList = actionList;
        return this;
    }
    public java.util.List<OpsActionWithCommand> getActionList() {
        return this.actionList;
    }

    public UpdateCustomflowtemplateRequest setActionPolicies(java.util.List<OpsActionPolicy> actionPolicies) {
        this.actionPolicies = actionPolicies;
        return this;
    }
    public java.util.List<OpsActionPolicy> getActionPolicies() {
        return this.actionPolicies;
    }

    public UpdateCustomflowtemplateRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UpdateCustomflowtemplateRequest setScopeIds(java.util.List<String> scopeIds) {
        this.scopeIds = scopeIds;
        return this;
    }
    public java.util.List<String> getScopeIds() {
        return this.scopeIds;
    }

}
