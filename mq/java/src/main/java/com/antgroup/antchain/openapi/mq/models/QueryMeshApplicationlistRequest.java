// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMeshApplicationlistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 队列id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 队列名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static QueryMeshApplicationlistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeshApplicationlistRequest self = new QueryMeshApplicationlistRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeshApplicationlistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMeshApplicationlistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMeshApplicationlistRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryMeshApplicationlistRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
