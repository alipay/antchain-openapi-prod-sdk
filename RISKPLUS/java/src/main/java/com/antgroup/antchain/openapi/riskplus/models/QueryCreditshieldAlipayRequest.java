// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryCreditshieldAlipayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // TRADE_QUERY 普通交易流水查询
    @NameInMap("query_code")
    @Validation(required = true)
    public String queryCode;

    // 支付宝交易流水查询请求体
    @NameInMap("query_infos")
    @Validation(required = true)
    public String queryInfos;

    public static QueryCreditshieldAlipayRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditshieldAlipayRequest self = new QueryCreditshieldAlipayRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditshieldAlipayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditshieldAlipayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditshieldAlipayRequest setQueryCode(String queryCode) {
        this.queryCode = queryCode;
        return this;
    }
    public String getQueryCode() {
        return this.queryCode;
    }

    public QueryCreditshieldAlipayRequest setQueryInfos(String queryInfos) {
        this.queryInfos = queryInfos;
        return this;
    }
    public String getQueryInfos() {
        return this.queryInfos;
    }

}
