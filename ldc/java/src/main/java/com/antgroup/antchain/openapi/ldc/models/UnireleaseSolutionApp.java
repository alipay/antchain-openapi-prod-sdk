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

}
