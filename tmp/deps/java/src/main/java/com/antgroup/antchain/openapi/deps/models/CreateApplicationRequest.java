// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 应用别称。最大60个UTF-8字符
    @NameInMap("alias")
    public String alias;

    // 创建的应用名称。最大60个UTF-8字符
    @NameInMap("application_name")
    @Validation(required = true)
    public String applicationName;

    // 技术栈架构版本，默认使用BUILDPACK_V1，取值列表：BUILDPACK_V1、BUILDPACK_V2
    @NameInMap("buildpack_arch")
    public String buildpackArch;

    // 应用使用的技术栈名称
    @NameInMap("buildpack_name")
    @Validation(required = true)
    public String buildpackName;

    // 应用使用的技术栈版本
    @NameInMap("buildpack_version")
    @Validation(required = true)
    public String buildpackVersion;

    // 应用描述。最大200个UTF-8字符
    @NameInMap("description")
    public String description;

    // 应用负责人登录名
    @NameInMap("owner_login_name")
    @Validation(required = true)
    public String ownerLoginName;

    // 应用发布类型，默认不填入表示包发布，支持 mixed,image,workload
    @NameInMap("deploy_type")
    public String deployType;

    // 是否允许公网访问
    @NameInMap("default_route")
    public Boolean defaultRoute;

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateApplicationRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateApplicationRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public CreateApplicationRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public CreateApplicationRequest setBuildpackArch(String buildpackArch) {
        this.buildpackArch = buildpackArch;
        return this;
    }
    public String getBuildpackArch() {
        return this.buildpackArch;
    }

    public CreateApplicationRequest setBuildpackName(String buildpackName) {
        this.buildpackName = buildpackName;
        return this;
    }
    public String getBuildpackName() {
        return this.buildpackName;
    }

    public CreateApplicationRequest setBuildpackVersion(String buildpackVersion) {
        this.buildpackVersion = buildpackVersion;
        return this;
    }
    public String getBuildpackVersion() {
        return this.buildpackVersion;
    }

    public CreateApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationRequest setOwnerLoginName(String ownerLoginName) {
        this.ownerLoginName = ownerLoginName;
        return this;
    }
    public String getOwnerLoginName() {
        return this.ownerLoginName;
    }

    public CreateApplicationRequest setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public CreateApplicationRequest setDefaultRoute(Boolean defaultRoute) {
        this.defaultRoute = defaultRoute;
        return this;
    }
    public Boolean getDefaultRoute() {
        return this.defaultRoute;
    }

}
