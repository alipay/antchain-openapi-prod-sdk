// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConsumecardCounterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础结构体
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 查询的类别（0 商家，1 商品）
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 查询的id（type：0 为accountId 1为goodsId）
    @NameInMap("query_id")
    @Validation(required = true)
    public String queryId;

    // 查询的时间戳对应的counter
    @NameInMap("query_time_in_mills")
    @Validation(required = true)
    public Long queryTimeInMills;

    public static QueryConsumecardCounterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumecardCounterRequest self = new QueryConsumecardCounterRequest();
        return TeaModel.build(map, self);
    }

    public QueryConsumecardCounterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryConsumecardCounterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryConsumecardCounterRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public QueryConsumecardCounterRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public QueryConsumecardCounterRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public QueryConsumecardCounterRequest setQueryTimeInMills(Long queryTimeInMills) {
        this.queryTimeInMills = queryTimeInMills;
        return this;
    }
    public Long getQueryTimeInMills() {
        return this.queryTimeInMills;
    }

}
