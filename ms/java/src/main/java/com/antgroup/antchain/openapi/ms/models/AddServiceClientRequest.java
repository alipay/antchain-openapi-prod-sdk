// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddServiceClientRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // middleware instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 服务器 IP 列表，多个 IP 间以英文逗号分隔
    @NameInMap("server_ips")
    @Validation(required = true)
    public String serverIps;

    // Client operation type: (logout)
    @NameInMap("operation_type")
    public String operationType;

    public static AddServiceClientRequest build(java.util.Map<String, ?> map) throws Exception {
        AddServiceClientRequest self = new AddServiceClientRequest();
        return TeaModel.build(map, self);
    }

    public AddServiceClientRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddServiceClientRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddServiceClientRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddServiceClientRequest setServerIps(String serverIps) {
        this.serverIps = serverIps;
        return this;
    }
    public String getServerIps() {
        return this.serverIps;
    }

    public AddServiceClientRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

}
