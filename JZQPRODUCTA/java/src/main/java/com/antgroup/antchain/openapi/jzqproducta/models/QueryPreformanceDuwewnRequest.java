// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.jzqproducta.models;

import com.aliyun.tea.*;

public class QueryPreformanceDuwewnRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    public static QueryPreformanceDuwewnRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPreformanceDuwewnRequest self = new QueryPreformanceDuwewnRequest();
        return TeaModel.build(map, self);
    }

    public QueryPreformanceDuwewnRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPreformanceDuwewnRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPreformanceDuwewnRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
