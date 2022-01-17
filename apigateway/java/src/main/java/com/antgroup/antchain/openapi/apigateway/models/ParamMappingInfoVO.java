// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ParamMappingInfoVO extends TeaModel {
    // api_count
    @NameInMap("api_count")
    public Long apiCount;

    // can_delete
    @NameInMap("can_delete")
    public Boolean canDelete;

    // 配置模板
    @NameInMap("config_template")
    public String configTemplate;

    // 描述
    @NameInMap("description")
    public String description;

    // gmt_create
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 映射类型
    @NameInMap("mapping_type")
    public String mappingType;

    // 创建人
    @NameInMap("operator")
    public String operator;

    // param_mapping_id
    @NameInMap("param_mapping_id")
    public String paramMappingId;

    // 参数映射名称
    @NameInMap("param_mapping_name")
    public String paramMappingName;

    // 脚本配置
    @NameInMap("script_config")
    public String scriptConfig;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // 配置模板名称
    @NameInMap("config_template_name")
    public String configTemplateName;

    public static ParamMappingInfoVO build(java.util.Map<String, ?> map) throws Exception {
        ParamMappingInfoVO self = new ParamMappingInfoVO();
        return TeaModel.build(map, self);
    }

    public ParamMappingInfoVO setApiCount(Long apiCount) {
        this.apiCount = apiCount;
        return this;
    }
    public Long getApiCount() {
        return this.apiCount;
    }

    public ParamMappingInfoVO setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public ParamMappingInfoVO setConfigTemplate(String configTemplate) {
        this.configTemplate = configTemplate;
        return this;
    }
    public String getConfigTemplate() {
        return this.configTemplate;
    }

    public ParamMappingInfoVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ParamMappingInfoVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ParamMappingInfoVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ParamMappingInfoVO setMappingType(String mappingType) {
        this.mappingType = mappingType;
        return this;
    }
    public String getMappingType() {
        return this.mappingType;
    }

    public ParamMappingInfoVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ParamMappingInfoVO setParamMappingId(String paramMappingId) {
        this.paramMappingId = paramMappingId;
        return this;
    }
    public String getParamMappingId() {
        return this.paramMappingId;
    }

    public ParamMappingInfoVO setParamMappingName(String paramMappingName) {
        this.paramMappingName = paramMappingName;
        return this;
    }
    public String getParamMappingName() {
        return this.paramMappingName;
    }

    public ParamMappingInfoVO setScriptConfig(String scriptConfig) {
        this.scriptConfig = scriptConfig;
        return this;
    }
    public String getScriptConfig() {
        return this.scriptConfig;
    }

    public ParamMappingInfoVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ParamMappingInfoVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ParamMappingInfoVO setConfigTemplateName(String configTemplateName) {
        this.configTemplateName = configTemplateName;
        return this;
    }
    public String getConfigTemplateName() {
        return this.configTemplateName;
    }

}
