// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class DeleteMeshQueuerouteeditionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 路由版本id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static DeleteMeshQueuerouteeditionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMeshQueuerouteeditionRequest self = new DeleteMeshQueuerouteeditionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMeshQueuerouteeditionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteMeshQueuerouteeditionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteMeshQueuerouteeditionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
