// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateDeploymentTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 模板编码
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 中文名称
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 模板描述
    @NameInMap("description")
    public String description;

    // 是否覆盖版本中的发布策略
    @NameInMap("override_deploy_config")
    @Validation(required = true)
    public Boolean overrideDeployConfig;

    // 发布策略
    @NameInMap("deploy_config")
    public DeployConfig deployConfig;

    // 是否开启变更卡点
    @NameInMap("enable_custom_hook")
    @Validation(required = true)
    public Boolean enableCustomHook;

    // 卡点类型：api或has
    @NameInMap("hook_type")
    public String hookType;

    // 自定义卡点配置列表
    @NameInMap("custom_hooks")
    public java.util.List<CustomHook> customHooks;

    // 操作人
    @NameInMap("operator")
    public String operator;

    public static UpdateDeploymentTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentTemplateRequest self = new UpdateDeploymentTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDeploymentTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDeploymentTemplateRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateDeploymentTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDeploymentTemplateRequest setOverrideDeployConfig(Boolean overrideDeployConfig) {
        this.overrideDeployConfig = overrideDeployConfig;
        return this;
    }
    public Boolean getOverrideDeployConfig() {
        return this.overrideDeployConfig;
    }

    public UpdateDeploymentTemplateRequest setDeployConfig(DeployConfig deployConfig) {
        this.deployConfig = deployConfig;
        return this;
    }
    public DeployConfig getDeployConfig() {
        return this.deployConfig;
    }

    public UpdateDeploymentTemplateRequest setEnableCustomHook(Boolean enableCustomHook) {
        this.enableCustomHook = enableCustomHook;
        return this;
    }
    public Boolean getEnableCustomHook() {
        return this.enableCustomHook;
    }

    public UpdateDeploymentTemplateRequest setHookType(String hookType) {
        this.hookType = hookType;
        return this;
    }
    public String getHookType() {
        return this.hookType;
    }

    public UpdateDeploymentTemplateRequest setCustomHooks(java.util.List<CustomHook> customHooks) {
        this.customHooks = customHooks;
        return this;
    }
    public java.util.List<CustomHook> getCustomHooks() {
        return this.customHooks;
    }

    public UpdateDeploymentTemplateRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
