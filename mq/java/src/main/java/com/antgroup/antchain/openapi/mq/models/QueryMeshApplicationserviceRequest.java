// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMeshApplicationserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static QueryMeshApplicationserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeshApplicationserviceRequest self = new QueryMeshApplicationserviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeshApplicationserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMeshApplicationserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMeshApplicationserviceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
