// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConsumecardGoodsupdateresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 异步更新商品返回的查询ID。使用该ID查询更新结果。
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    public static QueryConsumecardGoodsupdateresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumecardGoodsupdateresultRequest self = new QueryConsumecardGoodsupdateresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryConsumecardGoodsupdateresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryConsumecardGoodsupdateresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryConsumecardGoodsupdateresultRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConsumecardGoodsupdateresultRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

}
