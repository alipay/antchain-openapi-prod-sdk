// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiModelParamVO extends TeaModel {
    // 默认值
    @NameInMap("default_value")
    public String defaultValue;

    // 描述
    @NameInMap("description")
    public String description;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 模型id
    @NameInMap("model_id")
    public String modelId;

    // 模型提交 操作
    @NameInMap("operation")
    public String operation;

    // 模型参数id（唯一标识）
    @NameInMap("param_id")
    public String paramId;

    // 参数名
    @NameInMap("param_name")
    public String paramName;

    // 参数类型
    @NameInMap("param_type")
    public String paramType;

    // 引用模型id
    @NameInMap("ref_model_id")
    public String refModelId;

    // 工作空间标识
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static ApiModelParamVO build(java.util.Map<String, ?> map) throws Exception {
        ApiModelParamVO self = new ApiModelParamVO();
        return TeaModel.build(map, self);
    }

    public ApiModelParamVO setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public ApiModelParamVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApiModelParamVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ApiModelParamVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ApiModelParamVO setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public ApiModelParamVO setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ApiModelParamVO setParamId(String paramId) {
        this.paramId = paramId;
        return this;
    }
    public String getParamId() {
        return this.paramId;
    }

    public ApiModelParamVO setParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }
    public String getParamName() {
        return this.paramName;
    }

    public ApiModelParamVO setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public ApiModelParamVO setRefModelId(String refModelId) {
        this.refModelId = refModelId;
        return this;
    }
    public String getRefModelId() {
        return this.refModelId;
    }

    public ApiModelParamVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApiModelParamVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
