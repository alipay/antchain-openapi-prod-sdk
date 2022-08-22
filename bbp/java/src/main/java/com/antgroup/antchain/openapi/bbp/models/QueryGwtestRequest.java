// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class QueryGwtestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时时间 毫秒
    @NameInMap("timeout")
    public Long timeout;

    public static QueryGwtestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGwtestRequest self = new QueryGwtestRequest();
        return TeaModel.build(map, self);
    }

    public QueryGwtestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGwtestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGwtestRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
