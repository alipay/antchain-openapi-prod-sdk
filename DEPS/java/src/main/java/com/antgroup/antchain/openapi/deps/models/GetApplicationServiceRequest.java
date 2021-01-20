// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetApplicationServiceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 待查询的应用名称。最大60个UTF-8字符
    @NameInMap("application_name")
    public String applicationName;

    // 待查询服务实例名称
    @NameInMap("service_name")
    public String serviceName;

    @NameInMap("workspace")
    public String workspace;

    public static GetApplicationServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationServiceRequest self = new GetApplicationServiceRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetApplicationServiceRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public GetApplicationServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetApplicationServiceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
