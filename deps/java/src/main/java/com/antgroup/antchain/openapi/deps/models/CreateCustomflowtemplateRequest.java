// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateCustomflowtemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 模板名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 模板描述
    @NameInMap("description")
    public String description;

    // 模板id
    @NameInMap("template_id")
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
    public Long templateVersion;

    // 工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // 自定义流程列表
    @NameInMap("action_list")
    public java.util.List<OpsActionWithCommand> actionList;

    // 自定义流程策略配置
    @NameInMap("action_policies")
    public java.util.List<OpsActionPolicy> actionPolicies;

    // 可见范围
    @NameInMap("scope")
    public String scope;

    // 可见范围id
    @NameInMap("scope_ids")
    public java.util.List<String> scopeIds;

    public static CreateCustomflowtemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomflowtemplateRequest self = new CreateCustomflowtemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomflowtemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCustomflowtemplateRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateCustomflowtemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustomflowtemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCustomflowtemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateCustomflowtemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public CreateCustomflowtemplateRequest setSubTemplateType(String subTemplateType) {
        this.subTemplateType = subTemplateType;
        return this;
    }
    public String getSubTemplateType() {
        return this.subTemplateType;
    }

    public CreateCustomflowtemplateRequest setTemplateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public Long getTemplateVersion() {
        return this.templateVersion;
    }

    public CreateCustomflowtemplateRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateCustomflowtemplateRequest setActionList(java.util.List<OpsActionWithCommand> actionList) {
        this.actionList = actionList;
        return this;
    }
    public java.util.List<OpsActionWithCommand> getActionList() {
        return this.actionList;
    }

    public CreateCustomflowtemplateRequest setActionPolicies(java.util.List<OpsActionPolicy> actionPolicies) {
        this.actionPolicies = actionPolicies;
        return this;
    }
    public java.util.List<OpsActionPolicy> getActionPolicies() {
        return this.actionPolicies;
    }

    public CreateCustomflowtemplateRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateCustomflowtemplateRequest setScopeIds(java.util.List<String> scopeIds) {
        this.scopeIds = scopeIds;
        return this;
    }
    public java.util.List<String> getScopeIds() {
        return this.scopeIds;
    }

}
