// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateDeploymentRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 应用列表
    @NameInMap("applications")
    @Validation(required = true)
    public java.util.List<Application> applications;

    // 是否启用自动运维，默认为**False**
    @NameInMap("auto_execute")
    public Boolean autoExecute;

    // 部署维度，有两种取值：APPLICATION和APP_SERVICE。设置为APPLICATION，表示在尚未引入应用服务环境中对整个应用都执行部署操作; APP_SERVICE表示在引入应用服务的环境中对应用服务执行部署操作。
    @NameInMap("deploy_dimension")
    @Validation(required = true)
    public String deployDimension;

    // 部署单标题。长度不超过50个UTF-8字符
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 执行部署操作的目标工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static CreateDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentRequest self = new CreateDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDeploymentRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateDeploymentRequest setApplications(java.util.List<Application> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<Application> getApplications() {
        return this.applications;
    }

    public CreateDeploymentRequest setAutoExecute(Boolean autoExecute) {
        this.autoExecute = autoExecute;
        return this;
    }
    public Boolean getAutoExecute() {
        return this.autoExecute;
    }

    public CreateDeploymentRequest setDeployDimension(String deployDimension) {
        this.deployDimension = deployDimension;
        return this;
    }
    public String getDeployDimension() {
        return this.deployDimension;
    }

    public CreateDeploymentRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateDeploymentRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
