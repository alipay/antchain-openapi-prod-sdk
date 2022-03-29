// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateMeshQueuelimitstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 限流规则id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    public static UpdateMeshQueuelimitstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshQueuelimitstatusRequest self = new UpdateMeshQueuelimitstatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeshQueuelimitstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMeshQueuelimitstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateMeshQueuelimitstatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMeshQueuelimitstatusRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
