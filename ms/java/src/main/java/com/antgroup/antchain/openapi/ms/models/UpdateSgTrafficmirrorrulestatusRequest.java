// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateSgTrafficmirrorrulestatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 是否开启
    @NameInMap("enabled")
    @Validation(required = true)
    public Boolean enabled;

    public static UpdateSgTrafficmirrorrulestatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSgTrafficmirrorrulestatusRequest self = new UpdateSgTrafficmirrorrulestatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSgTrafficmirrorrulestatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSgTrafficmirrorrulestatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSgTrafficmirrorrulestatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSgTrafficmirrorrulestatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSgTrafficmirrorrulestatusRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
