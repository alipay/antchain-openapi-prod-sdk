// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeploymentTemplate extends TeaModel {
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
    // 
    @NameInMap("custom_hooks")
    public java.util.List<CustomHook> customHooks;

    // 操作人
    @NameInMap("operator")
    public String operator;

    // 创建时间
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // 更新时间
    @NameInMap("modified_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String modifiedTime;

    // 版本号
    @NameInMap("version")
    public Long version;

    public static DeploymentTemplate build(java.util.Map<String, ?> map) throws Exception {
        DeploymentTemplate self = new DeploymentTemplate();
        return TeaModel.build(map, self);
    }

    public DeploymentTemplate setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeploymentTemplate setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public DeploymentTemplate setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeploymentTemplate setOverrideDeployConfig(Boolean overrideDeployConfig) {
        this.overrideDeployConfig = overrideDeployConfig;
        return this;
    }
    public Boolean getOverrideDeployConfig() {
        return this.overrideDeployConfig;
    }

    public DeploymentTemplate setDeployConfig(DeployConfig deployConfig) {
        this.deployConfig = deployConfig;
        return this;
    }
    public DeployConfig getDeployConfig() {
        return this.deployConfig;
    }

    public DeploymentTemplate setEnableCustomHook(Boolean enableCustomHook) {
        this.enableCustomHook = enableCustomHook;
        return this;
    }
    public Boolean getEnableCustomHook() {
        return this.enableCustomHook;
    }

    public DeploymentTemplate setHookType(String hookType) {
        this.hookType = hookType;
        return this;
    }
    public String getHookType() {
        return this.hookType;
    }

    public DeploymentTemplate setCustomHooks(java.util.List<CustomHook> customHooks) {
        this.customHooks = customHooks;
        return this;
    }
    public java.util.List<CustomHook> getCustomHooks() {
        return this.customHooks;
    }

    public DeploymentTemplate setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DeploymentTemplate setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DeploymentTemplate setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public DeploymentTemplate setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}
