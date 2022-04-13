// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CustomHook extends TeaModel {
    // 卡点范围，目前只支持分批
    @NameInMap("hook_scope")
    @Validation(required = true)
    public String hookScope;

    // 卡点类型：api或has
    @NameInMap("hook_type")
    @Validation(required = true)
    public String hookType;

    // 卡点名称
    @NameInMap("hook_name")
    public String hookName;

    // 卡点执行策略：each-每个分组，first-第一个分组，last-最后一个分组，custom-自定义分组。
    // 默认每个分组都会执行。
    @NameInMap("hook_strategy")
    public String hookStrategy;

    // 自定义批次编号，从0开始。hook_strategy=custom时有效
    @NameInMap("custom_num")
    public Long customNum;

    // api类型卡点配置，当hook_type=api时不能为空
    @NameInMap("api_hook_config")
    public ApiHookConfig apiHookConfig;

    // 守夜人类型卡点配置，当hook_type=has时不能为空
    @NameInMap("has_hook_config")
    public HasHookConfig hasHookConfig;

    // 【暂不支持】是否允许忽略
    @NameInMap("ignore_supported")
    public Boolean ignoreSupported;

    // 【暂不支持】任务超时时间，单位毫秒，默认10分钟
    @NameInMap("timeout_millis")
    public Long timeoutMillis;

    // 【暂不支持】默认false
    @NameInMap("un_override")
    public Boolean unOverride;

    public static CustomHook build(java.util.Map<String, ?> map) throws Exception {
        CustomHook self = new CustomHook();
        return TeaModel.build(map, self);
    }

    public CustomHook setHookScope(String hookScope) {
        this.hookScope = hookScope;
        return this;
    }
    public String getHookScope() {
        return this.hookScope;
    }

    public CustomHook setHookType(String hookType) {
        this.hookType = hookType;
        return this;
    }
    public String getHookType() {
        return this.hookType;
    }

    public CustomHook setHookName(String hookName) {
        this.hookName = hookName;
        return this;
    }
    public String getHookName() {
        return this.hookName;
    }

    public CustomHook setHookStrategy(String hookStrategy) {
        this.hookStrategy = hookStrategy;
        return this;
    }
    public String getHookStrategy() {
        return this.hookStrategy;
    }

    public CustomHook setCustomNum(Long customNum) {
        this.customNum = customNum;
        return this;
    }
    public Long getCustomNum() {
        return this.customNum;
    }

    public CustomHook setApiHookConfig(ApiHookConfig apiHookConfig) {
        this.apiHookConfig = apiHookConfig;
        return this;
    }
    public ApiHookConfig getApiHookConfig() {
        return this.apiHookConfig;
    }

    public CustomHook setHasHookConfig(HasHookConfig hasHookConfig) {
        this.hasHookConfig = hasHookConfig;
        return this;
    }
    public HasHookConfig getHasHookConfig() {
        return this.hasHookConfig;
    }

    public CustomHook setIgnoreSupported(Boolean ignoreSupported) {
        this.ignoreSupported = ignoreSupported;
        return this;
    }
    public Boolean getIgnoreSupported() {
        return this.ignoreSupported;
    }

    public CustomHook setTimeoutMillis(Long timeoutMillis) {
        this.timeoutMillis = timeoutMillis;
        return this;
    }
    public Long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    public CustomHook setUnOverride(Boolean unOverride) {
        this.unOverride = unOverride;
        return this;
    }
    public Boolean getUnOverride() {
        return this.unOverride;
    }

}
