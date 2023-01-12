// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OpsCustomFlowTemplate extends TeaModel {
    // 可见范围
    @NameInMap("scope")
    public String scope;

    // 可见范围id
    @NameInMap("scope_ids")
    public java.util.List<String> scopeIds;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

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
    // 
    @NameInMap("sub_template_type")
    public String subTemplateType;

    // 模板版本
    // 
    @NameInMap("template_version")
    public Long templateVersion;

    // 工作空间id
    // 
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // 自定义流程列表
    // 
    @NameInMap("action_list")
    public java.util.List<OpsActionWithCommand> actionList;

    // 自定义流程策略配置
    // 
    @NameInMap("action_policies")
    public java.util.List<OpsActionPolicy> actionPolicies;

    public static OpsCustomFlowTemplate build(java.util.Map<String, ?> map) throws Exception {
        OpsCustomFlowTemplate self = new OpsCustomFlowTemplate();
        return TeaModel.build(map, self);
    }

    public OpsCustomFlowTemplate setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public OpsCustomFlowTemplate setScopeIds(java.util.List<String> scopeIds) {
        this.scopeIds = scopeIds;
        return this;
    }
    public java.util.List<String> getScopeIds() {
        return this.scopeIds;
    }

    public OpsCustomFlowTemplate setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OpsCustomFlowTemplate setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpsCustomFlowTemplate setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OpsCustomFlowTemplate setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public OpsCustomFlowTemplate setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public OpsCustomFlowTemplate setSubTemplateType(String subTemplateType) {
        this.subTemplateType = subTemplateType;
        return this;
    }
    public String getSubTemplateType() {
        return this.subTemplateType;
    }

    public OpsCustomFlowTemplate setTemplateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public Long getTemplateVersion() {
        return this.templateVersion;
    }

    public OpsCustomFlowTemplate setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public OpsCustomFlowTemplate setActionList(java.util.List<OpsActionWithCommand> actionList) {
        this.actionList = actionList;
        return this;
    }
    public java.util.List<OpsActionWithCommand> getActionList() {
        return this.actionList;
    }

    public OpsCustomFlowTemplate setActionPolicies(java.util.List<OpsActionPolicy> actionPolicies) {
        this.actionPolicies = actionPolicies;
        return this;
    }
    public java.util.List<OpsActionPolicy> getActionPolicies() {
        return this.actionPolicies;
    }

}
