// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryAsyncRequestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求的唯一标识
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    public static QueryAsyncRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAsyncRequestRequest self = new QueryAsyncRequestRequest();
        return TeaModel.build(map, self);
    }

    public QueryAsyncRequestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAsyncRequestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAsyncRequestRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
