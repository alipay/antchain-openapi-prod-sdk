// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddTransparentproxyAppRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 租户实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 包含的节点
    @NameInMap("nodes")
    public String nodes;

    // 支持的协议
    @NameInMap("support_protocols")
    @Validation(required = true)
    public String supportProtocols;

    public static AddTransparentproxyAppRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTransparentproxyAppRequest self = new AddTransparentproxyAppRequest();
        return TeaModel.build(map, self);
    }

    public AddTransparentproxyAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddTransparentproxyAppRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddTransparentproxyAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddTransparentproxyAppRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddTransparentproxyAppRequest setNodes(String nodes) {
        this.nodes = nodes;
        return this;
    }
    public String getNodes() {
        return this.nodes;
    }

    public AddTransparentproxyAppRequest setSupportProtocols(String supportProtocols) {
        this.supportProtocols = supportProtocols;
        return this;
    }
    public String getSupportProtocols() {
        return this.supportProtocols;
    }

}
