// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class DeleteMeshQueuelimitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 队列规则id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static DeleteMeshQueuelimitRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMeshQueuelimitRequest self = new DeleteMeshQueuelimitRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMeshQueuelimitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteMeshQueuelimitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteMeshQueuelimitRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
