// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateApplicationServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 应用名称
    @NameInMap("application_name")
    @Validation(required = true)
    public String applicationName;

    // 应用使用的技术栈版本
    @NameInMap("buildpack_version")
    @Validation(required = true)
    public String buildpackVersion;

    // 部署单元paas id列表
    @NameInMap("cell_ids")
    public java.util.List<String> cellIds;

    // 描述
    @NameInMap("description")
    public String description;

    // 负责人登录名
    @NameInMap("owner_login_name")
    public String ownerLoginName;

    // 应用服务实例名称
    @NameInMap("service_name")
    @Validation(required = true)
    public String serviceName;

    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static CreateApplicationServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationServiceRequest self = new CreateApplicationServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateApplicationServiceRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateApplicationServiceRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public CreateApplicationServiceRequest setBuildpackVersion(String buildpackVersion) {
        this.buildpackVersion = buildpackVersion;
        return this;
    }
    public String getBuildpackVersion() {
        return this.buildpackVersion;
    }

    public CreateApplicationServiceRequest setCellIds(java.util.List<String> cellIds) {
        this.cellIds = cellIds;
        return this;
    }
    public java.util.List<String> getCellIds() {
        return this.cellIds;
    }

    public CreateApplicationServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationServiceRequest setOwnerLoginName(String ownerLoginName) {
        this.ownerLoginName = ownerLoginName;
        return this;
    }
    public String getOwnerLoginName() {
        return this.ownerLoginName;
    }

    public CreateApplicationServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateApplicationServiceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
