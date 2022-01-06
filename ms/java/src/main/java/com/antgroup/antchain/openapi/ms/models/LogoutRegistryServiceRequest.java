// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class LogoutRegistryServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 服务器 IP
    @NameInMap("server_ips")
    @Validation(required = true)
    public java.util.List<String> serverIps;

    public static LogoutRegistryServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        LogoutRegistryServiceRequest self = new LogoutRegistryServiceRequest();
        return TeaModel.build(map, self);
    }

    public LogoutRegistryServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public LogoutRegistryServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public LogoutRegistryServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public LogoutRegistryServiceRequest setServerIps(java.util.List<String> serverIps) {
        this.serverIps = serverIps;
        return this;
    }
    public java.util.List<String> getServerIps() {
        return this.serverIps;
    }

}
