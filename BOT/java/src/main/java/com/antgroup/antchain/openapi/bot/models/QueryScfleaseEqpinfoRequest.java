// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryScfleaseEqpinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求体
    @NameInMap("request")
    @Validation(required = true)
    public java.util.List<ScfLeaseEqpInfoQueryRequest> request;

    public static QueryScfleaseEqpinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryScfleaseEqpinfoRequest self = new QueryScfleaseEqpinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryScfleaseEqpinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryScfleaseEqpinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryScfleaseEqpinfoRequest setRequest(java.util.List<ScfLeaseEqpInfoQueryRequest> request) {
        this.request = request;
        return this;
    }
    public java.util.List<ScfLeaseEqpInfoQueryRequest> getRequest() {
        return this.request;
    }

}
