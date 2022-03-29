// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMeshQueuebyidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 队列id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static QueryMeshQueuebyidRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeshQueuebyidRequest self = new QueryMeshQueuebyidRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeshQueuebyidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMeshQueuebyidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMeshQueuebyidRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
