// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class DeleteSgMeshclusterRequest extends TeaModel {
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

    public static DeleteSgMeshclusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSgMeshclusterRequest self = new DeleteSgMeshclusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSgMeshclusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSgMeshclusterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteSgMeshclusterRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteSgMeshclusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
