// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryRegisterstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 登记id
    @NameInMap("register_id")
    @Validation(required = true)
    public String registerId;

    public static QueryRegisterstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRegisterstatusRequest self = new QueryRegisterstatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryRegisterstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRegisterstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRegisterstatusRequest setRegisterId(String registerId) {
        this.registerId = registerId;
        return this;
    }
    public String getRegisterId() {
        return this.registerId;
    }

}
