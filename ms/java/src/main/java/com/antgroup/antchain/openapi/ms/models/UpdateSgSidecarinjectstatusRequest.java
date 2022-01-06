// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateSgSidecarinjectstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 主键
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 0关闭 1开启
    @NameInMap("enabled")
    @Validation(required = true)
    public Long enabled;

    public static UpdateSgSidecarinjectstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSgSidecarinjectstatusRequest self = new UpdateSgSidecarinjectstatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSgSidecarinjectstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSgSidecarinjectstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSgSidecarinjectstatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSgSidecarinjectstatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSgSidecarinjectstatusRequest setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

}
