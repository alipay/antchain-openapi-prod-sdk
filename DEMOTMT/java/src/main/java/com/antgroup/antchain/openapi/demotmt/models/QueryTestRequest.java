// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demotmt.models;

import com.aliyun.tea.*;

public class QueryTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // sleep时间
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    public static QueryTestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTestRequest self = new QueryTestRequest();
        return TeaModel.build(map, self);
    }

    public QueryTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTestRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
