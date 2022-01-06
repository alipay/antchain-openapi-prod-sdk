// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateTransparentproxyConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 透明劫持配置
    @NameInMap("app_config")
    @Validation(required = true)
    public String appConfig;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 租户实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static UpdateTransparentproxyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransparentproxyConfigRequest self = new UpdateTransparentproxyConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTransparentproxyConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateTransparentproxyConfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateTransparentproxyConfigRequest setAppConfig(String appConfig) {
        this.appConfig = appConfig;
        return this;
    }
    public String getAppConfig() {
        return this.appConfig;
    }

    public UpdateTransparentproxyConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateTransparentproxyConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
