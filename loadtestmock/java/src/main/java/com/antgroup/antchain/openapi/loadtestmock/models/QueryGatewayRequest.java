// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.loadtestmock.models;

import com.aliyun.tea.*;

public class QueryGatewayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 接口返回耗时，单位是ms
    @NameInMap("time_limit")
    @Validation(required = true)
    public Long timeLimit;

    public static QueryGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGatewayRequest self = new QueryGatewayRequest();
        return TeaModel.build(map, self);
    }

    public QueryGatewayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGatewayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGatewayRequest setTimeLimit(Long timeLimit) {
        this.timeLimit = timeLimit;
        return this;
    }
    public Long getTimeLimit() {
        return this.timeLimit;
    }

}
