// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConsumecardGoodscreateresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 异步发布商品返回的查询ID。使用该ID查询发布结果。
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    public static QueryConsumecardGoodscreateresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumecardGoodscreateresultRequest self = new QueryConsumecardGoodscreateresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryConsumecardGoodscreateresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryConsumecardGoodscreateresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryConsumecardGoodscreateresultRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public QueryConsumecardGoodscreateresultRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
