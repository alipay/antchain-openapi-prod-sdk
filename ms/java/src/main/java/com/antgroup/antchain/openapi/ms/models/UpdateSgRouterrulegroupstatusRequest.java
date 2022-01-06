// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateSgRouterrulegroupstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主键
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 0关闭/1开启
    @NameInMap("enabled")
    @Validation(required = true)
    public Long enabled;

    // 版本号
    @NameInMap("dispatch_version")
    @Validation(required = true)
    public Long dispatchVersion;

    public static UpdateSgRouterrulegroupstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSgRouterrulegroupstatusRequest self = new UpdateSgRouterrulegroupstatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSgRouterrulegroupstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSgRouterrulegroupstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSgRouterrulegroupstatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSgRouterrulegroupstatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSgRouterrulegroupstatusRequest setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public UpdateSgRouterrulegroupstatusRequest setDispatchVersion(Long dispatchVersion) {
        this.dispatchVersion = dispatchVersion;
        return this;
    }
    public Long getDispatchVersion() {
        return this.dispatchVersion;
    }

}
