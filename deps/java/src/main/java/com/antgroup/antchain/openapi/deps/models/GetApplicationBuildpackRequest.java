// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetApplicationBuildpackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 应用名称
    @NameInMap("application_name")
    @Validation(required = true)
    public String applicationName;

    // 应用服务的名称
    @NameInMap("service_name")
    @Validation(required = true)
    public String serviceName;

    // 环境
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static GetApplicationBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationBuildpackRequest self = new GetApplicationBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationBuildpackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetApplicationBuildpackRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetApplicationBuildpackRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public GetApplicationBuildpackRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetApplicationBuildpackRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
