// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UnireleaseSolutionApp extends TeaModel {
    // 应用名称
    @NameInMap("app")
    @Validation(required = true)
    public String app;

    // 应用依赖信息
    @NameInMap("depends_on")
    @Validation(required = true)
    public java.util.List<String> dependsOn;

    // 应用发布配置
    @NameInMap("release_config")
    @Validation(required = true)
    public AppReleaseConfig releaseConfig;

    // 中间件配置
    @NameInMap("middleware_configs")
    @Validation(required = true)
    public java.util.List<String> middlewareConfigs;

    // 机构/租户信息
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    // 中间件配置diff信息
    @NameInMap("middleware_config_diffs")
    public java.util.List<String> middlewareConfigDiffs;

    // 工作空间组
    @NameInMap("workspace_group")
    public String workspaceGroup;

    // 命名空间
    @NameInMap("namespace")
    public String namespace;

    // 中间件配置变更diff摘要
    @NameInMap("middleware_config_diff_summary")
    public String middlewareConfigDiffSummary;

    // 风险等级: ORDINARY-一般、HIGH-高危
    @NameInMap("risk_level")
    public String riskLevel;

    public static UnireleaseSolutionApp build(java.util.Map<String, ?> map) throws Exception {
        UnireleaseSolutionApp self = new UnireleaseSolutionApp();
        return TeaModel.build(map, self);
    }

    public UnireleaseSolutionApp setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public UnireleaseSolutionApp setDependsOn(java.util.List<String> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }
    public java.util.List<String> getDependsOn() {
        return this.dependsOn;
    }

    public UnireleaseSolutionApp setReleaseConfig(AppReleaseConfig releaseConfig) {
        this.releaseConfig = releaseConfig;
        return this;
    }
    public AppReleaseConfig getReleaseConfig() {
        return this.releaseConfig;
    }

    public UnireleaseSolutionApp setMiddlewareConfigs(java.util.List<String> middlewareConfigs) {
        this.middlewareConfigs = middlewareConfigs;
        return this;
    }
    public java.util.List<String> getMiddlewareConfigs() {
        return this.middlewareConfigs;
    }

    public UnireleaseSolutionApp setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UnireleaseSolutionApp setMiddlewareConfigDiffs(java.util.List<String> middlewareConfigDiffs) {
        this.middlewareConfigDiffs = middlewareConfigDiffs;
        return this;
    }
    public java.util.List<String> getMiddlewareConfigDiffs() {
        return this.middlewareConfigDiffs;
    }

    public UnireleaseSolutionApp setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public UnireleaseSolutionApp setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UnireleaseSolutionApp setMiddlewareConfigDiffSummary(String middlewareConfigDiffSummary) {
        this.middlewareConfigDiffSummary = middlewareConfigDiffSummary;
        return this;
    }
    public String getMiddlewareConfigDiffSummary() {
        return this.middlewareConfigDiffSummary;
    }

    public UnireleaseSolutionApp setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

}
