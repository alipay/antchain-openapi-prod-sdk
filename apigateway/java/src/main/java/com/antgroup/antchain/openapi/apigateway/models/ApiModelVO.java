// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiModelVO extends TeaModel {
    // 绑定的api数量
    @NameInMap("api_count")
    public Long apiCount;

    // 模板id(全局唯一)
    @NameInMap("api_model_id")
    public String apiModelId;

    // 是否可以删除
    @NameInMap("can_delete")
    public Boolean canDelete;

    // API模型描述
    @NameInMap("description")
    public String description;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 	
    // 更改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 模型配置
    @NameInMap("model_config")
    public String modelConfig;

    // 模型名称
    @NameInMap("model_name")
    public String modelName;

    // 数据模型参数
    @NameInMap("model_params")
    public java.util.List<ApiModelParamVO> modelParams;

    // 创建人
    // 
    @NameInMap("operator")
    public String operator;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // children
    @NameInMap("children")
    public String children;

    // option 表示模型是多参数
    @NameInMap("model_type")
    public String modelType;

    public static ApiModelVO build(java.util.Map<String, ?> map) throws Exception {
        ApiModelVO self = new ApiModelVO();
        return TeaModel.build(map, self);
    }

    public ApiModelVO setApiCount(Long apiCount) {
        this.apiCount = apiCount;
        return this;
    }
    public Long getApiCount() {
        return this.apiCount;
    }

    public ApiModelVO setApiModelId(String apiModelId) {
        this.apiModelId = apiModelId;
        return this;
    }
    public String getApiModelId() {
        return this.apiModelId;
    }

    public ApiModelVO setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public ApiModelVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApiModelVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ApiModelVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ApiModelVO setModelConfig(String modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public String getModelConfig() {
        return this.modelConfig;
    }

    public ApiModelVO setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ApiModelVO setModelParams(java.util.List<ApiModelParamVO> modelParams) {
        this.modelParams = modelParams;
        return this;
    }
    public java.util.List<ApiModelParamVO> getModelParams() {
        return this.modelParams;
    }

    public ApiModelVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ApiModelVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApiModelVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ApiModelVO setChildren(String children) {
        this.children = children;
        return this;
    }
    public String getChildren() {
        return this.children;
    }

    public ApiModelVO setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

}
