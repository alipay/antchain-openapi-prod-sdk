// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateTransparentproxyProtocolconfigRequest extends TeaModel {
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

    // 端口
    @NameInMap("port")
    @Validation(required = true)
    public Long port;

    // 治理参数
    @NameInMap("protocol_config")
    @Validation(required = true)
    public String protocolConfig;

    public static UpdateTransparentproxyProtocolconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransparentproxyProtocolconfigRequest self = new UpdateTransparentproxyProtocolconfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTransparentproxyProtocolconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateTransparentproxyProtocolconfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateTransparentproxyProtocolconfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateTransparentproxyProtocolconfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateTransparentproxyProtocolconfigRequest setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public UpdateTransparentproxyProtocolconfigRequest setProtocolConfig(String protocolConfig) {
        this.protocolConfig = protocolConfig;
        return this;
    }
    public String getProtocolConfig() {
        return this.protocolConfig;
    }

}
