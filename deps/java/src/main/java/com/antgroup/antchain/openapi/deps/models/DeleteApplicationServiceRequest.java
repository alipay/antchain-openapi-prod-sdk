// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteApplicationServiceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 待删除的服务实例的应用名称
    @NameInMap("application_name")
    @Validation(required = true)
    public String applicationName;

    // 待删除服务实例名称
    @NameInMap("service_name")
    public String serviceName;

    // 待删除服务实例所在环境名称
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static DeleteApplicationServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationServiceRequest self = new DeleteApplicationServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteApplicationServiceRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public DeleteApplicationServiceRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public DeleteApplicationServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public DeleteApplicationServiceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
