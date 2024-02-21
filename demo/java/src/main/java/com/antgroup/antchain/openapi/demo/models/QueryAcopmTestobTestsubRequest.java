// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryAcopmTestobTestsubRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主键
    @NameInMap("id")
    @Validation(required = true, minimum = 1)
    public Long id;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static QueryAcopmTestobTestsubRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAcopmTestobTestsubRequest self = new QueryAcopmTestobTestsubRequest();
        return TeaModel.build(map, self);
    }

    public QueryAcopmTestobTestsubRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAcopmTestobTestsubRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAcopmTestobTestsubRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryAcopmTestobTestsubRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
