// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateSgFaultinjectrulestatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主键
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 开启/关闭
    @NameInMap("enabled")
    @Validation(required = true)
    public Boolean enabled;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static UpdateSgFaultinjectrulestatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSgFaultinjectrulestatusRequest self = new UpdateSgFaultinjectrulestatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSgFaultinjectrulestatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSgFaultinjectrulestatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSgFaultinjectrulestatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSgFaultinjectrulestatusRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateSgFaultinjectrulestatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
