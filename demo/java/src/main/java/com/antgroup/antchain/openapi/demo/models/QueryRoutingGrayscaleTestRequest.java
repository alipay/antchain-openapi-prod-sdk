// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryRoutingGrayscaleTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 1
    @NameInMap("data")
    @Validation(required = true)
    public Long data;

    public static QueryRoutingGrayscaleTestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRoutingGrayscaleTestRequest self = new QueryRoutingGrayscaleTestRequest();
        return TeaModel.build(map, self);
    }

    public QueryRoutingGrayscaleTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRoutingGrayscaleTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRoutingGrayscaleTestRequest setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

}
