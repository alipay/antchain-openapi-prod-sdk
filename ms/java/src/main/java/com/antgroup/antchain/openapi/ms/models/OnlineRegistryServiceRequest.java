// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class OnlineRegistryServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // server_ips
    @NameInMap("server_ips")
    @Validation(required = true)
    public java.util.List<String> serverIps;

    public static OnlineRegistryServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineRegistryServiceRequest self = new OnlineRegistryServiceRequest();
        return TeaModel.build(map, self);
    }

    public OnlineRegistryServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OnlineRegistryServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OnlineRegistryServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnlineRegistryServiceRequest setServerIps(java.util.List<String> serverIps) {
        this.serverIps = serverIps;
        return this;
    }
    public java.util.List<String> getServerIps() {
        return this.serverIps;
    }

}
