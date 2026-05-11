// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.jzqproducta.models;

import com.aliyun.tea.*;

public class QueryPreformanceYdbeozRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    public static QueryPreformanceYdbeozRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPreformanceYdbeozRequest self = new QueryPreformanceYdbeozRequest();
        return TeaModel.build(map, self);
    }

    public QueryPreformanceYdbeozRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPreformanceYdbeozRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPreformanceYdbeozRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
